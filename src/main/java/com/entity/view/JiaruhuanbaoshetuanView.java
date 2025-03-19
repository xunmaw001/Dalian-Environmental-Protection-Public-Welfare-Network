package com.entity.view;

import com.entity.JiaruhuanbaoshetuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 加入环保社团
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@TableName("jiaruhuanbaoshetuan")
public class JiaruhuanbaoshetuanView  extends JiaruhuanbaoshetuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaruhuanbaoshetuanView(){
	}
 
 	public JiaruhuanbaoshetuanView(JiaruhuanbaoshetuanEntity jiaruhuanbaoshetuanEntity){
 	try {
			BeanUtils.copyProperties(this, jiaruhuanbaoshetuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
