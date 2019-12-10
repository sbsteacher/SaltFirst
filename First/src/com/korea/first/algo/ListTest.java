package com.korea.first.algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		CustomList list = new CustomList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
//		String val = list.get(2);
//		System.out.println(val);
		
//		list.removeLastOne();
//		list.removeFirstOne();
		list.removeAll();
		
		list.printList();

	}

}
