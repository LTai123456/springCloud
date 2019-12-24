package com.example.demo.role.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author jobob
 * @since 2018-12-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色
     */
    private String role;

    /**
     * 角色名
     */
    private String name;

    /**
     * 权限
     */
    private String modules;

    /**
     * 描述
     */
    private String describe;


}
