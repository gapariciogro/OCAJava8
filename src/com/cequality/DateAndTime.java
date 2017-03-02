/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cequality;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
/**
 *
 * @author gaparicio
 */
public class DateAndTime {
    public static void main(String args[]) {
        LocalDate ldNow = LocalDate.now();
        System.out.println(ldNow);
        LocalTime ltNow = LocalTime.now();
        System.out.println(ltNow);
        
        //NO hay constructor publico de estas clases
        LocalDate ld = LocalDate.of(1977, Month.JULY, 16);
        System.out.println(ld);
        
        LocalTime lt = LocalTime.of(15, 30, 0);
        System.out.println(lt);
        
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        System.out.println(ldt);
        
        Period p = Period.ofYears(10);
        
        ldt = ldt.plus(p);
        
        System.out.println("+10years=" + ldt);
        
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(f.format(ldt));

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(f2.format(ldt));
        //El objeto también tiene un método format
        System.out.println("Format from Formatter: "+ f2.format(ldt));
        System.out.println("Format from date/time " + ldt.format(f2));

        
        
        //Parsing Dates - Times
        LocalDateTime ldt2 = LocalDateTime.parse("30/01/2020 19:59:50",f2);
        System.out.println(f2.format(ldt2));
        
        
    }
}
