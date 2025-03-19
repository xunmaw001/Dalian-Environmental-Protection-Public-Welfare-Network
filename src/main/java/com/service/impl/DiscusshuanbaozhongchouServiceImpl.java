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


import com.dao.DiscusshuanbaozhongchouDao;
import com.entity.DiscusshuanbaozhongchouEntity;
import com.service.DiscusshuanbaozhongchouService;
import com.entity.vo.DiscusshuanbaozhongchouVO;
import com.entity.view.DiscusshuanbaozhongchouView;

@Service("discusshuanbaozhongchouService")
public class DiscusshuanbaozhongchouServiceImpl extends ServiceImpl<DiscusshuanbaozhongchouDao, DiscusshuanbaozhongchouEntity> implements DiscusshuanbaozhongchouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuanbaozhongchouEntity> page = this.selectPage(
                new Query<DiscusshuanbaozhongchouEntity>(params).getPage(),
                new EntityWrapper<DiscusshuanbaozhongchouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuanbaozhongchouEntity> wrapper) {
		  Page<DiscusshuanbaozhongchouView> page =new Query<DiscusshuanbaozhongchouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuanbaozhongchouVO> selectListVO(Wrapper<DiscusshuanbaozhongchouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuanbaozhongchouVO selectVO(Wrapper<DiscusshuanbaozhongchouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuanbaozhongchouView> selectListView(Wrapper<DiscusshuanbaozhongchouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuanbaozhongchouView selectView(Wrapper<DiscusshuanbaozhongchouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
