package com.intuit.challenges;

import java.util.ArrayList;

/**
 * The Class PrettyPrintRectangularPatternMatrix.
 */
public class PrettyPrintRectangularPatternMatrix {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		System.out.println(prettyPrint(1));
		System.out.println("=================================\n");
		System.out.println(prettyPrint(2));
		System.out.println("=================================\n");
		System.out.println(prettyPrint(3));
		System.out.println("=================================\n");
		System.out.println(prettyPrint(4));
		System.out.println("=================================\n");
	}
	
	/**
	 * Pretty print.
	 *
	 * @param a the a
	 * @return the array list
	 */
	public static ArrayList<ArrayList<Integer>> prettyPrint (int a){
		
		int size = getSize(a);	
				
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<size;i++){
			matrix.add(i,new ArrayList<Integer>());
		}
		
			for(int j=0;j<size;j++){
				ArrayList<Integer> rowTemp = getOuterRectangleRow(a--);
				if(rowTemp.size()==0)
					break;
				if(rowTemp.size() ==size){
					matrix.set(0, rowTemp);
					matrix.set(size-1, rowTemp);
				}else{
					while(rowTemp.size()<size){
						int currentValue = rowTemp.get(0);
						rowTemp.add(0,++currentValue);
						rowTemp.add(rowTemp.size(), currentValue);
					}
					matrix.set(j, rowTemp);
					matrix.set((size-1)-j,rowTemp);
				}
					
			}
						
		return matrix;
	}
	
	
	/**
	 * Gets the size.
	 *
	 * @param a the a
	 * @return the size
	 */
	private static int getSize(int a){
		
		/*
		 *  Logic to determine the size of the matrix
		 *  
		 *  1) Firstly this is a square matrix.
		 *  2) Count the hops from a to 1 and then 2 to a
		 *  
		 *  That will give the size of the matrix
		 * 
		 */
	
		int size = 0;
		
		//Count the hops from a to 1
		for(int i=a;i>=1;i--)
			size++;
		
		//Continue counting from 2 to a 
		for(int i=2;i<=a;i++)
			size++;
		
		return size;
	}
	
	/**
	 * Gets the outer rectangle row.
	 *
	 * @param size the size
	 * @return the outer rectangle row
	 */
	private static ArrayList<Integer> getOuterRectangleRow(int size){
		ArrayList<Integer> outerRect = new ArrayList<Integer>();
		int actualSize = getSize(size);
		
		for(int i=0;i<actualSize;i++){
			outerRect.add(size);
		}
		
		return outerRect;
	}

}
