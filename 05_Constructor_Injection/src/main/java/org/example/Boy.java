package org.example;

public class Boy {
    Agreement agreement;
    public Boy(Agreement agreement) {
        this.agreement=agreement;
    }
    public static void main(String[] args) {
        Boy boy=new Boy(new Girl());
        boy.chatWithGirlMethod1();
        boy.chatWithGirlMethod2();
    }
    public void chatWithGirlMethod1(){
        agreement.chat();
    }
    public void chatWithGirlMethod2(){

        agreement.chat();
    }

}