package com.example.chatme.Model;

public class Chatlist {
    public String id;
    public String chatID;

    public String getChatID() {
        return chatID;
    }

    public void setChatID(String chatID) {
        this.chatID = chatID;
    }

    public Chatlist(String id, String chatID) {
        this.id = id;
        this.chatID = chatID;
    }

    public Chatlist() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
