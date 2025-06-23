package io.github.miinhho.facade.media;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        switch (file.getCodecType()) {
            case "mp4":
                return new MPEG4CompressionCodec();
            default:
                return new OggCompressionCodec();
        }
    }
}
