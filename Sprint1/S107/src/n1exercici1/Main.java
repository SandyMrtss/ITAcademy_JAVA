package n1exercici1;

public class Main {
    public static void main(String[] args) {
        Worker unspecifiedWorker = new Worker("Juan", "García", 10);
        OnlineWorker onlineWorker = new OnlineWorker("Francisco", "Martín", 10);
        InOfficeWorker inOfficeWorker = new InOfficeWorker("Lara", "Soto", 10);
        int workedHours = 160;
        System.out.printf("All workers have worked %d hours\n", workedHours);
        System.out.printf("%s's monthly wage is: %d€\n", unspecifiedWorker.getName(), unspecifiedWorker.computeWage(workedHours));
        System.out.printf("%s's monthly wage is: %d€\n", onlineWorker.getName(), onlineWorker.computeWage(workedHours));
        System.out.printf("%s's monthly wage is: %d€\n", inOfficeWorker.getName(), inOfficeWorker.computeWage(workedHours));
    }
}
