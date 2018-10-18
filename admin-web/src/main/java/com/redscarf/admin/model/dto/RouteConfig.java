package com.redscarf.admin.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;
import com.alibaba.fastjson.annotation.JSONField;
/**
 * @author lengleng
 * @date 2017/11/7
 */
@Data
public class RouteConfig implements Serializable{

    @JSONField(name = "path")
    private String path;
    @JSONField(name = "component")
    private String component;
    @JSONField(name = "name")
    private String name;
    @JSONField(name = "components")
    private String components;
    @JSONField(name = "redirect")
    private String redirect;
    @JSONField(name = "props")
    private String props;
    @JSONField(name = "alias")
    private String alias;
    @JSONField(name = "children")
    private String children;
    @JSONField(name = "beforeEnter")
    private String beforeEnter;
    @JSONField(name = "meta")
    private Map<String,String> meta;
    @JSONField(name = "caseSensitive")
    private Boolean caseSensitive;
    @JSONField(name = "pathToRegexpOptions")
    private String pathToRegexpOptions;
}
