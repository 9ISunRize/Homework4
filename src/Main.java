public class Main {


    public static void main(String[] args) {
        // Задача1
        System.out.println("Задача 1 ");
        int age = 12;
        if (age >= 18) {
            System.out.println("Поздравление с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, придется немного  подождать");
        }


        System.out.println("Задача 2 ");
        var age1 = 21;
        if (age1 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age1 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age1 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("Задача 3 ");
        var passengers = 77;
        if (passengers < 60) {
            System.out.println("В вагоне есть место");
        }
        if (passengers > 60) {
            System.out.println("В вогоне нет мест, проезд стоя");
        }
        if (passengers >= 120) {
            System.out.println("Вагон полностью забит");
        }

        System.out.println("Задача 4 + выполнена в задаче 1 ");
        System.out.println("Задача 5 + =словия попадания в каждую группу не пересекаются, поэтому достаточно использовать if");


        System.out.println("Задача 6 ");
        int passengers1 = 5;
        if (passengers1 < 60) {
            System.out.println("В вагоне есть место");
        }
        if (passengers1 > 60 && passengers1 < 120) {
            System.out.println("В вогоне нет мест, проезд стоя");
        } else  {
            System.out.println("Вагон полностью забит");
        }




        System.out.println("Задача 8 ");
        int one =1;
        int two =2;
        int three =3;
        if (one>two && one>three) {
            System.out.println("бОльшее число - " +one);
        }
        if  (two>one && two>three) {
            System.out.println("бОльшее число - " +two);
        }
        else if (three>one && three>two) {
            System.out.println("бОльшее число - " + three);
        }


        System.out.println("Задача 7 ");
        var ageMen = 22;
        boolean ageKinderGarden = 2 <= ageMen && ageMen<= 6;
        boolean ageSchool = 7<= ageMen&& ageMen<= 18;
        boolean ageUniversity = 18 < ageMen && ageMen <=24;

        if (ageKinderGarden) {
            System.out.println("Если возраст человека равен "+ageMen +" , то ему нужно ходить в сад");
        }
        if(ageSchool) {
            System.out.println("Если возраст человека равен "+ageMen +" , то ему нужно ходить в школу");
        } else if (ageUniversity) {
            System.out.println("Если возраст человека равен "+ageMen +" , то его место в универсистете");
        }
        else if (ageMen >24) {
            System.out.println("Если возраст человека равен "+ageMen +" , то ему пора идти на работу");
        }




    }

}