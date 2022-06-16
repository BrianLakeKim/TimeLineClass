package com.example.timelineclass;

public class Comment {
    public String name;
    public String videoTime;
    public String content;

    public Comment(String name, String videoTime, String content) {
        this.name = name;
        this.videoTime = videoTime;
        this.content = content;
    }
    public Comment(String name, String content){
        this.name = name;
        this.content = content;
    }

    public Comment(){
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
