package com.jonas.util;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/08
 */
public class CodeGenerator {

    /**
     * 自动生成代码
     */
    public static void generateCode() {
        generateByTables(false, "com.jonas", "order");
    }

    private static void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {

    }

    public static void main(String[] args) {
        generateCode();
    }
}
