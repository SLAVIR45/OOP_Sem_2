package Abstract_class;

import Abstract_class.Animal;
import Interface_Animal.Get_info;
import Interface_Animal.Make_sound;
import Interface_home_animal.Show_affection;

public abstract class Home_animals extends Animal implements Make_sound, Get_info, Show_affection
{
    protected String nickname;
    protected String animal_breed;
    protected Boolean availability_vaccinations;
    protected String coat_color;
    protected String date_birth;

    public Home_animals(Integer animal_growth, Integer animal_weight, String color_animal_eyes, String nickname, String animal_breed, Boolean availability_vaccinations, String coat_color, String date_birth)
    {
        super(animal_growth, animal_weight, color_animal_eyes);
        this.nickname = nickname;
        this.animal_breed = animal_breed;
        this.availability_vaccinations = availability_vaccinations;
        this.coat_color = coat_color;
        this.date_birth = date_birth;
    }

}
