package indi.zht.unit9.menu;

import java.util.Iterator;

import indi.zht.unit9.menuitem.MenuItem;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
