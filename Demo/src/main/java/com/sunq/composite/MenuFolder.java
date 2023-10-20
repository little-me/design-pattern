package com.sunq.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuFolder extends AbstractMenu {

    private List<AbstractMenu> childList = new ArrayList<>();

    @Override
    public void create(String name) {
        this.name = name;
    }

    @Override
    public void delete() {
        for (AbstractMenu menu : childList) {
            menu.delete();
        }
        // 再删除当前对象...
    }

    public void addChild(AbstractMenu child) {
        childList.add(child);
    }

    public List<AbstractMenu> getChildList() {
        return childList;
    }
}
