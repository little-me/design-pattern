package com.sunq.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Table implements DBElement {

    private String name;
    private String alias;
    @Override
    public void accept(SQLVisitor visitor) {
        visitor.visit(this);
    }
}
