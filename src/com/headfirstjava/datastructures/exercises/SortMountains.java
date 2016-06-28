package com.headfirstjava.datastructures.exercises;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {
	
	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	
	class NameCompare implements Comparator<Mountain> {
		@Override
		public int compare(Mountain one, Mountain two) {
			return one.getName().compareTo(two.getName());
		}
	}
	
	class HeightCompare implements Comparator<Mountain> {
		@Override
		public int compare(Mountain one, Mountain two) {
			return Integer.compare(one.getHeight(), two.getHeight());
		}
	}
		
	public static void main(String[] args) {
		new SortMountains().go();
	}
	
	private void go() {
		mtn.add(new Mountain("Longs", 14255));
		mtn.add(new Mountain("Elbert", 14433));
		mtn.add(new Mountain("Maroon", 14156));
		mtn.add(new Mountain("Castle", 14265));
		
		System.out.println("as entered:\n" + mtn);
		
		NameCompare nameCompare = new NameCompare();	
		Collections.sort(mtn, nameCompare);
		System.out.println("by name:\n" + mtn);
		
		HeightCompare heightCompare = new HeightCompare();
		Collections.sort(mtn, heightCompare);
		System.out.println("by height:\n" + mtn);
		
	}

}

class Mountain {
	
	private String name;
	private int height;
	
	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return name + " " + height;
	}	
}
