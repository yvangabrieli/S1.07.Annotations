package ejercicio2;

public class RemoteWorker extends Worker{
    public static final double INTERNET_FEE = 27.50;

    public RemoteWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hours) {
        if (hours < 0 || hours > 176) {
            System.err.println("Error: hours must be between 0 and 176");
            return 0;
        }
        return super.calculateSalary(hours) + INTERNET_FEE;
    }

    @Deprecated
    public void connectWithOldVPN() {
        System.out.println("Warning: connecting with deprecated VPN method");
    }
}

