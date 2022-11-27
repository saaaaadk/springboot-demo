package com.Lei.controller;

import com.Lei.entity.R;
import com.Lei.entity.SysUser;
import com.Lei.service.SysUserService;
import com.Lei.utils.JwtUtils;
import com.Lei.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/user/list")
    public R userList(@RequestHeader(required = false) String token) {
        if (!StringUtil.isEmpty(token)) {
            Map<String, Object> resultMap = new HashMap<>();
            List<SysUser> list = sysUserService.list();
            resultMap.put("userList", list);
            return R.ok(resultMap);
        } else {
            return R.error(401, "无访问权限");
        }
    }

    @GetMapping("login")
    public R login() {
        return R.ok().put("token", JwtUtils.genJwtToken("java123"));
    }
}
