package com.alibaba.cola.dto;

import java.io.Serializable;

/**
 *
 * 数据传输对象，包括命令、查询和响应
 * Data Transfer object, including Command, Query and Response, 
 *
 * 命令和查询是CQRS的概念
 * Command and Query is CQRS concept.
 *
 * DTO 用于数据传输。实现了序列化接口
 *
 *
 * @author fulan.zjf 2017年10月21日 下午8:53:55
 */
public abstract class DTO implements Serializable{

	private static final long serialVersionUID = 1L;

}
