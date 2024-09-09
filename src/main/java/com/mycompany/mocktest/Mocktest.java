/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mocktest;

/**
 *
 * @author Udo
 */
public class Mocktest {

    public static void main(String[] args) {
        String[][] arrStudents = {{"", "JAN", "FEB", "MAR"},
                                 {"SUV", "25", "15", "35"},
                                 {"COUPE", "25", "55", "35"},
                                 {"SEDAN", "11", "20", "45"},
                                 {"VAN", "17", "27", "25"}};
        
        int suvTotal = 0;
        int coupeTotal = 0;
        int sedanTotal = 0;
        int vanTotal = 0;
        int y = 1;
        String strOutput = "***********************************************************************" + "\n";
        strOutput+= "VEHICLE SALES REPORT" + "\n";
        strOutput+= "***********************************************************************" + "\n";
        
        
        for(int x = 0; x < arrStudents.length;x++){
            
            strOutput+= arrStudents[x][0] + 
                    "\t\t"+" "+arrStudents[x][1] +
                    "\t\t"+" "+arrStudents[x][2] + 
                    "\t\t"+" "+arrStudents[x][3] + " \n";   
        }
        
        strOutput+= "***********************************************************************" + "\n";
        strOutput+= "VEHICLE TOTAL SALES" + "\n";
        strOutput+= "***********************************************************************" + "\n";

        while(y < 4)
        {
            suvTotal = suvTotal + Integer.parseInt(arrStudents[1][y]);
            coupeTotal = coupeTotal + Integer.parseInt(arrStudents[2][y]);
            sedanTotal = sedanTotal + Integer.parseInt(arrStudents[3][y]);
            vanTotal = vanTotal + Integer.parseInt(arrStudents[4][y]);
           
            y = y +1;
        }
        String suv = "";
        String coupe = "";
        String sedan = "";
        String van = "";
        
        if(suvTotal >= 100)
        {
            suv = "Gold Star";
        }
        else
        {
            suv = "Silver Star";
        }
        
        if(coupeTotal >= 100)
        {
            coupe = "Gold Star";
        }
        else
        {
            coupe = "Silver Star";
        }
        
        if(sedanTotal >= 100)
        {
            sedan = "Gold Star";
        }
        else
        {
            sedan = "Silver Star";
        }
        
        if(vanTotal >= 100)
        {
            van = "Gold Star";
        }
        else
        {
            van = "Silver Star";
        }
        
        strOutput+= arrStudents[1][0] + "\t\t"+ suvTotal + " (" + suv + ") \n"
                    +arrStudents[2][0] + "\t\t"+ coupeTotal + " (" + coupe + ") \n"
                    +arrStudents[3][0] + "\t\t"+ sedanTotal + " (" +sedan + ") \n"
                    +arrStudents[4][0] + "\t\t"+ vanTotal + " (" + van + ") \n"; 
       
        strOutput+= "***********************************************************************" + "\n";
        
        System.out.println(strOutput);
    }
}
