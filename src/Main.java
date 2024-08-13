public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        boolean aboveLimit = refill > 1000;

        int bonus = aboveLimit ? refill / 100 : 0;
        int totalAmount = balance + refill + bonus;

        System.out.println(totalAmount);
    }
}
       /* if (aboveLimit) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }



        // int bonusMiles = cost / oneMile;
        // System.out.println("Вам начислено " + bonusMiles + " бонусных миль");


        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}*/
