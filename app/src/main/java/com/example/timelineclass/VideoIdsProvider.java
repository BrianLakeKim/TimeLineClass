package com.example.timelineclass;

import java.util.Random;

public class VideoIdsProvider {
    private static String[] videoIds = {"yxGttpWEE4k","JGgvS42r48M", "j-fHOhD2QEY", "DfTheAvnWcE"};
    private static String[] liveVideoIds = {"0psx53682aY&t=16s"};
    private static Random random = new Random();

    public static String getNextVideoId(){
        return videoIds[random.nextInt(videoIds.length)];
    }

    public static String getNextLiveVideoId(){
        return liveVideoIds[random.nextInt(liveVideoIds.length)];
    }
}