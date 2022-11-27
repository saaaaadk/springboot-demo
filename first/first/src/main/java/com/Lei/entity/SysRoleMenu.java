package com.Lei.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName sys_role_menu
 */
@Data
public class SysRoleMenu implements Serializable {
    /**
     * 角色菜单主键ID
     */
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;

    private static final long serialVersionUID = 1L;
}