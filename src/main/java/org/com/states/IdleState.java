package org.com.states;

import lombok.Getter;
import org.com.core.MachineContext;
import org.com.enums.CoinTypes;
import org.com.enums.StateEnum;
import org.com.exception.VendingMachineExcpetion;


@Getter
public class IdleState implements MachineI {


private StateEnum label= StateEnum.IDLE;
@Override
public void selectProduct (String productCode, MachineContext machineContext) {
	if(machineContext.getInventry ().isAvailable (productCode)){
		System.out.println ("item not available stock over"+ productCode);
		return;
	}
	machineContext.setProductCode (productCode);
	System.out.println ("Item code "+productCode+"selected");
	machineContext.setMachineState (new ProductSelected ());
}

@Override
public void insertMoney (CoinTypes coin, MachineContext machineContext) {
	
	throw new VendingMachineExcpetion("oops insert money called,First need to select the productCode");

}

@Override
public void selectDispatch (MachineContext machineContext) {
	
	throw new VendingMachineExcpetion("oops dispatch called,First need to select the productCode");

}
}
