package com.huiguan.rpc.api.entity;

import java.io.Serializable;

/**
 * Created by ansoya on 2017/4/27.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
