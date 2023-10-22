package com.sunq.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<Colleague> colList;

    public Mediator() {
        this.colList = new ArrayList<>();
    }

    public void register(Colleague col) {
        if (!colList.contains(col)) {
            colList.add(col);
            col.setMediator(this);
        }
    }

    public void relay(Colleague col, String msg) {
        for (Colleague colleague : colList) {
            if (!colleague.equals(col)) {
                colleague.receive(col, msg);
            }
        }
    }

}
