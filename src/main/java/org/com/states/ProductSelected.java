package org.com.states;

import lombok.Getter;
import org.com.core.MachineContext;
import org.com.enums.CoinTypes;
import org.com.enums.StateEnum;
import org.com.exception.VendingMachineExcpetion;

@Getter
public class ProductSelected implements MachineI {


private StateEnum label= StateEnum.PRODUCT;

@Override
public void selectProduct (String productCode, MachineContext machineContext) {

	 throw new VendingMachineExcpetion ("oops Alredy produ is ther need to insert money");
}

@Override
public void insertMoney(CoinTypes coin, MachineContext machineContext) {
	
	System.out.println("Coin Inserted: " + coin.getValue());
	
	machineContext.setBalance(
			machineContext.getBalance() + coin.getValue()
	);
	
	if (machineContext.getBalance() >= machineContext.getItemPriceNeeded()) {
		
		System.out.println(
				"Sufficient coin for the product "
						+ machineContext.getProductCode()
		);
		
		
		System.out.println ("MOVED TO "+ StateEnum.MONEY+"sTATE AFTER FULL payment");
		
		
		machineContext.setMachineState(new coinInserted ());
	}else{
		
		System.out.println ("Total needed"+machineContext.getItemPriceNeeded ()+"inserted"+machineContext.getBalance ());
		
		System.out.println ("insert more coins");
	}
}

@Override
public void selectDispatch (MachineContext machineContext) {
	
	throw new VendingMachineExcpetion ("oops Need to insert the full price"+machineContext.getItemPriceNeeded ());
	
	
}
}
