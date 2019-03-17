package com.king.gupao.vip.pattern.adapter;

/**
 * @author King Chen
 * @Date: 2019/3/17 17:55
 */
public class RmvbPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp3(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playRmvb(String fileName) {
        System.out.println("看RMVB格式视频：" + fileName);
    }
}
