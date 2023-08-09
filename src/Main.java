import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 10;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int temp = 0;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int age = 61;

        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        } else {
            if (age >= 2 && age < 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            } else {
                if (age >= 7 && age < 18) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
                } else {
                    if (age >= 18 && age <= 24) {
                        System.out.println("Если возраст человека равен " + age + ", то его место в университете");
                    } else {
                        if (age > 24 && age <= 60) {
                            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
                        } else {
                            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
                        }
                    }
                }
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int age = 15;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else {
            boolean thereIsAdults = true;
            if (age >= 5 && age < 14 && thereIsAdults) {
                System.out.println("Если возраст ребенка равен " + age + " и присутствует взрослый, то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                if (age > 14) {
                    System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
                } else {
                    System.out.println("Если возраст ребенка равен " + age + " и нет взрослого, то ему нельзя кататься на аттракционе");
                }

            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        int numberPassenger = 102;

        if (numberPassenger < 60) {
            System.out.println("В вагоне еще есть " + (60 - numberPassenger) + " сидячих мест");
        } else {
            if (numberPassenger >= 60 && numberPassenger < 102) {
                System.out.println("В вагоне остались только " + (102 - numberPassenger) + " стоячих мест");
            } else {
                System.out.println("В вагоне нет свободных мест");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");

        int one = 4;
        int two = 10;
        int three = 1;

        boolean numberOneIsTheLargest = one > two && one > three;
        if (numberOneIsTheLargest) {
            System.out.println("Число 1 наибольшее");
        } else {
            boolean numberTwoIsTheLargest = two > three;
            if (numberTwoIsTheLargest) {
                System.out.println("Число 2 наибольшее");
            } else {
                System.out.println("Число 3 наибольшее");
            }
        }
    }
}

