/* 
 *  Name: Aaron Crum
 *  CSU ID: 2698195 
 *  CIS 265: Lab 2
 *  Description: A Java Program for calculating the area of a circle of given radius.
*/

import java.util.Scanner;
public class Area
{
    public static void main(String[] args) 
{
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;

        System.out.println("Area of circle:"+area);
    }            
}
