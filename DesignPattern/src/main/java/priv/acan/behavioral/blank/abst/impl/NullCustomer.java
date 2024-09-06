package priv.acan.behavioral.blank.abst.impl;

import priv.acan.behavioral.blank.abst.AbstractCustomer;

/**
 * @author acan
 * @since 2023/03/03 20:36
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
