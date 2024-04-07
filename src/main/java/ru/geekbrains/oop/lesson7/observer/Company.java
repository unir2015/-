package ru.geekbrains.oop.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();


    private String name;

    private Publisher jobAgency;

    private int maxSalary;
    private  int type;

    private boolean state;

    public Company(String name, Publisher jobAgency, int maxSalary, int type){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
        this.type = type;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);

        jobAgency.sendOffer(name, salary, type);
    }


}
