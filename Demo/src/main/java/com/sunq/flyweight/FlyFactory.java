package com.sunq.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyFactory {

    private List<Tune> tuneList;

    public FlyFactory() {
        this.tuneList = new ArrayList<>();
        DoTune doTune = new DoTune();
        ReTune reTune = new ReTune();
        MiTune miTune = new MiTune();
        tuneList.add(doTune);
        tuneList.add(reTune);
        tuneList.add(miTune);
    }

    private Tune getTune(char c) {
        return tuneList.get((int)c - 49);
    }

    public void playMusic(String music) {
        char[] charArray = music.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if ((int) c == 32) {
                continue;
            }
            getTune(c).play();
        }
    }


}
