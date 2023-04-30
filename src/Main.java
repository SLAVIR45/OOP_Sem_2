import Abstract_class.Animal;
import Abstract_class.Bird;
import Abstract_class.Home_animals;
import Abstract_class.Wild_animal;
import Animals_class.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Home_animals vasy = new Cat(10,20,"Голубые","Вася",
                "Вислоухий",true,"Бурый","20.12.2018",true);
        vasy.get_info();
        vasy.make_sound();
        vasy.show_affection();
        System.out.println("______________________________________________________________________________________");
        Wild_animal tiger = new Tiger(150,200,"Зелёные","Лес","12.06.2022");
        tiger.get_info();
        tiger.make_sound();
        System.out.println("______________________________________________________________________________________");
        Dog bobik = new Dog(20,10,"Серые","Bobik",
                "Овчарка",true,"Оранжево-черный","03.05.2021",false );
        bobik.get_info();
        bobik.tran();
        bobik.get_info();
        bobik.make_sound();
        bobik.show_affection();
        System.out.println("______________________________________________________________________________________");
        Wolf wolf = new Wolf(30,80,"Черные","Лес","18.07.2022",true);
        wolf.make_sound();
        wolf.get_info();
        System.out.println("______________________________________________________________________________________");
        Bird chicken = new Chicken(15,6,"Черные");
        chicken.get_info();
        chicken.make_sound();
        System.out.println("______________________________________________________________________________________");
        Bird stork = new Stork(130,30,"Синие", 1000);
        stork.get_info();
        stork.make_sound();
        stork.fly();
        Zoo zoo = new Zoo(new ArrayList<>());
        zoo.add_amimal(vasy);
        zoo.add_amimal(tiger);
        zoo.add_amimal(bobik);
        zoo.add_amimal(stork);
        zoo.get_info_index(1);
        zoo.make_sound_index(1);
        zoo.make_sound_all();
        zoo.get_ifo_all();
        zoo.remove(1);
        System.out.println("?????????????????????????????????????????????????????????????????????");
        zoo.get_ifo_all();
        Console_users console = new Console_users();
        console.start();


    }
}
