package adapter;

public class Client {

    public static void main(String[] args) {

        ITarget adapter1 = new Adapter(new Adaptee());
        adapter1.request();

    }
}
