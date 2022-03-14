package builder;

public class CreateCustomer {
    public static void main(String[] args) {
        Customer.Builder builder = new Customer.Builder();
        Customer customer =
                builder.withFirstName("harry").withLastName("xu").build();
        System.out.println(customer.fullName());
    }
}
