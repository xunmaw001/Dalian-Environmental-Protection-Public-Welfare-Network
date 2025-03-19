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


import com.dao.JiaruhuanbaoshetuanDao;
import com.entity.JiaruhuanbaoshetuanEntity;
import com.service.JiaruhuanbaoshetuanService;
import com.entity.vo.JiaruhuanbaoshetuanVO;
import com.entity.view.JiaruhuanbaoshetuanView;

@Service("jiaruhuanbaoshetuanService")
public class JiaruhuanbaoshetuanServiceImpl extends ServiceImpl<JiaruhuanbaoshetuanDao, JiaruhuanbaoshetuanEntity> implements JiaruhuanbaoshetuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaruhuanbaoshetuanEntity> page = this.selectPage(
                new Query<JiaruhuanbaoshetuanEntity>(params).getPage(),
                new EntityWrapper<JiaruhuanbaoshetuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaruhuanbaoshetuanEntity> wrapper) {
		  Page<JiaruhuanbaoshetuanView> page =new Query<JiaruhuanbaoshetuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaruhuanbaoshetuanVO> selectListVO(Wrapper<JiaruhuanbaoshetuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaruhuanbaoshetuanVO selectVO(Wrapper<JiaruhuanbaoshetuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaruhuanbaoshetuanView> selectListView(Wrapper<JiaruhuanbaoshetuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaruhuanbaoshetuanView selectView(Wrapper<JiaruhuanbaoshetuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
