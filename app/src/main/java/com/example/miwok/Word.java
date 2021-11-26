package com.example.miwok;

public class Word {
    private String english;
    private String miwok;
    private int id;
    private int media;

    public Word(String english, String miwok, int media) {
        this.setEnglish(english);
        this.setMiwok(miwok);
        this.media = media;
    }

    public Word(String english, String miwok, int id, int media) {
        this.english = english;
        this.miwok = miwok;
        this.id = id;
        this.media = media;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMiwok() {
        return miwok;
    }

    public void setMiwok(String miwok) {
        this.miwok = miwok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedia() {
        return media;
    }
}
