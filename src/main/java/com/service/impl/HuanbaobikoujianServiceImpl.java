package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuanbaobikoujianDao;
import com.entity.HuanbaobikoujianEntity;
import com.service.HuanbaobikoujianService;
import com.entity.vo.HuanbaobikoujianVO;
import com.entity.view.HuanbaobikoujianView;

@Service("huanbaobikoujianService")
public class HuanbaobikoujianServiceImpl extends ServiceImpl<HuanbaobikoujianDao, HuanbaobikoujianEntity> implements HuanbaobikoujianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanbaobikoujianEntity> page = this.selectPage(
                new Query<HuanbaobikoujianEntity>(params).getPage(),
                new EntityWrapper<HuanbaobikoujianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanbaobikoujianEntity> wrapper) {
		  Page<HuanbaobikoujianView> page =new Query<HuanbaobikoujianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanbaobikoujianVO> selectListVO(Wrapper<HuanbaobikoujianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanbaobikoujianVO selectVO(Wrapper<HuanbaobikoujianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanbaobikoujianView> selectListView(Wrapper<HuanbaobikoujianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanbaobikoujianView selectView(Wrapper<HuanbaobikoujianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
