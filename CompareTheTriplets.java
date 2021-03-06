/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .

Your task is to find their comparison points by comparing  with ,  with , and  with .

If , then Alice is awarded  point.
If , then Bob is awarded  point.
If , then neither person receives a point.
Comparison points is the total points a person earned.

Given  and , can you compare the two challenges and print their respective comparison points?

*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        if(a0 <1 && a0>100) System.out.println("Input should be between 1 to 100 .. ");
        if(a1 <1 && a1>100) System.out.println("Input should be between 1 to 100 .. ");
        if(a2 <1 && a2>100) System.out.println("Input should be between 1 to 100 .. ");
        if(b0 <1 && b0>100) System.out.println("Input should be between 1 to 100 .. ");
        if(b1 <1 && b1>100) System.out.println("Input should be between 1 to 100 .. ");
        if(b2 <1 && b2>100) System.out.println("Input should be between 1 to 100 .. ");
        
        int aPoint=0;
        int bPoint=0;
        
        if(a0 > b0) aPoint+=1; else if(a0==b0) bPoint+=0; else bPoint+=1;
        if(a1 > b1) aPoint+=1; else if(a1==b1) bPoint+=0; else bPoint+=1;
        if(a2 > b2) aPoint+=1; else if(a2==b2) bPoint+=0; else bPoint+=1;
        
        int [] pointsTally=new int[] {aPoint,bPoint};
        return pointsTally;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
