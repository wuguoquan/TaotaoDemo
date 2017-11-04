package com.wugq.taotao.service.impl;

import com.wugq.taotao.mapper.SysUserMapper;
import com.wugq.taotao.pojo.SysUser;
import com.wugq.taotao.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Autowired
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser getById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}
}
