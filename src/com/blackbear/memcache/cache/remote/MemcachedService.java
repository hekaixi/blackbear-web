/*
 * Copyright (C) 2011-2015 ShenZhen iBOXPAY Information Technology Co.,Ltd.
 * 
 * All right reserved.
 * 
 * This software is the confidential and proprietary
 * information of iBoxPay Company of China. 
 * ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only
 * in accordance with the terms of the contract agreement 
 * you entered into with iBoxpay inc.
 *
 */
package com.blackbear.memcache.cache.remote;

/**
 * The class MemcachedService.
 *
 * Description: memcached缓存service接口
 *
 * @author: weiyuanhua
 * @since: 2015年11月21日 上午9:49:53 	
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
public interface MemcachedService {

	public boolean delete(String key);

	public void set(String key, Object object);

	public Object get(String key);

	public boolean deleteWithType(String key, Class<?> clazz);

	public void setWithType(String key, Object object);

	public void setWithType(String key, Object object, Class<?> clazz);

	public Object getWithType(String key, Class<?> clazz);

	public Object[] getWithType(String keys[], Class<?> clazz);

	public void setWithType(String keys[], Class<?> clazz, Object objects[]);
}
