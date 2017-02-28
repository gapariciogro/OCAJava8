/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cequality;

import java.util.*;

/**
 *
 * @author jshernandez
 */
public class Lists {
   static public void main(String... args) {
       List<Integer> lNum = java.util.Arrays.asList(5,4,9,1,0);
       Collections.sort(lNum);
       
       for(Object o : lNum) {
           System.out.print(o+",");
       }
   }
}

