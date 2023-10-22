package com.sunq.interpreter;

public class SplitExpression implements Expression {

    @Override
    public int interpret(String info) {
        // 对 30 32 40|q 解释，前三个是力量、敏捷、智力属性，后面是放的技能。
        String[] split = info.split("\\|");
        PropertyExpression pe = new PropertyExpression();
        pe.interpret(split[0]);
        SkillExpression se = new SkillExpression(pe);
        int harm = se.interpret(split[1]);
        return harm;
    }

}
