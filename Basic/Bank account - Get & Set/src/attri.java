
public class attri {
    private int AccountNo;
    private int Pin;
    private int Amount;
    private int Deposit;
    
    public void setAccountNo(int accno){
        this.AccountNo = accno;
    }
    public void setPin(int pin){
        this.Pin = pin;
    }
    public void setAmount(int amount){
        this.Amount = amount;
    }
    public void setDepAmount(int dep){
        this.Deposit = dep;
    }
    
    public int getAccountNo(){
        return AccountNo;
    }
    public int getPin(){
        return Pin;
    }
    public int getAmount(){
        return Amount;
    }
    public int getDepAmount(){
        return Deposit;
    }

}
