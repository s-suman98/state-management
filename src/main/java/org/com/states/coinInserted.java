package org.com.states;

import lombok.Getter;
import org.com.core.MachineContext;
import org.com.enums.CoinTypes;
import org.com.enums.StateEnum;
import org.com.exception.VendingMachineExcpetion;

@Getter
public class coinInserted implements MachineI {



private  StateEnum label= StateEnum.MONEY;

@Override
public void selectProduct (String productCode, MachineContext machineContext) {
	
	throw new VendingMachineExcpetion ("it already have product selected");
	
	
}

@Override
public void insertMoney (CoinTypes coin, MachineContext machineContext) {
	
	
	throw new VendingMachineExcpetion ("Alredy have the suffienct coin");
	
}

@Override
public void selectDispatch (MachineContext machineContext) {
	
	
	System.out.println ("MOVED TO "+ StateEnum.DISPENCE+"State");
	
	machineContext.setMachineState (new DispencingState ());
	
}
}
