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


import com.dao.HuanbaofenleiDao;
import com.entity.HuanbaofenleiEntity;
import com.service.HuanbaofenleiService;
import com.entity.vo.HuanbaofenleiVO;
import com.entity.view.HuanbaofenleiView;

@Service("huanbaofenleiService")
public class HuanbaofenleiServiceImpl extends ServiceImpl<HuanbaofenleiDao, HuanbaofenleiEntity> implements HuanbaofenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanbaofenleiEntity> page = this.selectPage(
                new Query<HuanbaofenleiEntity>(params).getPage(),
                new EntityWrapper<HuanbaofenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanbaofenleiEntity> wrapper) {
		  Page<HuanbaofenleiView> page =new Query<HuanbaofenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanbaofenleiVO> selectListVO(Wrapper<HuanbaofenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanbaofenleiVO selectVO(Wrapper<HuanbaofenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanbaofenleiView> selectListView(Wrapper<HuanbaofenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanbaofenleiView selectView(Wrapper<HuanbaofenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
