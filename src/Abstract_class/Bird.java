package Abstract_class;

public abstract class Bird extends Animal
{
    protected Integer flight_altitude;

    public Bird(Integer animal_growth, Integer animal_weight, String color_animal_eyes )
    {
        super(animal_growth, animal_weight, color_animal_eyes);
    }

    protected Bird(Integer animal_growth, Integer animal_weight, String color_animal_eyes, Integer flight_altitude)
    {
        super(animal_growth, animal_weight, color_animal_eyes);
        this.flight_altitude = flight_altitude;
    }

    public void fly()
    {
        System.out.println("Я лечу на " + this.flight_altitude + " метрах");
    }
}
