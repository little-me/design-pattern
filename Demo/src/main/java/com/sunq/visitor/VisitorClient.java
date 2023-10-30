package com.sunq.visitor;

public class VisitorClient {
    public static void main(String[] args) {
        Table[] tables = new Table[]{new Table("PB_PAY_VOUCHER", "a"), new Table("PB_PAY_REQUEST", "b")};
        Where where = new Where(new String[]{"a.pay_voucher_id", "a.send_flag"}, new String[]{"b.pay_voucher_id", "1"});
        Page page = new Page(2, 10);
        Select select = new Select(tables, where, page);
        MySQLSQLVisitor visitor = new MySQLSQLVisitor();
        select.accept(visitor);
        String sql = visitor.getSql();
        System.out.println("MySQL的输出");
        System.out.println(sql);
        OracleSQLVisitor oraVisitor = new OracleSQLVisitor();
        select.accept(oraVisitor);
        String oraSql = oraVisitor.getSql();
        System.out.println("Oracle的输出");
        System.out.println(oraSql);
    }
}
