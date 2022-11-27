package com.Lei.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName sys_role
 */
@Data
public class SysRole extends BaseEntity implements Serializable {
    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色权限字符串
     */
    private String code;

    /**
     * 创建时间
     */

    private static final long serialVersionUID = 1L;
}