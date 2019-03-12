package com.king.gupao.vip.pattern.prototype;

/**
 * @author King Chen
 * @Date: 2019/3/12 19:53
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

