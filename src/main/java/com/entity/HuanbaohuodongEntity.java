package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 环保活动
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@TableName("huanbaohuodong")
public class HuanbaohuodongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuanbaohuodongEntity() {
		
	}
	
	public HuanbaohuodongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 社团编号
	 */
					
	private String shetuanbianhao;
	
	/**
	 * 社团名称
	 */
					
	private String shetuanmingcheng;
	
	/**
	 * 活动名称
	 */
					
	private String huodongmingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 环保类型
	 */
					
	private String huanbaoleixing;
	
	/**
	 * 活动时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date huodongshijian;
	
	/**
	 * 活动地点
	 */
					
	private String huodongdidian;
	
	/**
	 * 报名文档
	 */
					
	private String baomingwendang;
	
	/**
	 * 活动介绍
	 */
					
	private String huodongjieshao;
	
	/**
	 * 活动进展
	 */
					
	private String huodongjinzhan;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：社团编号
	 */
	public void setShetuanbianhao(String shetuanbianhao) {
		this.shetuanbianhao = shetuanbianhao;
	}
	/**
	 * 获取：社团编号
	 */
	public String getShetuanbianhao() {
		return shetuanbianhao;
	}
	/**
	 * 设置：社团名称
	 */
	public void setShetuanmingcheng(String shetuanmingcheng) {
		this.shetuanmingcheng = shetuanmingcheng;
	}
	/**
	 * 获取：社团名称
	 */
	public String getShetuanmingcheng() {
		return shetuanmingcheng;
	}
	/**
	 * 设置：活动名称
	 */
	public void setHuodongmingcheng(String huodongmingcheng) {
		this.huodongmingcheng = huodongmingcheng;
	}
	/**
	 * 获取：活动名称
	 */
	public String getHuodongmingcheng() {
		return huodongmingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：环保类型
	 */
	public void setHuanbaoleixing(String huanbaoleixing) {
		this.huanbaoleixing = huanbaoleixing;
	}
	/**
	 * 获取：环保类型
	 */
	public String getHuanbaoleixing() {
		return huanbaoleixing;
	}
	/**
	 * 设置：活动时间
	 */
	public void setHuodongshijian(Date huodongshijian) {
		this.huodongshijian = huodongshijian;
	}
	/**
	 * 获取：活动时间
	 */
	public Date getHuodongshijian() {
		return huodongshijian;
	}
	/**
	 * 设置：活动地点
	 */
	public void setHuodongdidian(String huodongdidian) {
		this.huodongdidian = huodongdidian;
	}
	/**
	 * 获取：活动地点
	 */
	public String getHuodongdidian() {
		return huodongdidian;
	}
	/**
	 * 设置：报名文档
	 */
	public void setBaomingwendang(String baomingwendang) {
		this.baomingwendang = baomingwendang;
	}
	/**
	 * 获取：报名文档
	 */
	public String getBaomingwendang() {
		return baomingwendang;
	}
	/**
	 * 设置：活动介绍
	 */
	public void setHuodongjieshao(String huodongjieshao) {
		this.huodongjieshao = huodongjieshao;
	}
	/**
	 * 获取：活动介绍
	 */
	public String getHuodongjieshao() {
		return huodongjieshao;
	}
	/**
	 * 设置：活动进展
	 */
	public void setHuodongjinzhan(String huodongjinzhan) {
		this.huodongjinzhan = huodongjinzhan;
	}
	/**
	 * 获取：活动进展
	 */
	public String getHuodongjinzhan() {
		return huodongjinzhan;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}
