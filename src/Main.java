public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int age = 1;
        if (age >= 18) {
            System.out.println("Если возраст человека равен "+ age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println();
        System.out.println("Задача №2");
        int outdoorTemperature = 5;
        if (outdoorTemperature < 5) {
            System.out.println("На улице "+outdoorTemperature+" градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице "+outdoorTemperature+" градусов, можно идти без шапки.");
        }

        System.out.println();
        System.out.println("Задача №3");
        int speed = 10;
        if (speed > 60) {
            System.out.println("Если скорость "+ speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость "+ speed + " км/ч, то можно ездить спокойно.");
        }
        System.out.println();
        System.out.println("Задача №4");
        int agePeople = 11;
        if (agePeople >=2 && agePeople <=6) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в детский сад.");
        }

        if (7<=agePeople && agePeople<=17) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в школу.");
        }
        if (18<=agePeople && agePeople<=24) {
            System.out.println("Если возраст человека равен " + agePeople + ", то его место в университете.");
        }
        if (agePeople>24) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему пора ходить на работу.");
        }
        System.out.println();
        System.out.println("Задача №5");
        int ageChild = 14;
        boolean adult = true;
        boolean rulesAttraction = ageChild >= 5 && ageChild < 14 && adult;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен "+ageChild+", то ему нельзя кататься на атракционе");
        }
            if (rulesAttraction) {
                System.out.println("Если возраст ребенка равен " + ageChild + " и у него есть сопровождащий, то ему можно кататься на атракционе в сопровождении взрослого.");
            } else
                if (ageChild >= 5 && ageChild < 14 && !adult) {
                    System.out.println("Если возраст ребенка равен " + ageChild + ", и ребенок один, то ему нельзя кататься на атракционе без сопровождения взрослого.");
                }

        if (ageChild>=14) {
            System.out.println("Если возраст ребенка равен "+ageChild+", то он может кататься на атракционе без сопровождения взрослого.");
        }
        System.out.println();
        System.out.println("Задача № 6");

    int passangers = 50;
    int capacity = 102;
    int sittingSeats = 60;
    int seats = capacity-passangers;
    int leftSittingSeats = sittingSeats-passangers;
    if (passangers>=capacity) {
        System.out.println("В вагоне нет мест!");
    } else {
        if (passangers<sittingSeats) {
            System.out.println("В вагоне осталось " + leftSittingSeats + " сидячих мест.");
        } else {
            System.out.println("В вагоне осталось "+seats+" стоячих мест.");
        }
    }

        System.out.println();
        System.out.println("Задача №7");
        int one=160;
        int two=16;
        int three=700;
        if (one>two && one>three) {
            System.out.println("Число "+ one + " больше чисел "+two + " и "+three);
        } else {
            if (two > one && two > three) {
                System.out.println("Число " + two + " больше чисел "+ one + " и " + three);
            } else {
                System.out.println("Число " + three + " больше чисел "+one + " и "+two);
            }
        }
    }
}