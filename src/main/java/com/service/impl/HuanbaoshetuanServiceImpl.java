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


import com.dao.HuanbaoshetuanDao;
import com.entity.HuanbaoshetuanEntity;
import com.service.HuanbaoshetuanService;
import com.entity.vo.HuanbaoshetuanVO;
import com.entity.view.HuanbaoshetuanView;

@Service("huanbaoshetuanService")
public class HuanbaoshetuanServiceImpl extends ServiceImpl<HuanbaoshetuanDao, HuanbaoshetuanEntity> implements HuanbaoshetuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanbaoshetuanEntity> page = this.selectPage(
                new Query<HuanbaoshetuanEntity>(params).getPage(),
                new EntityWrapper<HuanbaoshetuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanbaoshetuanEntity> wrapper) {
		  Page<HuanbaoshetuanView> page =new Query<HuanbaoshetuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanbaoshetuanVO> selectListVO(Wrapper<HuanbaoshetuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanbaoshetuanVO selectVO(Wrapper<HuanbaoshetuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanbaoshetuanView> selectListView(Wrapper<HuanbaoshetuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanbaoshetuanView selectView(Wrapper<HuanbaoshetuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
