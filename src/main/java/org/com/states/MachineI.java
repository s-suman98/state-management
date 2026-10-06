package org.com.states;

import org.com.core.MachineContext;
import org.com.enums.CoinTypes;

public interface MachineI {
 
 void selectProduct(String productCode, MachineContext machineContext);
 void insertMoney(CoinTypes coin, MachineContext machineContext);
 void selectDispatch(MachineContext machineContext);
 
 
}
