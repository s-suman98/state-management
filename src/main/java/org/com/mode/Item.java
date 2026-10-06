package org.com.mode;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

  private  String productCode;
  private String name;
  private int price;
  
}
