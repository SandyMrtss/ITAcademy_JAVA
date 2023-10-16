package n1exercici1;

public class Worker {
    private String name;
    private String lastName;
    private int wageByHour;

    public Worker(String name, String lastName, int wageByHour) {
        this.name = name;
        this.lastName = lastName;
        this.wageByHour = wageByHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWageByHour() {
        return wageByHour;
    }

    public void setWageByHour(int wageByHour) {
        this.wageByHour = wageByHour;
    }

    public int computeWage(int workedHours){
        return workedHours * this.wageByHour;
    }

}
