package petsnameandbreed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner pets = new Scanner(System.in);
        System.out.println("how many pets do you have? ");
        int amount = pets.nextInt();
        HashMap<String,String> Pets = new HashMap<String, String>();

        while (amount != 0){


            System.out.println("List the type of pet!");
            //This will stop the program from skipping user input text line
            String fireBlank = pets.nextLine();
            String type = pets.nextLine();


            System.out.println("Enter name of pet!");
            String name = pets.next();
            Pets.put(type,name);

            amount--;

        }

        System.out.println(Pets.entrySet());


        //This is Hashmap practice

//        HashMap<String,String> Pets = new HashMap<String, String>();

//        Pets.put("Barbara Dunkleman","302-824-8084");
//        Pets.put("Fuck face ", "302-200-5203");
//        Pets.put("Alaonzo Alpha","302-111-1111");
////        System.out.println(Pets);
//
////       String value = Pets.get("Barbara Dunkleman");
////
////        System.out.println(value);
////
////        System.out.println(Pets.entrySet());
//
//        for(Map.Entry<String,String> data : Pets.entrySet()){
//
//            System.out.println(data.getKey()+" Phone number is " + data.getValue());
//        }







        //========================================
    }
}
