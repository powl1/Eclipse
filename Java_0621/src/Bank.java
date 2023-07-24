class BankAccount {
    int balance = 0;     // 예금 잔액
 
    BankAccount(){
       System.out.println("생성자 시작");
    } //디폴트 생성자 =  컴파일러가 개발자가 안넣게 되면 기본적으로 넣음
    
    /* 생성자를 한개라도 개발자가 만들면 디폴트생성자를 컴파일러가 만들어 주지 않는다.*/
    BankAccount(int balance){
       this.balance = balance;
       System.out.println("생성자 시작2");
    }
    
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }    

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
}

public class Java_git4 {
    
   public static void check(BankAccount acc) {
        acc.checkMyBalance();
    }
    
   public static void main(String[] args) {
        
      BankAccount ref = new BankAccount();
      BankAccount ref2 = new BankAccount(2000);
   
      
        
      
   
   
   }

}