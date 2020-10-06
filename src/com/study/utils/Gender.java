package com.study.utils;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-06 15:01
 */
public enum Gender {
    /**
     * 女性
     */
    WOMAN("女",0),
    /**
     * 男性
     */
    MAN("男",1);

    private String gender;
    private int index;

    Gender(String gender, int index) {
        this.gender = gender;
        this.index = index;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
