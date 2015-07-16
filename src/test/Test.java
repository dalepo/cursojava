package test;

import java.util.List;

public class Test {
	
	public int quantity;
	
	public void addQuantity(List<Integer> list) {
		list.forEach(value -> quantity+=value);
	}
	
}
