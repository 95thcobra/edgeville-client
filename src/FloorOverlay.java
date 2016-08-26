import java.io.IOException;
 
public final class FloorOverlay {
 
    public int value = -1;
    public static void unpackConfig(StreamLoader streamLoader) throws IOException {
        Stream stream = new Stream(streamLoader.getDataForName("overlay.dat"));
        int cacheSize = stream.readUnsignedWord();
        if (cache == null)
            cache = new FloorOverlay[cacheSize];
        for (int j = 0; j < cacheSize; j++) {
            if (cache[j] == null)
                cache[j] = new FloorOverlay();
            cache[j].readValues(stream);
        }
 
    }
 
    private void readValues(Stream stream) {
        do {
            int i = stream.readUnsignedByte();
            if (i == 0)
                return;
            else if (i == 1) {
                anInt390 = stream.read3Bytes();
                method262(anInt390);
            } else if (i == 2)
                anInt391 = stream.readUnsignedByte();
            else if (i == 5)
                hideUnderlay = false;
            else if (i == 7) {
                this.value = stream.read3Bytes();
                method262(value);
            } else {
                System.out.println("Error unrecognised config code: " + i);
            }
        } while (true);
    }
 
    private void method262(int arg0) {
        double d = (arg0 >> 16 & 0xff) / 256.0;
        double d_5_ = (arg0 >> 8 & 0xff) / 256.0;
        double d_6_ = (arg0 & 0xff) / 256.0;
        double d_7_ = d;
        if (d_5_ < d_7_) {
            d_7_ = d_5_;
        }
        if (d_6_ < d_7_) {
            d_7_ = d_6_;
        }
        double d_8_ = d;
        if (d_5_ > d_8_) {
            d_8_ = d_5_;
        }
        if (d_6_ > d_8_) {
            d_8_ = d_6_;
        }
        double d_9_ = 0.0;
        double d_10_ = 0.0;
        double d_11_ = (d_7_ + d_8_) / 2.0;
        if (d_7_ != d_8_) {
            if (d_11_ < 0.5) {
                d_10_ = (d_8_ - d_7_) / (d_8_ + d_7_);
            }
            if (d_11_ >= 0.5) {
                d_10_ = (d_8_ - d_7_) / (2.0 - d_8_ - d_7_);
            }
            if (d == d_8_) {
                d_9_ = (d_5_ - d_6_) / (d_8_ - d_7_);
            } else if (d_5_ == d_8_) {
                d_9_ = 2.0 + (d_6_ - d) / (d_8_ - d_7_);
            } else if (d_6_ == d_8_) {
                d_9_ = 4.0 + (d - d_5_) / (d_8_ - d_7_);
            }
        }
        d_9_ /= 6.0;
        anInt394 = (int) (d_9_ * 256.0);
        anInt395 = (int) (d_10_ * 256.0);
        anInt396 = (int) (d_11_ * 256.0);
        if (anInt395 < 0) {
            anInt395 = 0;
        } else if (anInt395 > 255) {
            anInt395 = 255;
        }
        if (anInt396 < 0) {
            anInt396 = 0;
        } else if (anInt396 > 255) {
            anInt396 = 255;
        }
        if (d_11_ > 0.5) {
            anInt398 = (int) ((1.0 - d_11_) * d_10_ * 512.0);
        } else {
            anInt398 = (int) (d_11_ * d_10_ * 512.0);
        }
        if (anInt398 < 1) {
            anInt398 = 1;
        }
        anInt397 = (int) (d_9_ * anInt398);
        anInt399 = method263(anInt394, anInt395, anInt396);
    }
 
    private final int method263(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        int i = (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
        return i;
    }
 
    private FloorOverlay() {
        anInt391 = -1;
        hideUnderlay = true;
    }
 
    public static FloorOverlay cache[];
    public int anInt390;
    public int anInt391;
    public boolean hideUnderlay;
    public int anInt394;
    public int anInt395;
    public int anInt396;
    public int anInt397;
    public int anInt398;
    public int anInt399;
}