package com.redscarf.admin.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.redscarf.admin.model.vo.UserVO;
import com.redscarf.admin.service.SysUserService;
import com.redscarf.admin.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author lengleng
 * @date 2017/10/28
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private SysUserService userService;

    /**
     * 通过用户名查询用户及其角色信息
     *
     * @param username 用户名
     * @return UseVo 对象
     */
    @GetMapping("/findUserByUsername/{username}")
    public UserVO findUserByUsername(@PathVariable String username) {
        return userService.findUserByUsername(username);
    }

    /**
     * 分页查询用户
     *
     * @param params 参数集
     * @param userVO 用户信息
     * @return 用户集合
     */
    @RequestMapping("/userPage")
    public Page userPage(@RequestParam Map<String, Object> params, UserVO userVO) {

        return userService.selectWithRolePage(new Query(params),userVO);
    }

}
