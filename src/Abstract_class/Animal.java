package Abstract_class;

import Interface_Animal.Get_info;
import Interface_Animal.Make_sound;

public abstract class Animal implements Make_sound, Get_info
{
  protected Integer animal_growth;
   protected Integer animal_weight;
   protected String color_animal_eyes;

    public Animal(Integer animal_growth, Integer animal_weight, String color_animal_eyes) {
        this.animal_growth = animal_growth;
        this.animal_weight = animal_weight;
        this.color_animal_eyes = color_animal_eyes;
    }

    @Override
    public String toString() {
        return String.format("Рост животного: %d || Вес животного: %d || Цвет глаз животного: %s",animal_growth, animal_weight, color_animal_eyes);
    }
}
