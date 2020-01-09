package com.mobius.vision.jdk8.methodreference;

/**
 * @author NingXioaoming
 * @createTime 2019/11/11 16:23
 * @description
 */
public class StudentCompare {

    public int compareByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

}
