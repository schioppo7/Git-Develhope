public class Builder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Builder(String davide, String firstName, int i, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(firstName, lastName, age, address);
    }
}
