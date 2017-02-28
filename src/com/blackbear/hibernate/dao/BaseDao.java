package com.blackbear.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao{
 
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
     
    public Session getSession() {
        //事务配置后，可通过getCurrentSession方法获得session
        return sessionFactory.getCurrentSession();
    }
    public void setSession(Session session) {
        this.session = session;
    }
     
     
    public void saveOrUpdate(Object obj){
        this.getSession().saveOrUpdate(obj);
        System.out.println("保存完成...");
    }
    
    public void save(Object obj){
        this.getSession().save(obj);
        System.out.println("保存完成...");
    }
}



