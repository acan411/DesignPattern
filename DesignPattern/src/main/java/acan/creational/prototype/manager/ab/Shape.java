package acan.creational.prototype.manager.ab;

public abstract class Shape implements Cloneable {

    private int id;
    protected String type;

    public Shape() {
    }

    protected Shape(int id) {
        this.id = id;
    }

    protected abstract void draw();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    public Shape clone() {
        try {
            // TODO: 复制此处的可变状态，这样此克隆就不能更改初始克隆的内部项
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
