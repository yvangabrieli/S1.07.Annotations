package ejercicio1;

public class RemoteWorker extends Worker {
    public static final double internetFee = 27.50;

    public RemoteWorker( String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName,hourlyRate);
    }
    @Override
    public double calculateSalary(int hours) {
        double salary;
        if (hours >= 0 && hours <= 176){
            salary = super.calculateSalary(hours) + internetFee;
        } else {
            salary = 0;
            System.err.println("Error: hours must be between 0 and 176");
        }
        return salary;
    }
}
