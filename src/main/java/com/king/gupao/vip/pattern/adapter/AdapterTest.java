package com.king.gupao.vip.pattern.adapter;

/**
 * @author King Chen
 * @Date: 2019/3/17 18:05
 */
public class AdapterTest {
    public static void main(String[] args) {

        System.out.println("点开视频");
        String fileName = "这是一首歌.mp3";
        String type = fileName.split("\\.")[1];
        MediaAdapter mediaAdapter = new MediaAdapter(type);

        mediaAdapter.play(type, fileName);
    }
}
