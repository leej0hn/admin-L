package com.redscarf.admin.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.redscarf.admin.interceptor.DataScope;
import com.redscarf.admin.mapper.SysUserMapper;
import com.redscarf.admin.model.entity.SysUser;
import com.redscarf.admin.model.vo.UserVO;
import com.redscarf.admin.service.SysUserService;
import com.redscarf.admin.utils.Query;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lengleng
 * @date 2017/10/31
 */
@Slf4j
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public UserVO findUserByUsername(String username) {
        return sysUserMapper.selectUserVoByUsername(username);
    }

    @Override
    public Page selectWithRolePage(Query query, UserVO userVO) {
        DataScope dataScope = new DataScope();
        dataScope.setScopeName("deptId");
        dataScope.setIsOnly(true);
        Object username = query.getCondition().get("username");
        query.setRecords(sysUserMapper.selectUserVoPageDataScope(query, username, dataScope));
        return query;
    }




}
