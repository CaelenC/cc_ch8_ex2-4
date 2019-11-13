//HEADER
	//Program Name: Ch8Ex4Main
	//Author: Caelen Curtiss
	//Class: Cs160 Fall 2019
	//Date: 11/12/2019
	//Description: Creating, transversing, and looping arrays

	package edu.cgcc.cs160;
	
public class Ch8Ex4Main{
	
		//Array methods will refer to
		static int[] iArray = {2, 4, 8, 10, 6};
		
		public static void main(String[] args) {
			//print method indexOfMax, should display index 3 in this case
			System.out.println(indexOfMax(iArray));
		}
		
		//method creation of indexOfMax
		public static int indexOfMax(int[] iArray) {
			//loop variable
			int i = 0;
			//current maximum value to compare to the value at each index
			int max = 0;
			//index of current max value
			int maxind = 0;
			
			//while loop checking each value in the array
			while(i < iArray.length) {
				//finds the value and index of the current max in the array
				//checks indices linearly from 0 to 4
				if(max <= iArray[i]) {
					max = iArray[i];
					maxind = i;
				}
				//increment +1
				i++;
			}
			//return the index of the max value in the array
			return maxind;
		}	
	}
	/* FOOTER
	** 3
	*/