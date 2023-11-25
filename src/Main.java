
public class Main {
    public static void main(String[] args) {
        int balance = 200; // баланс счета до пополнения
        int many = 1800; // сумма пополнения
        boolean refill = true;

        int bonus;
        if (refill) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        int bonusRub = (balance + many) / 100;
        int check = balance + many + bonusRub;

        System.out.println("Ваш баланс:" + check);
        System.out.println("Ваши бонусные рубли:" + bonusRub);
    }
}
