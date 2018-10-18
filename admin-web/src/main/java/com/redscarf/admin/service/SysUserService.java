package com.redscarf.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.redscarf.admin.model.entity.SysUser;
import com.redscarf.admin.model.vo.UserVO;
import com.redscarf.admin.utils.Query;

/**
 * @author lengleng
 * @date 2017/10/31
 */
public interface SysUserService extends IService<SysUser> {
    /**
     * 根据用户名查询用户角色信息
     *
     * @param username 用户名
     * @return userVo
     */
    UserVO findUserByUsername(String username);

    /**
     * 分页查询用户信息（含有角色信息）
     *
     * @param query 查询条件
     * @param userVO
     * @return
     */
    Page selectWithRolePage(Query query, UserVO userVO);


}
