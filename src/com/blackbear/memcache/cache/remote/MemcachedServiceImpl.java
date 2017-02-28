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

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.danga.MemCached.MemCachedClient;

/**
 * The class MemcachedServiceImpl.
 *
 * Description: memcached缓存service实现类
 *
 * @author: weiyuanhua
 * @since: 2015年11月21日 上午9:49:06 	
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
//@Service("memcachedService")
public class MemcachedServiceImpl implements MemcachedService {

    private static final Log log = LogFactory.getLog(MemcachedServiceImpl.class);
    private static final long serialVersionUID = 1;

//    @Resource
    MemCachedClient memCachedClient;

    public void setMemCachedClient(MemCachedClient memCachedClient) {
        this.memCachedClient = memCachedClient;

        // 序列化
        if (this.memCachedClient != null) {
            this.memCachedClient.setPrimitiveAsString(true);
        }
    }

    public boolean delete(String key) {
        return memCachedClient.delete(key);
    }

    public void set(String key, Object object) {
        if (object != null)
            memCachedClient.set(key, object);
        else memCachedClient.delete(key);
    }

    public Object get(String key) {
        return memCachedClient.get(key);
    }

    public boolean deleteWithType(String key, Class clazz) {
        return memCachedClient.delete(getKeyWithType(key, clazz));
    }

    public Object getWithType(String key, Class clazz) {
        return memCachedClient.get(getKeyWithType(key, clazz));
    }

    public void setWithType(String key, Object object) {
        memCachedClient.set(getKeyWithType(key, object.getClass()), object);
    }

    public void setWithType(String key, Object object, Class clazz) {
        if (object != null)
            memCachedClient.set(getKeyWithType(key, clazz), object);
        else memCachedClient.delete(getKeyWithType(key, clazz));
    }

    protected String getKeyWithType(String key, Class clazz) {
        return clazz.getSimpleName() + "-" + key;
    }

    @Override
    public Object[] getWithType(String[] keys, Class clazz) {
        for (int i = 0; i < keys.length; i++) {
            keys[i] = getKeyWithType(keys[i], clazz);
        }
        try {
            return memCachedClient.getMultiArray(keys);
        } catch (Exception e) {}
        return new Object[0];
    }

    @Override
    public void setWithType(String[] keys, Class clazz, Object[] objects) {
        for (int i = 0; i < keys.length; i++) {
            memCachedClient.set(getKeyWithType(keys[i], clazz), objects[i]);
        }
    }



}
