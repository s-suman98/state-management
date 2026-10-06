package org.com;

import org.com.core.MachineContext;
import org.com.enums.CoinTypes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main (String[] args) {
	
	
	MachineContext vending=MachineContext.getInstance ();
	
	vending.getInventry ().printProductOption ();
	
	
	vending.selectProduct ("SAMOSA");
	
	
	System.out.println (vending.getMachineState ());
	
vending.insertMoney (CoinTypes.FIVE);
	
	
 	vending.selectDispatch ();
	
	
	
}
}