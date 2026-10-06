package org.com.enums;

import lombok.Getter;

@Getter
public enum CoinTypes {
	
	FIVE(5),
	TEN(10),
	TWENTY(20),
	FIFTY(50);
	
	private int value;
	
	 CoinTypes(int value){
		this.value=value;
	}
	
	
}
