package uk.axone.devintest.interfaces;

public class BankTest {

    public static void main(String[] args) {

        //An interface cannot be instantiated
        //Bank myBank = new Bank();
        System.out.println(Bank.FIN_INST_TYPE);

        HSBC wokinghamBranch = new HSBC("40-42-09","high street");
        wokinghamBranch.depositCash(4308);
        wokinghamBranch.withdrawCash(9438);

        Bank.display();

    }

}
