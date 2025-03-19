package com.entity.view;

import com.entity.DuihuanshangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 兑换商城
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@TableName("duihuanshangcheng")
public class DuihuanshangchengView  extends DuihuanshangchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DuihuanshangchengView(){
	}
 
 	public DuihuanshangchengView(DuihuanshangchengEntity duihuanshangchengEntity){
 	try {
			BeanUtils.copyProperties(this, duihuanshangchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
