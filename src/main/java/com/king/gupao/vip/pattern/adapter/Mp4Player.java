package com.king.gupao.vip.pattern.adapter;

/**
 * @author King Chen
 * @Date: 2019/3/17 17:54
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp3(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("看MP4格式视频：" + fileName);
    }

    @Override
    public void playRmvb(String fileName) {

    }
}