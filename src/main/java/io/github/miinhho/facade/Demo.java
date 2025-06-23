package io.github.miinhho.facade;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        var converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
