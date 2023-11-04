package com.sunq.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ScoreItem {

    private String name;

    /**
     * 比重
     */
    private double factor;
    private double score;

}
