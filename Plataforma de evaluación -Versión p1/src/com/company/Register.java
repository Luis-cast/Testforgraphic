package com.company;
import java.util.Scanner;

public class Register {
    public void DataInsert  (){
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[21m Bienvenido a el proceso de evaluación K-V1");
        System.out.println("\u001B[21m Por favor introduzca sus datos");
        System.out.println("\u001B[31m Ingrese su nombre  ");
        String name = sc.nextLine();
        System.out.println("\u001B[31m Ingrese su apellido ");
        String lname = sc.nextLine();
        System.out.println(name+" "+lname);
    }
}
