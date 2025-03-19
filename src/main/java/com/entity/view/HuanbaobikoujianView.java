package com.entity.view;

import com.entity.HuanbaobikoujianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 环保币扣减
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@TableName("huanbaobikoujian")
public class HuanbaobikoujianView  extends HuanbaobikoujianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuanbaobikoujianView(){
	}
 
 	public HuanbaobikoujianView(HuanbaobikoujianEntity huanbaobikoujianEntity){
 	try {
			BeanUtils.copyProperties(this, huanbaobikoujianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
