package com.Lei.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName sys_user_role
 */
@Data
public class SysUserRole implements Serializable {
    /**
     * 用户角色主键ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

    private static final long serialVersionUID = 1L;
}