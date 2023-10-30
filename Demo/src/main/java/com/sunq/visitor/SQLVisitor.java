package com.sunq.visitor;

public interface SQLVisitor {

    void visit(Table table);

    void visit(Where where);
    void visit(Page page);
    void visit(Select select);

    String getSql();
}
