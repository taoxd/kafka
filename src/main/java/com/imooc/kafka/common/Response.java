package com.imooc.kafka.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: taoxd
 * @Date: 2019/4/25 10:54
 * @Description:
 */
@Getter
@Setter
public class Response {
    private int code;
    private String message;

    public Response(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
