package com.entity.view;

import com.entity.DiscusshuanbaoshetuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 环保社团评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@TableName("discusshuanbaoshetuan")
public class DiscusshuanbaoshetuanView  extends DiscusshuanbaoshetuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusshuanbaoshetuanView(){
	}
 
 	public DiscusshuanbaoshetuanView(DiscusshuanbaoshetuanEntity discusshuanbaoshetuanEntity){
 	try {
			BeanUtils.copyProperties(this, discusshuanbaoshetuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
