package com.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumberInList {

	public static void main (String [] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,3,1,2,3);
	Integer max	=list.stream().reduce((i1,i2)->i1>i2?i1:i2).get();
	System.out.println(max);
  Integer secondHighest=  list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).limit(2).findFirst().get();
		System.out.println(secondHighest);
	}
	}

