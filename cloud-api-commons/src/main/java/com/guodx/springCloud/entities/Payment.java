package com.guodx.springCloud.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: guodx
 * @Date: 2020/9/29 9:53 上午
 * @Description:
 * @Version: 1.0
 */
@Data
public class Payment implements Serializable {
    private static final long serialVersionUID = -7493563319361501911L;

    private Long id;
    private String serials;
}
