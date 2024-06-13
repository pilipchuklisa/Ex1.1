import java.time.Period;

public class Driver extends Person{
    private Period drivingExperience;

    public Driver(String fullName, int getDrivingExperienceYear, int getDrivingExperienceMonth) {
        super(fullName);
        this.drivingExperience = Period.of(getDrivingExperienceYear, getDrivingExperienceMonth, 0);
    }

    public Period getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return "Имя водителя: " + this.getFullName() +
                ", Стаж вождения: " + drivingExperience.getYears() + " лет, " +
                drivingExperience.getMonths() + " месяцев";
    }
}
