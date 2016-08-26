/**
 * @author twelve
 */
public final class Skin {

	public final int[] anIntArray342;
	public final int[][] anIntArrayArray343;

	public Skin(Stream stream) { //lolled
		int anInt341 = stream.readUnsignedWord();
		anIntArray342 = new int[anInt341];
		anIntArrayArray343 = new int[anInt341][];
		for (int j = 0; j < anInt341; j++)
			anIntArray342[j] = stream.readUnsignedWord();

		for (int j = 0; j < anInt341; j++)
			anIntArrayArray343[j] = new int[stream.readUnsignedWord()];

		for (int j = 0; j < anInt341; j++)
			for (int l = 0; l < anIntArrayArray343[j].length; l++)
				anIntArrayArray343[j][l] = stream.readUnsignedWord();
	}

}
