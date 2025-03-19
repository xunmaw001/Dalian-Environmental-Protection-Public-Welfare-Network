package com.entity.model;

import com.entity.YonghuhuanbaobiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 用户环保币
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public class YonghuhuanbaobiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户名称
	 */
	
	private String yonghumingcheng;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 环保币
	 */
	
	private String huanbaobi;
				
	
	/**
	 * 设置：用户名称
	 */
	 
	public void setYonghumingcheng(String yonghumingcheng) {
		this.yonghumingcheng = yonghumingcheng;
	}
	
	/**
	 * 获取：用户名称
	 */
	public String getYonghumingcheng() {
		return yonghumingcheng;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：环保币
	 */
	 
	public void setHuanbaobi(String huanbaobi) {
		this.huanbaobi = huanbaobi;
	}
	
	/**
	 * 获取：环保币
	 */
	public String getHuanbaobi() {
		return huanbaobi;
	}
			
}
