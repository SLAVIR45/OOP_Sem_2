package Abstract_class;

import Abstract_class.Animal;
import Interface_Animal.Get_info;
import Interface_Animal.Make_sound;

public abstract class Wild_animal extends Animal implements Make_sound, Get_info
{
    protected String habitat;
    protected String date_location;

    public Wild_animal(Integer animal_growth, Integer animal_weight, String color_animal_eyes, String habitat, String date_location) {
        super(animal_growth, animal_weight, color_animal_eyes);
        this.habitat = habitat;
        this.date_location = date_location;
    }
}
