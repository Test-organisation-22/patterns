package builder;

public class Account {

    private final int id;
    private final String firstName;
    private final String secondName;
    private final Adress adress;
    private final String email;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Adress getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    private Account(Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.adress = builder.adress;
        this.email = builder.email;
    }

    public static class Builder {

        private int id;
        private String firstName;
        private String secondName;
        private Adress adress;
        private String email;

        public Builder withId(int id){
            this.id = id;
            return this;
        }

        public Builder withFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder withSecondName(String secondName){
            this.secondName = secondName;
            return this;
        }

        public Builder withAdress(Adress adress){
            this.adress = adress;
            return  this;
        }

        public Builder withEmail(String email){
            this.email = email;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }
}
