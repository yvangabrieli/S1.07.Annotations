package ejercicio1;

public abstract class Worker {
    private String firstName;
    private String lastName;
    private double hourlyRate;

    public Worker(String firstName, String lastName, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
    }
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public double getHourlyRate() {return hourlyRate;}

    public double calculateSalary (int hours) {
        double salary = 0;
        if (hours >= 0 && hours <= 176) {
            salary = hours * hourlyRate;
        } else {
            System.err.println("Error: hours must be between 0 and 176");
        }
        return salary;
    }

    @Override
    public String toString() {
        return "Worker: " + getFirstName() + " " + getLastName() + " (P/h: " + getHourlyRate() + " €)";
    }
}
