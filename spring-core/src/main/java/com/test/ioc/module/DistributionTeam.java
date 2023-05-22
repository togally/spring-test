package com.test.ioc.module;

import java.util.ArrayList;
import java.util.List;

/**
 * @author togally
 */
public class DistributionTeam {
    private List<Distributor> distributors;

    public DistributionTeam(Distributor distributor) {
        if (null == distributors){
            distributors = new ArrayList<Distributor>();
        }
        if (null != distributor){
            distributors.add(distributor);
        }
    }

    @Override
    public String toString() {
        return "DistributionTeam{" +
                "distributors=" + distributors +
                '}';
    }
}
