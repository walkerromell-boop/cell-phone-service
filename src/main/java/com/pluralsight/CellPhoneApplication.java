package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //created a cellphone object using default constructor
        CellPhone myPhone = new CellPhone();
        CellPhone phone = new CellPhone();


        System.out.println("What is the serial number? ");
        myPhone.setSerialNumber(scanner.nextInt());
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();


        System.out.println("What model is the phone? ");
        myPhone.setModel(scanner.nextLine());
        phone.setModel(scanner.nextLine());

        System.out.println("Who is the carrier? ");
        myPhone.setCarrier(scanner.nextLine());
        phone.setCarrier(scanner.nextLine());


        System.out.println("What is the phone number? ");
        myPhone.setPhoneNumber(scanner.nextLine());
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of the phone? ");
        myPhone.setOwner(scanner.nextLine());
        phone.setOwner(scanner.nextLine());

        phone.showMe();

        myPhone.showMe();

        displaying(phone);

        displaying(myPhone);

        serialnum1(myPhone);

    }


    private static void serialnum1(CellPhone myPhone) {
        System.out.println("Serial Number: " + myPhone.getSerialNumber());


    }

    public static void displaying(CellPhone myPhone) {
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Phone model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone number: " + myPhone.getPhoneNumber());
        System.out.println("Phone owner: " + myPhone.getOwner());
    }
}
