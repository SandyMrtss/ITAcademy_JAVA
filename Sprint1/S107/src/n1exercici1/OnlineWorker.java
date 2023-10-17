package n1exercici1;

public class OnlineWorker extends Worker {
    private static final int INTERNET = 50;


    public OnlineWorker(String name, String lastName, int wageByHour) {
        super(name, lastName, wageByHour);
    }

    @Override
    public int computeWage(int workedHoursMonth){
        return workedHoursMonth * getWageByHour() + INTERNET;
    }

    @Deprecated
    public int deprecatedComputeWage(int workedHoursMonth){
        return workedHoursMonth * getWageByHour();
    }
}
