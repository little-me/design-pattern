package com.sunq.interpreter;

public class SkillExpression implements Expression {

    private PropertyExpression property;

    private int[] q_skill = new int[]{100, 200, 300, 400};
    private int q_skill_level;

    public SkillExpression(PropertyExpression property) {
        this.property = property;
    }

    @Override
    public int interpret(String info) {
        String[] split = info.split(" ");
        if ("Q".equals(split[0])) {
            q_skill_level = Integer.parseInt(split[1]);
        }
        return q_skill[q_skill_level - 1] + property.getIntelligence() * 2;
    }
}
