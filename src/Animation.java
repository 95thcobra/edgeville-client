public final class Animation {

	public static void unpackConfig(StreamLoader streamLoader) {
		Stream stream = new Stream(streamLoader.getDataForName("seq.dat"));
		int length = stream.readUnsignedWord();
		System.out.println("Anim Length: " + length);
		if (anims == null)
			anims = new Animation[length];
		for (int j = 0; j < length; j++) {
			if (anims[j] == null)
				anims[j] = new Animation();
			anims[j].readValues(stream);
			if (j == 5806) {
				anims[j].frameCount = 16;
				anims[j].loopDelay = -1;
				anims[j].forcedPriority = 6;
				anims[j].leftHandItem = -1;
				anims[j].rightHandItem = -1;
				anims[j].frameStep = 99;
				anims[j].resetWhenWalk = 0;
				anims[j].priority = 0;
				anims[j].delayType = 2;
				anims[j].oneSquareAnimation = true;
				anims[j].frameIDs = new int[] { 11927560, 11927687, 11927577, 11927569,
						11927557, 11927569, 11927577, 11927687, 11927560, 11927651, 11927611, 11927680, 11927622,
						11927691, 11927571, 11927601 };
				anims[j].delays = new int[] { 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 3 };
			}
		}
	}

	public int method258(int i) {
		int j = delays[i];
		if (j == 0) {
			Class36 class36 = Class36.method531(frameIDs[i]);
			if (class36 != null)
				j = delays[i] = class36.anInt636;
		}
		if (j == 0)
			j = 1;
		return j;
	}

	private void readValues(Stream stream) {
		int i;
		while ((i = stream.readUnsignedByte()) != 0) {
			if (i == 1) {
				frameCount = stream.readUnsignedWord();
				frameIDs = new int[frameCount];
				frameIDs2 = new int[frameCount];
				delays = new int[frameCount];
				for (int j = 0; j < frameCount; j++) {
					frameIDs[j] = stream.readUnsignedWord();
					delays[j] = stream.readUnsignedWord();
					frameIDs2[j] = -1;

					frameIDs[j] += stream.readUnsignedWord() << 16;
				}
			} else if (i == 2)
				loopDelay = stream.readUnsignedWord();
			else if (i == 3) {
				int k = stream.readUnsignedByte();
				animationFlowControl = new int[k + 1];
				for (int l = 0; l < k; l++)
					animationFlowControl[l] = stream.readUnsignedByte();
				animationFlowControl[k] = 9999999;
			} else if (i == 4)
				oneSquareAnimation = true;
			else if (i == 5)
				forcedPriority = stream.readUnsignedByte();
			else if (i == 6)
				leftHandItem = stream.readUnsignedWord();
			else if (i == 7)
				rightHandItem = stream.readUnsignedWord();
			else if (i == 8)
				frameStep = stream.readUnsignedByte();
			else if (i == 9)
				resetWhenWalk = stream.readUnsignedByte();
			else if (i == 10)
				priority = stream.readUnsignedByte();
			else if (i == 11)
				delayType = stream.readUnsignedByte();
			// else if (i == 12)
			// stream.readDWord();
			else
				System.out.println("Error unrecognised seq config code: " + i);
		}
		if (frameCount == 0) {
			frameCount = 1;
			frameIDs = new int[1];
			frameIDs[0] = -1;
			frameIDs2 = new int[1];
			frameIDs2[0] = -1;
			delays = new int[1];
			delays[0] = -1;
		}
		if (resetWhenWalk == -1)
			if (animationFlowControl != null)
				resetWhenWalk = 2;
			else
				resetWhenWalk = 0;
		if (priority == -1) {
			if (animationFlowControl != null) {
				priority = 2;
				return;
			}
			priority = 0;
		}
	}

	private Animation() {
		loopDelay = -1;
		oneSquareAnimation = false;
		forcedPriority = 5;
		leftHandItem = -1; // Removes shield
		rightHandItem = -1; // Removes weapon
		frameStep = 99;
		resetWhenWalk = -1; // Stops character from moving
		priority = -1;
		delayType = 1;
	}

	public static Animation anims[];
	public int frameCount;
	public int frameIDs[];
	public int frameIDs2[];
	public int[] delays;
	public int loopDelay;
	public int animationFlowControl[];
	public boolean oneSquareAnimation;
	public int forcedPriority;
	public int leftHandItem;
	public int rightHandItem;
	public int frameStep;
	public int resetWhenWalk;
	public int priority;
	public int delayType;
	public static int anInt367;
}
