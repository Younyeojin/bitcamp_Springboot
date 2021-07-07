package com.example.demo.bank;

public class BankAccountStaticVersion {
    static int balnce = 0;    //예금 잔액

    public static int deposit(int amount) {  //입금을 담당하는 메소드
        balnce += amount;
        return BankAccountStaticVersion.balnce;
    }

    public static int withdraw(int amount) {   //출금을 담당하는 메소드
        balnce -= amount;
        return balnce;
    }

    public static int checkMyBalance() {   //예금 조회를 담당하는 메소드
        System.out.println("잔액 : " + balnce);
        return balnce;
    }

    public static void main(String[] args) {
        deposit(10000);  //입금 진행
        checkMyBalance();   //잔액 확인
        withdraw(3000);   //출금 진행
        checkMyBalance();    //잔액 확인
    }
}
        /*public static int deposit(int amount) {  //입금을 담당하는 메소드
            balnce += amount;
            return balnce;
        }
        public static int withdraw(int amount) {   //출금을 담당하는 메소드
            balnce -= amount;
            return balnce;
        }
        public static int checkMyBalance() {   //예금 조회를 담당하는 메소드
            System.out.println("잔액 : " + balnce);
            return balnce;
        }*/


