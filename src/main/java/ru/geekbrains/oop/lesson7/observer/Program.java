package ru.geekbrains.oop.lesson7.observer;

import java.lang.ref.Cleaner;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  *** воспользоваться методом removeObserver для удаления соискателя после получения работы
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120000, 3);
        Company yandex = new Company("Yandex", publisher, 95000, 3);
        Company geekBrains = new Company("GeekBrains", publisher, 98000, 3);

        Company JKX = new Company("LKX", publisher, 36000, 2);
        Company yandexTaksi = new Company("Yandex Taksi", publisher, 45000, 2);
        Company Gazprom = new Company("Gazprom", publisher, 40000, 2);

        Company construction = new Company("Сonstruction", publisher, 90000, 0);
        Company coven = new Company("coven", publisher, 45000, 1);
        Company finishingTheRoom = new Company("Finishing The Room", publisher, 100000, 0);



        Student student = new Student("Nasta");
        Master master1 = new Master("Alosha");
        Master master2 = new Master("Ilia");
        Programmer programmer = new Programmer("Andey");
        Programmer programmer1 = new Programmer("Svetozar");
        Сleaner cleaner = new Сleaner("Anastasia");


        publisher.registerObserver(student);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(programmer);
        publisher.registerObserver(programmer1);
        publisher.registerObserver(cleaner);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();

            JKX.needEmployee();
            yandexTaksi.needEmployee();
            Gazprom.needEmployee();

            construction.needEmployee();
            coven.needEmployee();
            finishingTheRoom.needEmployee();
        }

    }

}
