package ru.geekbrains.oop.lesson7.observer;

public interface Observer {



    void receiveOffer(String nameCompany, int salary, int type);

    void receiveOffer(String nameCompany, int salary);
}
