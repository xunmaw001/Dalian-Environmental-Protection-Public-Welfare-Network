package com.entity.view;

import com.entity.ZhongchouzhichiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 众筹支持
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@TableName("zhongchouzhichi")
public class ZhongchouzhichiView  extends ZhongchouzhichiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongchouzhichiView(){
	}
 
 	public ZhongchouzhichiView(ZhongchouzhichiEntity zhongchouzhichiEntity){
 	try {
			BeanUtils.copyProperties(this, zhongchouzhichiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
