package com.sunq.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Page implements DBElement {

    private int pageNo;
    private int pageSize;

    @Override
    public void accept(SQLVisitor visitor) {
        visitor.visit(this);
    }
}
