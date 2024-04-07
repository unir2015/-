package ru.geekbrains.oop.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {


    private Collection<Observer> observers = new ArrayList<>();

    public void sendOffer(String companyName, int salary, int type){
        for (Observer observer : observers){
            observer.receiveOffer(companyName, salary,type);
        }
    }



    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}
