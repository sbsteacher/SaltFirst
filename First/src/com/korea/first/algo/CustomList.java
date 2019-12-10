package com.korea.first.algo;

public class CustomList {
	private String[] list;
	
	public CustomList() {
		list = new String[0];
	}
	
	
	public void add(String val) {
		int oldLen = list.length;		
		String[] temp = new String[oldLen + 1];		
		
		for(int i=0; i<oldLen; i++) {
			temp[i]= list[i];
		}
				
		temp[oldLen] = val;
		list = temp;
	}
	
	public String get(int index) {
		return list[index];
	}
	
	public void removeLastOne() {		
		int oldLen = list.length; 
		if(oldLen == 0) return;
		
		String[] temp = new String[oldLen - 1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = list[i];
		}
		list = temp;
	}
	
	public void removeFirstOne() {
		int oldLen = list.length; 
		if(oldLen == 0) return;
		
		String[] temp = new String[oldLen - 1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = list[i+1];
		}
		list = temp;
	}
	
	public void remove(int index) {
		int oldLen = list.length; 
		if(oldLen == 0) return;
//		if(index == 0) {
//			removeFirstOne();
//			return;
//		}
//		if(index == list.length - 1) {
//			removeLastOne();
//			return;
//		}
		
		String[] temp = new String[oldLen - 1];
		for(int i=0; i<temp.length; i++) {
			if(i < index) {
				temp[i] = list[i];				
			}else {
				temp[i] = list[i+1];
			}
		}
		list = temp;
	}
	
	public void removeAll() {
		list = new String[0];
	}
	
	public void printList() {
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
