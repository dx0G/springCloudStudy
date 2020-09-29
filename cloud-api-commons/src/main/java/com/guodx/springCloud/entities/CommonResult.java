package com.guodx.springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: guodx
 * @Date: 2020/9/29 10:10 上午
 * @Description:
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {
    private static final long serialVersionUID = 7611478142422521549L;

    private Integer code;
    private String message;
    private T data;
}
