package DesignPatterns.factoryPattern;

public interface TeleCom{
    public void call(String number);
}

class Telephone implements TeleCom{
    public void call(String number){
        System.out.println("calling from telephone number : "+number);
    }
}

class CellPhone implements TeleCom{
    public void call(String number){
        System.out.println("calling from Cellphone number : "+number);
    }
    public void sendMessage(String msg){
        System.out.println("sending message from callphone : message = "+msg);
    }
}

class SmartPhone implements TeleCom{
    public void call(String number){
        System.out.println("calling from smart phone and number is : "+number);
    }
    public void videoCall(){
        System.out.println("video calling....");
    }
}

