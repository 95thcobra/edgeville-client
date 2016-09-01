import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public final class ItemDef {

	public static void nullLoader() {
		mruNodes2 = null;
		mruNodes1 = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}

	public static int getTexture(int id) {
		switch (id) {
		case 12773:
		case 12371:
			return 40;

		case 12774:
			return 24;
		}
		return -1;
	}

	public boolean method192(int j) {
		int k = anInt175;
		int l = anInt166;
		if (j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if (k == -1)
			return true;
		boolean flag = true;
		if (!Model.method463(k))
			flag = false;
		if (l != -1 && !Model.method463(l))
			flag = false;
		return flag;
	}

	public Model method194(int j) {
		int k = anInt175;
		int l = anInt166;
		if (j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if (k == -1)
			return null;
		Model model = Model.method462(k);
		if (l != -1) {
			Model model_1 = Model.method462(l);
			Model models[] = { model, model_1 };
			model = new Model(2, models);
		}
		if (editedModelColor != null) {
			for (int i1 = 0; i1 < editedModelColor.length; i1++)
				model.method476(editedModelColor[i1], newModelColor[i1], getTexture(id));
		}
		return model;
	}

	public boolean method195(int j) {
		int k = maleEquip1;
		int l = maleEquip2;
		int i1 = anInt185;
		if (j == 1) {
			k = femaleEquip1;
			l = femaleEquip2;
			i1 = anInt162;
		}
		if (k == -1)
			return true;
		boolean flag = true;
		if (!Model.method463(k))
			flag = false;
		if (l != -1 && !Model.method463(l))
			flag = false;
		if (i1 != -1 && !Model.method463(i1))
			flag = false;
		return flag;
	}

	public Model method196(int i) {
		int j = maleEquip1;
		int k = maleEquip2;
		int l = anInt185;
		if (i == 1) {
			j = femaleEquip1;
			k = femaleEquip2;
			l = anInt162;
		}
		if (j == -1)
			return null;
		Model model = Model.method462(j);
		if (k != -1)
			if (l != -1) {
				Model model_1 = Model.method462(k);
				Model model_3 = Model.method462(l);
				Model model_1s[] = { model, model_1, model_3 };
				model = new Model(3, model_1s);
			} else {
				Model model_2 = Model.method462(k);
				Model models[] = { model, model_2 };
				model = new Model(2, models);
			}
		/*
		 * if (i == 0 && aByte205 != 0) model.method475(0, aByte205, 0); if (i
		 * == 1 && aByte154 != 0) model.method475(0, aByte154, 0); if
		 * (editedModelColor != null) { for (int i1 = 0; i1 <
		 * editedModelColor.length; i1++) model.method476(editedModelColor[i1],
		 * newModelColor[i1]); } return model; }
		 */
		if (i == 0 && aByte205 != 0)
			model.method475(0, aByte205, 0);
		if (i == 1 && aByte154 != 0)
			model.method475(0, aByte154, 0);
		applyTexturing(model, id);
		if (editedModelColor != null) {
			for (int i1 = 0; i1 < editedModelColor.length; i1++)
				model.method476(editedModelColor[i1], newModelColor[i1], getTexture(id));

		}
		if (modelCustomColor > 0) {
			model.completelyRecolor(modelCustomColor);
		}
		if (modelCustomColor2 != 0) {
			model.shadingRecolor(modelCustomColor2);
		}
		if (modelCustomColor3 != 0) {
			model.shadingRecolor2(modelCustomColor3);
		}
		if (modelCustomColor4 != 0) {
			model.shadingRecolor4(modelCustomColor4);
		}
		if (modelSetColor != 0) {
			model.shadingRecolor3(modelSetColor);
		}
		return model;
	}

	public void setDefaults() {
		modelID = 0;
		name = null;
		description = null;
		editedModelColor = null;
		newModelColor = null;
		modelZoom = 2000;
		modelRotationY = 0;
		modelRotationX = 0;
		anInt204 = 0;
		modelOffset1 = 0;
		modelOffset2 = 0;
		stackable = false;
		value = 1;
		membersObject = false;
		groundActions = null;
		actions = null;
		maleEquip1 = -1;
		maleEquip2 = -1;
		aByte205 = 0;
		femaleEquip1 = -1;
		femaleEquip2 = -1;
		aByte154 = 0;
		anInt185 = -1;
		anInt162 = -1;
		anInt175 = -1;
		anInt166 = -1;
		anInt197 = -1;
		anInt173 = -1;
		stackIDs = null;
		stackAmounts = null;
		certID = -1;
		certTemplateID = -1;
		anInt167 = 128;
		anInt192 = 128;
		anInt191 = 128;
		brightness = 0;
		anInt184 = 0;
		team = 0;
		lendID = -1;
		lentItemID = -1;
	}

	public static void unpackConfig(StreamLoader streamLoader) {
		stream = new Stream(streamLoader.getDataForName("obj.dat"));
		Stream stream = new Stream(streamLoader.getDataForName("obj.idx"));
		totalItems = stream.readUnsignedWord();
		streamIndices = new int[totalItems + 1000];
		int i = 2;
		for (int j = 0; j < totalItems; j++) {
			streamIndices[j] = i;
			i += stream.readUnsignedWord();
		}
		cache = new ItemDef[10];
		for (int k = 0; k < 10; k++)
			cache[k] = new ItemDef();

		//dumpItems();
	}

	/**
	 * Item dump by Sky
	 */
	private static void dumpItems() {
		// dump items

		try {
			File itemDefs = new File("itemdefs-dump.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(itemDefs));
			writer.write("//id - name - noted - noteable - stackable - parentId - notedId - storeprice - highalch - lowalch\n");

			for (int itemId = 0; itemId <= 14678; itemId++) {
				ItemDef item = ItemDef.forID(itemId);

				int id = item.id;
				String name = item.name;

				if (name == null || name.equalsIgnoreCase("null")) {
					continue;
				}

				int certid = item.certID;

				boolean noteable = false;
				boolean noted = false;
				int notedId = -1;
				int parentId = -1;

				//System.out.println(certid);

				if (certid == -1) {
					noted = false;
					noteable = false;
				}

				else {

					if (certid > item.id) {
						notedId = certid;
						noted = false;
						noteable = true;
					}

					if (certid < item.id) {
						noteable = false;
						noted = true;
						parentId = certid;
					}

				}

				boolean stackable = item.stackable;
				boolean members = item.isMembers;

				int storePrice = item.value;
				int lowAlchPrice = (int) (storePrice * 0.4);
				int highAlchPrice = (int) (storePrice * 0.6);

				String itemDefsString = String.format("%d:%s:%b:%b:%b:%d:%d:%d:%d:%d\n", id, name, noted, noteable, stackable, parentId, notedId, storePrice, highAlchPrice, lowAlchPrice);
				System.out.println("Dump:" + itemDefsString);
				writer.write(itemDefsString);
			}

			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Item dump by Sky
	 */
	private static void dumpItemsOld() {
		// dump items

		try {
			File itemDefs = new File("itemdefs-dump.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(itemDefs));
			writer.write("//id - name - noted - noteable - stackable - parentId - notedId - members - storeprice\n");

			for (int itemId = 0; itemId <= 14678; itemId++) {
				ItemDef item = ItemDef.forID(itemId);

				int id = item.id;
				String name = item.name;

				int certid = item.certID;

				boolean noteable = false;
				boolean noted = false;
				int notedId = -1;
				int parentId = -1;

				//System.out.println(certid);

				if (certid == -1) {
					noted = false;
					noteable = false;
				}

				else {

					if (certid > item.id) {
						notedId = certid;
						noted = false;
						noteable = true;
					}

					if (certid < item.id) {
						noteable = false;
						noted = true;
						parentId = certid;
					}

				}

				boolean stackable = item.stackable;
				boolean members = item.isMembers;

				int storePrice = item.value;

				String itemDefsString = String.format("%d:%s:%b:%b:%b:%d:%d:%b:%d\n", id, name, noted, noteable, stackable, parentId, notedId, members, storePrice);
				System.out.println("Dump:" + itemDefsString);
				writer.write(itemDefsString);
			}

			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int[] getResults(String name, int range, boolean limited) {
		int[] items = new int[range];
		int position = 0;
		if (limited) {
			RSInterface bank = RSInterface.interfaceCache[5382];
			for (int i = 0; i < bank.inv.length; i++) {
				if (bank.inv[i] <= 0) {
					continue;
				}
				ItemDef itemDef = forID(bank.inv[i] - 1);
				if (position >= range) {
					break;
				}
				if (itemDef == null) {
					continue;
				}
				if (itemDef.stackable) {
					if (itemDef.description != null) {
						if (itemDef.description.startsWith("Swap this note")) {
							continue;
						}
					}
				}
				String itemName = itemDef.name;
				if (itemName == null) {
					continue;
				}
				if (itemName.toLowerCase().contains(name.toLowerCase())) {
					if (Arrays.binarySearch(items, bank.inv[i] - 1) >= 0) {
						continue;
					}
					items[position] = bank.inv[i] - 1;
					position++;
				}
			}
		} else {
			for (int i = 0; i < 14485; i++) {
				ItemDef itemDef = forID(i);
				if (position >= range) {
					break;
				}
				if (itemDef == null) {
					continue;
				}
				if (itemDef.stackable) {
					if (itemDef.description != null) {
						if (itemDef.description.startsWith("Swap this note")) {
							continue;
						}
					}
				}
				String itemName = itemDef.name;
				if (itemName == null) {
					continue;
				}
				if (itemName.toLowerCase().contains(name.toLowerCase())) {
					if (Arrays.binarySearch(items, itemDef.id) >= 0) {
						continue;
					}
					items[position] = itemDef.id;
					position++;
				}
			}
		}
		return items;
	}

	public static void applyTexturing(Model model, int id) {
		switch (id) {
		case 11992:
			System.out.println("Lava Scale-------------------------");
			// model.setTexture(47155, 40);
			Model.printModelColours(model);
			System.out.println("Lava Scale-------------------------");
			break;
		case 12769:
			System.out.println("Frozen Mix-------------------------");
			model.setTexture(42);
			Model.printModelColours(model);
			System.out.println("Frozen Mix-------------------------");
			break;
		case 12771:
			System.out.println("Volcanic Mix-------------------------");
			model.setTexture(40);
			Model.printModelColours(model);
			System.out.println("Volcanic Mix-------------------------");
			break;
		case 12773:
			System.out.println("Volcanic whip-------------------------");
			model.setTexture(16, 40);
			Model.printModelColours(model);
			System.out.println("Volcanic whip-------------------------");
			break;
		case 12774:
			System.out.println("Frozen whip-------------------------");
			// model.setTexture(16, 42);
			model.setTexture(42);
			Model.printModelColours(model);
			System.out.println("Frozen whip-------------------------");
			break;
		case 12371:
			System.out.println("Lava mask-------------------------");
			model.setTexture(38119, 40);
			Model.printModelColours(model);
			System.out.println("Lava mask-------------------------");
			break;
		}
	}

	public static ItemDef forID(int i) {
		for (int j = 0; j < 10; j++)
			if (cache[j].id == i)
				return cache[j];

		if (i > streamIndices.length)
			i = 0;

		cacheIndex = (cacheIndex + 1) % 10;
		ItemDef itemDef = cache[cacheIndex];
		stream.currentOffset = streamIndices[i];
		itemDef.id = i;
		itemDef.setDefaults();
		itemDef.readValues(stream);
		if (itemDef.certTemplateID != -1)
			itemDef.toNote();
		if (itemDef.lentItemID != -1)
			itemDef.toLend();
		if (!isMembers && itemDef.membersObject) {
			itemDef.name = "Members Object";
			itemDef.description = "Login to a members' server to use this object.";
			itemDef.groundActions = null;
			itemDef.actions = null;
			itemDef.team = 0;
		}
		if (itemDef.editedModelColor != null) {
			for (int i2 = 0; i2 < itemDef.editedModelColor.length; i2++) {
				if (itemDef.newModelColor[i2] == 0) {
					itemDef.newModelColor[i2] = 1;
				}
			}
		}
		if (itemDef.id == 766) {
			itemDef.name = "Dice Bag";
			itemDef.actions = new String[5];
			itemDef.actions[0] = "Roll Dices";
		}
		return itemDef;
	}

	/*
	 * private void readValues(Stream stream) { do { int i =
	 * stream.readUnsignedByte(); if (i == 0) return; if (i == 1) modelID =
	 * stream.readUnsignedWord(); else if (i == 2) name = stream.readString();
	 * else if (i == 3) description = stream.readString(); else if (i == 4)
	 * modelZoom = stream.readUnsignedWord(); else if (i == 5) modelRotationY =
	 * stream.readUnsignedWord(); else if (i == 6) modelRotationX =
	 * stream.readUnsignedWord(); else if (i == 7) { modelOffset1 =
	 * stream.readUnsignedWord(); if (modelOffset1 > 32767) modelOffset1 -=
	 * 0x10000; } else if (i == 8) { modelOffset2 = stream.readUnsignedWord();
	 * if (modelOffset2 > 32767) modelOffset2 -= 0x10000; } else if (i == 10)
	 * stream.readUnsignedWord(); else if (i == 11) stackable = true; else if (i
	 * == 12) value = stream.readDWord(); else if (i == 16) membersObject =
	 * true; else if (i == 23) { maleEquip1 = stream.readUnsignedWord();
	 * aByte205 = stream.readSignedByte(); } else if (i == 24) maleEquip2 =
	 * stream.readUnsignedWord(); else if (i == 25) { femaleEquip1 =
	 * stream.readUnsignedWord(); aByte154 = stream.readSignedByte(); } else if
	 * (i == 26) femaleEquip2 = stream.readUnsignedWord(); else if (i >= 30 && i
	 * < 35) { if (groundActions == null) groundActions = new String[5];
	 * groundActions[i - 30] = stream.readString(); } else if (i >= 35 && i <
	 * 40) { if (actions == null) actions = new String[5]; actions[i - 35] =
	 * stream.readString(); } else if (i == 40) { int j =
	 * stream.readUnsignedByte(); newModelColor = new int[j]; editedModelColor =
	 * new int[j]; for (int k = 0; k < j; k++) { newModelColor[k] =
	 * stream.readUnsignedWord(); editedModelColor[k] =
	 * stream.readUnsignedWord(); } } else if (i == 78) anInt185 =
	 * stream.readUnsignedWord(); else if (i == 79) anInt162 =
	 * stream.readUnsignedWord(); else if (i == 90) anInt175 =
	 * stream.readUnsignedWord(); else if (i == 91) anInt197 =
	 * stream.readUnsignedWord(); else if (i == 92) anInt166 =
	 * stream.readUnsignedWord(); else if (i == 93) anInt173 =
	 * stream.readUnsignedWord(); else if (i == 95) anInt204 =
	 * stream.readUnsignedWord(); else if (i == 97) certID =
	 * stream.readUnsignedWord(); else if (i == 98) certTemplateID =
	 * stream.readUnsignedWord(); else if (i >= 100 && i < 110) { if (stackIDs
	 * == null) { stackIDs = new int[10]; stackAmounts = new int[10]; }
	 * stackIDs[i - 100] = stream.readUnsignedWord(); stackAmounts[i - 100] =
	 * stream.readUnsignedWord(); } else if (i == 110) anInt167 =
	 * stream.readUnsignedWord(); else if (i == 111) anInt192 =
	 * stream.readUnsignedWord(); else if (i == 112) anInt191 =
	 * stream.readUnsignedWord(); else if (i == 113) brightness =
	 * stream.readSignedByte(); else if (i == 114) anInt184 =
	 * stream.readSignedByte() * 5; else if (i == 115) team =
	 * stream.readUnsignedByte(); } while (true); }
	 */

	private void readValues(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if (i == 0)
				return;
			if (i == 1)
				modelID = stream.readUnsignedWord();
			else if (i == 2)
				name = stream.readString();
			else if (i == 3)
				description = stream.readString();
			else if (i == 4)
				modelZoom = stream.readUnsignedWord();
			else if (i == 5)
				modelRotationY = stream.readUnsignedWord();
			else if (i == 6)
				modelRotationX = stream.readUnsignedWord();
			else if (i == 7) {
				modelOffset1 = stream.readUnsignedWord();
				if (modelOffset1 > 32767)
					modelOffset1 -= 0x10000;
			} else if (i == 8) {
				modelOffset2 = stream.readUnsignedWord();
				if (modelOffset2 > 32767)
					modelOffset2 -= 0x10000;
			} else if (i == 10)
				stream.readUnsignedWord();
			else if (i == 11)
				stackable = true;
			else if (i == 12)
				value = stream.readDWord();
			else if (i == 16)
				membersObject = true;
			else if (i == 23) {
				maleEquip1 = stream.readUnsignedWord();
				aByte205 = stream.readSignedByte();
			} else if (i == 24)
				maleEquip2 = stream.readUnsignedWord();
			else if (i == 25) {
				femaleEquip1 = stream.readUnsignedWord();
				aByte154 = stream.readSignedByte();
			} else if (i == 26)
				femaleEquip2 = stream.readUnsignedWord();
			else if (i >= 30 && i < 35) {
				if (groundActions == null)
					groundActions = new String[5];
				groundActions[i - 30] = stream.readString();
			} else if (i >= 35 && i < 40) {
				if (actions == null)
					actions = new String[5];
				actions[i - 35] = stream.readString();
			} else if (i == 40) {
				int j = stream.readUnsignedByte();
				newModelColor = new int[j];
				editedModelColor = new int[j];
				for (int k = 0; k < j; k++) {
					newModelColor[k] = stream.readUnsignedWord();
					editedModelColor[k] = stream.readUnsignedWord();
				}
				/*
				 * } else if (i == 41) { int j = stream.readUnsignedByte();
				 * textureFind = new int[j]; textureReplace = new int[j]; for
				 * (int k = 0; k < j; k++) { textureFind[k] =
				 * stream.readUnsignedWord(); textureReplace[k] =
				 * stream.readUnsignedWord(); }
				 */
			} else if (i == 78)
				anInt185 = stream.readUnsignedWord();
			else if (i == 79)
				anInt162 = stream.readUnsignedWord();
			else if (i == 90)
				anInt175 = stream.readUnsignedWord();
			else if (i == 91)
				anInt197 = stream.readUnsignedWord();
			else if (i == 92)
				anInt166 = stream.readUnsignedWord();
			else if (i == 93)
				anInt173 = stream.readUnsignedWord();
			else if (i == 95)
				anInt204 = stream.readUnsignedWord();
			else if (i == 97)
				certID = stream.readUnsignedWord();
			else if (i == 98)
				certTemplateID = stream.readUnsignedWord();
			else if (i >= 100 && i < 110) {
				if (stackIDs == null) {
					stackIDs = new int[10];
					stackAmounts = new int[10];
				}
				stackIDs[i - 100] = stream.readUnsignedWord();
				stackAmounts[i - 100] = stream.readUnsignedWord();
			} else if (i == 110)
				anInt167 = stream.readUnsignedWord();
			else if (i == 111)
				anInt192 = stream.readUnsignedWord();
			else if (i == 112)
				anInt191 = stream.readUnsignedWord();
			else if (i == 113)
				brightness = stream.readSignedByte();
			else if (i == 114)
				anInt184 = stream.readSignedByte() * 5;
			else if (i == 115)
				team = stream.readUnsignedByte();
		} while (true);
	}

	public void toNote() {
		ItemDef itemDef = forID(certTemplateID);
		modelID = itemDef.modelID;
		modelZoom = itemDef.modelZoom;
		modelRotationY = itemDef.modelRotationY;
		modelRotationX = itemDef.modelRotationX;
		anInt204 = itemDef.anInt204;
		modelOffset1 = itemDef.modelOffset1;
		modelOffset2 = itemDef.modelOffset2;
		editedModelColor = itemDef.editedModelColor;
		newModelColor = itemDef.newModelColor;
		ItemDef itemDef_1 = forID(certID);
		name = itemDef_1.name;
		membersObject = itemDef_1.membersObject;
		value = itemDef_1.value;
		String s = "a";
		char c = itemDef_1.name.charAt(0);
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			s = "an";
		description = ("Swap this note at any bank for " + s + " " + itemDef_1.name + ".");
		stackable = true;
	}

	private void toLend() {
		ItemDef itemDef = forID(lentItemID);
		actions = new String[5];
		modelID = itemDef.modelID;
		modelOffset1 = itemDef.modelOffset1;
		modelRotationX = itemDef.modelRotationX;
		modelOffset2 = itemDef.modelOffset2;
		modelZoom = itemDef.modelZoom;
		modelRotationY = itemDef.modelRotationY;
		anInt204 = itemDef.anInt204;
		value = 0;
		ItemDef itemDef_1 = forID(lendID);
		anInt166 = itemDef_1.anInt166;
		editedModelColor = itemDef_1.editedModelColor;
		anInt185 = itemDef_1.anInt185;
		maleEquip2 = itemDef_1.maleEquip2;
		anInt173 = itemDef_1.anInt173;
		anInt175 = itemDef_1.anInt175;
		groundActions = itemDef_1.groundActions;
		maleEquip1 = itemDef_1.maleEquip1;
		name = itemDef_1.name;
		femaleEquip1 = itemDef_1.femaleEquip1;
		membersObject = itemDef_1.membersObject;
		anInt197 = itemDef_1.anInt197;
		femaleEquip2 = itemDef_1.femaleEquip2;
		anInt162 = itemDef_1.anInt162;
		newModelColor = itemDef_1.newModelColor;
		team = itemDef_1.team;
		if (itemDef_1.actions != null) {
			for (int i_33_ = 0; i_33_ < 4; i_33_++)
				actions[i_33_] = itemDef_1.actions[i_33_];
		}
		actions[4] = "Discard";
	}

	public static Sprite getSprite(int i, int j, int k) {
		if (k == 0) {
			Sprite sprite = (Sprite) mruNodes1.insertFromCache(i);
			if (sprite != null && sprite.anInt1445 != j && sprite.anInt1445 != -1) {

				sprite.unlink();
				sprite = null;
			}
			if (sprite != null)
				return sprite;
		}
		ItemDef itemDef = forID(i);
		if (itemDef.stackIDs == null)
			j = -1;
		if (j > 1) {
			int i1 = -1;
			for (int j1 = 0; j1 < 10; j1++) {
				if (j1 < itemDef.stackAmounts.length) {
					if (j >= itemDef.stackAmounts[j1] && itemDef.stackAmounts[j1] != 0)
						i1 = itemDef.stackIDs[j1];
				}
			}
			if (i1 != -1)
				itemDef = forID(i1);
		}
		Model model = itemDef.method201(1);
		if (model == null)
			return null;
		Sprite sprite = null;
		if (itemDef.certTemplateID != -1) {
			sprite = getSprite(itemDef.certID, 10, -1);
			if (sprite == null)
				return null;
		}
		Sprite enabledSprite = new Sprite(32, 32);
		int k1 = Texture.textureInt1;
		int l1 = Texture.textureInt2;
		int ai[] = Texture.lineOffsets;
		int ai1[] = DrawingArea.pixels;
		int i2 = DrawingArea.width;
		int j2 = DrawingArea.height;
		int k2 = DrawingArea.topX;
		int l2 = DrawingArea.bottomX;
		int i3 = DrawingArea.topY;
		int j3 = DrawingArea.bottomY;
		Texture.aBoolean1464 = false;
		DrawingArea.initDrawingArea(32, 32, enabledSprite.myPixels);
		DrawingArea.drawPixels(32, 0, 0, 0, 32);
		Texture.method364();
		int k3 = itemDef.modelZoom;
		if (k == -1)
			k3 = (int) ((double) k3 * 1.5D);
		if (k > 0)
			k3 = (int) ((double) k3 * 1.04D);
		int l3 = Texture.anIntArray1470[itemDef.modelRotationY] * k3 >> 16;
		int i4 = Texture.anIntArray1471[itemDef.modelRotationY] * k3 >> 16;
		model.method482(itemDef.modelRotationX, itemDef.anInt204, itemDef.modelRotationY, itemDef.modelOffset1, l3 + model.modelHeight / 2 + itemDef.modelOffset2, i4 + itemDef.modelOffset2);
		for (int i5 = 31; i5 >= 0; i5--) {
			for (int j4 = 31; j4 >= 0; j4--)
				if (enabledSprite.myPixels[i5 + j4 * 32] == 0)
					if (i5 > 0 && enabledSprite.myPixels[(i5 - 1) + j4 * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (j4 > 0 && enabledSprite.myPixels[i5 + (j4 - 1) * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (i5 < 31 && enabledSprite.myPixels[i5 + 1 + j4 * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (j4 < 31 && enabledSprite.myPixels[i5 + (j4 + 1) * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;

		}

		if (k > 0) {
			for (int j5 = 31; j5 >= 0; j5--) {
				for (int k4 = 31; k4 >= 0; k4--)
					if (enabledSprite.myPixels[j5 + k4 * 32] == 0)
						if (j5 > 0 && enabledSprite.myPixels[(j5 - 1) + k4 * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (k4 > 0 && enabledSprite.myPixels[j5 + (k4 - 1) * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (j5 < 31 && enabledSprite.myPixels[j5 + 1 + k4 * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (k4 < 31 && enabledSprite.myPixels[j5 + (k4 + 1) * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;

			}

		} else if (k == 0) {
			for (int k5 = 31; k5 >= 0; k5--) {
				for (int l4 = 31; l4 >= 0; l4--)
					if (enabledSprite.myPixels[k5 + l4 * 32] == 0 && k5 > 0 && l4 > 0 && enabledSprite.myPixels[(k5 - 1) + (l4 - 1) * 32] > 0)
						enabledSprite.myPixels[k5 + l4 * 32] = 0x302020;

			}

		}
		if (itemDef.certTemplateID != -1) {
			int l5 = sprite.anInt1444;
			int j6 = sprite.anInt1445;
			sprite.anInt1444 = 32;
			sprite.anInt1445 = 32;
			sprite.drawSprite(0, 0);
			sprite.anInt1444 = l5;
			sprite.anInt1445 = j6;
		}
		if (k == 0)
			mruNodes1.removeFromCache(enabledSprite, i);
		DrawingArea.initDrawingArea(j2, i2, ai1);
		DrawingArea.setDrawingArea(j3, k2, l2, i3);
		Texture.textureInt1 = k1;
		Texture.textureInt2 = l1;
		Texture.lineOffsets = ai;
		Texture.aBoolean1464 = true;
		if (itemDef.stackable)
			enabledSprite.anInt1444 = 33;
		else
			enabledSprite.anInt1444 = 32;
		enabledSprite.anInt1445 = j;
		return enabledSprite;
	}

	public Model method201(int i) {

		if (stackIDs != null && i > 1) {
			int j = -1;
			for (int k = 0; k < 10; k++)
				if (i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];
			if (j != -1)
				return forID(j).method201(1);
		}

		Model model = (Model) mruNodes2.insertFromCache(id);

		if (model != null)
			return model;
		model = Model.method462(modelID);
		if (model == null)
			return null;
		applyTexturing(model, id);
		if (anInt167 != 128 || anInt192 != 128 || anInt191 != 128)
			model.method478(anInt167, anInt191, anInt192);
		if (editedModelColor != null && newModelColor != null) {
			for (int l = 0; l < editedModelColor.length; l++)
				model.method476(editedModelColor[l], newModelColor[l], getTexture(id));

		}
		if (modelCustomColor > 0) {
			model.completelyRecolor(modelCustomColor);
		}
		if (modelCustomColor2 != 0) {
			model.shadingRecolor(modelCustomColor2);
		}
		if (modelCustomColor3 != 0) {
			model.shadingRecolor2(modelCustomColor3);
		}
		if (modelCustomColor4 != 0) {
			model.shadingRecolor4(modelCustomColor4);
		}
		if (modelSetColor != 0) {
			model.shadingRecolor3(modelSetColor);
		}

		model.method479(64 + brightness, 768 + anInt184, -50, -10, -50, true);
		model.aBoolean1659 = true;
		mruNodes2.removeFromCache(model, id);
		return model;
	}

	public Model method202(int i) {
		if (stackIDs != null && i > 1) {
			int j = -1;
			for (int k = 0; k < 10; k++)
				if (i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];
			if (j != -1)
				return forID(j).method202(1);
		}
		Model model = Model.method462(modelID);
		if (model == null)
			return null;
		if (editedModelColor != null) {
			for (int l = 0; l < editedModelColor.length; l++)
				model.method476(editedModelColor[l], newModelColor[l], getTexture(id));
		}
		return model;
	}

	public ItemDef() {
		id = -1;
	}

	public int modelCustomColor = 0;
	public int modelCustomColor2 = 0;
	public int modelCustomColor3 = 0;
	public int modelCustomColor4 = 0;
	public int modelSetColor = 0;
	public byte aByte154;
	public int value;
	public int[] editedModelColor;
	public int id;
	static MRUNodes mruNodes1 = new MRUNodes(100);
	public static MRUNodes mruNodes2 = new MRUNodes(50);
	public int[] newModelColor;
	public boolean membersObject;
	public int anInt162;
	public int certTemplateID;
	public int femaleEquip2;
	public int maleEquip1;
	public int anInt166;
	public int anInt167;
	public String groundActions[];
	public int modelOffset1;
	public String name;
	public static ItemDef[] cache;
	public int anInt173;
	public int modelID;
	public int anInt175;
	public boolean stackable;
	public String description;
	public int certID;
	public static int cacheIndex;
	public int modelZoom;
	public static boolean isMembers = true;
	public static Stream stream;
	public int anInt184;
	public int anInt185;
	public int maleEquip2;
	public String actions[];
	public int modelRotationY;
	public int anInt191;
	public int anInt192;
	public int[] stackIDs;
	public int modelOffset2;
	public static int[] streamIndices;
	public int brightness;
	public int anInt197;
	public int modelRotationX;
	public int femaleEquip1;
	public int[] stackAmounts;
	public int team;
	public static int totalItems;
	public int anInt204;
	public byte aByte205;
	public int lendID;
	public int lentItemID;
	public int lendTemplateID;
}