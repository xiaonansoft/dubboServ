package com.suanfa.test;

import java.util.ArrayList;

public class miyunsaun {
	static ArrayList<ArrayList<Integer>> getSubsets2(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
		int max = 1 << set.size(); //how many sub sets
		for(int i=0; i<max; i++){
			int index = 0;
			int k = i;
			ArrayList<Integer> s = new ArrayList<Integer>();
			while(k > 0){
				if((k&1) > 0){
					s.add(set.get(index));
				}
				k>>=1;
				index++;
			}
			allsubsets.add(s);
		}
		return allsubsets;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		ArrayList<ArrayList<Integer>> allsubsets = getSubsets2(s);
		for(ArrayList<Integer> set : allsubsets){
			System.out.println(set);
		}}

}
