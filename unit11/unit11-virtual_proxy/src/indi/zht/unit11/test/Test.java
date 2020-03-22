package indi.zht.unit11.test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import indi.zht.unit11.icon.IconProxy;
import indi.zht.unit11.icon.MyIconPanel;

public class Test implements ActionListener{
	private JFrame frame;
	private int frameWidth = 500;
	private int frameHeight = 500;
	public static void main(String[] args) {
		Test test = new Test();
		test.go();
		
	}

	public void go() {
		frame = new JFrame();
		JButton button = new JButton();
		button.setBounds(0, 0, 100, 100);
		button.addActionListener(this);
		frame.getContentPane().add(button);
		MyIconPanel myIconPanel = new MyIconPanel(new IconProxy("C:\\Users\\haimiao\\eclipse-workspace\\unit11-virtual_proxy\\src\\resource\\1.jpg"));
		frame.getContentPane().add(myIconPanel);
		frame.setSize(frameWidth, frameHeight);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MyIconPanel myIconPanel = new MyIconPanel(new IconProxy("http://img0.imgtn.bdimg.com/it/u=3434045650,2211347790&fm=26&gp=0.jpg"));
		frame.getContentPane().add(myIconPanel);
		frame.setVisible(true);
	}
}
