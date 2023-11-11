import java.util.Scanner;

class CreatePerson {
    private Person person;

    public CreatePerson() {
        this.person = getUserData();
    }

    private Person getUserData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        String firstName = getInput(scanner);

        System.out.println("Введите фамилию:");
        String lastName = getInput(scanner);

        System.out.println("Введите адрес:");
        String address = getInput(scanner);

        System.out.println("Введите номер телефона:");
        String phoneNumber = getInput(scanner);

        System.out.println("Введите идентификатор:");
        String id = getInput(scanner);

        return new Person(firstName, lastName, address, phoneNumber, id);
    }

    private String getInput(Scanner scanner) {
        return scanner.nextLine();
    }

    public Person getPerson() {
        return this.person;
    }
}