package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter your country name");
        String userCountry = myInput.nextLine();

        enumCountry c = enumCountry.valueOf(userCountry.toUpperCase());

        CountryParameters myCountryParameters = new CountryParameters(c);
        myCountryParameters.getArea();
        myCountryParameters.getPopulation();


        if (c == enumCountry.CHINA) {
            System.out.println("Chinas area is: " + myCountryParameters.getArea() + " population is: " + myCountryParameters.getPopulation());
        }
        else if (c == enumCountry.BANGLADESH) {
            System.out.println("BANGLADESH area is: " + myCountryParameters.getArea() + " population is: " + myCountryParameters.getPopulation());
        }
        else if (c == enumCountry.BAZIL) {
            System.out.println("BAZIL area is: " + myCountryParameters.getArea() + " population is: " + myCountryParameters.getPopulation());
        }
        else if (c == enumCountry.INDIA) {
            System.out.println("INDIA area is: " + myCountryParameters.getArea() + " population is: " + myCountryParameters.getPopulation());
        }
        else if (c == enumCountry.INDONESIA) {
            System.out.println("INDONESIA area is: " + myCountryParameters.getArea() + " population is: " + myCountryParameters.getPopulation());
        }
        else if (c == enumCountry.MEXICO) {
            System.out.println("MEXICO area is: " + myCountryParameters.getArea() + " population is: " + myCountryParameters.getPopulation());
        }
        else if (c == enumCountry.NIGERIA) {
            System.out.println("NIGERIA area is: " + myCountryParameters.getArea() + " population is: " + myCountryParameters.getPopulation());
        }
        else if (c == enumCountry.PAKISTAN) {
            System.out.println("PAKISTAN area is: " + myCountryParameters.getArea() + " population is: " + myCountryParameters.getPopulation());
        }
        else if (c == enumCountry.RUSSIA) {
            System.out.println("RUSSIA area is: " + myCountryParameters.getArea() + " population is: " + myCountryParameters.getPopulation());
        }
        else if (c == enumCountry.USA) {
            System.out.println("USA area is: " + myCountryParameters.getArea() + " population is: " + myCountryParameters.getPopulation());
        }

        enumCountry notexisting = enumCountry.valueOf("Belarus");
    }
}
