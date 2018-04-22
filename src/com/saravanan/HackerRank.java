package com.saravanan;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);*/
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int x=sc.nextInt();
             //Complete this line
             /*int length = s1.length();
            while(length<15){
            	s1=s1+" ";
            	length++;
            }*/
            
            //int lengthInt=(int) (Math.log10(x)+1);
            //String xint=String.format("%03d", x);
           /* while(lengthInt<3){
            	xint="0"+xint;
            	lengthInt++;
            }*/
            
            //map.put(s1, xint);
map.put(s1, x);

            
         }
        for(Map.Entry<String, Integer> entry:map.entrySet()){
        	 //System.out.println(entry.getKey()+entry.getValue());
        	 System.out.printf("%-15s%03d\n", entry.getKey(), entry.getValue());
        	 System.out.printf("\n");
        	 
         }
         System.out.println("================================");
	}

}
