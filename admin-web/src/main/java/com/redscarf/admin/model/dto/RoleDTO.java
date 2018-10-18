package com.redscarf.admin.model.dto;

import com.redscarf.admin.model.entity.SysRole;
import lombok.Data;

/**
 * @author lengleng
 * @date 2018/1/20
 * 角色Dto
 */
@Data
public class RoleDTO extends SysRole {
    /**
     * 角色部门Id
     */
    private Integer roleDeptId;

    /**
     * 部门名称
     */
    private String deptName;
}
