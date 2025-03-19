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


import com.dao.HuanbaobiruzhangDao;
import com.entity.HuanbaobiruzhangEntity;
import com.service.HuanbaobiruzhangService;
import com.entity.vo.HuanbaobiruzhangVO;
import com.entity.view.HuanbaobiruzhangView;

@Service("huanbaobiruzhangService")
public class HuanbaobiruzhangServiceImpl extends ServiceImpl<HuanbaobiruzhangDao, HuanbaobiruzhangEntity> implements HuanbaobiruzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanbaobiruzhangEntity> page = this.selectPage(
                new Query<HuanbaobiruzhangEntity>(params).getPage(),
                new EntityWrapper<HuanbaobiruzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanbaobiruzhangEntity> wrapper) {
		  Page<HuanbaobiruzhangView> page =new Query<HuanbaobiruzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanbaobiruzhangVO> selectListVO(Wrapper<HuanbaobiruzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanbaobiruzhangVO selectVO(Wrapper<HuanbaobiruzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanbaobiruzhangView> selectListView(Wrapper<HuanbaobiruzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanbaobiruzhangView selectView(Wrapper<HuanbaobiruzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
