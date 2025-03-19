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


import com.dao.DiscusshuanbaoshetuanDao;
import com.entity.DiscusshuanbaoshetuanEntity;
import com.service.DiscusshuanbaoshetuanService;
import com.entity.vo.DiscusshuanbaoshetuanVO;
import com.entity.view.DiscusshuanbaoshetuanView;

@Service("discusshuanbaoshetuanService")
public class DiscusshuanbaoshetuanServiceImpl extends ServiceImpl<DiscusshuanbaoshetuanDao, DiscusshuanbaoshetuanEntity> implements DiscusshuanbaoshetuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuanbaoshetuanEntity> page = this.selectPage(
                new Query<DiscusshuanbaoshetuanEntity>(params).getPage(),
                new EntityWrapper<DiscusshuanbaoshetuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuanbaoshetuanEntity> wrapper) {
		  Page<DiscusshuanbaoshetuanView> page =new Query<DiscusshuanbaoshetuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuanbaoshetuanVO> selectListVO(Wrapper<DiscusshuanbaoshetuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuanbaoshetuanVO selectVO(Wrapper<DiscusshuanbaoshetuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuanbaoshetuanView> selectListView(Wrapper<DiscusshuanbaoshetuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuanbaoshetuanView selectView(Wrapper<DiscusshuanbaoshetuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
