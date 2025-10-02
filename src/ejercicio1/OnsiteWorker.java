package ejercicio1;

public class OnsiteWorker extends Worker {
    private static double fuelAllowance;
    public OnsiteWorker(String firstName, String lastName, double hourlyRate,  double fuelAllowance) {
        super(firstName, lastName,  hourlyRate);
        OnsiteWorker.fuelAllowance = fuelAllowance;
    }
    public double getFuelAllowance() {return fuelAllowance;}
    public void setFuelAllowance(double fuelAllowance) {OnsiteWorker.fuelAllowance = fuelAllowance;}

    @Override
    public double calculateSalary(int hours){
        double salary = 0;
        if (hours >= 0 && hours <= 176){
            salary = super.calculateSalary(hours) + getFuelAllowance();
        }
        else{
            System.err.println("Error: hours must be between 0 and 176");
        }
        return salary;
    }
}

