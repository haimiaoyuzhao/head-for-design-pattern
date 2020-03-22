package indi.zht.unit11.icon;

import java.awt.Graphics;

import javax.swing.JPanel;

public interface Icon {
	int getIconWidth();
	int getIconHeight();
	void paintIcon(final JPanel panel, Graphics g, int x, int y);
}
