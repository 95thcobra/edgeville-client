
public final class FloorUnderlay {

	public static void unpackConfig(StreamLoader streamLoader) {
		Stream stream = new Stream(streamLoader.getDataForName("underlay.dat"));
		int cacheSize = stream.readUnsignedWord();
		if (cache == null)
			cache = new FloorUnderlay[cacheSize];
		for (int j = 0; j < cacheSize; j++) {
			if (cache[j] == null)
				cache[j] = new FloorUnderlay();
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
			}
		} while (true);
	}

	private void method262(int i) {
		final double d = ((i >> 16) & 0xff) / 256.0;
		final double d_3_ = ((i >> 8) & 0xff) / 256.0;
		final double d_4_ = (i & 0xff) / 256.0;
		double d_5_ = d;
		if (d_3_ < d) {
			d_5_ = d_3_;
		}
		if (d_4_ < d_5_) {
			d_5_ = d_4_;
		}
		double d_6_ = d;
		if (d_3_ > d) {
			d_6_ = d_3_;
		}
		if (d_4_ > d_6_) {
			d_6_ = d_4_;
		}
		double d_7_ = 0.0;
		double d_8_ = 0.0;
		final double d_9_ = (d_5_ + d_6_) / 2.0;
		if (d_6_ != d_5_) {
			if (d_9_ < 0.5) {
				d_8_ = (d_6_ - d_5_) / (d_5_ + d_6_);
			}
			if (d_9_ >= 0.5) {
				d_8_ = (d_6_ - d_5_) / (2.0 - d_6_ - d_5_);
			}
			if (d_6_ == d) {
				d_7_ = (d_3_ - d_4_) / (d_6_ - d_5_);
			} else if (d_3_ == d_6_) {
				d_7_ = ((d_4_ - d) / (d_6_ - d_5_)) + 2.0;
			} else if (d_6_ == d_4_) {
				d_7_ = 4.0 + ((d - d_3_) / (d_6_ - d_5_));
			}
		}
		d_7_ /= 6.0;
		anInt394 = (int) (d_7_ * 256.0) + ((int) (Math.random() * 17) - 8);
		anInt395 = (int) (256.0 * d_8_);
		anInt396 = (int) (d_9_ * 256.0) + ((int) (Math.random() * 33) - 16);
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

		if (d_9_ > 0.5) {
			anInt398 = (int) (512.0 * (1.0 - d_9_) * d_8_);
		} else {
			anInt398 = (int) (d_8_ * d_9_ * 512.0);
		}
		if (anInt398 < 1) {
			anInt398 = 1;
		}

		anInt397 = (int) (d_7_ * (anInt398));
	}

	private FloorUnderlay() {
	}

	public static FloorUnderlay cache[];
	public int anInt390;
	public int anInt394;
	public int anInt395;
	public int anInt396;
	public int anInt397;
	public int anInt398;
}
