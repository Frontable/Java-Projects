import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HourlyEmployee[] employees = new HourlyEmployee[2];
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++ ){
            try{
                employees[i] = new HourlyEmployee();
                System.out.println("Name of Intern " + (i+1));
                employees[i].setName(scanner.next());
                System.out.println("Education of the Intern");
                employees[i].setEducation(scanner.next());
                System.out.println("Number  of the Intern");
                employees[i].setNumber(scanner.nextInt());
                System.out.println("Hours worked by the employee");
                employees[i].setWorkedHours(scanner.nextDouble());
                System.out.println("Hourly payment of the employee");
                employees[i].setPaymentPerHour(scanner.nextDouble());
            }
            catch (Exception ex){
                System.out.println("Error");
            }
        }
        scanner.close();
        for (int i = 0; i < employees.length; i++) {
            System.out.println((i+1) + employees[i].toString());
            sum += employees[i].getMonthlyPayment();
        }
        System.out.println(sum);
    }
}
