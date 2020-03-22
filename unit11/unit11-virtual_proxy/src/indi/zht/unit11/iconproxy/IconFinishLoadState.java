package indi.zht.unit11.iconproxy;

import indi.zht.unit11.icon.ImageIcon;

public class IconFinishLoadState implements IconProxyState {
	private ImageIcon imageIcon;
	public IconFinishLoadState(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return imageIcon.getIconWidth();
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return imageIcon.getIconHeight();
	}

}
