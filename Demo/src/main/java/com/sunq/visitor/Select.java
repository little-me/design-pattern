package com.sunq.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Select implements DBElement {

    private Table[] tableArr;
    private Where where;
    private Page page;


    @Override
    public void accept(SQLVisitor visitor) {
        visitor.visit(this);
    }
}
