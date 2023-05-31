package task2;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone(89197462434L, "Nokia", 356, "Egor");
        Phone phone2 = new Phone(89002648875L, "iPhone", 300, "Anna");
        Phone phone3 = new Phone(89051324555L, "Samsung", 311, "Stanislav");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.receiveCall();
        System.out.println(phone1.getNumber());
        phone2.receiveCall();
        System.out.println(phone2.getNumber());
        phone3.receiveCall();
        System.out.println(phone3.getNumber());
    }
}
