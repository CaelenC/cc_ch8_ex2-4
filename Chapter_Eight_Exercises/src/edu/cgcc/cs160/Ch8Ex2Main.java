//HEADER
	//Program Name: Ch8Ex2Main
	//Author: Caelen Curtiss
	//Class: Cs160 Fall 2019
	//Date: 11/12/2019
	//Description: Identifying poor naming conventions and understanding how arrays function / within a loop

	package edu.cgcc.cs160;
	
public class Ch8Ex2Main {
	
		public static void main(String[] args) {

		}
		//creates method named "banana" with parameters int array a
		public static int banana(int[] a) {
		   
			//integer kiwi set to 1
			int kiwi = 1;
			
			//loop variable i set to 0
		    int i = 0;
		    //whlie i < length of the array a, multiply int kiwi by the value of 
		    //position i in array a. Then increment by 1
		    while (i < a.length) {
		        kiwi = kiwi * a[i];
		        i++;
		    }
		    //return value of int kiwi
		    return kiwi;
		
		}
		//method named grapefruit created
		public static int grapefruit(int[] a, int grape) {
			//for loop 
			//loop variable, int i = 0
			//conditional, i < a.length (for when i is less than the length of array a
			//increment by 1
		    for (int i = 0; i < a.length; i++) {
		        //on the condition position i of array a is equal to grape, return position i
		    	if (a[i] == grape) {
		            return i;
		        }
		    }
		    //Negative statement indicating postition "grape" wasn't found
		    return -1;
		}
		//created int method pineapple
		//parameters, int array a & int apple
		public static int pineapple(int[] a, int apple) {
		    //int pear = loop variable
			int pear = 0;
			//enhanced for loop
			//looking for pine in array a
		    for (int pine: a) {
		    	
		    	//if the value of pine equals apple increment pear by 1
		        if (pine == apple) {
		            pear++;
		        }
		    }
		    //return data type pear
		    return pear;
		}
	}
	/* FOOTER
	**
	*/

