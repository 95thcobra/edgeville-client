public class Interfaces extends RSInterface {

	public static void loadInterfaces(StreamLoader streamLoader, TextDrawingArea textDrawingAreas[]) {
		Sidebar0(textDrawingAreas);
		equipmentScreen(textDrawingAreas);
		prayerTab(textDrawingAreas);
		clanChatTab(textDrawingAreas);
		clanChatSetup(textDrawingAreas);
		magicTab(textDrawingAreas);
		ancientMagicTab(textDrawingAreas);
		optionTab(textDrawingAreas);
		emoteTab();
		Logout(textDrawingAreas);
		slayerRewardsBuy(textDrawingAreas);
		slayerRewardsLearn(textDrawingAreas);
		slayerRewardsAssign(textDrawingAreas);
		equipmentTab(textDrawingAreas);
		itemsOnDeathDATA(textDrawingAreas);
		itemsOnDeath(textDrawingAreas);
		configureLunar(textDrawingAreas);
		constructLunar();
		bank(textDrawingAreas);
		tradeUIAddon(textDrawingAreas);
		spawnInterface(textDrawingAreas);
		itemIdFinder(textDrawingAreas);
		Pestpanel(textDrawingAreas);
		Pestpanel2(textDrawingAreas);
		lootingBag(textDrawingAreas);
		questTab(textDrawingAreas);
		optionsTab(textDrawingAreas);
	}

	public static void optionsTab(TextDrawingArea[] TDA) {
		RSInterface tab = addTabInterface(904);
		RSInterface energy = interfaceCache[149];
		energy.textColor = 0xff9933;
		addSprite(905, 9, "Options/SPRITE");
		addSprite(951, 32, "Options/SPRITE");
		addSprite(953, 33, "Options/SPRITE");
		addSprite(955, 34, "Options/SPRITE");
		addSprite(947, 36, "Options/SPRITE");
		addSprite(949, 35, "Options/SPRITE");
		addSprite(36001, 4, "Options/SPRITE");
		addSprite(36002, 4, "Options/SPRITE");
		addSprite(36016, 4, "Options/SPRITE");
		addButton(36100, 30, "Options/SPRITE", "Settings");
		addSprite(36101, 43, "Options/SPRITE");
		addHoverButton(36004, "Options/SPRITE", 37, 50, 39, "Fixed", -1, 36005, 1);
		addHoveredButton(36005, "Options/SPRITE", 38, 50, 39, 36006);
		addHoverButton(36007, "Options/SPRITE", 39, 50, 39, "Resizable", -1, 36008, 1);
		addHoveredButton(36008, "Options/SPRITE", 40, 50, 39, 36009);
		addHoverButton(36010, "Options/SPRITE", 41, 50, 39, "Fullscreen", -1, 36011, 1);
		addHoveredButton(36011, "Options/SPRITE", 42, 50, 39, 36012);

		addText(36003, "Screen Modes", 0xFF981F, true, true, -1, TDA, 1);
		addText(36017, "Client Options", 0xFF981F, true, true, -1, TDA, 1);
		addText(36013, "Fixed", 0xFF981F, true, true, -1, TDA, 1);
		addText(36014, "Resizable", 0xFF981F, true, true, -1, TDA, 1);
		addText(36015, "Fullscreen", 0xFF981F, true, true, -1, TDA, 1);

		addConfigButton(906, 904, 10, 14, "Options/SPRITE", 32, 16, "Dark", 1, 5, 166);
		addConfigButton(908, 904, 11, 15, "Options/SPRITE", 32, 16, "Normal", 2, 5, 166);
		addConfigButton(910, 904, 12, 16, "Options/SPRITE", 32, 16, "Bright", 3, 5, 166);
		addConfigButton(912, 904, 13, 17, "Options/SPRITE", 32, 16, "Very Bright", 4, 5, 166);
		addConfigButton(152, 904, 30, 31, "Options/SPRITE", 40, 40, "Toggle-run", 1, 5, 173);
		addConfigButton(913, 904, 30, 31, "Options/SPRITE", 40, 40, "Toggle-Mouse Buttons", 0, 5, 170);
		addConfigButton(915, 904, 30, 31, "Options/SPRITE", 40, 40, "Toggle-Chat Effects", 0, 5, 171);
		addConfigButton(957, 904, 30, 31, "Options/SPRITE", 40, 40, "Toggle-Split Private Chat", 1, 5, 287);
		addConfigButton(12464, 904, 30, 31, "Options/SPRITE", 40, 40, "Toggle-Accept Aid", 0, 5, 427);
		tab.totalChildren(32);
		int x = 0;
		int y = 2;
		tab.child(0, 36001, 0, 22);
		tab.child(1, 36002, 0, 85);
		tab.child(2, 36003, 93, 4);
		tab.child(3, 36004, 9, 30);
		tab.child(4, 36005, 9, 30);
		tab.child(5, 36007, 70, 30);
		tab.child(6, 36008, 70, 30);
		tab.child(7, 36010, 131, 30);
		tab.child(8, 36011, 131, 30);
		tab.child(9, 36013, 34, 70);
		tab.child(10, 36014, 93, 70);
		tab.child(11, 36015, 158, 70);
		tab.child(14, 905, 13 + x, 110 + y);
		tab.child(15, 906, 48 + x, 118 + y);
		tab.child(16, 908, 80 + x, 118 + y);
		tab.child(17, 910, 112 + x, 118 + y);
		tab.child(18, 912, 144 + x, 118 + y);
		tab.child(19, 152, 75, 208);
		tab.child(20, 913, 15, 153);
		tab.child(21, 915, 75, 153);
		tab.child(22, 957, 135, 153);
		tab.child(23, 951, 139, 159);
		tab.child(24, 953, 79, 160);
		tab.child(25, 955, 19, 159);
		tab.child(26, 947, 87, 212);
		tab.child(27, 12464, 15, 208);
		tab.child(28, 949, 20, 213);
		tab.child(29, 149, 80, 231);
		tab.child(12, 36016, 0, 105);
		tab.child(13, 36017, 93, 87);
		tab.child(30, 36100, 135, 208);
		tab.child(31, 36101, 135, 208);
	}

	public static void questTab(TextDrawingArea[] TDA) {
		RSInterface Interface = addInterface(638);
		setChildren(5, Interface);
		addText(29155, "Quest Tab", 0xFF981F, false, true, 52, TDA, 2);
		addButton(29156, 1, "Interfaces/QuestTab/QUEST", 18, 18, "Swap to Achievements", 1);
		addButton(29270, 3, "Interfaces/QuestTab/QUEST", 18, 18, "Swap to Minigames", 1);
		addSprite(29157, 0, "Interfaces/QuestTab/QUEST");
		setBounds(29155, 10, 5, 0, Interface);
		setBounds(29156, 154, 4, 1, Interface);
		setBounds(29157, 3, 24, 2, Interface);
		setBounds(29160, 5, 29, 3, Interface);
		setBounds(29270, 172, 4, 4, Interface);
		Interface = addInterface(29160);
		Interface.height = 214;
		Interface.width = 165;
		Interface.scrollMax = 1700;
		setChildren(104, Interface);
		addText(29161, " " + Configuration.SERVER_NAME, 0xFF981F, false, true, 22, TDA, 1);
		addHoverText(29162, "", "View Progress", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29163, "Players Online", "View Progress", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29164, "Server Information", "View Progress", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29165, "", "View Progress", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29166, "", "View Progress", TDA, 0, 0xff0000, false, true, 150);
		setBounds(29161, 4, 4, 0, Interface);
		setBounds(29162, 8, 22, 1, Interface);
		setBounds(29163, 8, 35, 2, Interface);
		setBounds(29164, 8, 48, 3, Interface);
		setBounds(29165, 8, 61, 4, Interface);
		setBounds(29166, 8, 74, 5, Interface);
		int Ypos = 87;
		int frameID = 6;
		for (int iD = 29167; iD <= 29264; iD++) {
			addHoverText(iD, "", "View" + iD/* "View Quest Journal, "+iD */, TDA, 0, 0xff0000, false, true, 150);
			setBounds(iD, 8, Ypos, frameID, Interface);
			frameID++;
			Ypos += 13;
			Ypos++;
		}
		Interface = addInterface(29265);
		setChildren(5, Interface);
		addText(29266, "        Achievements", 0xFF981F, false, true, -1, TDA, 2);
		addButton(29267, 2, "Interfaces/QuestTab/QUEST", 18, 18, "Swap to Quests", 1);
		addButton(29271, 3, "Interfaces/QuestTab/QUEST", 18, 18, "Swap to Minigames", 1);
		addSprite(29269, 0, "Interfaces/QuestTab/QUEST");
		setBounds(29266, 10, 5, 0, Interface);
		setBounds(29267, 154, 4, 1, Interface);
		setBounds(29269, 3, 24, 2, Interface);
		setBounds(29268, 5, 29, 3, Interface);
		setBounds(29271, 172, 4, 4, Interface);
		Interface = addInterface(29268);
		Interface.height = 214;
		Interface.width = 165;
		Interface.scrollMax = 215;
		setChildren(14, Interface);
		setBounds(29295, 8, 6, 0, Interface);
		setBounds(29287, 8, 21, 1, Interface);
		setBounds(29305, 8, 36, 2, Interface);
		setBounds(29306, 8, 51, 3, Interface);
		setBounds(29307, 8, 66, 4, Interface);
		setBounds(29308, 8, 81, 5, Interface);
		setBounds(29309, 8, 96, 6, Interface);
		setBounds(29310, 8, 110, 7, Interface);
		setBounds(29311, 8, 125, 8, Interface);
		setBounds(29312, 8, 155, 9, Interface);
		setBounds(29313, 8, 170, 10, Interface);
		setBounds(29314, 8, 140, 11, Interface);
		setBounds(29315, 8, 185, 12, Interface);
		setBounds(29316, 8, 200, 13, Interface);
		addHoverText(29295, "Tasks Completed: 0", "View Achievements", TDA, 0, 65280, false, true, 150);
		addHoverText(29287, "Easy Tasks", "View Achievements", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29305, "        Task", "View Achievements", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29306, "        Task", "View Achievements", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29307, "        Task", "View Achievements", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29308, "        Task", "View Achievements", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29309, "        Task", "View Achievements", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29310, "Medium Tasks", "View Achievements", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29311, "        Task", "View Achievements", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29314, "        Task", "View Achievements", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29312, "Hard Tasks", "View Achievements", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29313, "        Task", "View Achievements", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29315, "        Task", "View Achievements", TDA, 0, 0xff0000, false, true, 150);
		addHoverText(29316, "        Task", "View Achievements", TDA, 0, 0xff0000, false, true, 150);

		Interface = addInterface(29300);

		addText(29301, "        MiniGames", 0xFF981F, false, true, -1, TDA, 2);
		addButton(29302, 2, "Interfaces/QuestTab/QUEST", 18, 18, "Swap to Quests", 1);
		addButton(29303, 1, "Interfaces/QuestTab/QUEST", 18, 18, "Swap to Achievements", 1);
		addSprite(29304, 0, "Interfaces/QuestTab/QUEST");

		setChildren(5, Interface);
		setBounds(29301, 10, 5, 0, Interface);
		setBounds(29302, 154, 4, 1, Interface);
		setBounds(29304, 3, 24, 2, Interface);
		setBounds(29350, 5, 29, 3, Interface);
		setBounds(29303, 172, 4, 4, Interface);
		Interface = addInterface(29350);

		addHoverText(29352, "Barrows", "Teleport to Barrows", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29353, "Castle Wars", "Teleport to Castle Wars", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29351, "Duel Arena", "Teleport to Duel Arena", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29354, "Fight Caves", "Teleport to Fight Caves", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29355, "Fight Pits", "Teleport to Fight Pits", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29356, "Pest Control ", "Teleport to Pest Control", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29357, "Nightmarezone ", "Teleport to Nightmarezone", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29358, "Rouges Den", "Teleport to Rouges Den", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29359, "Warriors Guild", "Teleport to Warriors Guild", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29360, "", "", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29361, "", "", TDA, 0, 0xFF981F, false, true, 150);
		addHoverText(29362, "", "", TDA, 0, 0xFF981F, false, true, 150);

		Interface.height = 214;
		Interface.width = 165;
		Interface.scrollMax = 215;
		setChildren(12, Interface);
		setBounds(29352, 8, 6, 0, Interface);
		setBounds(29353, 8, 21, 1, Interface);
		setBounds(29351, 8, 36, 2, Interface);
		setBounds(29354, 8, 51, 3, Interface);
		setBounds(29355, 8, 66, 4, Interface);
		setBounds(29356, 8, 81, 5, Interface);
		setBounds(29357, 8, 96, 6, Interface);
		setBounds(29358, 8, 110, 7, Interface);
		setBounds(29359, 8, 125, 8, Interface);
		setBounds(29360, 8, 140, 9, Interface);
		setBounds(29361, 8, 155, 10, Interface);
		setBounds(29362, 8, 170, 11, Interface);
	}

	public static void lootingBag(TextDrawingArea[] tda) {
		RSInterface tab = addInterface(26700);
		addSprite(26701, 0, "looting/BAG");
		addHoverButton(26702, "looting/BAG", 1, 16, 16, "Close", 0, 26703, 1);
		addHoveredButton(26703, "looting/BAG", 2, 16, 16, 26704);
		addText(26705, "Looting bag", tda, 2, 0xFF9900, true, true);
		itemGroup(26706, 4, 7, 13, 0);
		addText(26707, "Value: 0 coins", tda, 0, 0xFF9900, true, true);
		tab.totalChildren(6);
		tab.child(0, 26701, 9, 21);
		tab.child(1, 26702, 168, 4);
		tab.child(2, 26703, 168, 4);
		tab.child(3, 26705, 95, 4);
		tab.child(4, 26706, 12, 23);
		tab.child(5, 26707, 95, 250);
	}

	public static void itemGroup(int id, int w, int h, int x, int y) {
		RSInterface rsi = addInterface(id);
		rsi.width = w;
		rsi.height = h;
		rsi.inv = new int[w * h];
		rsi.invStackSizes = new int[w * h];
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		rsi.invSpritePadX = x;
		rsi.invSpritePadY = y;
		rsi.spritesX = new int[20];
		rsi.spritesY = new int[20];
		rsi.sprites = new Sprite[20];
		rsi.type = 2;
	}

	public static void Pestpanel(TextDrawingArea tda[]) {
		RSInterface RSinterface = addInterface(27119);
		addText(27120, "What", 0x999999, false, true, 52, tda, 1);
		addText(27121, "What", 0x33cc00, false, true, 52, tda, 1);
		addText(27122, "(Need 5 to 25 players)", 0xffcc33, false, true, 52, tda, 1);
		addText(27123, "Points", 0x33ccff, false, true, 52, tda, 1);
		int last = 4;
		RSinterface.children = new int[last];
		RSinterface.childX = new int[last];
		RSinterface.childY = new int[last];
		setBounds(27120, 10, 12, 0, RSinterface);
		setBounds(27121, 10, 30, 1, RSinterface);
		setBounds(27122, 10, 48, 2, RSinterface);
		setBounds(27123, 10, 66, 3, RSinterface);
	}

	public static void Pestpanel2(TextDrawingArea tda[]) {
		RSInterface RSinterface = addInterface(21100);
		addSprite(21101, 0, "Interfaces/Pest Control/PEST1");
		addSprite(21102, 1, "Interfaces/Pest Control/PEST1");
		addSprite(21103, 2, "Interfaces/Pest Control/PEST1");
		addSprite(21104, 3, "Interfaces/Pest Control/PEST1");
		addSprite(21105, 4, "Interfaces/Pest Control/PEST1");
		addSprite(21106, 5, "Interfaces/Pest Control/PEST1");
		addText(21107, "", 0xcc00cc, false, true, 52, tda, 1);
		addText(21108, "", 255, false, true, 52, tda, 1);
		addText(21109, "", 0xffff44, false, true, 52, tda, 1);
		addText(21110, "", 0xcc0000, false, true, 52, tda, 1);
		addText(21111, "250", 0x99ff33, false, true, 52, tda, 1);
		addText(21112, "250", 0x99ff33, false, true, 52, tda, 1);
		addText(21113, "250", 0x99ff33, false, true, 52, tda, 1);
		addText(21114, "250", 0x99ff33, false, true, 52, tda, 1);
		addText(21115, "200", 0x99ff33, false, true, 52, tda, 1);
		addText(21116, "0", 0x99ff33, false, true, 52, tda, 1);
		addText(21117, "Time Remaining:", 0xffffff, false, true, 52, tda, 0);
		addText(21118, "", 0xffffff, false, true, 52, tda, 0);
		int last = 18;
		RSinterface.children = new int[last];
		RSinterface.childX = new int[last];
		RSinterface.childY = new int[last];
		setBounds(21101, 361, 26, 0, RSinterface);
		setBounds(21102, 396, 26, 1, RSinterface);
		setBounds(21103, 436, 26, 2, RSinterface);
		setBounds(21104, 474, 26, 3, RSinterface);
		setBounds(21105, 3, 21, 4, RSinterface);
		setBounds(21106, 3, 50, 5, RSinterface);
		setBounds(21107, 371, 60, 6, RSinterface);
		setBounds(21108, 409, 60, 7, RSinterface);
		setBounds(21109, 443, 60, 8, RSinterface);
		setBounds(21110, 479, 60, 9, RSinterface);
		setBounds(21111, 362, 10, 10, RSinterface);
		setBounds(21112, 398, 10, 11, RSinterface);
		setBounds(21113, 436, 10, 12, RSinterface);
		setBounds(21114, 475, 10, 13, RSinterface);
		setBounds(21115, 32, 32, 14, RSinterface);
		setBounds(21116, 32, 62, 15, RSinterface);
		setBounds(21117, 8, 88, 16, RSinterface);
		setBounds(21118, 87, 88, 17, RSinterface);
	}

	public static TextDrawingArea[] fonts;

	public static void addText(int i, String s, int k, boolean l, boolean m, int a, int j) {
		RSInterface rsinterface = addTabInterface(i);
		rsinterface.parentID = i;
		rsinterface.id = i;
		rsinterface.type = 4;
		rsinterface.atActionType = 0;
		rsinterface.width = 0;
		rsinterface.height = 0;
		rsinterface.contentType = 0;
		rsinterface.aByte254 = 0;
		rsinterface.mOverInterToTrigger = a;
		rsinterface.centerText = l;
		rsinterface.textShadow = m;
		rsinterface.textDrawingAreas = Interfaces.fonts[j];
		rsinterface.message = s;
		rsinterface.textColor = k;
	}

	private static Sprite loadSprite(int i, String s) {

		Sprite sprite;
		try {
			sprite = new Sprite(s + " " + i);
			if (sprite != null) {
				return sprite;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
		return sprite;
	}

	public Sprite loadSprite(String s, int i) {
		Sprite sprite;
		try {
			sprite = new Sprite(s + " " + i);
			if (sprite != null) {
				return sprite;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
		return null;
	}

	public static void addLunarSprite(int i, int j, String name) {
		RSInterface RSInterface = addTabInterface(i);
		RSInterface.id = i;
		RSInterface.parentID = i;
		RSInterface.type = 5;
		RSInterface.atActionType = 0;
		RSInterface.contentType = 0;
		RSInterface.aByte254 = 0;
		RSInterface.mOverInterToTrigger = 52;
		RSInterface.sprite1 = imageLoader(j, name);
		RSInterface.width = 500;
		RSInterface.height = 500;
		RSInterface.tooltip = "";
	}

	public static void drawRune(int i, int id, String runeName) {
		RSInterface RSInterface = addTabInterface(i);
		RSInterface.type = 5;
		RSInterface.atActionType = 0;
		RSInterface.contentType = 0;
		RSInterface.aByte254 = 0;
		RSInterface.mOverInterToTrigger = 52;
		RSInterface.sprite1 = loadSprite(id, "Lunar/RUNE");
		RSInterface.width = 500;
		RSInterface.height = 500;
	}

	public static void addRuneText(int ID, int runeAmount, int RuneID, TextDrawingArea[] font) {
		RSInterface rsInterface = addTabInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 4;
		rsInterface.atActionType = 0;
		rsInterface.contentType = 0;
		rsInterface.width = 0;
		rsInterface.height = 14;
		rsInterface.aByte254 = 0;
		rsInterface.mOverInterToTrigger = -1;
		rsInterface.anIntArray245 = new int[1];
		rsInterface.anIntArray212 = new int[1];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = runeAmount;
		rsInterface.valueIndexArray = new int[1][4];
		rsInterface.valueIndexArray[0][0] = 4;
		rsInterface.valueIndexArray[0][1] = 3214;
		rsInterface.valueIndexArray[0][2] = RuneID;
		rsInterface.valueIndexArray[0][3] = 0;
		rsInterface.centerText = true;
		rsInterface.textDrawingAreas = font[0];
		rsInterface.textShadow = true;
		rsInterface.message = "%1/" + runeAmount + "";
		rsInterface.aString228 = "";
		rsInterface.textColor = 12582912;
		rsInterface.anInt219 = 49152;
	}

	public static void homeTeleport() {
		RSInterface RSInterface = addTabInterface(30000);
		RSInterface.tooltip = "Cast @gre@Lunar Home Teleport";
		RSInterface.id = 30000;
		RSInterface.parentID = 30000;
		RSInterface.type = 5;
		RSInterface.atActionType = 5;
		RSInterface.contentType = 0;
		RSInterface.aByte254 = 0;
		RSInterface.mOverInterToTrigger = 30001;
		RSInterface.sprite1 = loadSprite(1, "Lunar/SPRITE");
		RSInterface.width = 20;
		RSInterface.height = 20;
		RSInterface hover = addTabInterface(30001);
		hover.mOverInterToTrigger = -1;
		hover.isMouseoverTriggered = true;
		setChildren(1, hover);
		addLunarSprite(30002, 0, "Lunar/SPRITE");
		setBounds(30002, 0, 0, 0, hover);
	}

	public static void addLunar2RunesSmallBox(int ID, int r1, int r2, int ra1, int ra2, int rune1, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addTabInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast On";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[3];
		rsInterface.anIntArray212 = new int[3];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = lvl;
		rsInterface.valueIndexArray = new int[3][];
		rsInterface.valueIndexArray[0] = new int[4];
		rsInterface.valueIndexArray[0][0] = 4;
		rsInterface.valueIndexArray[0][1] = 3214;
		rsInterface.valueIndexArray[0][2] = r1;
		rsInterface.valueIndexArray[0][3] = 0;
		rsInterface.valueIndexArray[1] = new int[4];
		rsInterface.valueIndexArray[1][0] = 4;
		rsInterface.valueIndexArray[1][1] = 3214;
		rsInterface.valueIndexArray[1][2] = r2;
		rsInterface.valueIndexArray[1][3] = 0;
		rsInterface.valueIndexArray[2] = new int[3];
		rsInterface.valueIndexArray[2][0] = 1;
		rsInterface.valueIndexArray[2][1] = 6;
		rsInterface.valueIndexArray[2][2] = 0;
		rsInterface.sprite2 = loadSprite(sid, "Lunar/LUNARON");
		rsInterface.sprite1 = loadSprite(sid, "Lunar/LUNAROFF");
		RSInterface hover = addTabInterface(ID + 1);
		hover.mOverInterToTrigger = -1;
		hover.isMouseoverTriggered = true;
		setChildren(7, hover);
		addLunarSprite(ID + 2, 0, "Lunar/BOX");
		setBounds(ID + 2, 0, 0, 0, hover);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, 1);
		setBounds(ID + 3, 90, 4, 1, hover);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, 0);
		setBounds(ID + 4, 90, 19, 2, hover);
		setBounds(30016, 37, 35, 3, hover);// Rune
		setBounds(rune1, 112, 35, 4, hover);// Rune
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 50, 66, 5, hover);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 123, 66, 6, hover);

	}

	public static void addLunar3RunesSmallBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1, int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addTabInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.valueIndexArray = new int[4][];
		rsInterface.valueIndexArray[0] = new int[4];
		rsInterface.valueIndexArray[0][0] = 4;
		rsInterface.valueIndexArray[0][1] = 3214;
		rsInterface.valueIndexArray[0][2] = r1;
		rsInterface.valueIndexArray[0][3] = 0;
		rsInterface.valueIndexArray[1] = new int[4];
		rsInterface.valueIndexArray[1][0] = 4;
		rsInterface.valueIndexArray[1][1] = 3214;
		rsInterface.valueIndexArray[1][2] = r2;
		rsInterface.valueIndexArray[1][3] = 0;
		rsInterface.valueIndexArray[2] = new int[4];
		rsInterface.valueIndexArray[2][0] = 4;
		rsInterface.valueIndexArray[2][1] = 3214;
		rsInterface.valueIndexArray[2][2] = r3;
		rsInterface.valueIndexArray[2][3] = 0;
		rsInterface.valueIndexArray[3] = new int[3];
		rsInterface.valueIndexArray[3][0] = 1;
		rsInterface.valueIndexArray[3][1] = 6;
		rsInterface.valueIndexArray[3][2] = 0;
		rsInterface.sprite2 = loadSprite(sid, "Lunar/LUNARON");
		rsInterface.sprite1 = loadSprite(sid, "Lunar/LUNAROFF");
		RSInterface hover = addTabInterface(ID + 1);
		hover.mOverInterToTrigger = -1;
		hover.isMouseoverTriggered = true;
		setChildren(9, hover);
		addLunarSprite(ID + 2, 0, "Lunar/BOX");
		setBounds(ID + 2, 0, 0, 0, hover);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, 1);
		setBounds(ID + 3, 90, 4, 1, hover);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, 0);
		setBounds(ID + 4, 90, 19, 2, hover);
		setBounds(30016, 14, 35, 3, hover);
		setBounds(rune1, 74, 35, 4, hover);
		setBounds(rune2, 130, 35, 5, hover);
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 26, 66, 6, hover);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 87, 66, 7, hover);
		addRuneText(ID + 7, ra3 + 1, r3, TDA);
		setBounds(ID + 7, 142, 66, 8, hover);
	}

	public static void addLunar3RunesBigBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1, int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addTabInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.valueIndexArray = new int[4][];
		rsInterface.valueIndexArray[0] = new int[4];
		rsInterface.valueIndexArray[0][0] = 4;
		rsInterface.valueIndexArray[0][1] = 3214;
		rsInterface.valueIndexArray[0][2] = r1;
		rsInterface.valueIndexArray[0][3] = 0;
		rsInterface.valueIndexArray[1] = new int[4];
		rsInterface.valueIndexArray[1][0] = 4;
		rsInterface.valueIndexArray[1][1] = 3214;
		rsInterface.valueIndexArray[1][2] = r2;
		rsInterface.valueIndexArray[1][3] = 0;
		rsInterface.valueIndexArray[2] = new int[4];
		rsInterface.valueIndexArray[2][0] = 4;
		rsInterface.valueIndexArray[2][1] = 3214;
		rsInterface.valueIndexArray[2][2] = r3;
		rsInterface.valueIndexArray[2][3] = 0;
		rsInterface.valueIndexArray[3] = new int[3];
		rsInterface.valueIndexArray[3][0] = 1;
		rsInterface.valueIndexArray[3][1] = 6;
		rsInterface.valueIndexArray[3][2] = 0;
		rsInterface.sprite2 = loadSprite(sid, "Lunar/LUNARON");
		rsInterface.sprite1 = loadSprite(sid, "Lunar/LUNAROFF");
		RSInterface hover = addTabInterface(ID + 1);
		hover.mOverInterToTrigger = -1;
		hover.isMouseoverTriggered = true;
		setChildren(9, hover);
		addLunarSprite(ID + 2, 1, "Lunar/BOX");
		setBounds(ID + 2, 0, 0, 0, hover);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, 1);
		setBounds(ID + 3, 90, 4, 1, hover);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, 0);
		setBounds(ID + 4, 90, 21, 2, hover);
		setBounds(30016, 14, 48, 3, hover);
		setBounds(rune1, 74, 48, 4, hover);
		setBounds(rune2, 130, 48, 5, hover);
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 26, 79, 6, hover);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 87, 79, 7, hover);
		addRuneText(ID + 7, ra3 + 1, r3, TDA);
		setBounds(ID + 7, 142, 79, 8, hover);
	}

	public static void addLunar3RunesLargeBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1, int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addTabInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.valueIndexArray = new int[4][];
		rsInterface.valueIndexArray[0] = new int[4];
		rsInterface.valueIndexArray[0][0] = 4;
		rsInterface.valueIndexArray[0][1] = 3214;
		rsInterface.valueIndexArray[0][2] = r1;
		rsInterface.valueIndexArray[0][3] = 0;
		rsInterface.valueIndexArray[1] = new int[4];
		rsInterface.valueIndexArray[1][0] = 4;
		rsInterface.valueIndexArray[1][1] = 3214;
		rsInterface.valueIndexArray[1][2] = r2;
		rsInterface.valueIndexArray[1][3] = 0;
		rsInterface.valueIndexArray[2] = new int[4];
		rsInterface.valueIndexArray[2][0] = 4;
		rsInterface.valueIndexArray[2][1] = 3214;
		rsInterface.valueIndexArray[2][2] = r3;
		rsInterface.valueIndexArray[2][3] = 0;
		rsInterface.valueIndexArray[3] = new int[3];
		rsInterface.valueIndexArray[3][0] = 1;
		rsInterface.valueIndexArray[3][1] = 6;
		rsInterface.valueIndexArray[3][2] = 0;
		rsInterface.sprite2 = loadSprite(sid, "Lunar/LUNARON");
		rsInterface.sprite1 = loadSprite(sid, "Lunar/LUNAROFF");
		RSInterface hover = addTabInterface(ID + 1);
		hover.isMouseoverTriggered = true;
		hover.mOverInterToTrigger = -1;
		setChildren(9, hover);
		addLunarSprite(ID + 2, 2, "Lunar/BOX");
		setBounds(ID + 2, 0, 0, 0, hover);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, 1);
		setBounds(ID + 3, 90, 4, 1, hover);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, 0);
		setBounds(ID + 4, 90, 34, 2, hover);
		setBounds(30016, 14, 61, 3, hover);
		setBounds(rune1, 74, 61, 4, hover);
		setBounds(rune2, 130, 61, 5, hover);
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 26, 92, 6, hover);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 87, 92, 7, hover);
		addRuneText(ID + 7, ra3 + 1, r3, TDA);
		setBounds(ID + 7, 142, 92, 8, hover);
	}

	public static void configureLunar(TextDrawingArea[] TDA) {
		homeTeleport();
		drawRune(30003, 1, "Fire");
		drawRune(30004, 2, "Water");
		drawRune(30005, 3, "Air");
		drawRune(30006, 4, "Earth");
		drawRune(30007, 5, "Mind");
		drawRune(30008, 6, "Body");
		drawRune(30009, 7, "Death");
		drawRune(30010, 8, "Nature");
		drawRune(30011, 9, "Chaos");
		drawRune(30012, 10, "Law");
		drawRune(30013, 11, "Cosmic");
		drawRune(30014, 12, "Blood");
		drawRune(30015, 13, "Soul");
		drawRune(30016, 14, "Astral");
		addLunar3RunesSmallBox(30017, 9075, 554, 555, 0, 4, 3, 30003, 30004, 64, "Bake Pie", "Bake pies without a stove", TDA, 0, 16, 2);
		addLunar2RunesSmallBox(30025, 9075, 557, 0, 7, 30006, 65, "Cure Plant", "Cure disease on farming patch", TDA, 1, 4, 2);
		addLunar3RunesBigBox(30032, 9075, 564, 558, 0, 0, 0, 30013, 30007, 65, "Monster Examine", "Detect the combat statistics of a\\nmonster", TDA, 2, 2, 2);
		addLunar3RunesSmallBox(30040, 9075, 564, 556, 0, 0, 1, 30013, 30005, 66, "NPC Contact", "Speak with varied NPCs", TDA, 3, 0, 2);
		addLunar3RunesSmallBox(30048, 9075, 563, 557, 0, 0, 9, 30012, 30006, 67, "Cure Other", "Cure poisoned players", TDA, 4, 8, 2);
		addLunar3RunesSmallBox(30056, 9075, 555, 554, 0, 2, 0, 30004, 30003, 67, "Humidify", "fills certain vessels with water", TDA, 5, 0, 5);
		addLunar3RunesSmallBox(30064, 9075, 563, 557, 1, 0, 1, 30012, 30006, 68, "Training Teleports", "Teleports you to moonclan island", TDA, 6, 0, 5);
		addLunar3RunesBigBox(30075, 9075, 563, 557, 1, 0, 3, 30012, 30006, 69, "Minigame Teleports", "Teleports players to Moonclan\\nisland", TDA, 7, 0, 5);
		addLunar3RunesSmallBox(30083, 9075, 563, 557, 1, 0, 5, 30012, 30006, 70, "Pking Teleports", "Teleports you to ourania rune altar", TDA, 8, 0, 5);
		addLunar3RunesSmallBox(30091, 9075, 564, 563, 1, 1, 0, 30013, 30012, 70, "Skilling Area", "Cures Poison", TDA, 9, 0, 5);
		addLunar2RunesSmallBox(30099, 9075, 557, 1, 1, 30006, 70, "Hunter Kit", "Get a kit of hunting gear", TDA, 10, 0, 5);
		addLunar3RunesSmallBox(30106, 9075, 563, 555, 1, 0, 0, 30012, 30004, 71, "Boss Teleports", "Teleports you to Waterbirth island", TDA, 11, 0, 5);
		addLunar3RunesBigBox(30114, 9075, 563, 555, 1, 0, 4, 30012, 30004, 72, "Tele Group Waterbirth", "Teleports players to Waterbirth\\nisland", TDA, 12, 0, 5);
		addLunar3RunesSmallBox(30122, 9075, 564, 563, 1, 1, 1, 30013, 30012, 73, "Cure Group", "Cures Poison on players", TDA, 13, 0, 5);
		addLunar3RunesBigBox(30130, 9075, 564, 559, 1, 1, 4, 30013, 30008, 74, "Stat Spy", "Cast on another player to see their\\nskill levels", TDA, 14, 8, 2);
		addLunar3RunesBigBox(30138, 9075, 563, 554, 1, 1, 2, 30012, 30003, 74, "Barbarian Teleport", "Teleports you to the Barbarian\\noutpost", TDA, 15, 0, 5);
		addLunar3RunesBigBox(30146, 9075, 563, 554, 1, 1, 5, 30012, 30003, 75, "Tele Group Barbarian", "Teleports players to the Barbarian\\noutpost", TDA, 16, 0, 5);
		addLunar3RunesSmallBox(30154, 9075, 554, 556, 1, 5, 9, 30003, 30005, 76, "Superglass Make", "Make glass without a furnace", TDA, 17, 16, 2);
		addLunar3RunesSmallBox(30162, 9075, 563, 555, 1, 1, 3, 30012, 30004, 77, "Khazard Teleport", "Teleports you to Port khazard", TDA, 18, 0, 5);
		addLunar3RunesSmallBox(30170, 9075, 563, 555, 1, 1, 7, 30012, 30004, 78, "Tele Group Khazard", "Teleports players to Port khazard", TDA, 19, 0, 5);
		addLunar3RunesBigBox(30178, 9075, 564, 559, 1, 0, 4, 30013, 30008, 78, "Dream", "Take a rest and restore hitpoints 3\\n times faster", TDA, 20, 0, 5);
		addLunar3RunesSmallBox(30186, 9075, 557, 555, 1, 9, 4, 30006, 30004, 79, "String Jewellery", "String amulets without wool", TDA, 21, 0, 5);
		addLunar3RunesLargeBox(30194, 9075, 557, 555, 1, 9, 9, 30006, 30004, 80, "Stat Restore Pot\\nShare", "Share a potion with up to 4 nearby\\nplayers", TDA, 22, 0, 5);
		addLunar3RunesSmallBox(30202, 9075, 554, 555, 1, 6, 6, 30003, 30004, 81, "Magic Imbue", "Combine runes without a talisman", TDA, 23, 0, 5);
		addLunar3RunesBigBox(30210, 9075, 561, 557, 2, 1, 14, 30010, 30006, 82, "Fertile Soil", "Fertilise a farming patch with super\\ncompost", TDA, 24, 4, 2);
		addLunar3RunesBigBox(30218, 9075, 557, 555, 2, 11, 9, 30006, 30004, 83, "Boost Potion Share", "Shares a potion with up to 4 nearby\\nplayers", TDA, 25, 0, 5);
		addLunar3RunesSmallBox(30226, 9075, 563, 555, 2, 2, 9, 30012, 30004, 84, "Fishing Guild Teleport", "Teleports you to the fishing guild", TDA, 26, 0, 5);
		addLunar3RunesLargeBox(30234, 9075, 563, 555, 1, 2, 13, 30012, 30004, 85, "Tele Group Fishing\\nGuild", "Teleports players to the Fishing\\nGuild", TDA, 27, 0, 5);
		addLunar3RunesSmallBox(30242, 9075, 557, 561, 2, 14, 0, 30006, 30010, 85, "Plank Make", "Turn Logs into planks", TDA, 28, 16, 5);
		/******** Cut Off Limit **********/
		addLunar3RunesSmallBox(30250, 9075, 563, 555, 2, 2, 9, 30012, 30004, 86, "Catherby Teleport", "Teleports you to Catherby", TDA, 29, 0, 5);
		addLunar3RunesSmallBox(30258, 9075, 563, 555, 2, 2, 14, 30012, 30004, 87, "Tele Group Catherby", "Teleports players to Catherby", TDA, 30, 0, 5);
		addLunar3RunesSmallBox(30266, 9075, 563, 555, 2, 2, 7, 30012, 30004, 88, "Ice Plateau Teleport", "Teleports you to Ice Plateau", TDA, 31, 0, 5);
		addLunar3RunesBigBox(30274, 9075, 563, 555, 2, 2, 15, 30012, 30004, 89, "Tele Group Ice\\n Plateau", "Teleports players to Ice Plateau", TDA, 32, 0, 5);
		addLunar3RunesBigBox(30282, 9075, 563, 561, 2, 1, 0, 30012, 30010, 90, "Energy Transfer", "Spend hitpoints and SA Energy to\\n give another player hitpoints and run energy", TDA, 33, 8, 2);
		addLunar3RunesBigBox(30290, 9075, 563, 565, 2, 2, 0, 30012, 30014, 91, "Heal Other", "Transfer up to 75% of hitpoints\\n to another player", TDA, 34, 8, 2);
		addLunar3RunesBigBox(30298, 9075, 560, 557, 2, 1, 9, 30009, 30006, 92, "Vengeance Other", "Allows another player to rebound\\ndamage to an opponent", TDA, 35, 8, 2);
		addLunar3RunesSmallBox(30306, 9075, 560, 557, 3, 1, 9, 30009, 30006, 93, "Vengeance", "Rebound damage to an opponent", TDA, 36, 0, 5);
		addLunar3RunesBigBox(30314, 9075, 565, 563, 3, 2, 5, 30014, 30012, 94, "Heal Group", "Transfer up to 75% of hitpoints to a group", TDA, 37, 0, 5);
		addLunar3RunesBigBox(30322, 9075, 564, 563, 2, 1, 0, 30013, 30012, 95, "Spellbook Swap", "Change to another spellbook for 1\\nspell cast", TDA, 38, 0, 5);
	}

	public static void constructLunar() {
		RSInterface Interface = addTabInterface(29999);
		setChildren(80, Interface);
		setBounds(30000, 11, 10, 0, Interface);
		setBounds(30017, 40, 9, 1, Interface);
		setBounds(30025, 71, 12, 2, Interface);
		setBounds(30032, 103, 10, 3, Interface);
		setBounds(30040, 135, 12, 4, Interface);
		setBounds(30048, 165, 10, 5, Interface);
		setBounds(30056, 8, 38, 6, Interface);
		setBounds(30064, 39, 39, 7, Interface);
		setBounds(30075, 71, 39, 8, Interface);
		setBounds(30083, 103, 39, 9, Interface);
		setBounds(30091, 135, 39, 10, Interface);
		setBounds(30099, 165, 37, 11, Interface);
		setBounds(30106, 12, 68, 12, Interface);
		setBounds(30114, 42, 68, 13, Interface);
		setBounds(30122, 71, 68, 14, Interface);
		setBounds(30130, 103, 68, 15, Interface);
		setBounds(30138, 135, 68, 16, Interface);
		setBounds(30146, 165, 68, 17, Interface);
		setBounds(30154, 14, 97, 18, Interface);
		setBounds(30162, 42, 97, 19, Interface);
		setBounds(30170, 71, 97, 20, Interface);
		setBounds(30178, 101, 97, 21, Interface);
		setBounds(30186, 135, 98, 22, Interface);
		setBounds(30194, 168, 98, 23, Interface);
		setBounds(30202, 11, 125, 24, Interface);
		setBounds(30210, 42, 124, 25, Interface);
		setBounds(30218, 74, 125, 26, Interface);
		setBounds(30226, 103, 125, 27, Interface);
		setBounds(30234, 135, 125, 28, Interface);
		setBounds(30242, 164, 126, 29, Interface);
		setBounds(30250, 10, 155, 30, Interface);
		setBounds(30258, 42, 155, 31, Interface);
		setBounds(30266, 71, 155, 32, Interface);
		setBounds(30274, 103, 155, 33, Interface);
		setBounds(30282, 136, 155, 34, Interface);
		setBounds(30290, 165, 155, 35, Interface);
		setBounds(30298, 13, 185, 36, Interface);
		setBounds(30306, 42, 185, 37, Interface);
		setBounds(30314, 71, 184, 38, Interface);
		setBounds(30322, 104, 184, 39, Interface);
		setBounds(30001, 6, 184, 40, Interface);// hover
		setBounds(30018, 5, 176, 41, Interface);// hover
		setBounds(30026, 5, 176, 42, Interface);// hover
		setBounds(30033, 5, 163, 43, Interface);// hover
		setBounds(30041, 5, 176, 44, Interface);// hover
		setBounds(30049, 5, 176, 45, Interface);// hover
		setBounds(30057, 5, 176, 46, Interface);// hover
		setBounds(30065, 5, 176, 47, Interface);// hover
		setBounds(30076, 5, 163, 48, Interface);// hover
		setBounds(30084, 5, 176, 49, Interface);// hover
		setBounds(30092, 5, 176, 50, Interface);// hover
		setBounds(30100, 5, 176, 51, Interface);// hover
		setBounds(30107, 5, 176, 52, Interface);// hover
		setBounds(30115, 5, 163, 53, Interface);// hover
		setBounds(30123, 5, 176, 54, Interface);// hover
		setBounds(30131, 5, 163, 55, Interface);// hover
		setBounds(30139, 5, 163, 56, Interface);// hover
		setBounds(30147, 5, 163, 57, Interface);// hover
		setBounds(30155, 5, 176, 58, Interface);// hover
		setBounds(30163, 5, 176, 59, Interface);// hover
		setBounds(30171, 5, 176, 60, Interface);// hover
		setBounds(30179, 5, 163, 61, Interface);// hover
		setBounds(30187, 5, 176, 62, Interface);// hover
		setBounds(30195, 5, 149, 63, Interface);// hover
		setBounds(30203, 5, 176, 64, Interface);// hover
		setBounds(30211, 5, 163, 65, Interface);// hover
		setBounds(30219, 5, 163, 66, Interface);// hover
		setBounds(30227, 5, 176, 67, Interface);// hover
		setBounds(30235, 5, 149, 68, Interface);// hover
		setBounds(30243, 5, 176, 69, Interface);// hover
		setBounds(30251, 5, 5, 70, Interface);// hover
		setBounds(30259, 5, 5, 71, Interface);// hover
		setBounds(30267, 5, 5, 72, Interface);// hover
		setBounds(30275, 5, 5, 73, Interface);// hover
		setBounds(30283, 5, 5, 74, Interface);// hover
		setBounds(30291, 5, 5, 75, Interface);// hover
		setBounds(30299, 5, 5, 76, Interface);// hover
		setBounds(30307, 5, 5, 77, Interface);// hover
		setBounds(30323, 5, 5, 78, Interface);// hover
		setBounds(30315, 5, 5, 79, Interface);// hover
	}

	public static void setBounds(int ID, int X, int Y, int frame, RSInterface RSinterface) {
		RSinterface.children[frame] = ID;
		RSinterface.childX[frame] = X;
		RSinterface.childY[frame] = Y;
	}

	public static void setChildren(int total, RSInterface i) {
		i.children = new int[total];
		i.childX = new int[total];
		i.childY = new int[total];
	}

	private static void itemIdFinder(TextDrawingArea[] tda) {
		RSInterface main = addTabInterface(55300);
		RSInterface widget = addInterface(55320);
		addInputField(55301, 50, 0xE68A00, "Search", 132, 23, false, true);
		addText(55302, "Search for an item!", tda, 2, 0xE68A00, true, true);

		for (int index = 55321; index < 55821; index++) {
			addText(index, "" + index, tda, 2, 0xFFFFFF, false, true);
		}

		setChildren(3, main);
		main.child(0, 55301, 28, 34);
		main.child(1, 55302, 93, 14);
		main.child(2, 55320, 6, 64);
		widget.width = 168;
		widget.height = 170;
		widget.scrollMax = 1320;
		setChildren(500, widget);
		int interfaceId = 55321;
		int x = 25;
		int y = 10;
		for (int index = 0; index < 500; index++) {
			widget.child(index, interfaceId, x, y);
			interfaceId++;
			y += 20;
		}
	}

	private static void spawnInterface(TextDrawingArea[] tda) {
		RSInterface main = addInterface(55100);

		RSInterface widget = addInterface(55106);

		addSprite(55101, 0, "interfaces/spawn/sprite");

		addHoverButton(55102, "interfaces/spawn/sprite", 1, 16, 16, "Close Window", 0, 55104, 4);
		addHoveredButton(55104, "interfaces/spawn/sprite", 2, 16, 16, 55103);

		addText(55105, "Combat Beta Supplies", tda, 2, 0xE68A00, true, true);

		addInputField(55120, 50, 0xE68A00, "Search", 132, 23, false, true);

		addToItemGroup(55121, 8, 80, 25, 10, true, "Buy 1", "Buy 5", "Buy 10", "Buy 50", "Buy X");

		setChildren(6, main);
		main.child(0, 55101, 13, 10);
		main.child(1, 55102, 475, 18);
		main.child(2, 55104, 475, 18);
		main.child(3, 55105, 250, 19);
		main.child(4, 55120, 180, 279);
		main.child(5, 55106, 12, 57);

		setChildren(1, widget);
		widget.child(0, 55121, 12, 12);

		widget.width = 450;

		widget.height = 223;

		widget.scrollMax = 450;
	}

	public static void addToItemGroup(int childId, int w, int h, int x, int y, boolean actions, String action1, String action2, String action3, String action4, String action5) {
		RSInterface rsi = addInterface(childId);
		rsi.width = w;
		rsi.height = h;
		rsi.inv = new int[w * h];
		rsi.invStackSizes = new int[w * h];
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		rsi.invSpritePadX = x;
		rsi.invSpritePadY = y;
		rsi.spritesX = new int[20];
		rsi.spritesY = new int[20];
		rsi.sprites = new Sprite[20];
		rsi.actions = new String[5];
		if (actions) {
			rsi.actions[0] = action1;
			rsi.actions[1] = action2;
			rsi.actions[2] = action3;
			rsi.actions[3] = action4;
			rsi.actions[4] = action5;
		}
		rsi.type = 2;
	}

	private static void tradeUIAddon(TextDrawingArea[] tda) {

		RSInterface main = addInterface(55000);
		interfaceCache[3557].message = "";
		interfaceCache[3558].message = "";

		setChildren(3, main);

		setBounds(3443, 0, 0, 0, main);
		setBounds(55010, 25, 85, 1, main);
		setBounds(55050, 265, 85, 2, main);

		RSInterface widget = addInterface(55010);
		setChildren(28, widget);
		widget.width = 213;
		widget.height = 205;
		widget.scrollMax = 28 * 15;
		for (int child = 0; child < widget.children.length; child++) {
			addText(55011 + child, "", tda, 2, 0xFFFFFF, true, true);
			setBounds(55011 + child, 100, child * 15, child, widget);
		}

		widget = addInterface(55050);
		setChildren(28, widget);
		widget.width = 213;
		widget.height = 205;
		widget.scrollMax = 28 * 15;
		for (int child = 0; child < widget.children.length; child++) {
			addText(55051 + child, "", tda, 2, 0xFFFFFF, true, true);
			setBounds(55051 + child, 100, child * 15, child, widget);
		}

	}

	public static void bank(TextDrawingArea[] tda) {
		RSInterface rs = addInterface(5292);
		rs.message = "";
		setChildren(28, rs);
		addSprite(58001, 0, "BankTab/BANK");
		addHoverButton(5384, "BankTab/BANK", 1, 24, 24, "Close Window", 250, 5380, 3);
		addHoveredButton(5380, "BankTab/BANK", 2, 24, 24, 5379);
		addHoverButton(5294, "BankTab/BANK", 3, 100, 33, "Set A Bank PIN", 250, 5295, 4);
		addHoveredButton(5295, "BankTab/BANK", 4, 100, 33, 5296);
		addBankHover(58002, 4, 58003, 5, 8, "BankTab/BANK", 37, 29, 304, 1, "Swap Withdraw Mode", 58004, 7, 6, "BankTab/BANK", 58005, "Switch to insert items \nmode", "Switch to swap items \nmode.", 12, 20);
		addBankHover(58010, 4, 58011, 9, 11, "BankTab/BANK", 37, 29, 115, 1, "Swap Withdrawal Mode", 58012, 10, 12, "BankTab/BANK", 58013, "Switch to note withdrawal \nmode", "Switch to item withdrawal \nmode", 12, 20);
		addBankHover1(58018, 5, 58019, 17, "BankTab/BANK", 37, 29, "Deposit carried items", 58020, 18, "BankTab/BANK", 58021, "Empty your backpack into\nyour bank", 0, 20);
		addBankHover1(58026, 5, 58027, 19, "BankTab/BANK", 35, 25, "Deposit worn items", 58028, 20, "BankTab/BANK", 58029, "Empty the items your are\nwearing into your bank", 0, 20);
		for (int i = 0; i < 9; i++) {
			addInterface(58050 + i);
			if (i == 0)
				addConfigButton(58031, 5292, 1, 0, "BankTab/TAB", 48, 38, new String[] { "Price Check", "View" }, 1, 700);
			else
				addConfigButton(58031 + i, 5292, 4, 2, "BankTab/TAB", 48, 38, new String[] { "Price Check", "Collapse", "View" }, 1, 700 + i);
			addToItemGroup(58040 + i, 1, 1, 0, 0, false, "", "", "");
		}
		addSprite(58060, 21, "BankTab/BANK");
		addText(58061, "0", tda, 0, 0xE68A00, true, true);
		addText(58062, "350", tda, 0, 0xE68A00, true, true);
		addInputField(58063, 50, 0xE68A00, "Search", 132, 23, false, true);
		addText(58064, "Jason's Bank", tda, 1, 0xE68A00, true, true);
		RSInterface Interface = interfaceCache[5385];
		Interface.height = 208;
		Interface.width = 481;
		Interface = interfaceCache[5382];
		Interface.width = 10;
		Interface.invSpritePadX = 12;
		Interface.height = 35;
		Interface.actions = new String[] { "Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw All", "Withdraw X", "Withdraw All but one" };
		setBounds(58001, 13, 1, 0, rs);
		setBounds(5384, 475, 10, 1, rs);
		setBounds(5380, 475, 10, 2, rs);
		setBounds(5294, 193, 297, 3, rs);
		setBounds(5295, 193, 297, 4, rs);
		setBounds(58002, 25, 297, 5, rs);
		setBounds(58003, 10, 237, 6, rs);
		setBounds(58010, 67, 297, 7, rs);
		setBounds(58011, 52, 237, 8, rs);

		setBounds(58018, 109, 297, 9, rs);
		setBounds(58019, 94, 237, 10, rs);
		setBounds(58026, 151, 297, 11, rs);
		setBounds(58027, 136, 237, 12, rs);
		setBounds(5385, -3, 76, 13, rs);
		RSInterface.interfaceCache[5385].height = 216;
		int x = 68;
		for (int i = 0; i < 9; i++) {
			setBounds(58050 + i, 0, 0, 14 + i, rs);
			RSInterface rsi = interfaceCache[58050 + i];
			setChildren(2, rsi);
			setBounds(58031 + i, x, 36, 0, rsi);
			setBounds(58040 + i, x + 5, 39, 1, rsi);
			x += 41;
		}
		setBounds(58060, 452, 295, 23, rs);
		setBounds(58061, 473, 299, 24, rs);
		setBounds(58062, 473, 310, 25, rs);
		setBounds(58063, 315, 298, 26, rs);
		setBounds(58064, 250, 11, 27, rs);
	}

	public static void addConfigButton(int ID, int pID, int bID, int bID2, String bName, int width, int height, String[] tooltips, int configID, int configFrame) {
		RSInterface Tab = addTabInterface(ID);
		Tab.parentID = pID;
		Tab.id = ID;
		Tab.type = 5;
		Tab.atActionType = 8;
		Tab.contentType = 0;
		Tab.width = width;
		Tab.height = height;
		Tab.opacity = 0;
		Tab.hoverType = -1;
		Tab.anIntArray245 = new int[1];
		Tab.anIntArray212 = new int[1];
		Tab.anIntArray245[0] = 1;
		Tab.anIntArray212[0] = configID;
		Tab.valueIndexArray = new int[1][3];
		Tab.valueIndexArray = new int[1][3];
		Tab.valueIndexArray[0][0] = 5;
		Tab.valueIndexArray[0][1] = configFrame;
		Tab.valueIndexArray[0][2] = 0;
		Tab.sprite1 = imageLoader(bID, bName);
		Tab.sprite2 = imageLoader(bID2, bName);
		Tab.tooltips = tooltips;
	}

	public static void Logout(TextDrawingArea[] wid) {
		RSInterface rsinterface = interfaceCache[2449];
		rsinterface.childX[0] = 8;
		rsinterface.childY[0] = 68;
		rsinterface.childX[1] = 10;
		rsinterface.childY[1] = 86;
		rsinterface.childX[2] = 12;
		rsinterface.childY[2] = 104;
		rsinterface.childX[8] = 29;
		rsinterface.childY[8] = 164;
		rsinterface = interfaceCache[2450];
		rsinterface.textColor = 0xff981f;
		rsinterface = interfaceCache[2451];
		rsinterface.textColor = 0xff981f;
		rsinterface = interfaceCache[2452];
		rsinterface.textColor = 0xff981f;
	}

	public static void emoteTab() {
		RSInterface tab = addTabInterface(147);
		RSInterface scroll = addTabInterface(148);
		tab.totalChildren(1);
		tab.child(0, 148, 0, 1);
		addButton(168, 0, "Emotes/EMOTE", "Yes");
		addButton(169, 1, "Emotes/EMOTE", "No");
		addButton(164, 2, "Emotes/EMOTE", "Bow");
		addButton(165, 3, "Emotes/EMOTE", "Angry");
		addButton(162, 4, "Emotes/EMOTE", "Think");
		addButton(163, 5, "Emotes/EMOTE", "Wave");
		addButton(13370, 6, "Emotes/EMOTE", "Shrug");
		addButton(171, 7, "Emotes/EMOTE", "Cheer");
		addButton(167, 8, "Emotes/EMOTE", "Beckon");
		addButton(170, 9, "Emotes/EMOTE", "Laugh");
		addButton(13366, 10, "Emotes/EMOTE", "Jump for Joy");
		addButton(13368, 11, "Emotes/EMOTE", "Yawn");
		addButton(166, 12, "Emotes/EMOTE", "Dance");
		addButton(13363, 13, "Emotes/EMOTE", "Jig");
		addButton(13364, 14, "Emotes/EMOTE", "Spin");
		addButton(13365, 15, "Emotes/EMOTE", "Headbang");
		addButton(161, 16, "Emotes/EMOTE", "Cry");
		addButton(11100, 17, "Emotes/EMOTE", "Blow kiss");
		addButton(13362, 18, "Emotes/EMOTE", "Panic");
		addButton(13367, 19, "Emotes/EMOTE", "Raspberry");
		addButton(172, 20, "Emotes/EMOTE", "Clap");
		addButton(13369, 21, "Emotes/EMOTE", "Salute");
		addButton(13383, 22, "Emotes/EMOTE", "Goblin Bow");
		addButton(13384, 23, "Emotes/EMOTE", "Goblin Salute");
		addButton(667, 24, "Emotes/EMOTE", "Glass Box");
		addButton(6503, 25, "Emotes/EMOTE", "Climb Rope");
		addButton(6506, 26, "Emotes/EMOTE", "Lean On Air");
		addButton(666, 27, "Emotes/EMOTE", "Glass Wall");
		addButton(18464, 28, "Emotes/EMOTE", "Zombie Walk");
		addButton(18465, 29, "Emotes/EMOTE", "Zombie Dance");
		addButton(15166, 30, "Emotes/EMOTE", "Scared");
		addButton(18686, 31, "Emotes/EMOTE", "Rabbit Hop");
		addConfigButton(154, 147, 32, 33, "Emotes/EMOTE", 41, 47, "Skillcape Emote", 0, 1, 700);
		scroll.totalChildren(33);
		scroll.child(0, 168, 10, 7);
		scroll.child(1, 169, 54, 7);
		scroll.child(2, 164, 98, 14);
		scroll.child(3, 165, 137, 7);
		scroll.child(4, 162, 9, 56);
		scroll.child(5, 163, 48, 56);
		scroll.child(6, 13370, 95, 56);
		scroll.child(7, 171, 137, 56);
		scroll.child(8, 167, 7, 105);
		scroll.child(9, 170, 51, 105);
		scroll.child(10, 13366, 95, 104);
		scroll.child(11, 13368, 139, 105);
		scroll.child(12, 166, 6, 154);
		scroll.child(13, 13363, 50, 154);
		scroll.child(14, 13364, 90, 154);
		scroll.child(15, 13365, 135, 154);
		scroll.child(16, 161, 8, 204);
		scroll.child(17, 11100, 51, 203);
		scroll.child(18, 13362, 99, 204);
		scroll.child(19, 13367, 137, 203);
		scroll.child(20, 172, 10, 253);
		scroll.child(21, 13369, 53, 253);
		scroll.child(22, 13383, 88, 258);
		scroll.child(23, 13384, 138, 252);
		scroll.child(24, 667, 2, 303);
		scroll.child(25, 6503, 49, 302);
		scroll.child(26, 6506, 93, 302);
		scroll.child(27, 666, 137, 302);
		scroll.child(28, 18464, 9, 352);
		scroll.child(29, 18465, 50, 352);
		scroll.child(30, 15166, 94, 356);
		scroll.child(31, 18686, 141, 353);
		scroll.child(32, 154, 5, 401);
		scroll.width = 173;
		scroll.height = 258;
		scroll.scrollMax = 450;
	}

	public static void optionTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(904);
		RSInterface energy = interfaceCache[149];
		energy.textColor = 0xff9933;
		addSprite(905, 9, "Options/SPRITE");
		addSprite(907, 18, "Options/SPRITE");
		addSprite(909, 29, "Options/SPRITE");
		addSprite(951, 32, "Options/SPRITE");
		addSprite(953, 33, "Options/SPRITE");
		addSprite(955, 34, "Options/SPRITE");
		addSprite(947, 36, "Options/SPRITE");
		addSprite(949, 35, "Options/SPRITE");
		addConfigButton(152, 904, 30, 31, "Options/SPRITE", 40, 40, "Toggle-run", 1, 5, 173);
		addConfigButton(906, 904, 10, 14, "Options/SPRITE", 32, 16, "Dark", 1, 5, 166);
		addConfigButton(908, 904, 11, 15, "Options/SPRITE", 32, 16, "Normal", 2, 5, 166);
		addConfigButton(910, 904, 12, 16, "Options/SPRITE", 32, 16, "Bright", 3, 5, 166);
		addConfigButton(912, 904, 13, 17, "Options/SPRITE", 32, 16, "Very Bright", 4, 5, 166);
		addConfigButton(930, 904, 19, 24, "Options/SPRITE", 26, 16, "Music Off", 4, 5, 168);
		addConfigButton(931, 904, 20, 25, "Options/SPRITE", 26, 16, "Music Level-1", 3, 5, 168);
		addConfigButton(932, 904, 21, 26, "Options/SPRITE", 26, 16, "Music Level-2", 2, 5, 168);
		addConfigButton(933, 904, 22, 27, "Options/SPRITE", 26, 16, "Music Level-3", 1, 5, 168);
		addConfigButton(934, 904, 23, 28, "Options/SPRITE", 24, 16, "Music Level-4", 0, 5, 168);
		addConfigButton(941, 904, 19, 24, "Options/SPRITE", 26, 16, "Sound Effects Off", 4, 5, 169);
		addConfigButton(942, 904, 20, 25, "Options/SPRITE", 26, 16, "Sound Effects Level-1", 3, 5, 169);
		addConfigButton(943, 904, 21, 26, "Options/SPRITE", 26, 16, "Sound Effects Level-2", 2, 5, 169);
		addConfigButton(944, 904, 22, 27, "Options/SPRITE", 26, 16, "Sound Effects Level-3", 1, 5, 169);
		addConfigButton(945, 904, 23, 28, "Options/SPRITE", 24, 16, "Sound Effects Level-4", 0, 5, 169);
		addConfigButton(913, 904, 30, 31, "Options/SPRITE", 40, 40, "Toggle-Mouse Buttons", 0, 5, 170);
		addConfigButton(915, 904, 30, 31, "Options/SPRITE", 40, 40, "Toggle-Chat Effects", 0, 5, 171);
		addConfigButton(957, 904, 30, 31, "Options/SPRITE", 40, 40, "Toggle-Split Private Chat", 1, 5, 287);
		addConfigButton(12464, 904, 30, 31, "Options/SPRITE", 40, 40, "Toggle-Accept Aid", 0, 5, 427);
		tab.totalChildren(28);
		int x = 0;
		int y = 2;
		tab.child(0, 905, 13 + x, 10 + y);
		tab.child(1, 906, 48 + x, 18 + y);
		tab.child(2, 908, 80 + x, 18 + y);
		tab.child(3, 910, 112 + x, 18 + y);
		tab.child(4, 912, 144 + x, 18 + y);
		tab.child(5, 907, 14 + x, 55 + y);
		tab.child(6, 930, 49 + x, 61 + y);
		tab.child(7, 931, 75 + x, 61 + y);
		tab.child(8, 932, 101 + x, 61 + y);
		tab.child(9, 933, 127 + x, 61 + y);
		tab.child(10, 934, 151 + x, 61 + y);
		tab.child(11, 909, 13 + x, 99 + y);
		tab.child(12, 941, 49 + x, 104 + y);
		tab.child(13, 942, 75 + x, 104 + y);
		tab.child(14, 943, 101 + x, 104 + y);
		tab.child(15, 944, 127 + x, 104 + y);
		tab.child(16, 945, 151 + x, 104 + y);
		tab.child(17, 913, 15, 153);
		tab.child(18, 955, 19, 159);
		tab.child(19, 915, 75, 153);
		tab.child(20, 953, 79, 160);
		tab.child(21, 957, 135, 153);
		tab.child(22, 951, 139, 159);
		tab.child(23, 12464, 15, 208);
		tab.child(24, 949, 20, 213);
		tab.child(25, 152, 75, 208);
		tab.child(26, 947, 87, 212);
		tab.child(27, 149, 80, 231);
	}

	public static void equipmentTab(TextDrawingArea[] wid) {
		RSInterface Interface = interfaceCache[1644];
		addSprite(15101, 0, "Equipment/bl");// cheap hax
		addSprite(15102, 1, "Equipment/bl");// cheap hax
		addSprite(15109, 2, "Equipment/bl");// cheap hax
		removeSomething(15103);
		removeSomething(15104);
		Interface.children[23] = 15101;
		Interface.childX[23] = 40;
		Interface.childY[23] = 205;
		Interface.children[24] = 15102;
		Interface.childX[24] = 110;
		Interface.childY[24] = 205;
		Interface.children[25] = 15109;
		Interface.childX[25] = 39;
		Interface.childY[25] = 240;
		Interface.children[26] = 27650;
		Interface.childX[26] = 0;
		Interface.childY[26] = 0;
		Interface = addInterface(27650);
		addButton(27653, 1, "Equipment/BOX", "Show Equipment Stats", 27655, 1, 40, 39);
		addTooltip(27655, "Show Equipment Stats");
		addButton(27654, 2, "Equipment/BOX", "Show Items Kept on Death", 27657, 1, 40, 39);
		addTooltip(27657, "Show Items Kept on Death");
		setChildren(4, Interface);
		setBounds(27653, 29, 205, 0, Interface);
		setBounds(27654, 124, 205, 1, Interface);
		setBounds(27655, 39, 240, 2, Interface);
		setBounds(27657, 39, 220, 3, Interface);
	}

	public static void equipmentScreen(TextDrawingArea[] wid) {
		RSInterface Interface = RSInterface.interfaceCache[1644];
		addButton(19144, 6, "Equipment/CUSTOM", "Show Equipment Stats");
		removeSomething(19145);
		removeSomething(19146);
		removeSomething(19147);
		setBounds(19144, 21, 210, 23, Interface);
		setBounds(19145, 40, 210, 24, Interface);
		setBounds(19146, 40, 210, 25, Interface);
		setBounds(19147, 40, 210, 26, Interface);
		RSInterface tab = addTabInterface(15106);
		addSprite(15107, 7, "Equipment/CUSTOM");
		addHoverButton(15210, "Equipment/CUSTOM", 8, 21, 21, "Close", 250, 15211, 3);
		addHoveredButton(15211, "Equipment/CUSTOM", 9, 21, 21, 15212);
		addText(15111, "Equip Your Character...", wid, 2, 0xe4a146, false, true);
		addText(15112, "Attack bonus", wid, 2, 0xe4a146, false, true);
		addText(15113, "Defence bonus", wid, 2, 0xe4a146, false, true);
		addText(15114, "Other bonuses", wid, 2, 0xe4a146, false, true);
		for (int i = 1675; i <= 1684; i++) {
			textSize(i, wid, 1);
		}
		textSize(1686, wid, 1);
		textSize(1687, wid, 1);
		addChar(15125);
		tab.totalChildren(44);
		tab.child(0, 15107, 4, 20);
		tab.child(1, 15210, 476, 29);
		tab.child(2, 15211, 476, 29);
		tab.child(3, 15111, 14, 30);
		int Child = 4;
		int Y = 69;
		for (int i = 1675; i <= 1679; i++) {
			tab.child(Child, i, 20, Y);
			Child++;
			Y += 14;
		}
		tab.child(9, 1680, 20, 161);
		tab.child(10, 1681, 20, 177);
		tab.child(11, 1682, 20, 192);
		tab.child(12, 1683, 20, 207);
		tab.child(13, 1684, 20, 221);
		tab.child(14, 1686, 20, 262);
		tab.child(15, 15125, 170, 200);
		tab.child(16, 15112, 16, 55);
		tab.child(17, 1687, 20, 276);
		tab.child(18, 15113, 16, 147);
		tab.child(19, 15114, 16, 248);
		tab.child(20, 1645, 104 + 295, 149 - 52);
		tab.child(21, 1646, 399, 163);
		tab.child(22, 1647, 399, 163);
		tab.child(23, 1648, 399, 58 + 146);
		tab.child(24, 1649, 26 + 22 + 297 - 2, 110 - 44 + 118 - 13 + 5);
		tab.child(25, 1650, 321 + 22, 58 + 154);
		tab.child(26, 1651, 321 + 134, 58 + 118);
		tab.child(27, 1652, 321 + 134, 58 + 154);
		tab.child(28, 1653, 321 + 48, 58 + 81);
		tab.child(29, 1654, 321 + 107, 58 + 81);
		tab.child(30, 1655, 321 + 58, 58 + 42);
		tab.child(31, 1656, 321 + 112, 58 + 41);
		tab.child(32, 1657, 321 + 78, 58 + 4);
		tab.child(33, 1658, 321 + 37, 58 + 43);
		tab.child(34, 1659, 321 + 78, 58 + 43);
		tab.child(35, 1660, 321 + 119, 58 + 43);
		tab.child(36, 1661, 321 + 22, 58 + 82);
		tab.child(37, 1662, 321 + 78, 58 + 82);
		tab.child(38, 1663, 321 + 134, 58 + 82);
		tab.child(39, 1664, 321 + 78, 58 + 122);
		tab.child(40, 1665, 321 + 78, 58 + 162);
		tab.child(41, 1666, 321 + 22, 58 + 162);
		tab.child(42, 1667, 321 + 134, 58 + 162);
		tab.child(43, 1688, 50 + 297 - 2, 110 - 13 + 5);
		for (int i = 1675; i <= 1684; i++) {
			RSInterface rsi = interfaceCache[i];
			rsi.textColor = 0xe4a146;
			rsi.centerText = false;
		}
		for (int i = 1686; i <= 1687; i++) {
			RSInterface rsi = interfaceCache[i];
			rsi.textColor = 0xe4a146;
			rsi.centerText = false;
		}
	}

	public static void itemsOnDeathDATA(TextDrawingArea[] wid) {
		RSInterface rsinterface = addInterface(17115);
		addText(17109, "a", wid, 0, 0xff981f);
		addText(17110, "b", wid, 0, 0xff981f);
		addText(17111, "c", wid, 0, 0xff981f);
		addText(17112, "d", wid, 0, 0xff981f);
		addText(17113, "e", wid, 0, 0xff981f);
		addText(17114, "f", wid, 0, 0xff981f);
		addText(17117, "g", wid, 0, 0xff981f);
		addText(17118, "h", wid, 0, 0xff981f);
		addText(17119, "i", wid, 0, 0xff981f);
		addText(17120, "j", wid, 0, 0xff981f);
		addText(17121, "k", wid, 0, 0xff981f);
		addText(17122, "l", wid, 0, 0xff981f);
		addText(17123, "m", wid, 0, 0xff981f);
		addText(17124, "n", wid, 0, 0xff981f);
		addText(17125, "o", wid, 0, 0xff981f);
		addText(17126, "p", wid, 0, 0xff981f);
		addText(17127, "q", wid, 0, 0xff981f);
		addText(17128, "r", wid, 0, 0xff981f);
		addText(17129, "s", wid, 0, 0xff981f);
		addText(17130, "t", wid, 0, 0xff981f);
		rsinterface.parentID = 17115;
		rsinterface.id = 17115;
		rsinterface.type = 0;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.width = 130;
		rsinterface.height = 197;
		rsinterface.aByte254 = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.scrollMax = 280;
		rsinterface.children = new int[20];
		rsinterface.childX = new int[20];
		rsinterface.childY = new int[20];
		rsinterface.children[0] = 17109;
		rsinterface.childX[0] = 0;
		rsinterface.childY[0] = 0;
		rsinterface.children[1] = 17110;
		rsinterface.childX[1] = 0;
		rsinterface.childY[1] = 12;
		rsinterface.children[2] = 17111;
		rsinterface.childX[2] = 0;
		rsinterface.childY[2] = 24;
		rsinterface.children[3] = 17112;
		rsinterface.childX[3] = 0;
		rsinterface.childY[3] = 36;
		rsinterface.children[4] = 17113;
		rsinterface.childX[4] = 0;
		rsinterface.childY[4] = 48;
		rsinterface.children[5] = 17114;
		rsinterface.childX[5] = 0;
		rsinterface.childY[5] = 60;
		rsinterface.children[6] = 17117;
		rsinterface.childX[6] = 0;
		rsinterface.childY[6] = 72;
		rsinterface.children[7] = 17118;
		rsinterface.childX[7] = 0;
		rsinterface.childY[7] = 84;
		rsinterface.children[8] = 17119;
		rsinterface.childX[8] = 0;
		rsinterface.childY[8] = 96;
		rsinterface.children[9] = 17120;
		rsinterface.childX[9] = 0;
		rsinterface.childY[9] = 108;
		rsinterface.children[10] = 17121;
		rsinterface.childX[10] = 0;
		rsinterface.childY[10] = 120;
		rsinterface.children[11] = 17122;
		rsinterface.childX[11] = 0;
		rsinterface.childY[11] = 132;
		rsinterface.children[12] = 17123;
		rsinterface.childX[12] = 0;
		rsinterface.childY[12] = 144;
		rsinterface.children[13] = 17124;
		rsinterface.childX[13] = 0;
		rsinterface.childY[13] = 156;
		rsinterface.children[14] = 17125;
		rsinterface.childX[14] = 0;
		rsinterface.childY[14] = 168;
		rsinterface.children[15] = 17126;
		rsinterface.childX[15] = 0;
		rsinterface.childY[15] = 180;
		rsinterface.children[16] = 17127;
		rsinterface.childX[16] = 0;
		rsinterface.childY[16] = 192;
		rsinterface.children[17] = 17128;
		rsinterface.childX[17] = 0;
		rsinterface.childY[17] = 204;
		rsinterface.children[18] = 17129;
		rsinterface.childX[18] = 0;
		rsinterface.childY[18] = 216;
		rsinterface.children[19] = 17130;
		rsinterface.childX[19] = 0;
		rsinterface.childY[19] = 228;
	}

	public static void itemsOnDeath(TextDrawingArea[] wid) {
		RSInterface rsinterface = addInterface(17100);
		addSprite(17101, 2, 2);
		addHover(17102, 3, 0, 10601, 1, "Equipment/SPRITE", 17, 17, "Close Window");
		addHovered(10601, 3, "Equipment/SPRITE", 17, 17, 10602);
		addText(17103, "Items kept on death", wid, 2, 0xff981f);
		addText(17104, "Items I will keep...", wid, 1, 0xff981f);
		addText(17105, "Items I will lose...", wid, 1, 0xff981f);
		addText(17106, "Info", wid, 1, 0xff981f);
		addText(17107, "Shit fuck", wid, 1, 0xffcc33);
		addText(17108, "", wid, 1, 0xffcc33);
		rsinterface.scrollMax = 0;
		rsinterface.isMouseoverTriggered = false;
		rsinterface.children = new int[12];
		rsinterface.childX = new int[12];
		rsinterface.childY = new int[12];
		rsinterface.children[0] = 17101;
		rsinterface.childX[0] = 7;
		rsinterface.childY[0] = 8;
		rsinterface.children[1] = 17102;
		rsinterface.childX[1] = 480;
		rsinterface.childY[1] = 17;
		rsinterface.children[2] = 17103;
		rsinterface.childX[2] = 185;
		rsinterface.childY[2] = 18;
		rsinterface.children[3] = 17104;
		rsinterface.childX[3] = 22;
		rsinterface.childY[3] = 50;
		rsinterface.children[4] = 17105;
		rsinterface.childX[4] = 22;
		rsinterface.childY[4] = 110;
		rsinterface.children[5] = 17106;
		rsinterface.childX[5] = 347;
		rsinterface.childY[5] = 47;
		rsinterface.children[6] = 17107;
		rsinterface.childX[6] = 349;
		rsinterface.childY[6] = 270;
		rsinterface.children[7] = 17108;
		rsinterface.childX[7] = 398;
		rsinterface.childY[7] = 298;
		rsinterface.children[8] = 17115;
		rsinterface.childX[8] = 348;
		rsinterface.childY[8] = 64;
		rsinterface.children[9] = 10494;
		rsinterface.childX[9] = 26;
		rsinterface.childY[9] = 74;
		rsinterface.children[10] = 10600;
		rsinterface.childX[10] = 26;
		rsinterface.childY[10] = 133;
		rsinterface.children[11] = 10601;
		rsinterface.childX[11] = 480;
		rsinterface.childY[11] = 17;

	}

	public static void Sidebar0(TextDrawingArea[] tda) {
		Sidebar0a(1698, 1701, 7499, "Chop", "Hack", "Smash", "Block", 42, 75, 127, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda, "Accurate\nSlash\nAttack XP", "Aggressive\nSlash\nStrength XP", "Aggressive\nCrush\nStrength XP", "Defensive\nSlash\nDefence XP", 40132, 40136, 40140, 40144); // OK

		Sidebar0a(2276, 2279, 7574, "Stab", "Lunge", "Slash", "Block", 43, 75, 124, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda, "Accurate\nStab\nAttack XP", "Aggressive\nStab\nStrength XP", "Aggressive\nSlash\nStrength XP", "Defensive\nStab\nDefence XP", 40020, 40024, 40028, 40032); // OK

		Sidebar0a(2423, 2426, 7599, "Chop", "Slash", "Lunge", "Block", 42, 75, 125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda, "Accurate\nSlash\nAttack XP", "Aggressive\nSlash\nStrength XP", "Controlled\nStab\nShared XP", "Defensive\nSlash\nDefence XP", 40036, 40040, 40044, 40048); // OK

		Sidebar0a(3796, 3799, 7624, "Pound", "Pummel", "Spike", "Block", 39, 75, 121, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda, "", "", "", "", 40052, 40056, 40060, 40064); // WTF IS
																																																	// THIS?!

		Sidebar0a(4679, 4682, 7674, "Lunge", "Swipe", "Pound", "Block", 40, 75, 124, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda, "Controlled\nStab\nShared XP", "Controlled\nSlash\nShared XP", "Controlled\nCrush\nShared XP", "Defensive\nStab\nDefence XP", 40068, 40072, 40076, 40080); // OK

		Sidebar0a(4705, 4708, 7699, "Chop", "Slash", "Smash", "Block", 42, 75, 125, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda, "Accurate\nSlash\nAttack XP", "Aggressive\nSlash\nStrength XP", "Aggressive\nCrush\nStrength XP", "Defensive\nSlash\nDefence XP", 40084, 40088, 40092, 40096); // ???

		Sidebar0a(5570, 5573, 7724, "Spike", "Impale", "Smash", "Block", 41, 75, 123, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda, "Accurate\nStab\nAttack XP", "Aggressive\nStab\nStrength XP", "Aggressive\nCrush\nStrength XP", "Defensive\nStab\nDefence XP", 40010, 40104, 40108, 40112); // OK

		Sidebar0a(7762, 7765, 7800, "Chop", "Slash", "Lunge", "Block", 42, 75, 125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda, "Accurate\nSlash\nAttack XP", "Aggressive\nSlash\nStrength XP", "Controlled\nStab\nShared XP", "Defensive\nSlash\nDefence XP", 40116, 40120, 40124, 40128); // OK

		Sidebar0b(776, 779, "Reap", "Chop", "Jab", "Block", 42, 75, 126, 75, 46, 128, 125, 128, 122, 103, 122, 50, 40, 103, 40, 50, tda, "", "", "", "", 40132, 40136, 40140, 40144); // ???

		Sidebar0c(425, 428, 7474, "Pound", "Pummel", "Block", 39, 75, 121, 75, 42, 128, 40, 103, 40, 50, 122, 50, tda, "Accurate\nCrush\nAttack XP", "Aggressive\nCrush\nDefence XP", "Defensive\nCrush\nDefence XP", 40148, 40152, 40156); // OK

		Sidebar0c(1749, 1752, 7524, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, tda, "Accurate\nRanged XP", "Rapid\nRanged XP", "Long range\nRanged XP\nDefence XP", 40160, 40164, 40168); // OK

		Sidebar0c(1764, 1767, 7549, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, tda, "Accurate\nRanged XP", "Rapid\nRanged XP", "Long range\nRanged XP\nDefence XP", 40172, 40176, 40180); // OK

		Sidebar0c(4446, 4449, 7649, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, tda, "Accurate\nRanged XP", "Rapid\nRanged XP", "Long range\nRanged XP\nDefence XP", 40184, 40188, 40192); // OK

		Sidebar0c(5855, 5857, 7749, "Punch", "Kick", "Block", 40, 75, 129, 75, 42, 128, 40, 50, 122, 50, 40, 103, tda, "Accurate\nCrush\nAttack XP", "Aggressive\nCrush\nStrength XP", "Defensive\nCrush\nDefence XP", 40196, 40200, 40204); // OK

		Sidebar0c(6103, 6132, 6117, "Bash", "Pound", "Block", 43, 75, 124, 75, 42, 128, 40, 103, 40, 50, 122, 50, tda, "Accurate\nCrush\nAttack XP", "Aggressive\nCrush\nStrength XP", "Defensive\nCrush\nDefence XP", 40208, 40212, 40216); // ???

		Sidebar0c(8460, 8463, 8493, "Jab", "Swipe", "Fend", 46, 75, 124, 75, 43, 128, 40, 103, 40, 50, 122, 50, tda, "Controlled\nStabbed\nShared XP", "Aggressive\nSlash\nStrength XP", "Defensive\nStab\nDefence XP", 40224, 40228, 40232); // OK

		Sidebar0c(12290, 12293, 12323, "Flick", "Lash", "Deflect", 44, 75, 127, 75, 36, 128, 40, 50, 40, 103, 122, 50, tda, "Accurate\nSlash\nAttack XP", "Controlled\nSlash\nShared XP", "Defensive\nSlash\nDefence XP", 40236, 40240, 40244); // OK

		Sidebar0d(328, 331, "Bash", "Pound", "Focus", 42, 66, 39, 101, 41, 136, 40, 120, 40, 50, 40, 85, tda);

		RSInterface rsi = addTabInterface(19300);
		textSize(3983, tda, 0);
		addAttackStyleButton2(150, 150, 172, 150, 44, "Auto Retaliate", 40000, 154, 42, "When active, you will\nautomatically fight back if\nattacked.", tda);

		rsi.totalChildren(3);
		rsi.child(0, 3983, 52, 25); // combat level
		rsi.child(1, 150, 21, 153); // auto retaliate
		rsi.child(2, 40000, 26, 200);

		rsi = interfaceCache[3983];
		rsi.centerText = true;
		rsi.textColor = 0xff981f;
	}

	public static void Sidebar0a(int id, int id2, int id3, String text1, String text2, String text3, String text4, int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int str4x, int str4y, int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, int img4x, int img4y, TextDrawingArea[] tda, String popupString1, String popupString2, String popupString3, String popupString4, int hoverID1, int hoverID2, int hoverID3, int hoverID4) // 4button
																																																																																																																		// spec
	{
		RSInterface rsi = addTabInterface(id); // 2423
		addAttackText(id2, "-2", tda, 3, 0xff981f, true); // 2426
		addAttackText(id2 + 11, text1, tda, 0, 0xff981f, false);
		addAttackText(id2 + 12, text2, tda, 0, 0xff981f, false);
		addAttackText(id2 + 13, text3, tda, 0, 0xff981f, false);
		addAttackText(id2 + 14, text4, tda, 0, 0xff981f, false);

		rsi.specialBar(id3, tda); // 7599

		addAttackHover(id2 + 3, hoverID1, popupString1, tda);
		addAttackHover(id2 + 6, hoverID2, popupString2, tda);
		addAttackHover(id2 + 5, hoverID3, popupString3, tda);
		addAttackHover(id2 + 4, hoverID4, popupString4, tda);

		rsi.width = 190;
		rsi.height = 261;

		int frame = 0;
		rsi.totalChildren(20);

		rsi.child(frame, id2 + 3, 21, 46);
		frame++; // 2429
		rsi.child(frame, id2 + 4, 104, 99);
		frame++; // 2430
		rsi.child(frame, id2 + 5, 21, 99);
		frame++; // 2431
		rsi.child(frame, id2 + 6, 105, 46);
		frame++; // 2432

		rsi.child(frame, id2 + 7, img1x, img1y);
		frame++; // bottomright 2433
		rsi.child(frame, id2 + 8, img2x, img2y);
		frame++; // topleft 2434
		rsi.child(frame, id2 + 9, img3x, img3y);
		frame++; // bottomleft 2435
		rsi.child(frame, id2 + 10, img4x, img4y);
		frame++; // topright 2436

		rsi.child(frame, id2 + 11, str1x, str1y);
		frame++; // chop 2437
		rsi.child(frame, id2 + 12, str2x, str2y);
		frame++; // slash 2438
		rsi.child(frame, id2 + 13, str3x, str3y);
		frame++; // lunge 2439
		rsi.child(frame, id2 + 14, str4x, str4y);
		frame++; // block 2440

		rsi.child(frame, id3, 21, 205);
		frame++; // special attack 7599
		rsi.child(frame, 19300, 0, 0);
		frame++; // stuffs
		rsi.child(frame, id2, 94, 4);
		frame++; // weapon 2426
		rsi.child(frame, hoverID1, 25, 96);
		frame++;
		rsi.child(frame, hoverID2, 108, 96);
		frame++;
		rsi.child(frame, hoverID3, 25, 149);
		frame++;
		rsi.child(frame, hoverID4, 108, 149);
		frame++;
		rsi.child(frame, 40005, 28, 149);
		frame++; // special bar tooltip

		for (int i = id2 + 3; i < id2 + 7; i++) { // 2429 - 2433
			rsi = interfaceCache[i];
			rsi.sprite1 = CustomSpriteLoader(19301, "");
			rsi.sprite2 = CustomSpriteLoader(19301, "a");
			rsi.width = 68;
			rsi.height = 44;
		}
	}

	public static void Sidebar0b(int id, int id2, String text1, String text2, String text3, String text4, int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int str4x, int str4y, int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, int img4x, int img4y, TextDrawingArea[] tda, String popupString1, String popupString2, String popupString3, String popupString4, int hoverID1, int hoverID2, int hoverID3, int hoverID4) // 4button
																																																																																																																// nospec
	{
		RSInterface rsi = addTabInterface(id); // 2423
		addAttackText(id2, "-2", tda, 3, 0xff981f, true); // 2426
		addAttackText(id2 + 11, text1, tda, 0, 0xff981f, false);
		addAttackText(id2 + 12, text2, tda, 0, 0xff981f, false);
		addAttackText(id2 + 13, text3, tda, 0, 0xff981f, false);
		addAttackText(id2 + 14, text4, tda, 0, 0xff981f, false);

		addAttackHover(id2 + 3, hoverID1, popupString1, tda);
		addAttackHover(id2 + 6, hoverID2, popupString2, tda);
		addAttackHover(id2 + 5, hoverID3, popupString3, tda);
		addAttackHover(id2 + 4, hoverID4, popupString4, tda);

		rsi.width = 190;
		rsi.height = 261;

		int frame = 0;
		rsi.totalChildren(18);

		rsi.child(frame, id2 + 3, 21, 46);
		frame++; // 2429
		rsi.child(frame, id2 + 4, 104, 99);
		frame++; // 2430
		rsi.child(frame, id2 + 5, 21, 99);
		frame++; // 2431
		rsi.child(frame, id2 + 6, 105, 46);
		frame++; // 2432

		rsi.child(frame, id2 + 7, img1x, img1y);
		frame++; // bottomright 2433
		rsi.child(frame, id2 + 8, img2x, img2y);
		frame++; // topleft 2434
		rsi.child(frame, id2 + 9, img3x, img3y);
		frame++; // bottomleft 2435
		rsi.child(frame, id2 + 10, img4x, img4y);
		frame++; // topright 2436

		rsi.child(frame, id2 + 11, str1x, str1y);
		frame++; // chop 2437
		rsi.child(frame, id2 + 12, str2x, str2y);
		frame++; // slash 2438
		rsi.child(frame, id2 + 13, str3x, str3y);
		frame++; // lunge 2439
		rsi.child(frame, id2 + 14, str4x, str4y);
		frame++; // block 2440

		rsi.child(frame, 19300, 0, 0);
		frame++; // stuffs
		rsi.child(frame, id2, 94, 4);
		frame++; // weapon 2426
		rsi.child(frame, hoverID1, 25, 96);
		frame++;
		rsi.child(frame, hoverID2, 108, 96);
		frame++;
		rsi.child(frame, hoverID3, 25, 149);
		frame++;
		rsi.child(frame, hoverID4, 108, 149);
		frame++;

		for (int i = id2 + 3; i < id2 + 7; i++) { // 2429 - 2433
			rsi = interfaceCache[i];
			rsi.sprite1 = CustomSpriteLoader(19301, "");
			rsi.sprite2 = CustomSpriteLoader(19301, "a");
			rsi.width = 68;
			rsi.height = 44;
		}
	}

	public static void Sidebar0c(int id, int id2, int id3, String text1, String text2, String text3, int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, TextDrawingArea[] tda, String popupString1, String popupString2, String popupString3, int hoverID1, int hoverID2, int hoverID3) // 3button spec
	{
		RSInterface rsi = addTabInterface(id); // 2423
		addAttackText(id2, "-2", tda, 3, 0xff981f, true); // 2426
		addAttackText(id2 + 9, text1, tda, 0, 0xff981f, false);
		addAttackText(id2 + 10, text2, tda, 0, 0xff981f, false);
		addAttackText(id2 + 11, text3, tda, 0, 0xff981f, false);

		rsi.specialBar(id3, tda); // 7599

		addAttackHover(id2 + 5, hoverID1, popupString1, tda);
		addAttackHover(id2 + 4, hoverID2, popupString2, tda);
		addAttackHover(id2 + 3, hoverID3, popupString3, tda);

		rsi.width = 190;
		rsi.height = 261;

		int frame = 0;
		rsi.totalChildren(16);

		rsi.child(frame, id2 + 3, 21, 99);
		frame++;
		rsi.child(frame, id2 + 4, 105, 46);
		frame++;
		rsi.child(frame, id2 + 5, 21, 46);
		frame++;

		rsi.child(frame, id2 + 6, img1x, img1y);
		frame++; // topleft
		rsi.child(frame, id2 + 7, img2x, img2y);
		frame++; // bottomleft
		rsi.child(frame, id2 + 8, img3x, img3y);
		frame++; // topright

		rsi.child(frame, id2 + 9, str1x, str1y);
		frame++; // chop
		rsi.child(frame, id2 + 10, str2x, str2y);
		frame++; // slash
		rsi.child(frame, id2 + 11, str3x, str3y);
		frame++; // lunge

		rsi.child(frame, id3, 21, 205);
		frame++; // special attack 7599
		rsi.child(frame, 19300, 0, 0);
		frame++; // stuffs
		rsi.child(frame, id2, 94, 4);
		frame++; // weapon

		rsi.child(frame, hoverID1, 25, 96);
		frame++;
		rsi.child(frame, hoverID2, 108, 96);
		frame++;
		rsi.child(frame, hoverID3, 25, 149);
		frame++;
		rsi.child(frame, 40005, 28, 149);
		frame++; // special bar tooltip

		for (int i = id2 + 3; i < id2 + 6; i++) {
			rsi = interfaceCache[i];
			rsi.sprite1 = CustomSpriteLoader(19301, "");
			rsi.sprite2 = CustomSpriteLoader(19301, "a");
			rsi.width = 68;
			rsi.height = 44;
		}
	}

	public static void Sidebar0d(int id, int id2, String text1, String text2, String text3, int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, TextDrawingArea[] tda) // 3button nospec
																																																														// (magic intf)
	{
		RSInterface rsi = addTabInterface(id); // 2423
		addAttackText(id2, "-2", tda, 3, 0xff981f, true); // 2426
		addAttackText(id2 + 9, text1, tda, 0, 0xff981f, false);
		addAttackText(id2 + 10, text2, tda, 0, 0xff981f, false);
		addAttackText(id2 + 11, text3, tda, 0, 0xff981f, false);

		addAttackText(353, "Spell", tda, 0, 0xff981f, false);
		addAttackText(354, "Spell", tda, 0, 0xff981f, false);

		addCacheSprite(337, 19, 0, "combaticons");
		addCacheSprite(338, 13, 0, "combaticons2");
		addCacheSprite(339, 14, 0, "combaticons2");

		/* addToggleButton(id, sprite, config, width, height, tooltip); */
		// addToggleButton(349, 349, 108, 68, 44, "Select");
		removeSomething(349);
		addToggleButton(350, 350, 108, 68, 44, "Select");

		rsi.width = 190;
		rsi.height = 261;

		int last = 15;
		int frame = 0;
		rsi.totalChildren(last);

		rsi.child(frame, id2 + 3, 20, 115);
		frame++;
		rsi.child(frame, id2 + 4, 20, 80);
		frame++;
		rsi.child(frame, id2 + 5, 20, 45);
		frame++;

		rsi.child(frame, id2 + 6, img1x, img1y);
		frame++; // topleft
		rsi.child(frame, id2 + 7, img2x, img2y);
		frame++; // bottomleft
		rsi.child(frame, id2 + 8, img3x, img3y);
		frame++; // topright

		rsi.child(frame, id2 + 9, str1x, str1y);
		frame++; // bash
		rsi.child(frame, id2 + 10, str2x, str2y);
		frame++; // pound
		rsi.child(frame, id2 + 11, str3x, str3y);
		frame++; // focus

		rsi.child(frame, 349, 105, 46);
		frame++; // spell1
		rsi.child(frame, 350, 104, 106);
		frame++; // spell2

		rsi.child(frame, 353, 125, 74);
		frame++; // spell
		rsi.child(frame, 354, 125, 134);
		frame++; // spell

		rsi.child(frame, 19300, 0, 0);
		frame++; // stuffs
		rsi.child(frame, id2, 94, 4);
		frame++; // weapon
	}

	public static void prayerTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(5608);
		RSInterface currentPray = interfaceCache[687];
		addSprite(5651, 0, "Prayer/PRAYER");
		currentPray.textColor = 0xFF981F;
		currentPray.textShadow = true;
		currentPray.message = "%1/%2";

		int[] ID1 = { 18016, 18017, 18018, 18019, 18020, 18021, 18022, 18023, 18024, 18025, 18026, 18027, 18028, 18029, 18030, 18031, 18032, 18033, 18034, 18035, 18036, 18037, 18038, 18039, 18040, 18041 };
		int[] X = { 8, 44, 80, 114, 150, 8, 44, 80, 116, 152, 8, 42, 78, 116, 152, 8, 44, 80, 116, 150, 6, 44, 80, 116, 150, 6 };
		int[] Y = { 6, 6, 6, 4, 4, 42, 42, 42, 42, 42, 79, 76, 76, 78, 78, 114, 114, 114, 114, 112, 148, 150, 150, 150, 148, 184 };

		int[] hoverIDs = { 18050, 18052, 18054, 18056, 18058, 18060, 18062, 18064, 18066, 18068, 18070, 18072, 18074, 18076, 18078, 18080, 18082, 18084, 18086, 18088, 18090, 18092, 18094, 18096, 18098, 18100 };
		int[] hoverX = { 12, 8, 20, 12, 24, 2, 2, 6, 6, 50, 6, 6, 10, 6, 6, 5, 5, 5, 5, 5, 18, 28, 28, 50, 1, 1 };
		int[] hoverY = { 42, 42, 42, 42, 42, 80, 80, 80, 80, 80, 118, 118, 118, 118, 118, 150, 150, 150, 150, 150, 105, 80, 65, 65, 65, 110 };
		String[] hoverStrings = { "Level 01\nThick Skin\nIncreases your Defence by 5%", "Level 04\nBurst of Strength\nIncreases your Strength by 5%", "Level 07\nCharity of Thought\nIncreases your Attack by 5%", "Level 08\nSharp Eye\nIncreases your Ranged by 5%", "Level 09\nMystic Will\nIncreases your Magic by 5%", "Level 10\nRock Skin\nIncreases your Defence by 10%", "Level 13\nSuperhuman Strength\nIncreases your Strength by 10%", "Level 16\nImproved Reflexes\nIncreases your Attack by 10%", "Level 19\nRapid Restore\n2x restore rate for all stats\nexcept Hitpoints and Prayer", "Level 22\nRapid Heal\n2x restore rate for the\nHitpoints stat", "Level 25\nProtect Item\nKeep one extra item if you die", "Level 26\nHawk Eye\nIncreases your Ranged by 10%", "Level 27\nMystic Lore\nIncreases your Magic by 10%", "Level 28\nSteel Skin\nIncreases your Defence by 15%", "Level 31\nUltimate Strength\nIncreases your Strength by 15%", "Level 34\nIncredible Reflexes\nIncreases your Attack by 15%",
				"Level 37\nProtect from Magic\nProtection from magical attacks", "Level 40\nProtect from Missiles\nProtection from ranged attacks", "Level 43\nProtect from Melee\nProtection from close attacks", "Level 44\nEagle Eye\nIncreases your Ranged by 15%", "Level 45\nMystic Might\nIncreases your Magic by 15%", "Level 46\nRetribution\nInflicts damage to nearby\ntargets if you die", "Level 49\nRedemption\nHeals you when damaged\nand Hitpoints falls\nbelow 10%", "Level 52\nSmite\n1/4 of damage dealt is\nalso removed from\nopponents Prayer", "Level 60\nChivalry\nIncreases your Defence by 20%,\nStrength by 18% and Attack by\n15%", "Level 70\nPiety\nIncreases your Defence by 25%,\nStrength by 23% and Attack by\n20%" };

		int ID2[] = { 5609, 5610, 5611, 5612, 5613, 5614, 5615, 5616, 5617, 5618, 5619, 5620, 5621, 5622, 5623, 683, 684, 685, 5632, 5633, 5634, 5635, 5636, 5637, 5638, 5639, 5640, 5641, 5642, 5643, 5644, 686, 5645, 5649, 5647, 5648, 18000, 18001, 18002, 18003, 18004, 18005, 18006, 18007, 18008, 18009, 18010, 18011, 18012, 18013, 18014, 18015, 5651, 687 };
		int X2[] = { 6, 42, 78, 6, 42, 78, 114, 150, 6, 114, 150, 6, 42, 78, 114, 42, 78, 114, 8, 44, 80, 8, 44, 80, 116, 152, 8, 116, 152, 8, 44, 80, 116, 44, 80, 116, 114, 117, 150, 153, 42, 45, 78, 81, 150, 153, 6, 9, 150, 157, 6, 8, 65, 14 };
		int Y2[] = { 4, 4, 4, 40, 40, 40, 40, 40, 76, 76, 76, 112, 112, 112, 112, 148, 148, 148, 6, 6, 6, 42, 42, 42, 42, 42, 79, 78, 78, 114, 114, 114, 114, 150, 150, 150, 4, 8, 4, 7, 76, 80, 76, 79, 112, 116, 148, 151, 148, 151, 184, 194, 242, 244 };

		String[] oldPrayerNames = { "Thick Skin", "Burst of Strength", "Charity of Thought", "Rock Skin", "Superhuman Strength", "Improved Reflexes", "Rapid Restore", "Rapid Heal", "Protect Item", "Steel Skin", "Ultimate Strength", "Incredible Reflexes", "Protect from Magic", "Protect from Missiles", "Protect from Melee", "Retribution", "Redemption", "Smite" };
		addPrayer(18000, 0, 601, 7, 0, "Sharp Eye");
		addPrayer(18002, 0, 602, 8, 1, "Mystic Will");
		addPrayer(18004, 0, 603, 25, 2, "Hawk Eye");
		addPrayer(18006, 0, 604, 26, 3, "Mystic Lore");
		addPrayer(18008, 0, 605, 43, 4, "Eagle Eye");
		addPrayer(18010, 0, 606, 44, 5, "Mystic Might");
		addPrayer(18012, 0, 607, 59, 6, "Chivalry");
		addPrayer(18014, 0, 608, 69, 7, "Piety");

		for (int i = 0; i < 18; i++) {
			addOldPrayer(ID2[i], oldPrayerNames[i]);
		}

		for (int i = 0; i < 26; i++) {
			addPrayerHover(ID1[i], hoverIDs[i], i, hoverStrings[i]);
		}

		tab.totalChildren(106); // 54
		tab.child(52, 5651, 70, 242);
		for (int ii = 0; ii < 54; ii++) {
			tab.child(ii, ID2[ii], X2[ii], Y2[ii]);
		}

		int frame = 54;
		int frame2 = 0;
		for (int i : ID1) {
			tab.child(frame, i, X[frame2], Y[frame2]);
			frame++;
			frame2++;
		}

		int frame3 = 0;
		for (int i : hoverIDs) {
			tab.child(frame, i, hoverX[frame3], hoverY[frame3]);
			frame++;
			frame3++;
		}
	}

	public static void slayerRewardsBuy(TextDrawingArea[] tda) {
		RSInterface rsi = addTab(22100);
		int j = 0;
		addSprite(22101, 1, "Slayer/PANEL");
		addButton(22102, 0, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addButton(22103, 1, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addButton(22104, 1, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addText(22105, "Buy", tda, 0, 0xff9040);
		addText(22106, "Learn", tda, 0, 0xff9040);
		addText(22107, "Assignment", tda, 0, 0xff9040);
		addText(22108, "Slayer Points : ", tda, 2, 0xff9040);
		addText(22109, "XXXX", tda, 2, 0xff9040);
		addHoverText(22110, "Close window", "Close window", tda, 1, 0xff9040, false, true, 73);
		addHoverText(22111, "Purchase slayer experience (400 * Level)", "Slayer experience", tda, 1, 0xff9040, false, true, 205);
		addText(22112, "(100 Points)", tda, 0, 0xff9040);
		addHoverText(22113, "Purchase 250 Slayer dart casts", "Slayer dart casts", tda, 1, 0xff9040, false, true, 205);
		addText(22114, "(25 Points)", tda, 0, 0xff9040);
		addHoverText(22115, "Purchase untrimmed slayer cape", "Untrimmed slayer cape", tda, 1, 0xff9040, false, true, 205);
		addText(22116, "(300 Points)", tda, 0, 0xff9040);
		addHoverText(22117, "Purchase ring of slaying", "Ring of slaying", tda, 1, 0xff9040, false, true, 205);
		addText(22118, "(30 Points)", tda, 0, 0xff9040);
		rsi.totalChildren(18);
		rsi.child(j, 22101, 10, 10);
		j++;
		rsi.child(j, 22102, 20, 20);
		j++;
		rsi.child(j, 22103, 98, 20);
		j++;
		rsi.child(j, 22104, 176, 20);
		j++;
		rsi.child(j, 22105, 40, 25);
		j++;
		rsi.child(j, 22106, 118, 25);
		j++;
		rsi.child(j, 22107, 186, 25);
		j++;
		rsi.child(j, 22108, 85, 75);
		j++;
		rsi.child(j, 22109, 200, 75);
		j++;
		rsi.child(j, 22110, 409, 20);
		j++;
		rsi.child(j, 22111, 161, 153);
		j++;
		rsi.child(j, 22112, 409, 157);
		j++;
		rsi.child(j, 22113, 161, 190);
		j++;
		rsi.child(j, 22114, 409, 194);
		j++;
		rsi.child(j, 22115, 161, 233);
		j++;
		rsi.child(j, 22116, 409, 237);
		j++;
		rsi.child(j, 22117, 161, 270);
		j++;
		rsi.child(j, 22118, 409, 274);
		j++;
	}

	public static void slayerRewardsLearn(TextDrawingArea[] tda) {
		RSInterface rsi = addTab(22200);
		int j = 0;
		addSprite(22201, 2, "Slayer/PANEL");
		addButton(22202, 1, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addButton(22203, 0, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addButton(22204, 1, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addText(22205, "Buy", tda, 0, 0xff9040);
		addText(22206, "Learn", tda, 0, 0xff9040);
		addText(22207, "Assignment", tda, 0, 0xff9040);
		addText(22208, "Slayer Points : ", tda, 2, 0xff9040);
		addText(22209, "XXXX", tda, 2, 0xff9040);
		addHoverText(22210, "Close window", "Close window", tda, 1, 0xff9040, false, true, 73);
		addHoverText(22211, "Unlock the ability to create a slayer helmet", "Unlock", tda, 1, 0xff9040, false, true, 205);
		addText(22212, "(300 Points)", tda, 0, 0xff9040);
		addHoverText(22213, "Unlock the ability to create rings of slaying", "Unlock", tda, 1, 0xff9040, false, true, 205);
		addText(22214, "(100 Points)", tda, 0, 0xff9040);
		rsi.totalChildren(14);
		rsi.child(j, 22201, 10, 10);
		j++;
		rsi.child(j, 22202, 20, 20);
		j++;
		rsi.child(j, 22203, 98, 20);
		j++;
		rsi.child(j, 22204, 176, 20);
		j++;
		rsi.child(j, 22205, 40, 25);
		j++;
		rsi.child(j, 22206, 118, 25);
		j++;
		rsi.child(j, 22207, 186, 25);
		j++;
		rsi.child(j, 22208, 85, 75);
		j++;
		rsi.child(j, 22209, 200, 75);
		j++;
		rsi.child(j, 22210, 409, 20);
		j++;
		rsi.child(j, 22211, 150, 165);
		j++;
		rsi.child(j, 22212, 409, 170);
		j++;
		rsi.child(j, 22213, 150, 225);
		j++;
		rsi.child(j, 22214, 409, 230);
		j++;
	}

	public static void slayerRewardsAssign(TextDrawingArea[] tda) {
		RSInterface rsi = addTab(22300);
		int j = 0;
		addSprite(22301, 3, "Slayer/PANEL");
		addButton(22302, 1, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addButton(22303, 1, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addButton(22304, 0, "Slayer/TAB", "View", 27640, 1, 75, 23);
		addText(22305, "Buy", tda, 0, 0xff9040);
		addText(22306, "Learn", tda, 0, 0xff9040);
		addText(22307, "Assignment", tda, 0, 0xff9040);
		addText(22308, "Slayer Points : ", tda, 2, 0xff9040);
		addText(22309, "XXXX", tda, 2, 0xff9040);
		addHoverText(22310, "Close window", "Close window", tda, 1, 0xff9040, false, true, 73);
		addHoverText(22311, "Cancel your current task", "Cancel your current task", tda, 1, 0xff9040, false, true, 140);
		addText(22312, "(30 Points)", tda, 0, 0xff9040);
		addHoverText(22313, "Cancel and stop assigning current task", "Cancel task and stop it from being assigned", tda, 1, 0xff9040, false, true, 225);
		addText(22314, "(100 Points)", tda, 0, 0xff9040);
		addText(22315, "No task set", tda, 0, 0xff9040);
		addText(22316, "No task set", tda, 0, 0xff9040);
		addText(22317, "No task set", tda, 0, 0xff9040);
		addText(22318, "No task set", tda, 0, 0xff9040);
		addHoverText(22319, "(Remove)", "Removes your banned task", tda, 1, 0xff9040, false, true, 52);
		addHoverText(22320, "(Remove)", "Removes your banned task", tda, 1, 0xff9040, false, true, 52);
		addHoverText(22321, "(Remove)", "Removes your banned task", tda, 1, 0xff9040, false, true, 52);
		addHoverText(22322, "(Remove)", "Removes your banned task", tda, 1, 0xff9040, false, true, 52);
		rsi.totalChildren(22);
		rsi.child(j, 22301, 10, 10);
		j++;
		rsi.child(j, 22302, 20, 20);
		j++;
		rsi.child(j, 22303, 98, 20);
		j++;
		rsi.child(j, 22304, 176, 20);
		j++;
		rsi.child(j, 22305, 40, 25);
		j++;
		rsi.child(j, 22306, 118, 25);
		j++;
		rsi.child(j, 22307, 186, 25);
		j++;
		rsi.child(j, 22308, 85, 75);
		j++;
		rsi.child(j, 22309, 200, 75);
		j++;
		rsi.child(j, 22210, 409, 20);
		j++;
		rsi.child(j, 22311, 87, 130);
		j++;
		rsi.child(j, 22312, 409, 134);
		j++;
		rsi.child(j, 22313, 87, 150);
		j++;
		rsi.child(j, 22314, 409, 154);
		j++;
		rsi.child(j, 22315, 87, 205);
		j++;
		rsi.child(j, 22316, 87, 225);
		j++;
		rsi.child(j, 22317, 87, 245);
		j++;
		rsi.child(j, 22318, 87, 265);
		j++;
		rsi.child(j, 22319, 400, 205);
		j++;
		rsi.child(j, 22320, 400, 225);
		j++;
		rsi.child(j, 22321, 400, 245);
		j++;
		rsi.child(j, 22322, 400, 265);
		j++;
	}

	public static void magicTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(1151);
		RSInterface homeHover = addTabInterface(1196);
		RSInterface spellButtons = interfaceCache[12424];
		spellButtons.scrollMax = 0;
		spellButtons.height = 260;
		spellButtons.width = 190;
		int[] spellButton = { 1196, 1199, 1206, 1215, 1224, 1231, 1240, 1249, 1258, 1267, 1274, 1283, 1573, 1290, 1299, 1308, 1315, 1324, 1333, 1340, 1349, 1358, 1367, 1374, 1381, 1388, 1397, 1404, 1583, 12038, 1414, 1421, 1430, 1437, 1446, 1453, 1460, 1469, 15878, 1602, 1613, 1624, 7456, 1478, 1485, 1494, 1503, 1512, 1521, 1530, 1544, 1553, 1563, 1593, 1635, 12426, 12436, 12446, 12456, 6004, 18471 };
		tab.totalChildren(63);
		tab.child(0, 12424, 13, 24);
		for (int i1 = 0; i1 < spellButton.length; i1++) {
			int yPos = i1 > 34 ? 8 : 183;
			tab.child(1, 1195, 13, 24);
			tab.child(i1 + 2, spellButton[i1], 5, yPos);
			addButton(1195, 1, "Magic/Home", "Cast @gre@Home Teleport");
			RSInterface homeButton = interfaceCache[1195];
			homeButton.mOverInterToTrigger = 1196;
		}
		for (int i2 = 0; i2 < spellButton.length; i2++) {
			if (i2 < 60)
				spellButtons.childX[i2] = spellButtons.childX[i2] + 24;
			if (i2 == 6 || i2 == 12 || i2 == 19 || i2 == 35 || i2 == 41 || i2 == 44 || i2 == 49 || i2 == 51)
				spellButtons.childX[i2] = 0;
			spellButtons.childY[6] = 24;
			spellButtons.childY[12] = 48;
			spellButtons.childY[19] = 72;
			spellButtons.childY[49] = 96;
			spellButtons.childY[44] = 120;
			spellButtons.childY[51] = 144;
			spellButtons.childY[35] = 170;
			spellButtons.childY[41] = 192;
		}
		homeHover.isMouseoverTriggered = true;
		addText(1197, "Level 0: Home Teleport", tda, 1, 0xFE981F, true, true);
		RSInterface homeLevel = interfaceCache[1197];
		homeLevel.width = 174;
		homeLevel.height = 68;
		addText(1198, "A teleport which requires no", tda, 0, 0xAF6A1A, true, true);
		addText(18998, "runes and no required level that", tda, 0, 0xAF6A1A, true, true);
		addText(18999, "teleports you to the main land.", tda, 0, 0xAF6A1A, true, true);
		homeHover.totalChildren(4);
		homeHover.child(0, 1197, 3, 4);
		homeHover.child(1, 1198, 91, 23);
		homeHover.child(2, 18998, 91, 34);
		homeHover.child(3, 18999, 91, 45);
	}

	public static void ancientMagicTab(TextDrawingArea[] tda) {
		RSInterface tab = addInterface(12855);
		addButton(12856, 1, "Magic/Home", "Cast @gre@Home Teleport");
		RSInterface homeButton = interfaceCache[12856];
		homeButton.mOverInterToTrigger = 1196;
		int[] itfChildren = { 12856, 12939, 12987, 13035, 12901, 12861, 13045, 12963, 13011, 13053, 12919, 12881, 13061, 12951, 12999, 13069, 12911, 12871, 13079, 12975, 13023, 13087, 12929, 12891, 13095, 1196, 12940, 12988, 13036, 12902, 12862, 13046, 12964, 13012, 13054, 12920, 12882, 13062, 12952, 13000, 13070, 12912, 12872, 13080, 12976, 13024, 13088, 12930, 12892, 13096 };
		tab.totalChildren(itfChildren.length);
		for (int i1 = 0, xPos = 18, yPos = 8; i1 < itfChildren.length; i1++, xPos += 45) {
			if (xPos > 175) {
				xPos = 18;
				yPos += 28;
			}
			if (i1 < 25)
				tab.child(i1, itfChildren[i1], xPos, yPos);
			if (i1 > 24) {
				yPos = i1 < 41 ? 181 : 1;
				tab.child(i1, itfChildren[i1], 4, yPos);
			}
		}
	}

	public static void clanChatSetup(TextDrawingArea[] tda) {
		RSInterface rsi = addInterface(18300);
		rsi.totalChildren(12 + 15);
		int count = 0;
		/* Background */
		addSprite(18301, 1, "/Interfaces/Clan Chat/sprite");
		rsi.child(count++, 18301, 14, 18);
		/* Close button */
		addButton(18302, 0, "/Interfaces/Clan Chat/close", "Close");
		interfaceCache[18302].atActionType = 3;
		rsi.child(count++, 18302, 475, 26);
		/* Clan Setup title */
		addText(18303, "Clan Setup", tda, 2, 0xFF981F, true, true);
		rsi.child(count++, 18303, 256, 26);
		/* Setup buttons */
		String[] titles = { "Clan name:", "Who can enter chat?", "Who can talk on chat?", "Who can kick on chat?", "Who can ban on chat?" };
		String[] defaults = { "Chat Disabled", "Anyone", "Anyone", "Anyone", "Anyone" };
		String[] whoCan = { "Anyone", "Recruit", "Corporal", "Sergeant", "Lieutenant", "Captain", "General", "Only Me" };
		for (int index = 0, id = 18304, y = 50; index < titles.length; index++, id += 3, y += 40) {
			addButton(id, 2, "/Interfaces/Clan Chat/sprite", "");
			interfaceCache[id].atActionType = 0;
			if (index > 0) {
				interfaceCache[id].actions = whoCan;
			} else {
				interfaceCache[id].actions = new String[] { "Change title", "Delete clan" };
				;
			}
			addText(id + 1, titles[index], tda, 0, 0xFF981F, true, true);
			addText(id + 2, defaults[index], tda, 1, 0xFFFFFF, true, true);
			rsi.child(count++, id, 25, y);
			rsi.child(count++, id + 1, 100, y + 4);
			rsi.child(count++, id + 2, 100, y + 17);
		}
		/* Table */
		addSprite(18319, 5, "/Interfaces/Clan Chat/sprite");
		rsi.child(count++, 18319, 197, 70);
		/* Labels */
		int id = 18320;
		int y = 74;
		addText(id, "Ranked Members", tda, 2, 0xFF981F, false, true);
		rsi.child(count++, id++, 202, y);
		addText(id, "Banned Members", tda, 2, 0xFF981F, false, true);
		rsi.child(count++, id++, 339, y);
		/* Ranked members list */
		RSInterface list = addInterface(id++);
		int lines = 100;
		list.totalChildren(lines);
		String[] ranks = { "Demote", "Recruit", "Corporal", "Sergeant", "Lieutenant", "Captain", "General", "Owner" };
		list.childY[0] = 2;
		// System.out.println(id);
		for (int index = id; index < id + lines; index++) {
			addText(index, "", tda, 1, 0xffffff, false, true);
			interfaceCache[index].actions = ranks;
			list.children[index - id] = index;
			list.childX[index - id] = 2;
			list.childY[index - id] = (index - id > 0 ? list.childY[index - id - 1] + 14 : 0);
		}
		id += lines;
		list.width = 119;
		list.height = 210;
		list.scrollMax = (lines * 14) + 2;
		rsi.child(count++, list.id, 199, 92);
		/* Banned members list */
		list = addInterface(id++);
		list.totalChildren(lines);
		list.childY[0] = 2;
		// System.out.println(id);
		for (int index = id; index < id + lines; index++) {
			addText(index, "", tda, 1, 0xffffff, false, true);
			interfaceCache[index].actions = new String[] { "Unban" };
			list.children[index - id] = index;
			list.childX[index - id] = 0;
			list.childY[index - id] = (index - id > 0 ? list.childY[index - id - 1] + 14 : 0);
		}
		id += lines;
		list.width = 119;
		list.height = 210;
		list.scrollMax = (lines * 14) + 2;
		rsi.child(count++, list.id, 339, 92);
		/* Table info text */
		y = 47;
		addText(id, "You can manage both ranked and banned members here.", tda, 0, 0xFF981F, true, true);
		rsi.child(count++, id++, 337, y);
		addText(id, "Right click on a name to edit the member.", tda, 0, 0xFF981F, true, true);
		rsi.child(count++, id++, 337, y + 11);
		/* Add ranked member button */
		y = 75;
		addButton(id, 0, "/Interfaces/Clan Chat/plus", "Add ranked member");
		interfaceCache[id].atActionType = 5;
		rsi.child(count++, id++, 319, y);
		/* Add banned member button */
		addButton(id, 0, "/Interfaces/Clan Chat/plus", "Add banned member");
		interfaceCache[id].atActionType = 5;
		rsi.child(count++, id++, 459, y);

		/* Hovers */
		int[] clanSetup = { 18302, 18304, 18307, 18310, 18313, 18316, 18526, 18527 };
		String[] names = { "close", "sprite", "sprite", "sprite", "sprite", "sprite", "plus", "plus" };
		int[] ids = { 1, 3, 3, 3, 3, 3, 1, 1 };
		for (int index = 0; index < clanSetup.length; index++) {
			rsi = interfaceCache[clanSetup[index]];
			rsi.disabledHover = imageLoader(ids[index], "/Interfaces/Clan Chat/" + names[index]);
		}
	}

	public static void clanChatTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(18128);
		addHoverButton(18129, "/Clan Chat/SPRITE", 6, 72, 32, "Join Clan", 550, 18130, 5);
		addHoveredButton(18130, "/Clan Chat/SPRITE", 7, 72, 32, 18131);
		addHoverButton(18132, "/Clan Chat/SPRITE", 6, 72, 32, "Clan Setup", -1, 18133, 5);
		addHoveredButton(18133, "/Clan Chat/SPRITE", 7, 72, 32, 18134);
		addText(18135, "Join Clan", tda, 0, 0xff9b00, true, true);
		addText(18136, "Clan Setup", tda, 0, 0xff9b00, true, true);
		addSprite(18137, 37, "/Clan Chat/SPRITE");
		addText(18138, "Clan Chat", tda, 2, 0xff9b00, true, true);
		addText(18139, "Talking in: Not in clan", tda, 0, 0xff9b00, false, true);
		addText(18140, "Owner: None", tda, 0, 0xff9b00, false, true);
		tab.totalChildren(11);
		tab.child(0, 18137, 5, 57);
		tab.child(1, 18143, 0, 62);
		tab.child(2, 18129, 15, 226);
		tab.child(3, 18130, 15, 226);
		tab.child(4, 18132, 103, 226);
		tab.child(5, 18133, 103, 226);
		tab.child(6, 18135, 51, 237);
		tab.child(7, 18136, 139, 237);
		tab.child(8, 18138, 95, 4);
		tab.child(9, 18139, 10, 27);
		tab.child(10, 18140, 25, 42);
		/* Text area */
		RSInterface list = addTabInterface(18143);
		list.totalChildren(100);
		for (int i = 18144; i <= 18244; i++) {
			addText(i, "", tda, 0, 0xffffff, false, true);
		}
		for (int id = 18144, i = 0; id <= 18243 && i <= 99; id++, i++) {
			interfaceCache[id].actions = new String[] { "Edit Rank", "Kick", "Ban" };
			list.children[i] = id;
			list.childX[i] = 20;
			for (int id2 = 18144, i2 = 1; id2 <= 18243 && i2 <= 99; id2++, i2++) {
				list.childY[0] = 7;
				list.childY[i2] = list.childY[i2 - 1] + 14;
			}
		}
		list.height = 158;
		list.width = 174;
		list.scrollMax = 1405;
	}

}
