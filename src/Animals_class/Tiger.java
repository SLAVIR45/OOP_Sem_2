package Animals_class;

import Abstract_class.Wild_animal;

public class Tiger extends Wild_animal
{
    public Tiger(Integer animal_growth, Integer animal_weight, String color_animal_eyes, String habitat, String date_location) {
        super(animal_growth, animal_weight, color_animal_eyes, habitat, date_location);
    }

    @Override
    public void get_info()
    {
        System.out.println(String.format("Рост животного: %d || Вес животного: %d || Цвет глаз животного: %s || Место обитания: %s || Дата нахождения: %s"
                                        ,animal_growth, animal_weight, color_animal_eyes,habitat,date_location )+ "  ______  Животное: тигр");

    }



    @Override
    public void make_sound()
    {
        System.out.println("Р-р-Р-р-Р");
    }
}
