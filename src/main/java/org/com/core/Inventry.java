package org.com.core;

import org.com.mode.Item;

import java.util.HashMap;
import java.util.Map;



public class Inventry {


public Map< String, Item > items;

public Map< String, Integer > itemStock;


public Inventry () {
	
	items = new HashMap<> ();
	itemStock = new HashMap<> ();
	
	
	//SEED THE DATA ON THIS CALSS
	
	this.addItem (new Item ("COKE", "cokacola", 30), 2);
	this.addItem (new Item ("CAKE", "cake for better taste", 50), 3);
	this.addItem (new Item ("SAMOSA", "cryspuy samosa", 12), 5);
	
}


public int getPrice (String productCode) {
	
	return items.get (productCode).getPrice ();
	
}

public boolean isAvailable(String productCode) {
	return itemStock.getOrDefault(productCode, 0) > 0;
}


public boolean addItem (Item item, Integer quantity) {
	
	items.put (item.getProductCode (), item);
	
	itemStock.put (item.getProductCode (), itemStock.getOrDefault (item.getProductCode (), 0) + quantity);
	
	return true;
}

public boolean removeItem(String productCode, int quantity) {
	
	int available = itemStock.getOrDefault(productCode, 0);
	
	if (available < quantity) {
		return false;
	}
	
	int remaining = available - quantity;
	
	if (remaining == 0) {
		itemStock.remove(productCode);
//		items.remove (productCode);
		// Usually keep item details even when stock becomes 0
	} else {
		itemStock.put(productCode, remaining);
	}
	
	return true;
}


public Item getItem (String productCode) {
	return items.get (productCode);
}


public void printProductOption () {
	
	 System.out.println ("SELECT THE PRODUCT CODE FROM BELOW");
	 
	 System.out.println (this.items);
	
	System.out.println ("STOKES OF EACH ITEMS");
	
	System.out.println (this.itemStock);
}

}