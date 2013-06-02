package com.tl.mediacodecandroid;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;

public class MediaCodecData {
    public void getcodecinfo() {
        int count = MediaCodecList.getCodecCount();
//        String output = "";
        for (int idx = 0; idx < count; idx++) {
            MediaCodecInfo mediaCodecInfo = MediaCodecList.getCodecInfoAt(idx);

            String name = mediaCodecInfo.getName();
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            boolean isEncoder = mediaCodecInfo.isEncoder();
            log(name);
            log("> " + (isEncoder ? "encoder" : "decoder"));
            for (String typeData : supportedTypes) {
                log(typeData);
            }

//            output += name + "\n";
//            output += "> " + (isEncoder ? "encoder" : "decoder");

        }
    }

    void log(String aString) {
        Log.i("MediaCodec", aString);
    }
}
