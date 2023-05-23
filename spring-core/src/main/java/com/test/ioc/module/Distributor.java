package com.test.ioc.module;


import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author togally
 */
public class Distributor {
    private String name;
    private Integer age;
    @Value("type")
    private String type;
    @Value("#{systemProperties['os.name']}")
    private String osName;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(@Value("88")Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Distributor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", osName='" + osName + '\'' +
                '}';
    }
}
