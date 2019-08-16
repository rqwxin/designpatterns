package com.cgx.adapter;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-15 17:07
 **/
public class AdapterDemo {

    public static void main(String[] args) {
        System.out.println("-----旧需求---------");
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("hello");

        System.out.println("-----新需求adapter---------");
        Mp4Player mp4Player = new Mp4Player();
        MediaPlayerAdapter adapter = new MediaPlayerAdapter(mp4Player);
        adapter.play("要要要");
    }
}
