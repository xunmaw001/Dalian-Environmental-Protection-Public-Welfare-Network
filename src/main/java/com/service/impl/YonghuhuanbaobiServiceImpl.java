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


import com.dao.YonghuhuanbaobiDao;
import com.entity.YonghuhuanbaobiEntity;
import com.service.YonghuhuanbaobiService;
import com.entity.vo.YonghuhuanbaobiVO;
import com.entity.view.YonghuhuanbaobiView;

@Service("yonghuhuanbaobiService")
public class YonghuhuanbaobiServiceImpl extends ServiceImpl<YonghuhuanbaobiDao, YonghuhuanbaobiEntity> implements YonghuhuanbaobiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuhuanbaobiEntity> page = this.selectPage(
                new Query<YonghuhuanbaobiEntity>(params).getPage(),
                new EntityWrapper<YonghuhuanbaobiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuhuanbaobiEntity> wrapper) {
		  Page<YonghuhuanbaobiView> page =new Query<YonghuhuanbaobiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuhuanbaobiVO> selectListVO(Wrapper<YonghuhuanbaobiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuhuanbaobiVO selectVO(Wrapper<YonghuhuanbaobiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuhuanbaobiView> selectListView(Wrapper<YonghuhuanbaobiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuhuanbaobiView selectView(Wrapper<YonghuhuanbaobiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
