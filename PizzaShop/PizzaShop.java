import java.util.Scanner;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza[] pizzas = new Pizza[2];
        String input;
        String yes = "yes", no = "no";
        double priceWithTaxes = 0.00;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < pizzas.length; i++ ){
            try{
                pizzas[i] = new Pizza();
                System.out.println((i+1) + ": Pizza's name: ");
                pizzas[i].setName(scanner.next());
                System.out.println((i+1) + ": Pizza's price: ");
                pizzas[i].setPrice(scanner.nextDouble());
                System.out.println((i+1) + ": Pizza's size: ");
                pizzas[i].setSize(scanner.next());
                System.out.println((i+1) + ": Would you like any sauce? (Yes/No)");
                scanner.nextLine();
                input = scanner.nextLine();
                if(input.equalsIgnoreCase(yes)){
                    pizzas[i].setSauce(true);
                }else if(input.equalsIgnoreCase(no)){
                    pizzas[i].setSauce(false);
                }
            }
            catch (Exception ex){
                System.out.println("Error");
            }
        }
        scanner.close();
        for (int i = 0; i < pizzas.length; i++) {
            System.out.println((i+1) + pizzas[i].toString());
            double taxesCut = (pizzas[i].getPrice() * 20) / 100;
            priceWithTaxes += pizzas[i].getPrice() + taxesCut;
        }
        System.out.println(priceWithTaxes);
    }
}


