package com.arielaustria.oop.inheritance.interfaces.mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jenifer's Birthday");
        video.setUser(new User("John@domain.com"));

        var processor = new VideoProcessor(
                new XVideoEncoder(),
                new SqlVideoDatabase(),
                new EmailService());
        processor.process(video);
    }
}
