package com.dongtu.consts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: HAO
 * @Date: 2019-12-25 21:57
 * @Desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    // 成功且带数据
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMessage());
        result.setData(object);
        return result;
    }

    // 成功但不带数据
    public static Result success() {

        return success(null);
    }

    // 返回失败的状态码及数据
    public static Result failure(Object object) {
        Result result = new Result();
        result.setCode(ResultEnum.FAILED.getCode());
        result.setMsg(ResultEnum.FAILED.getMessage());
        result.setData(object);
        return result;
    }

    // 失败但不带数据
    public static Result failure() {


        return failure(null);
    }

}
