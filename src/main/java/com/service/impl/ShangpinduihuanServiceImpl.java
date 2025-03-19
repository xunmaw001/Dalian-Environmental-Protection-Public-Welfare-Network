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


import com.dao.ShangpinduihuanDao;
import com.entity.ShangpinduihuanEntity;
import com.service.ShangpinduihuanService;
import com.entity.vo.ShangpinduihuanVO;
import com.entity.view.ShangpinduihuanView;

@Service("shangpinduihuanService")
public class ShangpinduihuanServiceImpl extends ServiceImpl<ShangpinduihuanDao, ShangpinduihuanEntity> implements ShangpinduihuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinduihuanEntity> page = this.selectPage(
                new Query<ShangpinduihuanEntity>(params).getPage(),
                new EntityWrapper<ShangpinduihuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinduihuanEntity> wrapper) {
		  Page<ShangpinduihuanView> page =new Query<ShangpinduihuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinduihuanVO> selectListVO(Wrapper<ShangpinduihuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinduihuanVO selectVO(Wrapper<ShangpinduihuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinduihuanView> selectListView(Wrapper<ShangpinduihuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinduihuanView selectView(Wrapper<ShangpinduihuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
