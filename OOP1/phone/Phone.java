package phone;

public class Phone {

    String number;
    String model;
    int weight;
    String ReceiveCall;
    String name;

    public void setNumber(String number) {

        this.number = number;
    }
    public String getNumber(){
        return number;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
    public void setReceiveCall(String ReceiveCall, String name) {
        this.ReceiveCall=ReceiveCall;
        this.name=name;
    }
    public String getReceiveCall(){
        return ReceiveCall;
    }
}