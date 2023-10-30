package com.sunq.visitor;

public interface DBElement {

    void accept(SQLVisitor visitor);
}
