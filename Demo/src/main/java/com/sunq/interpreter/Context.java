package com.sunq.interpreter;

public class Context {

    private int maxBlood;

    public Context(int maxBlood) {
        this.maxBlood = maxBlood;
    }

    public void showHarm(String info) {
        SplitExpression se = new SplitExpression();
        int harm = se.interpret(info);
        if (harm >= maxBlood) {
            System.out.println("对方英雄对我造成了" + harm + "伤害，我方阵亡");
        } else {
            System.out.println("对方英雄对我造成了" + harm + "伤害，我的血量剩余" + (maxBlood - harm));
        }
    }
}
