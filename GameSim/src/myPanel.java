import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

import javax.swing.JPanel;

public class myPanel extends JPanel implements KeyListener {

	private static final long serialVersionUID = 4898126438312543377L;
	ArrayList<Unit> unitArray = new ArrayList<>();
	Move m = new Move();
	
	Unit ball1 = new Unit(250, 160, 20, 20, "", "ball.png");
	Unit ball2 = new Unit(528, 200, 20, 20, "", "ball.png");
	Unit ball3 = new Unit(250, 240, 20, 20, "", "ball.png");
	Unit ball4 = new Unit(528, 280, 20, 20, "", "ball.png");
	Unit ball5 = new Unit(250, 320, 20, 20, "", "ball.png");
	Unit layout = new Unit(77, 108, 644, 285, "", "layout.png");
	Unit layout1 = new Unit(108, 141, 62, 206, "", "layoutE.png");
	Unit layout2 = new Unit(185, 382, 58, 8, "", "layoutE.png");
	Unit layout3a = new Unit(260, 348, 1, 36, "", "layoutE.png");
	Unit layout3b = new Unit(260, 348, 1, 36, "", "layoutE.png");
	Unit layout4 = new Unit(260, 152, 316, 196, "", "layoutE.png");
	Unit layout5 = new Unit(520, 148, 1, 36, "", "layoutE.png");
	Unit layout6 = new Unit(520, 112, 28, 8, "", "layoutE.png");
	Unit layout7 = new Unit(600, 112, 62, 206, "", "layoutE.png");

	

	myPanel() throws IOException {
		for (int i = 0; i < 50; i++) {
			String s = "" + i;
			Unit u = new Unit(124, 236, 28, 28, s, "box.png");
			unitArray.add(u);
		}
		x();
		addKeyListener(this);
		setFocusable(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		layout.draw(g, this);
		
		layout1.draw(g, this);
		layout2.draw(g, this);
		layout3a.draw(g, this);
		layout3b.draw(g, this);
		layout4.draw(g, this);
		layout5.draw(g, this);
		layout6.draw(g, this);
		layout7.draw(g, this);
		
		ball1.draw(g, this);
		ball2.draw(g, this);
		ball3.draw(g, this);
		ball4.draw(g, this);
		ball5.draw(g, this);
		unitArray.forEach(Unit -> {
			Unit.draw(g, this);
		});
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			new Thread(() -> {
				while (true) {
					update();
					try {
						Thread.sleep(3);
					} catch (InterruptedException e2) {
						e2.printStackTrace();
					}
				}
			}).start();
		}
	}

	public void update() {
		ball1.x += ball1.moveX;
		ball3.x += ball3.moveX;
		ball5.x += ball5.moveX;
		ball2.x -= ball2.moveX;
		ball4.x -= ball4.moveX;
		if (ball1.x >= 537.0 || ball1.x <= 241.0) {
			ball1.moveX *= -1;
			ball3.moveX *= -1;
			ball5.moveX *= -1;
			ball2.moveX *= -1;
			ball4.moveX *= -1;
		}
		repaint();
		
		for (int i = 0; i < unitArray.size(); i++) {
			if (unitArray.get(i).intersects(ball1) || unitArray.get(i).intersects(ball2) || unitArray.get(i).intersects(ball3) || unitArray.get(i).intersects(ball4) || unitArray.get(i).intersects(ball5)) {
				unitArray.get(i).out = true;
			}
			m.moveUnits(unitArray, i, layout1, layout2, layout3a, layout3b, layout4, layout5, layout6, layout7);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	public void moveBoxes(BigInteger b) {
		
	}

	//make Move object in order to access Move class methods. This enables populating array list based on UnitID's with BigIntegers
	public void x() {
		Move m = new Move();
		m.populate();
		
		for (int i = 0; i < unitArray.size(); i++) {
			unitArray.get(i).memArray.addAll(m.arr1);
			unitArray.get(i).memArray.addAll(m.arr2);
			unitArray.get(i).memArray.addAll(m.arr3);
			unitArray.get(i).memArray.addAll(m.arr4);
		}
	}

}
