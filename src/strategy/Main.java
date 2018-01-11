package strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println("What delivery you want to send?");
        Scanner scanner = new Scanner(System.in);
        String delivery = scanner.nextLine();

        if (delivery.equals("document")) {
            context.setTransport(new LightCar());
        } else {
            context.setTransport(new Minivan());
        }
        System.out.println("Where you want to send?");
        String address = scanner.nextLine();
        context.perform(address);
        scanner.close();
    }
}
