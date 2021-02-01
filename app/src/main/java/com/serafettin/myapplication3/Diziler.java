package com.serafettin.myapplication3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Diziler {
    public  static void main (String[] args)
    {
        String[] isimler=new String[2];
        isimler[0]="Ali";
        isimler[1]="Veli";


        ArrayList<String> isimler2=new ArrayList<String>();
        isimler2.add("Kaan");
        isimler2.add("Can");
        isimler2.add("Ali");

        System.out.println(isimler2);
        HashSet<String> hasss=new HashSet<String>();
        hasss.add("Ali");
        hasss.add("Ali");
        System.out.println(hasss);

        HashMap<String,String> hasMapp=new HashMap<String, String>();
        hasMapp.put("name","Alii");
        hasMapp.put("language","Turkish");
        System.out.println(hasMapp.get("language") );
        int[] sayilar={2,3,4,5,5};
        for (int i=0;i<sayilar.length;i++)
        {
            System.out.println(sayilar[i]);

        }

        for (int number: sayilar ) {
            System.out.println(number);
        }





    }
}
