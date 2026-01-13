package org.example;
public class Boy {
    Agreement agreement;
    public void setter(Agreement agreement) {
        this.agreement = agreement;
    }
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setter(new Girl());
        boy.chatWithGirl1();
        boy.chatWithGirl2();
    }
    public void chatWithGirl1(){
        agreement.chat();
    }
    public void chatWithGirl2(){
        agreement.chat();
    }
}