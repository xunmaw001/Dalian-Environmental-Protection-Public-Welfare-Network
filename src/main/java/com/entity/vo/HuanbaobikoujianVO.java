package com.entity.vo;

import com.entity.HuanbaobikoujianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 环保币扣减
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public class HuanbaobikoujianVO  implements Serializable {
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
	 * 扣减原因
	 */
	
	private String koujianyuanyin;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
				
	
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
				
	
	/**
	 * 设置：扣减原因
	 */
	 
	public void setKoujianyuanyin(String koujianyuanyin) {
		this.koujianyuanyin = koujianyuanyin;
	}
	
	/**
	 * 获取：扣减原因
	 */
	public String getKoujianyuanyin() {
		return koujianyuanyin;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
			
}
