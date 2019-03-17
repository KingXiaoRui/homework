package com.king.gupao.vip.pattern.adapter;

/**
 * @author King Chen
 * @Date: 2019/3/17 17:50
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp3")) {
            advancedMediaPlayer = new Mp3Player();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("rmvb")) {
            advancedMediaPlayer = new RmvbPlayer();
        }
    }

    @Override
    public void play(String type, String fileName) {
        if (type.equalsIgnoreCase("mp3")) {
            advancedMediaPlayer.playMp3(fileName);
        } else if (type.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else if (type.equalsIgnoreCase("rmvb")) {
            advancedMediaPlayer.playRmvb(fileName);
        }
    }
}
