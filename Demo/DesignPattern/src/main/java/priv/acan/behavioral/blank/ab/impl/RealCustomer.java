package priv.acan.behavioral.blank.ab.impl;

import priv.acan.behavioral.blank.ab.AbstractCustomer;

/**
 * @author acan
 * @version 2023/03/03 20:38
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
