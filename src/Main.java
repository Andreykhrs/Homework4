public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int age = 1;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println();
        System.out.println("Задача №2");
        int outdoorTemperature = 5;
        if (outdoorTemperature < 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти без шапки.");
        }

        System.out.println();
        System.out.println("Задача №3");
        int speed = 10;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
        System.out.println();
        System.out.println("Задача №4");
        int agePeople = 5;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в детский сад.");
        } else {

            if (7 <= agePeople && agePeople <= 17) {
                System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в школу.");
            } else {

                if (18 <= agePeople && agePeople <= 24) {
                    System.out.println("Если возраст человека равен " + agePeople + ", то его место в университете.");
                } else {
                    if (agePeople > 24) {
                        System.out.println("Если возраст человека равен " + agePeople + ", то ему пора ходить на работу.");
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Задача №5");
        int ageChild = 14;
        boolean adult = true;
        boolean rulesAttraction = ageChild >= 5 && ageChild < 14 && adult;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на атракционе");
        }
        if (rulesAttraction) {
            System.out.println("Если возраст ребенка равен " + ageChild + " и у него есть сопровождащий, то ему можно кататься на атракционе в сопровождении взрослого.");
        } else {
            if (ageChild < 5 || ageChild >= 14 || adult) {
            } else {
                System.out.println("Если возраст ребенка равен " + ageChild + ", и ребенок один, то ему нельзя кататься на атракционе без сопровождения взрослого.");
            }
        }

        if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься на атракционе без сопровождения взрослого.");
        }
        System.out.println();
        System.out.println("Задача № 6");

       int sittingPassanger = 70;
       int standingPassanger = 25;
        int capacity = 102;
        int sittingSeats = 60;
        int passanger = sittingPassanger+standingPassanger;
        int standingSeats = capacity-sittingSeats;
        int leftSittingSeats = sittingSeats - sittingPassanger;
        int leftStandingSeats = standingSeats-standingPassanger;
        if (passanger > capacity) {
            System.out.println("В вагоне нет мест!");
        } else {
            if (sittingPassanger < sittingSeats) {
                System.out.println("В вагоне осталось " + leftSittingSeats + " сидячих мест.");
            } else {
                System.out.println("В вагоне нет сидячих мест.");
            }
            if (standingPassanger < standingSeats) {
                System.out.println("В вагоне осталось " + leftStandingSeats + " стоячих мест.");
            } else {
                System.out.println("В вагоне нет стоячих мест.");
            }
        }

        System.out.println();
        System.out.println("Задача №7");
        int one = 1600;
        int two = 1600;
        int three = 1600;
        if (one > two && one > three && two != three) {
            System.out.println("Число " + one + " больше чисел " + two + " и " + three);
        } else {
            if (two > one && two > three && one != three) {
                System.out.println("Число " + two + " больше чисел " + one + " и " + three);
            } else {
                if (three > one && three > two && one != two) {
                    System.out.println("Число " + three + " больше чисел " + one + " и " + two);
                } else {
                    System.out.println("Ошибка. Числа не должны быть одинаковыми.");
                }
            }
        }
    }
}

