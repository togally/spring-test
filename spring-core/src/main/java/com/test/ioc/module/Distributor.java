package com.test.ioc.module;


/**
 *
 * @author togally
 */
public class Distributor {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Distributor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
