package ejercicio2;

public class OnsiteWorker extends Worker {
    private static double fueAllowance;

    public OnsiteWorker(String name, String surname, double hourlyRate, double fueAllowance) {
        super(name, surname, hourlyRate);
        OnsiteWorker.fueAllowance = fueAllowance;
    }

    public static double getFueAllowance() {
        return fueAllowance;
    }

    public static void setFueAllowance(double fueAllowance) {
        OnsiteWorker.fueAllowance = fueAllowance;
    }
    @Override
    public double calculateSalary(int hours) {
        if (hours < 0 || hours > 176) {
            System.err.println("Error: hours must be between 0 and 176");
            return 0;
        }
        return super.calculateSalary(hours) + getFueAllowance();
    }

    @Deprecated
    public double oldCalculateSalary(int hours) {
        System.out.println("Warning: using old salary calculation");
        return super.calculateSalary(hours);
    }
}
