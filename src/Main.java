public class Main {
    public static void main(String[] args) {

        //входные данные
        int billStarted = 200;   // начальный счет
        int summa = 700;         // сумма пополнения
        int limit = 1000;        // сумма пополнения с которой начисляется бонус
        int amount = 100;        // за каждые 100 рублей 1 бонусный рубль

        // начисляем бонусные рубли
        int bonus;
        if (summa >= limit) {
            bonus = summa / amount;
        } else {
            bonus = 0;
        }

        // конечный остаток на счету
        int bill = billStarted + bonus + summa;

        System.out.println("Начистено " + bonus + " бонусных рублей");
        System.out.println("Всего на счету " + bill + " рублей");


    }

}
