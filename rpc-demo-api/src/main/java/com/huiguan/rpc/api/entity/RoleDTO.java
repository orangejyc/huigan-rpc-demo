/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.rpc.api.entity;

import java.io.Serializable;

/**
 * TODO desc
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午7:43 $$
 */
public class RoleDTO  implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
}
