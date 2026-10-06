package org.com.core;

import lombok.Data;
import lombok.Setter;
import org.com.enums.CoinTypes;
import org.com.states.IdleState;
import org.com.states.MachineI;

@Setter
@Data
public class MachineContext {

private MachineI machineState;

private Inventry inventry;

private String productCode; //product code

private int itemPriceNeeded; // price of the product slected


static final MachineContext instance= new MachineContext ();



private int balance; //current abalnce system have


private  MachineContext () {
	
	this.inventry = new Inventry ();
	machineState = new IdleState ();
	
	
}


public static MachineContext getInstance(){
	
	 return instance;
}



public void selectProduct (String productCode) {
	
	this.machineState.selectProduct (productCode, this
	);
	
	
}

public void insertMoney (CoinTypes coin) {
	this.machineState.insertMoney (coin, this);
	
}

public void selectDispatch () {
	
	this.machineState.selectDispatch (this
	);
	
}


}


