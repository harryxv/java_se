package builder;

/**
 * use static nested class of Builder.
 * the constructor of outer class uses builder instance.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String note;

    public Customer(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.note = builder.note;
    }

    public String fullName() {
        return new StringBuilder(this.firstName).append(" ").append(this.lastName).toString();
    }

    /**
     * Builder class has its own field set.
     * build has build() method to return an in stance of outer class.
     */
    static class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private String address;
        private String note;

        public Builder() {
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withNote(String note) {
            this.note = note;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
