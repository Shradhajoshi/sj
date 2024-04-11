package LeetCode;

import java.util.ArrayList;
import java.util.List;

/*  Problem: 
    Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 

Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
*/

public class FizzBuzz {
	
	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();
		int i = 1;
		while(i <= n) {
			if(i % 15 == 0) {
				list.add("FizzBuzz");
			} else if(i % 3 == 0) {
				list.add("Fizz");
			} else if(i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(String.valueOf(i));
			}
			i++;
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz fb = new FizzBuzz();
		System.out.println(fb.fizzBuzz(3));
		System.out.println(fb.fizzBuzz(5));
		System.out.println(fb.fizzBuzz(15));
		
	}

}
