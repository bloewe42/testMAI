import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Unit extends Rectangle {

	private static final long serialVersionUID = -6388078988647666977L;

	Image UnitImage;
	boolean out;
	double moveX;
	String unitID, path;
	BigInteger b;
	ArrayList<Integer> memArray = new ArrayList<>();
	ArrayList<Integer> pathArray = new ArrayList<>();


	Unit(int x, int y, int w, int h, String path) throws IOException {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		this.path = path;
		moveX = 1;

		UnitImage = ImageIO.read(new File("src/" + path));
	}

	public void draw(Graphics g, Component c) {
		if (!out) {
			g.drawImage(UnitImage, x, y, width, height, c);
		}
	}

}
