public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 6;
        if (age >= 18) {
            System.out.println(" Если возраст человека " + age + " то он совершеннолетний");
        } else if (age < 18) {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задание 2");
        int temp = 3;
        if (temp > 5){
            System.out.println("Сегодня тепло, можно идти без шапки");}
        else {System.out.println("На улице холодно, нужно надеть шапку");}

        System.out.println("Задание 3");
        int speed = 80;
        if (speed>60)
        {System.out.println("Если скроость больше " + speed + "придется заплатить штраф");}
        else {System.out.println("если скорость меньше" + speed + " можно ехать спокойно");}

        System.out.println("Задание 4");
        int age1 = 2;
        if (age1 >=2 && age1 <= 6){
            System.out.println("Если возраст человека равен " +age1 + "то ему нужно ходить в сад");}
        else if (age >=7 && age <= 17)
        {System.out.println("Если возраст человека равен " +age1 + "то ему нужно ходить в школу");}
        else if (age1>=18 && age1<=24)
        {System.out.println("Если возраст человека равен " +age1 + "то ему нужно ходить в университет");}
        else if (age1>27)
        {System.out.println("Если возраст человека равен " +age1 + "то ему нужно работать");}

        System.out.println("Задание 5");

        int ageChildren = 17;
        if ( ageChildren < 5) {
            System.out.println("Если возрвст ребенка равен" + ageChildren + ", то ему нельзя кататься на атракционе");
        }else if (ageChildren>5 &&ageChildren <14 ){
            System.out.println(" Если возраст ребенка равен" + ageChildren + ", то ему можно кататься в сопровождениии взрослого");
        } else if (ageChildren  >= 14) {
            System.out.println(" Если возраст ребенка равен" + ageChildren + ", то ему можно кататься самостоятельно");}


        }

      }




