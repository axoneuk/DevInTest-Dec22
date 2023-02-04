package uk.axone.devintest.interfaces;

public class HSBC implements Bank, UKSecStandards{

    private String sortCode;
    private String address;

    public HSBC(String sortCode, String address){
        this.address = address;
        this.sortCode = sortCode;
    }

    void processPersonalLoan(){

    }

    @Override
    public void depositCash(int amount) {

    }

    @Override
    public boolean withdrawCash(int amount) {
        return false;
    }

    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public int getCompanyNumber() {
        return 0;
    }

    @Override
    public String getVATNumber() {
        return null;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public int getEncryptionType() {
        return 0;
    }
}

