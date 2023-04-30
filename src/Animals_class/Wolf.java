package Animals_class;

import Abstract_class.Wild_animal;

public class Wolf extends Wild_animal
{
   private Boolean pack_leader;

    public Wolf(Integer animal_growth, Integer animal_weight, String color_animal_eyes,
                String habitat, String date_location, Boolean pack_leader)
    {
        super(animal_growth, animal_weight, color_animal_eyes, habitat, date_location);
        pack_leader = pack_leader;
    }

    @Override
    public void get_info()
    {
        System.out.println(String.format("Рост животного: %d || Вес животного: %d || Цвет глаз животного: %s " +
                        "|| Место обитания: %s || Дата нахождения: %s || Вожак стаи: %b "
                        ,animal_growth, animal_weight, color_animal_eyes,habitat,date_location, pack_leader )+ "  ______  Животное: волк");
    }

    @Override
    public void make_sound()
    {
        System.out.println("Волк воет");
    }
}
