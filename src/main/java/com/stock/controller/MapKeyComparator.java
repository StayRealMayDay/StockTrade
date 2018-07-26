package com.stock.controller;

import java.util.Comparator;

public class MapKeyComparator implements Comparator<Double> {

	@Override
	public int compare(Double o1, Double o2) {
		// TODO Auto-generated method stub
		return  (int) Math.ceil(o1 - o2);
	}

}
