package indi.zht.unit11.icon;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyIconPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Icon icon;
	public MyIconPanel(Icon icon) {
		this.icon = icon; 
	}

	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		icon.paintIcon(this, g, 100, 100);
	}
}
