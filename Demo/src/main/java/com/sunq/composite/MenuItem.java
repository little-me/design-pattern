package com.sunq.composite;

public class MenuItem extends AbstractMenu {

    private AbstractMenu parent;

    @Override
    public void create(String name) {
        this.name = name;
    }

    @Override
    public void delete() {
        // 直接删除当前对象...
    }

    public AbstractMenu getParent() {
        return parent;
    }

    public void setParent(AbstractMenu parent) {
        this.parent = parent;
    }
}
