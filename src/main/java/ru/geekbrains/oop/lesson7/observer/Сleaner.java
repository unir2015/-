package ru.geekbrains.oop.lesson7.observer;

public class Сleaner implements Observer {
    private String name;
    private int salary;

    private int type;
    private boolean state;
    public Сleaner(String name) {
        this.name = name;
        salary = 35000;
        type = 2;
        state = false;
    }



    @Override
    public void receiveOffer(String nameCompany, int salary) {

    }


    @Override
    public void receiveOffer(String nameCompany, int salary, int type) {
        if(this.type == type & state == false ) {
            if ( this.salary <= salary) {
                System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d), тип уборшик\n",
                        name, nameCompany, salary, type);
                this.salary = salary;
                state = true;
            } else {
                System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)тип уборшик\n",
                        name, nameCompany, salary);
            }
        }
    }

}
