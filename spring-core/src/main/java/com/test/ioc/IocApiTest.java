package com.test.ioc;

import com.test.ioc.module.DistributionTeam;
import com.test.ioc.module.Distributor;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author togally
 */
public class IocApiTest {

    private ApplicationContext context;

    @Before
    public void before(){
        context = new ClassPathXmlApplicationContext("classpath:IocTest.xml");
    }

    /**
     * property di must create property's setMethod
     */
    @Test
    public void propertyInject(){
        Distributor zhangsan = context.getBean("zhangsan",Distributor.class);
        System.out.println(zhangsan.toString());
    }

    @Test
    public void constructInject(){
        DistributionTeam team = context.getBean(DistributionTeam.class);
        System.out.println(team.toString());
    }

    @Test
    public void factoryBeanInject(){
        Distributor distributor = context.getBean("lisi",Distributor.class);
        System.out.println(distributor.toString());
    }
}
