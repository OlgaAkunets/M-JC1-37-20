package com.company;

public class CountryParameters implements ICountry {
    enumCountry country;
    public CountryParameters (enumCountry myCountry){
        this.country=myCountry;
    }
    public double getArea (){
       return country.area;
       }
       public int getPopulation (){
        return country.population;
       }
   }

