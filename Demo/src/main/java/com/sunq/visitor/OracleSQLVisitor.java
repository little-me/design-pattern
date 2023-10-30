package com.sunq.visitor;

public class OracleSQLVisitor implements SQLVisitor {

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
        String oriSql = sql.toString();
        sql = new StringBuilder();
        sql.append("select * from(select rownum as rowno, t.* from(");
        sql.append(oriSql);
        sql.append(") t where rownum <= ");
        sql.append(page.getPageSize() * page.getPageNo());
        sql.append(") table_alias where table_alias.rowno >= ");
        sql.append(page.getPageSize() * (page.getPageNo() - 1));
    }

    @Override
    public void visit(Select select) {
        sql.append("select * from");
        for (Table table : select.getTableArr()) {
            visit(table);
        }
        visit(select.getWhere());
        visit(select.getPage());
    }

    @Override
    public String getSql() {
        return sql.toString();
    }
}
