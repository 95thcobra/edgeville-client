public final class Floor {

	public static Floor cache[];
	public int rgb;
	public int texture;
	public boolean occlude;
	public int hue;
	public int saturation;
	public int lumiance;
	public int blendHue;
	public int blendHueMultiplier;
	public int hslToRgb;
	
	private Floor() {
		texture = -1;
		occlude = true;
	}
	
	public static void unpackConfig(StreamLoader streamLoader) {
		Stream stream = new Stream(streamLoader.getDataForName("flo.dat"));
		int cacheSize = stream.readUnsignedWord();
		System.out.println("Underlay Floors Loaded: "+cacheSize);
		if(cache == null) {
			cache = new Floor[cacheSize];
		}
		for(int j = 0; j < cacheSize; j++) {
			if(cache[j] == null) {
				cache[j] = new Floor();
			}
			cache[j].readValues(stream);
		}
	}

	private void readValues(Stream stream) {
		do {
			int opcode = stream.readUnsignedByte();
			if(opcode == 0) {
				return;
			} else if(opcode == 1) {
				rgb = stream.read3Bytes();
				rgbToHsl(rgb);
			} else if(opcode == 2) {
				texture = stream.readUnsignedByte();
			} else if(opcode == 3) {
				/* empty */
			} else if(opcode == 5) {
				occlude = false;
			} else if(opcode == 6) {
				stream.readString();
			} else if(opcode == 7) {
				int h = hue;
				int s = saturation;
				int l = lumiance;
				int blend = blendHue;
				int rgb = stream.read3Bytes();
				rgbToHsl(rgb);
				hue = h;
				saturation = s;
				lumiance = l;
				blendHue = blend;
				blendHueMultiplier = blend;
			} else {
				System.out.println("Error unrecognised config code: " + opcode);
			}
		} while(true);
	}

	private void rgbToHsl(int rgb) {
        double r = (rgb >> 16 & 0xff) / 256.0;
        double g = (rgb >> 8 & 0xff) / 256.0;
        double b = (rgb & 0xff) / 256.0;
        double min = r;
        if (g < min) {
            min = g;
        }
        if (b < min) {
            min = b;
        }
        double max = r;
        if (g > max) {
            max = g;
        }
        if (b > max) {
            max = b;
        }
        double h = 0.0;
        double s = 0.0;
        double l = (min + max) / 2.0;
		if (min != max) {
            if (l < 0.5) {
                s = (max - min) / (max + min);
            }
            if (l >= 0.5) {
                s = (max - min) / (2.0 - max - min);
            }
            if (r == max) {
                h = (g - b) / (max - min);
            } else if (g == max) {
                h = 2.0 + (b - r) / (max - min);
            } else if (b == max) {
                h = 4.0 + (r - g) / (max - min);
            }
        }
		h /= 6D;
		hue = (int)(h * 256D);
		saturation = (int)(s * 256D);
		lumiance = (int)(l * 256D);
		if(l > 0.5D) {
			blendHueMultiplier = (int)((1.0D - l) * s * 512D);
		} else {
			blendHueMultiplier = (int)(l * s * 512D);
		}
		if(blendHueMultiplier < 1) {
			blendHueMultiplier = 1;
		}
		blendHue = (int)(h * (double)blendHueMultiplier);
		hslToRgb = hslToRgb(hue, saturation, lumiance);
	}

	private int hslToRgb(int h, int s, int l) {
		if(l > 179) {
			s /= 2;
		}
		if(l > 192) {
			s /= 2;
		}
		if(l > 217) {
			s /= 2;
		}
		if(l > 243) {
			s /= 2;
		}
		int rgb = (h / 4 << 10) + (s / 32 << 7) + l / 2;
		return rgb;
	}
}