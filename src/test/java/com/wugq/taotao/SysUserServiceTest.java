package com.wugq.taotao;

import com.wugq.taotao.pojo.SysUser;
import com.wugq.taotao.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class SysUserServiceTest {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void test1() {
        SysUser sysUser = sysUserService.getById(1L);
        System.out.println("--------------------------------" + sysUser.toString());
    }
}