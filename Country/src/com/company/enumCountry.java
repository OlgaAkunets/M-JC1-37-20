package com.company;

public enum enumCountry {
    CHINA (9706961, 1433783686),
    INDIA (3287590, 1366417754),
    USA (9372610, 329064917),
    INDONESIA (1904569, 270625568),
    PAKISTAN (881912, 216565318),
    BAZIL (8515767,211049527),
    NIGERIA (923768, 200963599),
    BANGLADESH (147570, 163046161),
    RUSSIA (17098242, 145872256),
    MEXICO (1964375, 127575529);

   public final double area;
   public final int population;
   enumCountry (double area, int population) {
       this.area = area;
       this.population = population;
   }
}
