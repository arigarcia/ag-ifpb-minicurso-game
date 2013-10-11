import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Plataform extends JPanel {
	private int x = 0;
	private int y = 0;
	
	
	public Plataform() {
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				Plataform.this.repaint();
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		System.out.println("paint...");
		g.setColor(Color.BLUE);
		g.drawRect(x, y, 100, 100);
	}
	
	@Override
	public void repaint() {
		super.repaint();
		System.out.println("repaint...");
	}
	
	@Override
	public void update(Graphics g) {
		super.update(g);
		System.out.println("update...");
	}
	
}
