package Animals_class;

import Abstract_class.Bird;

public class Chicken extends Bird
{
    public Chicken(Integer animal_growth, Integer animal_weight, String color_animal_eyes)
    {
        super(animal_growth, animal_weight, color_animal_eyes);
    }

    @Override
    public void get_info()
    {
        System.out.println(String.format("Рост животного: %d || Вес животного: %d || Цвет глаз животного: %s"
                ,animal_growth, animal_weight, color_animal_eyes )+ "  ______  Животное: курица");
    }

    @Override
    public void make_sound()
    {
        System.out.println("Кудах-кудах");
    }
}
