package DesignPatterns.factoryPattern;

public class TeleComFactory {
    String teleComType;
    TeleComFactory(String teleComType){
        this.teleComType=teleComType;
    }

    public TeleCom getTeleCom(){

        if(teleComType.equalsIgnoreCase("Telephone")){
            return new Telephone();
        } else if (teleComType.equalsIgnoreCase("CellPhone")) {
            return new CellPhone();
        }else if(teleComType.equalsIgnoreCase("SmartPhone")){
            return new SmartPhone();
        }else
            return null;
    }
}
