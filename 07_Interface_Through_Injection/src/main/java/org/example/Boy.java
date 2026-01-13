package org.example;

public class Boy implements DI {
    Agreement agreement;
    public static void main(String[] args) {
       Boy boy = new Boy();
       boy.inject(new Girl());
       boy.chatWithGirl1();
       boy.chatWithGirl2();
    }
    public void chatWithGirl1(){
        agreement.chat();
    }
    public void chatWithGirl2(){
        agreement.chat();
    }
    @Override
    public void inject(Agreement agreement) {
        this.agreement = agreement;
    }
}