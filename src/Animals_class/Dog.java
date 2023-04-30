package Animals_class;

import Abstract_class.Home_animals;

public class Dog extends Home_animals
{
    private Boolean availability_training = false;

    public Dog(Integer animal_growth, Integer animal_weight, String color_animal_eyes, String nickname, String animal_breed,
               Boolean availability_vaccinations, String coat_color, String date_birth, Boolean availability_training)
    {
        super(animal_growth, animal_weight, color_animal_eyes, nickname, animal_breed, availability_vaccinations, coat_color, date_birth);
        this.availability_training = availability_training;
    }

    public void tran()
    {
        this.availability_training = true;
        System.out.println("Дрессировка");
    }

    @Override
    public void get_info() {
        System.out.println(String.format("Рост животного: %d || Вес животного: %d || Цвет глаз животного: %s || Кличка: %s || Порода: %s " +
                        "|| Наличие прививок: %b || Цвет шерсти: %s || Дата рождения: %s || Наличие дрессировки: %b"
                ,animal_growth, animal_weight, color_animal_eyes, nickname, animal_breed,
                availability_vaccinations, coat_color, date_birth, availability_training )+ "  ______  Животное: собака");
    }

    @Override
    public void make_sound()
    {
        System.out.println("Гав-Гав-Гав");
    }

    @Override
    public void show_affection()
    {
        System.out.println("Собака виляет хвостом");
    }
}

