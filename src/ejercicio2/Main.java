package ejercicio2;

public class Main {
    public static void main(String[] args) {
    OnsiteWorker onsiteWorker = new OnsiteWorker("Joe", "Harris", 24.50, 275.80);
    RemoteWorker remoteWorker = new RemoteWorker("Ana", "Johanssen", 32.45);

    double salary1 = onsiteWorker.calculateSalary(139);
    double salary2 = remoteWorker.calculateSalary(149);

        System.out.println(onsiteWorker + " → Salary: " + salary1 + " €");
        System.out.println(remoteWorker + " → Salary: " + salary2 + " €");

        @SuppressWarnings("deprecated")
    double oldSalary = onsiteWorker.oldCalculateSalary(139);
        remoteWorker.connectWithOldVPN();

        System.out.println("Old calculation (deprecated) for onsite worker: " + oldSalary + " €");
}
}
