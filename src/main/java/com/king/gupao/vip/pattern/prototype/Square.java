package com.king.gupao.vip.pattern.prototype;

/**
 * @author King Chen
 * @Date: 2019/3/12 19:54
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
