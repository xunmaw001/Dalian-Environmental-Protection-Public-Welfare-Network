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


import com.dao.HuanbaozhongchouDao;
import com.entity.HuanbaozhongchouEntity;
import com.service.HuanbaozhongchouService;
import com.entity.vo.HuanbaozhongchouVO;
import com.entity.view.HuanbaozhongchouView;

@Service("huanbaozhongchouService")
public class HuanbaozhongchouServiceImpl extends ServiceImpl<HuanbaozhongchouDao, HuanbaozhongchouEntity> implements HuanbaozhongchouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanbaozhongchouEntity> page = this.selectPage(
                new Query<HuanbaozhongchouEntity>(params).getPage(),
                new EntityWrapper<HuanbaozhongchouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanbaozhongchouEntity> wrapper) {
		  Page<HuanbaozhongchouView> page =new Query<HuanbaozhongchouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanbaozhongchouVO> selectListVO(Wrapper<HuanbaozhongchouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanbaozhongchouVO selectVO(Wrapper<HuanbaozhongchouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanbaozhongchouView> selectListView(Wrapper<HuanbaozhongchouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanbaozhongchouView selectView(Wrapper<HuanbaozhongchouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
