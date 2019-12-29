package builder;

public class App {

    public static void main(String[] args){

        Adress adress = new Adress.Builder()
                .withNouseNumber("12a")
                .withStreer("Mozart str")
                .withZipCode(68123)
                .withCity("Munchen")
                .build();

        Account account = new Account.Builder()
                .withAdress(adress)
                .withEmail("example@mail.com")
                .withFirstName("Matthias")
                .withSecondName("Ivanov")
                .withId(199)
                .build();
    }
}
