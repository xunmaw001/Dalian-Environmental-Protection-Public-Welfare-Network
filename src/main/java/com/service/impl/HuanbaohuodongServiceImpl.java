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


import com.dao.HuanbaohuodongDao;
import com.entity.HuanbaohuodongEntity;
import com.service.HuanbaohuodongService;
import com.entity.vo.HuanbaohuodongVO;
import com.entity.view.HuanbaohuodongView;

@Service("huanbaohuodongService")
public class HuanbaohuodongServiceImpl extends ServiceImpl<HuanbaohuodongDao, HuanbaohuodongEntity> implements HuanbaohuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanbaohuodongEntity> page = this.selectPage(
                new Query<HuanbaohuodongEntity>(params).getPage(),
                new EntityWrapper<HuanbaohuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanbaohuodongEntity> wrapper) {
		  Page<HuanbaohuodongView> page =new Query<HuanbaohuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanbaohuodongVO> selectListVO(Wrapper<HuanbaohuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanbaohuodongVO selectVO(Wrapper<HuanbaohuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanbaohuodongView> selectListView(Wrapper<HuanbaohuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanbaohuodongView selectView(Wrapper<HuanbaohuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
