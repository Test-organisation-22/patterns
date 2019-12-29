package builder;

public class Adress {

    private final String street;
    private final String houseNumber;
    private final int zipCode;
    private final String city;

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    private Adress(Builder builder){
        this.street = builder.street;
        this.houseNumber = builder.houseNumber;
        this.zipCode = builder.zipCode;
        this.city = builder.city;
    }

    public static class Builder{
        private String street;
        private String houseNumber;
        private int zipCode;
        private String city;

        public Builder withStreer(String streer){
            this.street = streer;
            return this;
        }

        public Builder withNouseNumber(String houseNumber){
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder withZipCode(int zipCode){
            this.zipCode = zipCode;
            return this;
        }

        public Builder withCity(String city){
            this.city = city;
            return this;
        }

        public Adress build(){
            return new Adress(this);
        }

    }




}
