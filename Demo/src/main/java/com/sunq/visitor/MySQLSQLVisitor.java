package com.sunq.visitor;

public class MySQLSQLVisitor implements SQLVisitor {

    StringBuilder sql = new StringBuilder();
    @Override
    public void visit(Table table) {
        sql.append(" ");
        sql.append(table.getName());
        sql.append(" ");
        sql.append(table.getAlias());
    }

    @Override
    public void visit(Where where) {
        sql.append(" where 1=1");
        for (int i = 0; i < where.getFieldArr().length; i++) {
            sql.append(" ");
            sql.append("and");
            sql.append(" ");
            sql.append(where.getFieldArr()[i]);
            sql.append(" = ");
            sql.append(where.getValueArr()[i]);
        }
    }

    @Override
    public void visit(Page page) {
        sql.append(" limit ");
        sql.append(page.getPageNo());
        sql.append(",");
        sql.append(page.getPageSize());
    }

    @Override
    public void visit(Select select) {
        sql.append("select * from");
        for (Table table : select.getTableArr()) {
            visit(table);
            sql.append(",");
        }
        // 去除最后一个逗号
        sql.deleteCharAt(sql.length() - 1);
        visit(select.getWhere());
        visit(select.getPage());
    }

    @Override
    public String getSql() {
        return sql.toString();
    }
}
