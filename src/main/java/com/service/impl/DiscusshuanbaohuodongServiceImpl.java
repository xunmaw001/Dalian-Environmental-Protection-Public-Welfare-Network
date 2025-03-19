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


import com.dao.DiscusshuanbaohuodongDao;
import com.entity.DiscusshuanbaohuodongEntity;
import com.service.DiscusshuanbaohuodongService;
import com.entity.vo.DiscusshuanbaohuodongVO;
import com.entity.view.DiscusshuanbaohuodongView;

@Service("discusshuanbaohuodongService")
public class DiscusshuanbaohuodongServiceImpl extends ServiceImpl<DiscusshuanbaohuodongDao, DiscusshuanbaohuodongEntity> implements DiscusshuanbaohuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuanbaohuodongEntity> page = this.selectPage(
                new Query<DiscusshuanbaohuodongEntity>(params).getPage(),
                new EntityWrapper<DiscusshuanbaohuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuanbaohuodongEntity> wrapper) {
		  Page<DiscusshuanbaohuodongView> page =new Query<DiscusshuanbaohuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuanbaohuodongVO> selectListVO(Wrapper<DiscusshuanbaohuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuanbaohuodongVO selectVO(Wrapper<DiscusshuanbaohuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuanbaohuodongView> selectListView(Wrapper<DiscusshuanbaohuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuanbaohuodongView selectView(Wrapper<DiscusshuanbaohuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
