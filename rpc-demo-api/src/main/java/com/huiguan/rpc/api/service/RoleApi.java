/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */

package com.huiguan.rpc.api.service;

import com.huiguan.rpc.api.entity.RoleDTO;

/**
 * 角色暴露接口
 *
 * @author juyongcheng
 * @since $$Revision:1.0.0, $$Date: 2017/5/2 下午7:44 $$
 */
public interface RoleApi {
    RoleDTO getRole(RoleDTO roleDTO);
}
