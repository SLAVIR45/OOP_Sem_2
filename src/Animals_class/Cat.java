package Animals_class;

import Abstract_class.Animal;
import Abstract_class.Home_animals;

public class Cat extends Home_animals
{
    private Boolean have_hair;

    public Cat(Integer animal_growth, Integer animal_weight, String color_animal_eyes, String nickname, String animal_breed,
               Boolean availability_vaccinations, String coat_color, String date_birth, Boolean have_hair)
    {
        super(animal_growth, animal_weight, color_animal_eyes, nickname, animal_breed, availability_vaccinations, coat_color, date_birth);
        this.have_hair = have_hair;
    }

    @Override
    public void get_info()
    {
        System.out.println(String.format("Рост животного: %d || Вес животного: %d || Цвет глаз животного: %s || Кличка: %s || Порода: %s" +
                        "|| Наличие прививок: %b || Цвет шерсти: %s || Дата рождения: %s || Наличие шерсти: %s"
                ,animal_growth, animal_weight, color_animal_eyes, nickname, animal_breed,
                availability_vaccinations, coat_color, date_birth, have_hair)+ "  ______  Животное: кошка");

    }

    @Override
    public void make_sound()
    {
        System.out.println("Кошка издаёт МЯУ-МЯУ");
    }

    @Override
    public void show_affection()
    {
        System.out.println("Кошка мурчит");

    }
}
