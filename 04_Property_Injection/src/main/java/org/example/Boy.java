package org.example;

public class Boy {
    //property injection
    Agreement agreement = new Girl();

    public static void main(String[] args) {
       Boy boy = new Boy();
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