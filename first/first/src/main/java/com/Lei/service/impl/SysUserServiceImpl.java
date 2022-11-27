package com.Lei.service.impl;

import com.Lei.entity.SysUser;
import com.Lei.mapper.SysUserMapper;
import com.Lei.service.SysUserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author 维磊
 * @description 针对表【sys_user】的数据库操作Service实现
 * @createDate 2022-11-02 19:02:18
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
        implements SysUserService {

    @Override
    public SysUser getByUsername(String username) {
        return getOne(new LambdaQueryWrapper<SysUser>().eq(SysUser::getUsername, username));
    }
}




