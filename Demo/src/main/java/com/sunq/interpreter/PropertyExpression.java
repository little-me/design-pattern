package com.sunq.interpreter;

public class PropertyExpression implements Expression {

    /**
     * 力量属性
     */
    private int strength;
    /**
     * 敏捷属性
     */
    private int agility;
    /**
     * 智力属性
     */
    private int intelligence;

    @Override
    public int interpret(String info) {
        String[] split = info.split(" ");
        strength = Integer.parseInt(split[0]);
        agility = Integer.parseInt(split[1]);
        intelligence = Integer.parseInt(split[2]);
        return 0;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
