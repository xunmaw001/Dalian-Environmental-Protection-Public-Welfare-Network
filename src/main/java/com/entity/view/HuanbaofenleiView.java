package com.entity.view;

import com.entity.HuanbaofenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 环保分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@TableName("huanbaofenlei")
public class HuanbaofenleiView  extends HuanbaofenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuanbaofenleiView(){
	}
 
 	public HuanbaofenleiView(HuanbaofenleiEntity huanbaofenleiEntity){
 	try {
			BeanUtils.copyProperties(this, huanbaofenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
