package com.cgx.adapter;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-15 17:02
 **/
public class AudioPlayer implements MediaPlayer {

    public void play(String fileName) {
        System.out.println("mp3 player ，playing:"+fileName);
    }
}
