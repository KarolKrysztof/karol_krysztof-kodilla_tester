package com.kodilla.abstracts.homework;

public class AppPerson {

    public static void main(String[] args) {

       Person karol = new Person("Karol", 34);
       Person anna = new Person("Anna", 45);
       Person wiktor = new Person("Wiktor", 56);

       anna.setJob(new Doctor(6000, "Lekarz leczy ludzi."));
       karol.setJob(new Manager(8500, "Manager zarządza ludźmi"));
       wiktor.setJob(new PoliceMan(3500, "Policjant pilnuje porządku."));

       karol.displayResponsibilities();
       anna.displayResponsibilities();
       wiktor.displayResponsibilities();

    }

}
