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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double calculateSalary(int hours) {
        if (hours < 0 || hours > 176) {
            throw new IllegalArgumentException(" Hours must be between 0 and 176");
        }
        return hours * hourlyRate;
    }

    @Override
    public String toString() {
        return "Worker: " + getFirstName() + " " + getLastName() + " (P/h: " + getHourlyRate() + " €)";
    }
}
