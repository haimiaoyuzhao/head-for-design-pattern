package indi.zht.unit11.icon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImageIcon implements Icon {
	Image image;
	public ImageIcon(File imageFile) {
		try {
			image = ImageIO.read(imageFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public void paintIcon(final JPanel panel, Graphics g, int x, int y) {
		System.out.println(image);
		Color bgcolor = new Color(255, 0, 0);
		g.drawImage(image, x, y, 100, 100, bgcolor, null);
	}

}
