package Animals_class;

import Abstract_class.Bird;

public class Stork extends Bird
{
    public Stork(Integer animal_growth, Integer animal_weight, String color_animal_eyes,Integer flight_altitude)
    {
        super(animal_growth, animal_weight, color_animal_eyes,flight_altitude);
    }

    @Override
    public void get_info()
    {
        System.out.println(String.format("Рост животного: %d || Вес животного: %d || Цвет глаз животного: %s || Высота полета: %d"
                        ,animal_growth, animal_weight, color_animal_eyes,flight_altitude)+ "  ______  Животное: Аист");
    }

    @Override
    public void make_sound()
    {
        System.out.println("Щелкает клювом");
    }
}
