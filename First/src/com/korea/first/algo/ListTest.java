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
		list.add(1, "가");
		
//		String val = list.get(2);
//		System.out.println(val);
		
//		list.removeLastOne();
//		list.removeFirstOne();
//		list.removeAll();
//		list.remove(4);
		
		list.printList();

	}

}
