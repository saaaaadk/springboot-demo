package com.Lei.controller;

import com.Lei.entity.R;
import com.Lei.entity.SysUser;
import com.Lei.service.SysUserService;
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
    public R userList(@RequestHeader(required = false)String token) {
        Map<String, Object> resultMap = new HashMap<>();
        List<SysUser> list = sysUserService.list();
        resultMap.put("userList", list);
        return R.ok(resultMap);
    }
    @PostMapping("login")
    public R login(){
        return null;
    }
}
