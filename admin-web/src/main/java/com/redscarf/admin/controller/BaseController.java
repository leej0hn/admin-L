package com.redscarf.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lengleng
 * @date 2017/10/28
 */
public class BaseController {
    @Autowired
    private HttpServletRequest request;
    protected org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());



}
