package ejercicio1;

public class RemoteWorker extends Worker {
    public static final double internetFee = 27.50;

    public RemoteWorker( String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName,hourlyRate);
    }
    @Override
    public double calculateSalary(int hours) {
        if ((hours < 0) || (hours > 176)) {
            throw new IllegalArgumentException("Error: hours must be between 0 and 176");
        }
        return super.calculateSalary(hours) + internetFee;
    }
}
