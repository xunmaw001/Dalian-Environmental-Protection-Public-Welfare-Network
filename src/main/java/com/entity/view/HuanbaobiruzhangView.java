package com.entity.view;

import com.entity.HuanbaobiruzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 环保币入账
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@TableName("huanbaobiruzhang")
public class HuanbaobiruzhangView  extends HuanbaobiruzhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuanbaobiruzhangView(){
	}
 
 	public HuanbaobiruzhangView(HuanbaobiruzhangEntity huanbaobiruzhangEntity){
 	try {
			BeanUtils.copyProperties(this, huanbaobiruzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
