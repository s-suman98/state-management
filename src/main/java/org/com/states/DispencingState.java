package org.com.states;

import lombok.Getter;
import org.com.core.MachineContext;
import org.com.enums.CoinTypes;
import org.com.enums.StateEnum;
import org.com.exception.VendingMachineExcpetion;

@Getter
public class DispencingState implements MachineI {


private StateEnum label= StateEnum.DISPENCE;
@Override
public void selectProduct (String productCode, MachineContext machineContext) {
	
	throw new VendingMachineExcpetion ("cant select product while working");
	
	
}

@Override
public void insertMoney (CoinTypes coin, MachineContext machineContext) {
	
	
	throw new VendingMachineExcpetion ("cant select product while working");

}

@Override
public void selectDispatch (MachineContext machineContext) {
	
	System.out.println ("Diancing item" + machineContext.getProductCode () + "price" + machineContext.getItemPriceNeeded ());
	
	
	machineContext.getInventry ().removeItem (machineContext.getProductCode (), 1);
	machineContext.setBalance (machineContext.getBalance () - machineContext.getItemPriceNeeded ());
	
	machineContext.setItemPriceNeeded (0);
	machineContext.setProductCode ("");
	
	System.out.println ("collect you change " + machineContext.getBalance ());
	
	machineContext.setBalance (0);
	machineContext.setMachineState (new IdleState ());
	
	
	System.out.println ("thanks for using our service");
	
	
}
}
