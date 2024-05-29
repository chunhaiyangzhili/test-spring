package org.example.model;

import lombok.Data;

/**
 * Description
 *
 * @author zwzhang5
 * @description
 * @date Created on 2024/5/28 9:18
 */
@Data
public class ReturnMsg<T> {

    private String code;

    private String desc;

    private T data;

    public ReturnMsg(String code, String desc, T data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }

    public ReturnMsg(T data) {
        this.code = "0000";
        this.desc = "success";
        this.data = data;
    }



}
