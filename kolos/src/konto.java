import java.util.Scanner;

public class konto {
    int id;
    int money;

    public konto(int id,int money){
        this.id=id;
        this.money=money;
    }
    public void checkMoney(){
        System.out.println("ilość pieniędzy na koncie: "+this.money);
    }
    public void addMoneyIn(int x){
        if(x<0){
            System.out.println("nie można wpłacić kwoty na minusie");
        }else{
            this.money= this.money+x;
        }
    }
    public void takeMoneyOut(int x){
        if(x<0){
            System.out.println("nie można wypłacić kwoty na minusie");
        }
        if (this.money-x <0){
            System.out.println("za mało środków");
        }
        else{
            this.money= this.money-x;
        }
    }

    public static void main(String[] args) {
        konto konto1 = new konto(1,100);
        konto konto2 = new konto(2,100);
        konto konto3 = new konto(3,100);
        konto konto4 = new konto(4,100);
        konto konto5 = new konto(5,100);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an id: ");
        int id = scan.nextInt();
        boolean exit = true;

            System.out.println("Main menu\n1:check balance\n2:withdraw\n3:deposit\n4:exit");
        while(exit) {
            System.out.println("Enter a choice:");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    switch (id) {
                        case 1 -> {
                            konto1.checkMoney();
                        }
                        case 2 -> {
                            konto2.checkMoney();
                        }
                        case 3 -> {
                            konto3.checkMoney();
                        }
                        case 4 -> {
                            konto4.checkMoney();
                        }
                        case 5 -> {
                            konto5.checkMoney();
                        }
                    }
                }
                case 3 -> {
                    System.out.println("podaj kwote do wpłaty: ");
                    int kwota = scan.nextInt();

                    switch (id) {
                        case 1 -> {
                            konto1.addMoneyIn(kwota);
                        }
                        case 2 -> {
                            konto2.addMoneyIn(kwota);
                        }
                        case 3 -> {
                            konto3.addMoneyIn(kwota);
                        }
                        case 4 -> {
                            konto4.addMoneyIn(kwota);
                        }
                        case 5 -> {
                            konto5.addMoneyIn(kwota);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("podaj kwote do wypłaty: ");
                    int kwotawyp = scan.nextInt();

                    switch (id) {
                        case 1 -> {
                            konto1.takeMoneyOut(kwotawyp);
                        }
                        case 2 -> {
                            konto2.takeMoneyOut(kwotawyp);
                        }
                        case 3 -> {
                            konto3.takeMoneyOut(kwotawyp);
                        }
                        case 4 -> {
                            konto4.takeMoneyOut(kwotawyp);
                        }
                        case 5 -> {
                            konto5.takeMoneyOut(kwotawyp);
                        }
                    }
                }
                case 4 -> {
                    exit = false;
                    System.out.println("Zapraszamy ponownie!");
                }
            }
        }
    }

}
