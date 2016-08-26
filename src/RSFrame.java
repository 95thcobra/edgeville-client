import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;

final class RSFrame extends Frame {

	private static final long serialVersionUID = 1L;

	public RSFrame(RSApplet RSApplet_, int i, int j) {
		rsApplet = RSApplet_;
		setTitle(Configuration.SERVER_NAME);
		setVisible(true);
		toFront();
		setSize(i + 8, j + 28);
		setResizable(true);
		setLocationRelativeTo(null);
	}

	public RSFrame(RSApplet rsapplet, int width, int height, boolean undecorative, boolean resizable) {
		rsApplet = rsapplet;
		setTitle(Configuration.SERVER_NAME);
		setUndecorated(undecorative);
		setResizable(resizable);
		setVisible(true);
		Insets insets = this.getInsets();
		if (resizable) {
			setMinimumSize(new Dimension(766 + insets.left + insets.right, 560 + insets.top + insets.bottom));
		}
		setSize(width + insets.left + insets.right, height + insets.top + insets.bottom);// 28
		setLocation((screenWidth - width) / 2, ((screenHeight - height) / 2) - screenHeight == Client.getMaxHeight() ? 0 : undecorative ? 0 : 70);
		requestFocus();
		toFront();
		setBackground(Color.BLACK);
	}

	public Graphics getGraphics() {
		Graphics g = super.getGraphics();
		Insets insets = this.getInsets();
		g.translate(insets.left, insets.top);
		return g;
	}

	public int getFrameWidth() {
		Insets insets = this.getInsets();
		return getWidth() - (insets.left + insets.right);
	}

	public int getFrameHeight() {
		Insets insets = this.getInsets();
		return getHeight() - (insets.top + insets.bottom);
	}

	public void update(Graphics g) {
		rsApplet.update(g);
	}

	public void paint(Graphics g) {
		rsApplet.paint(g);
	}

	private final RSApplet rsApplet;
	public Toolkit toolkit = Toolkit.getDefaultToolkit();
	public Dimension screenSize = toolkit.getScreenSize();
	public int screenWidth = (int) screenSize.getWidth();
	public int screenHeight = (int) screenSize.getHeight();
}
