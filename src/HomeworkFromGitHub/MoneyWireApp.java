package HomeworkFromGitHub;

import static HomeworkFromGitHub.Bank.transferFromJuridicToPhysical;

public class MoneyWireApp {
    public static void main(String[] args) {
        transferFromJuridicToPhysical(5000); // Transfer 2000 from juridic to physical
        System.out.println("Physical person's balance: $" + Bank.PhysicalPersonClient.money);
        System.out.println("Juridic person's balance: $" + Bank.JuridicPersonClient.money);
        System.out.println("Bank balance: $" + Bank.money);

    }
}
// secondary class
class Bank {

    static int money = 0;

    static class PhysicalPersonClient {
        static int money = 100;
    }

    static class JuridicPersonClient {
        static int money = 1000000;
    }

    static void transferFromJuridicToPhysical(int amount) {
        if (amount >= 100 && amount <= 5000) {
            double transferAmount = amount;
                if (amount > 500){
                    //take 1% from the transaction
                    transferAmount -= (0.01 * amount);
                }else {
                    // take 10 units for amounts < 500
                    transferAmount -= 10;
                }
            if (JuridicPersonClient.money >= amount) {
                JuridicPersonClient.money -= amount;
                PhysicalPersonClient.money += amount;
                PhysicalPersonClient.money += (int) transferAmount;
                Bank.money += (amount - (int) transferAmount); // Deposit remainder in bank
                System.out.println("The transaction was successfully.");
            } else {
                System.out.println("Insufficient money in the juridic account.");
            }
        } else {
            System.out.println("Invalid transaction amount. Please choose an amount between 100 and 5000.");
        }
    }
}
//ТРЕБУЕТСЯ:
//
//Напишите код внутри метода transferFromJuridicToPhysical(...) так чтобы метод "передал" указанную суму денег со счета юр лица на счет физ лица.
//Метод перевода денег должен за один вызов передать суму в пределах 100..5000
//Метод перевода денег должен отнимать 1% из суммы (ели она от 500 и выше) или 10 единиц для сум - меньше 500 и положить на счет банка
//Деньги не могут быть переведены со счета где осталось меньше чем требуемая сума
//Проверьте ваш код в main() переведя 40050 единиц с юр на физ лицо. При этом в банке должно накопиться 410, на счету физ - 39640 (кроме 100 которые были изначально) и на юр счету останутся - 959950 денег