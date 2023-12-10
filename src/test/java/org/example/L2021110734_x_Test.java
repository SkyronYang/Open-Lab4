package org.example;

import org.junit.Assert;
import org.junit.Test;

public class L2021110734_x_Test {
    // 测试用例设计原则: 等价类划分
    // 1. 分数可以整除，返回整数形式
    // 2. 分数不能整除，无循环小数
    // 3. 分数不能整除，有循环小数

    @Test
    public void testFractionToDecimal_case1() {
        Solution1 solution = new Solution1();
        int numerator = 1;
        int denominator = 2;
        String expected = "0.5";
        String result = solution.fractionToDecimal(numerator, denominator);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFractionToDecimal_case2() {
        Solution1 solution = new Solution1();
        int numerator = 2;
        int denominator = 3;
        String expected = "2";
        String result = solution.fractionToDecimal(numerator, denominator);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFractionToDecimal_case3() {
        Solution1 solution = new Solution1();
        int numerator = 4;
        int denominator = 333;
        String expected = "0.(012)";
        String result = solution.fractionToDecimal(numerator, denominator);
        Assert.assertEquals(expected, result);
    }
}