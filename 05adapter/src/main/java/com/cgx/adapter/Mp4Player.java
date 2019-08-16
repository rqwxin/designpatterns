package com.cgx.adapter;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-15 17:11
 **/
public class Mp4Player implements AdvancedMediaPlayer {
    public void playMp4(String fileName) {
        System.out.println("mp4 player，playing:"+fileName);
    }
}
