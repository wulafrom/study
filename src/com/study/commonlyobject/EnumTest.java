package com.study.commonlyobject;

/**
 * @version V1.0
 * @Description: 测试枚举
 * @author: h'mm
 * @date: 2020-10-02 13:35
 */
public enum EnumTest {
    /**
     * 红色
     */
    RED("红色", 1),
    /**
     * 黑色
     */
    BLACK("黑色", 2),
    /**
     * 白色
     */
    WHITE("白色", 3);

    /**
     * 枚举的名字
     */
    private String name;
    /**
     * 枚举的下标
     */
    private Integer index;

    EnumTest(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public static String  getName(Integer index){
        for (EnumTest enumTest : EnumTest.values()) {
            if(enumTest.getIndex().equals(index)){
                return enumTest.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String toString(){
        return this.index+" "+this.getName();
    }
}
