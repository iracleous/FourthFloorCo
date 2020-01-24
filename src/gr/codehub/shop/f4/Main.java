package gr.codehub.shop.f4;

        import gr.codehub.shop.f5.Product;

        import java.util.*;
        import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Solution solution = new Solution("magic solution",
                "this solution is special",

                1000., 800., new Date());

        System.out.println(solution.toString());
        System.out.println(solution.getTitle());

        solution.setFinalPrice();

        Customer customer = new Customer("John", "Smith",
                new Date(90, 11, 1),
                "72 Alexandras Av. Athens",
                "11525", "0220", "+30(210-74)",
                "smith@provider.com");

        System.out.println(customer);

        Customer[] customers = new Customer[10];
        customers[0] = customer;
        customers[1] = new Customer();

        List<Customer> customersList = new ArrayList<>();

        List<Customer> customSortedCustomers = customersList.stream()
                .sorted(Comparator.comparing(Customer::getAge))
                .collect(Collectors.toList());

        customSortedCustomers.forEach(p -> System.out.println(p));

        customSortedCustomers.forEach(System.out::println);

        Solution[] solutions;
        solutions = new Solution[10];
        solutions[0] = new Solution();

        Solution[][] solutions2;
        solutions2 = new Solution[10][];
        solutions2[0] = new Solution[10];
        solutions2[0][0] = new Solution();


        //solutions[8].getDate();


        List<Solution> extremeSolutions = new ArrayList<>();

        extremeSolutions.add(solutions[8]);

        System.out.println(extremeSolutions.get(4).getTitle());
        ;

        printList(extremeSolutions);
        printList(customersList);

       List<Product> products = new ArrayList<>() ;

       Collections.sort(products);
    }

    public static <T> void printList(List<T> objects) {
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i).toString());
        }
    }

    public static void printProductList(
            List<Customer> customerList) {
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i).toString());
        }

    }


}
