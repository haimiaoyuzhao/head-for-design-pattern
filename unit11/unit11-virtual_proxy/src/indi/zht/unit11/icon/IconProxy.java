package indi.zht.unit11.icon;

import java.awt.Graphics;
import java.io.File;

import javax.swing.JPanel;

import indi.zht.unit11.iconproxy.IconFinishLoadState;
import indi.zht.unit11.iconproxy.IconLoadingState;
import indi.zht.unit11.iconproxy.IconProxyState;

public class IconProxy implements Icon {
	private Icon icon;
	private IconProxyState iconProxyState;
	private File imageFile;
	private boolean isRetrieving = false;
	
	public IconProxy(String url) {
		imageFile = new File(url);
		if (imageFile.exists()) {
			System.out.println("exists");
		}
		else {
			System.out.println("not exists");
		}
		this.imageFile = imageFile;
		iconProxyState = new IconLoadingState();
	}
	
	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return iconProxyState.getIconWidth();
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return iconProxyState.getIconHeight();
	}

	@Override
	public void paintIcon(final JPanel panel, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		if (icon == null) {
			System.out.println("zht");
			g.drawString("image is loading......", x, y);
			if (!isRetrieving) {
				isRetrieving = true;
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						icon = new ImageIcon(imageFile);
						panel.repaint();
						iconProxyState = new IconFinishLoadState((ImageIcon)icon);
					}
				}).start();
			}
		}
		else {
			icon.paintIcon(panel, g, x, y);
		}
	}

}
