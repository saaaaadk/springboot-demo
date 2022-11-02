package com.Lei.entity;

import cn.hutool.jwt.Claims;
import lombok.Data;

@Data
public class CheckResult {
    private int errCode;
    private boolean success;
    private Claims claims;
}
