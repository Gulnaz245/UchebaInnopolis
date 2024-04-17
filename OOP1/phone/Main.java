package phone;

public class Main {
    public static void main (String[] args){
        Phone phone1 =new Phone();
        Phone phone2 =new Phone();
        Phone phone3 =new Phone();
        Name name1= new Name();
        Name name2= new Name();
        Name name3= new Name();

        phone1.setNumber("+79600332233");
        phone1.setModel("Samsung");
        phone1.setWeight(300);

        phone2.setNumber("+79060332244");
        phone2.setModel("IPhone");
        phone2.setWeight(150);

        phone3.setNumber("+79033554455");
        phone3.setModel("Redmi");
        phone3.setWeight(200);

        name1.setReceiveCall("Владимир");
        name2.setReceiveCall("Ольга");
        name3.setReceiveCall("Евгений");

        System.out.println("Телефон 1");
        System.out.println("Номер телефона:"+phone1.getNumber());
        System.out.println("Модель телефона:"+phone1.getModel());
        System.out.println("Вес телефона:"+phone1.getWeight());

        System.out.println("Телефон 2");
        System.out.println("Номер телефона:"+phone2.getNumber());
        System.out.println("Модель телефона:"+phone2.getModel());
        System.out.println("Вес телефона:"+phone2.getWeight());

        System.out.println("Телефон 3");
        System.out.println("Номер телефона:"+phone3.getNumber());
        System.out.println("Модель телефона:"+phone3.getModel());
        System.out.println("Вес телефона:"+phone3.getWeight());

        System.out.println("Звонит "+name1.getReceiveCall()+" "+phone1.getNumber());
        System.out.println("Звонит "+name2.getReceiveCall()+" "+phone2.getNumber());
        System.out.println("Звонит "+name3.getReceiveCall()+" "+phone3.getNumber());
    }
}
