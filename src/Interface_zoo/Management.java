package Interface_zoo;

import Abstract_class.Animal;

public interface Management
{
    public void add_amimal(Animal animal);

    public void remove(int index_animal);
    public void get_info_index(int index_animal);
    public void make_sound_index(int index_animal);
    public void get_ifo_all();
    public  void  make_sound_all();
}

