package com.ghavinj.apps;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


    	//Array Lists
		ArrayList animals = new ArrayList();
		animals.add("Pig");
		animals.add("Cow");
		animals.add("Dog");
		animals.add("Bird");

		for (int i = 0; i < animals.size() ; i++) {
			System.out.println(animals.get(i));
		}



		if(animals.contains("Cow")){
			animals.remove("Cow");
		}else{
			System.out.println("Nope");
		}

		for(Object animal : animals){
			System.out.println(animal);
		}










//	    int[] intArray = { 1, 2, 3, 4};
//	    String[] myStringArray = {"apple", "orange", "grape", "pear","pineapple"};
//
//	    for (int i = 0; i < intArray.length; i++){
//	        System.out.println("Item# " + intArray[i]);
//
//        }
//
//	    int[] newArray = new int[5];
//	    String[] newStringArray = new String[5];
//
//	    newArray[0] = 3;
//	    newArray[1] = 12;
//	    newArray[2] = 33;
//	    newArray[3] = 15;
//	    newArray[4] = 21;
//
//	    newStringArray[0] = "dog";
//	    newStringArray[1] = "cat";
//	    newStringArray[2] = "bird";
//	    newStringArray[3] = "fish";
//	    newStringArray[4] = "goat";
//
//	    for (int j = 0; j < newStringArray.length; j++){
//
//	    	System.out.println(newStringArray[j]);
//
//		}
    }
}
