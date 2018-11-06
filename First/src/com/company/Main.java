package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.time.*;

public class Main {

    public static int fact(int n)
    {
        int res = 1;
        for(int i = 1; i <= n; i++)
        {
            res*=i;
        }
        return res;
    }

    public static int sochetanie(int n, int k)
    {
        int nfact = fact(n);
        int kfact = fact(k);
        int nMinusKfact = fact(n-k);
        int res = nfact / (kfact * nMinusKfact);
        return res;
    }

    public static void main(String[] args){
       Scanner scannerMain = new Scanner(System.in);

       int n,k;
       n = scannerMain.nextInt();
       k = scannerMain.nextInt();
       if(n < k)
       {
           while(n < k)
           {
               n = scannerMain.nextInt();
               k = scannerMain.nextInt();
           }
       }

       int result = sochetanie(n, k);

       System.out.println(result);

    }
}
