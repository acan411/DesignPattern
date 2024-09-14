package priv.acan.creational.prototype.abst;

import lombok.Getter;

@Getter
public abstract class Shape implements Cloneable {

    protected String type;

    public Shape() {
    }

    protected abstract void setType();

    protected abstract void draw();

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
