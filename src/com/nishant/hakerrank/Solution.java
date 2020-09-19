package com.nishant.hakerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String args[] ) throws Exception {
      Scanner ins = new Scanner(System.in);
        String ip = ins.nextLine();
        String s = ip.replaceAll(" ", "");
        char[] ch = s.toCharArray();
        Arrays.sort(ch); 
        int count = 1;
        for(int i =0; i< ch.length;i++){
            for(int j = i+1;j< ch.length;j++){
                if(ch[i]== ch[j]){
                    count++;
                }
            }
            if(count==2){
             System.out.print(ch[i]+" ");
            }
            else if(count==1){
            System.out.println("No Duplicate");
            }
        }
        
    
    }   
}