package n1exercici2;

import n1exercici1.InOfficeWorker;
import n1exercici1.OnlineWorker;
public class Main {
    @SuppressWarnings("deprecation")
    static void printOnlinePreviousWage(OnlineWorker worker, int workedHours){
        System.out.printf("%s's monthly wage was: %d€\n", worker.getName(),  worker.deprecatedComputeWage(workedHours));
    }
    @SuppressWarnings("deprecation")
    static void printInOfficePreviousWage(InOfficeWorker worker, int workedHours){
        System.out.printf("%s's monthly wage was: %d€\n", worker.getName(),  worker.deprecatedComputeWage(workedHours));
    }
    public static void main(String[] args) {
        OnlineWorker onlineWorker = new OnlineWorker("Francisco", "Martín", 10);
        InOfficeWorker inOfficeWorker = new InOfficeWorker("Lara", "Soto", 10);
        int workedHours = 160;
        System.out.println("Before the gas or internet cost was taken into account");
        printOnlinePreviousWage(onlineWorker, workedHours);
        printInOfficePreviousWage(inOfficeWorker, workedHours);
    }
}
