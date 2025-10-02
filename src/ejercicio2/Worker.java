package ejercicio2;

public abstract class Worker {
    private String name;
    private String surname;
    private double hourlyRate;

    public Worker(String name, String surname, double hourlyRate) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public double getHourlyRate() { return hourlyRate; }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

    public double calculateSalary(int hours){
        if (hours < 0 || hours > 176){
            System.err.println("Error: Hours must be between 0 and 176");
        }
        return getHourlyRate() * hours;
    }
    @Override
    public String toString() {
        return "Worker: " + getName() + " " + getSurname() + " (P/h: " + getHourlyRate() + " €)";
    }
}
