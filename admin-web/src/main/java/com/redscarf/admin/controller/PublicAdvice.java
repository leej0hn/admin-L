package com.redscarf.admin.controller;

import com.redscarf.admin.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author Jonsy
 *
 */
@ControllerAdvice
public class PublicAdvice {

    @Autowired
    protected SysMenuService sysMenuService;

    @ExceptionHandler
    public void handleControllerException(HttpServletRequest request, HttpServletResponse response, Throwable ex) throws IOException {
        ex.printStackTrace();
        String ajax = request.getHeader("X-Requested-With");
        response.setCharacterEncoding("utf-8");
        if (StringUtils.isEmpty(ajax)) {
            response.sendRedirect("/error");
        } else {
            response.getWriter().println("出错了:" + ex.getMessage());
        }

    }

    @ModelAttribute
    public void addCommonModel(Model model, HttpServletRequest request) {
        model.addAttribute("navs", sysMenuService.findMenuByRoleName("ROLE_ADMIN"));
    }


}
