package io.github.miinhho.facade;

import java.io.File;

import io.github.miinhho.facade.media.AudioMixer;
import io.github.miinhho.facade.media.BitrateReader;
import io.github.miinhho.facade.media.Codec;
import io.github.miinhho.facade.media.CodecFactory;
import io.github.miinhho.facade.media.MPEG4CompressionCodec;
import io.github.miinhho.facade.media.OggCompressionCodec;
import io.github.miinhho.facade.media.VideoFile;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started");
        var file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);

        Codec destinationCodec = switch (format) {
            case "mp4" -> new MPEG4CompressionCodec();
            default -> new OggCompressionCodec();
        };

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFascade: conversion completed");
        return result;
    }
}
