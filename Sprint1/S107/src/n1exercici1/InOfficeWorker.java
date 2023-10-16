package n1exercici1;

public class InOfficeWorker extends Worker{
    private static final int GAS = 100;

    public InOfficeWorker(String name, String lastName, int wageByHour) {
        super(name, lastName, wageByHour);
    }

    @Override
    public int computeWage(int workedHoursMonth){
        return workedHoursMonth * getWageByHour() + GAS;
    }
}
