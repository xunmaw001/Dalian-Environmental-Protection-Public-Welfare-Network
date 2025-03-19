package com.entity.view;

import com.entity.YonghuhuanbaobiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户环保币
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@TableName("yonghuhuanbaobi")
public class YonghuhuanbaobiView  extends YonghuhuanbaobiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuhuanbaobiView(){
	}
 
 	public YonghuhuanbaobiView(YonghuhuanbaobiEntity yonghuhuanbaobiEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuhuanbaobiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
