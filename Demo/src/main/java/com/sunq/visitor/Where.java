package com.sunq.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Where implements DBElement {

    private String[] fieldArr;
    private String[] valueArr;

    @Override
    public void accept(SQLVisitor visitor) {
        visitor.visit(this);
    }
}
