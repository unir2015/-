package ru.geekbrains.oop.lesson7.observer;

public class Master implements Observer {

    private String name;
    private int salary;

    private int type;
    private boolean state;

    public Master(String name) {
        this.name = name;
        salary = 80000;
        type = 0;
        state = false;
    }



    @Override
    public void receiveOffer(String nameCompany, int salary) {


    }




    @Override
    public void receiveOffer(String nameCompany, int salary, int type) {
        if (this.state = false & this.type == type) {
            if ( this.salary <= salary) {
                System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d), тип универсальный работник с опытом\n",
                        name, nameCompany, salary, type);
                this.salary = salary;
                this.state = true;
            } else {
                System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)тип универсальный работник с опытом\n",
                        name, nameCompany, salary);
            }
        }
    }
}
