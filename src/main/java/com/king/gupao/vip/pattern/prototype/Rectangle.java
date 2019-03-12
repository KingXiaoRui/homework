package com.king.gupao.vip.pattern.prototype;

/**
 * @author King Chen
 * @Date: 2019/3/12 19:55
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
