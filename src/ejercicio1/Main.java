package ejercicio1;

public class Main {
    public static void main(String[] args) {
        OnsiteWorker onsiteWorker = new OnsiteWorker("Joe", "Harris", 24.50, 275.80);
        RemoteWorker remoteWorker = new RemoteWorker("Ana", "Johnassen", 32.45);
        double salary = onsiteWorker.calculateSalary(149);
        double salary2 = remoteWorker.calculateSalary(150);
        System.out.println(onsiteWorker + "\n The salary is: " + salary + " Euros.");
        System.out.println(remoteWorker + "\n The salary is: " + salary2 + " Euros.");

    }
}