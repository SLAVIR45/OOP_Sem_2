import Abstract_class.Animal;
import Interface_Animal.Get_info;
import Interface_Animal.Make_sound;
import Interface_zoo.Management;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements Management
{
    private List<Animal> list_animal;

    public Zoo()
    {
        list_animal = new ArrayList<Animal>();
    }

    public Zoo(List<Animal> list_animal)
    {
        this.list_animal = list_animal;
    }

    @Override
    public void add_amimal(Animal animal)
    {
        this.list_animal.add(animal);
    }

    @Override
    public void remove(int index_animal)
    {
        this.list_animal.remove(index_animal - 1);
    }


    @Override
    public void get_info_index(int index_animal)
    {

        this.list_animal.get(index_animal - 1).get_info();
    }


    @Override
    public void make_sound_index(int index_animal)
    {
        this.list_animal.get(index_animal - 1).make_sound();
    }

    @Override
    public void get_ifo_all()
    {
        for (Animal element: this.list_animal)
        {
            element.get_info();
            System.out.println("_________________________________________________________________");
        }
    }


    @Override
    public  void  make_sound_all()
    {
        for (Animal element: this.list_animal)
        {
            element.make_sound();
        }
    }


}




