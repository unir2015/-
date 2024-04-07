package ru.geekbrains.oop.lesson7.observer;

public class Student implements Observer{

    private String name;
    private int salary;
    private int type;
    private boolean state;
    public Student(String name){
        this.name = name;
        salary = 5000;
        type = 1;
        state = false;
    }



    @Override
    public void receiveOffer(String nameCompany, int salary) {

    }

    @Override
    public void receiveOffer(String nameCompany, int salary, int type) {
        if (this.type == type & state == false) {
            if (this.salary <= salary) {
                System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d), тип универсальный работник без опыта\n",
                        name, nameCompany, salary);
                this.salary = salary;
                this.state = true;
            } else {
                System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d), тип универсальный работник без опыта\n",
                        name, nameCompany, salary);
            }
        }
    }

}
