package com.guodx.springCloud.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @Author: guodx
 * @Date: 2020/10/8 8:23 下午
 * @Description:
 * @Version: 1.0
 */
public class MyRule extends AbstractLoadBalancerRule {

    /**
     * 总共被调用的次数，目前要求每台被调用4次
     */
    private int total = 0;
    /**
     * 当前提供服务列表的索引
     */
    private int currentIndex = 0;

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        // 获取负载均衡器lb
        ILoadBalancer lb = getLoadBalancer();
        if (lb == null) {
            return null;
        }

        Server server = null;
        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            // 获取可用服务列表
            List<Server> upList = lb.getReachableServers();
            // 获取所有服务列表
            List<Server> allList = lb.getAllServers();
            int serverCount = allList.size();
            if (serverCount == 0) {
                return null;
            }

            // 若调用次数小于4次，一直调用可用服务列表中索引为 currentIndex 的服务
            if (total < 4) {
                server = upList.get(currentIndex);
                total++;
            } else {
                // 到了4次之后，服务列表中的索引值++，表示下一个调用下一个服务
                total = 0;
                currentIndex++;
                // 当索引大于可用服务列表的size时，要重新从头开始
                currentIndex = currentIndex % upList.size();

                if (server == null) {
                    Thread.yield();
                    continue;
                }

                if (server.isAlive()) {
                    return (server);
                }

                server = null;
                Thread.yield();
            }
        }
        return server;
    }

}
