package com.sunq.flyweight;

public class FlyWeightClient {
    public static void main(String[] args) {
        String music = "1231 1231";
        FlyFactory flyFactory = new FlyFactory();
        flyFactory.playMusic(music);
    }
}
