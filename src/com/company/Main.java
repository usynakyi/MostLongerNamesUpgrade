package com.company;
import java.util.*;

public class Main {

    static void sort(String []s, int n)
    {
        for (int i=0 ;i<=n; i++)
        {
            String temp = s[i];
            System.out.println("Name"+i+": "+temp);

            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;

        }
    }
        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);  //System.in is a standard input stream
            System.out.print("Enter a names through a space and press 'Enter': ");
            String str= sc.nextLine(); //reads string

            String ArrayNames[] = str.split(" ");

            int n = ArrayNames.length-1;

            sort(ArrayNames,n);
            System.out.println("Most smaller name: "+ArrayNames[0]);
            System.out.println("Biggest name: "+ArrayNames[n]);

        }
    }
