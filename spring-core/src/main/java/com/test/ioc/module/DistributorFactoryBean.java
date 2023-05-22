package com.test.ioc.module;

/**
 * @author togally
 */
public class DistributorFactoryBean {
    public Distributor getObject(){
        Distributor distributor = new Distributor();
        distributor.setAge(22);
        distributor.setName("lisi");
        return distributor;
    }
}
