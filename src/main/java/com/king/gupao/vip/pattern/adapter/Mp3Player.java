package com.king.gupao.vip.pattern.adapter;

/**
 * @author King Chen
 * @Date: 2019/3/17 17:52
 */
public class Mp3Player implements AdvancedMediaPlayer {
    @Override
    public void playMp3(String fileName) {
        System.out.println("听音乐：" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playRmvb(String fileName) {

    }
}
