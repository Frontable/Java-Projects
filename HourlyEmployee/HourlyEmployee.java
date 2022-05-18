public class HourlyEmployee extends Person{
    private double workedHours, paymentPerHour, monthlyPayment;
    public double getWorkedHours(){
        return workedHours;
    }
    public void setWorkedHours(double workedHours){
        this.workedHours = workedHours;
    }
    public double getPaymentPerHour(){
        return paymentPerHour;
    }
    public void setPaymentPerHour(double paymentPerHour){
        this.paymentPerHour = paymentPerHour;
    }
    public double getMonthlyPayment(){
        return monthlyPayment = workedHours*paymentPerHour;
    }
    public void setMonthlyPayment(double monthlyPayment){
        this.monthlyPayment = monthlyPayment;
    }

    public HourlyEmployee(String name, String education, int number, double workedHours, double paymentPerHour){
        super(name, education, number);
        this.workedHours = workedHours;
        this.paymentPerHour = paymentPerHour;
    }
    public HourlyEmployee(){
        super();
    }
    public String toString(){
        return "Intern " + super.toString()+ "worked " + this.workedHours + " hourly payment " + this.paymentPerHour + " monthly" + this.monthlyPayment;
    }
}
