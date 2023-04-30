import Abstract_class.Animal;
import Animals_class.*;
import Interface_zoo.Management;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Console
{

    private Zoo zoo = new Zoo();
    protected HashMap<Integer, String> animal_map_list;
    protected HashMap<Integer, String> comand_map_list;

    protected HashMap<Integer, String> getAnimal_map_list() {
        animal_map_list = new HashMap<>();
        this.animal_map_list.put(1, "Кошка");
        this.animal_map_list.put(2, "Тигр");
        this.animal_map_list.put(3, "Собака");
        this.animal_map_list.put(4, "Волк");
        this.animal_map_list.put(5, "Курица");
        this.animal_map_list.put(6, "Аист");
        return animal_map_list;
    }

    protected HashMap<Integer, String> getComand_map_list() {
        comand_map_list = new HashMap<>();
        this.comand_map_list.put(1, "Добавлять новых животных в зоопарк");
        this.comand_map_list.put(2, "Убрать животное из зоопарка");
        this.comand_map_list.put(3, "Печатать информацию о конкретном животном");
        this.comand_map_list.put(4, "Печатать информацию о всех животных в зоопарке на данный момент");
        this.comand_map_list.put(5, "Заставить животное издавать звук");
        this.comand_map_list.put(6, "Заставлять издавать звук всех животных");
        return comand_map_list;
    }

    protected void show_HashMap(HashMap<Integer, String> map)
    {
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }


    protected void action (int number)
    {
        switch (number)
        {
            case 1:
                add_amimal();
                break;
            case 2:
                remove();
                break;
            case 3:
                get_info_index();
                break;
            case 4:
                get_ifo_all();
                break;
            case 5:
                make_sound_index();
                break;
            case 6:
                make_sound_all();
                break;

        }
    }




        public void add_amimal ()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Какое животное хотите добавить?");
            show_HashMap(getAnimal_map_list());
            int value = scanner.nextInt();
            switch (value)
            {
                case 1:
                    System.out.println("Введите рост животного");
                    Integer animal_growth = scanner.nextInt();
                    System.out.println("Введите вес животного");
                    Integer animal_weight = scanner.nextInt();
                    System.out.println("Введите цвет глаз животного");
                    String color_animal_eyes = scanner.next();
                    System.out.println("Введите кличку животного");
                    String nickname = scanner.next();
                    System.out.println("Введите породу животного");
                    String animal_breed = scanner.next();
                    System.out.println("Введите наличие вакцинации животного: true или false");
                    Boolean availability_vaccinations = scanner.nextBoolean();
                    System.out.println("Введите цвет шерсти животного");
                    String coat_color = scanner.next();
                    System.out.println("Введите дату рождения животного");
                    String date_birth = scanner.next();
                    System.out.println("Введите наличие шерсти у животного: true или false");
                    Boolean have_hair = scanner.nextBoolean();
                    this.zoo.add_amimal(new Cat(animal_growth,animal_weight,color_animal_eyes,nickname,animal_breed,availability_vaccinations,coat_color,date_birth,have_hair));
                    break;
                case  2:
                    System.out.println("Введите рост животного");
                    animal_growth = scanner.nextInt();
                    System.out.println("Введите вес животного");
                    animal_weight = scanner.nextInt();
                    System.out.println("Введите цвет глаз животного");
                    color_animal_eyes = scanner.next();
                    System.out.println("Введите место обитания животного");
                    String habitat = scanner.next();
                    System.out.println("Введите дату нахождения животного");
                    String date_location = scanner.next();
                    this.zoo.add_amimal(new Tiger(animal_growth,animal_weight,color_animal_eyes,habitat,date_location));
                    break;
                case  3:
                    System.out.println("Введите рост животного");
                    animal_growth = scanner.nextInt();
                    System.out.println("Введите вес животного");
                    animal_weight = scanner.nextInt();
                    System.out.println("Введите цвет глаз животного");
                    color_animal_eyes = scanner.next();
                    System.out.println("Введите кличку животного");
                    nickname = scanner.next();
                    System.out.println("Введите породу животного");
                    animal_breed = scanner.next();
                    System.out.println("Введите наличие вакцинации животного: true или false");
                    availability_vaccinations = scanner.nextBoolean();
                    System.out.println("Введите цвет шерсти животного");
                    coat_color = scanner.next();
                    System.out.println("Введите дату рождения животного");
                    date_birth = scanner.next();
                    System.out.println("Введите наличие дрессировки животного: true или false");
                    Boolean availability_training = scanner.nextBoolean();
                    this.zoo.add_amimal(new Dog(animal_growth,animal_weight,color_animal_eyes,nickname,animal_breed,availability_vaccinations,coat_color,date_birth,availability_training));
                    break;
                case  4:
                    System.out.println("Введите рост животного");
                    animal_growth = scanner.nextInt();
                    System.out.println("Введите вес животного");
                    animal_weight = scanner.nextInt();
                    System.out.println("Введите цвет глаз животного");
                    color_animal_eyes = scanner.next();
                    System.out.println("Введите место обитания животного");
                    habitat = scanner.next();
                    System.out.println("Введите дату нахождения животного");
                    date_location = scanner.next();
                    System.out.println("Введите вожак ли животное: true или false");
                    Boolean pack_leader = scanner.nextBoolean();
                    this.zoo.add_amimal(new Wolf(animal_growth,animal_weight,color_animal_eyes,habitat,date_location,pack_leader));
                    break;
                case 5:
                    System.out.println("Введите рост животного");
                    animal_growth = scanner.nextInt();
                    System.out.println("Введите вес животного");
                    animal_weight = scanner.nextInt();
                    System.out.println("Введите цвет глаз животного");
                    color_animal_eyes = scanner.next();
                    this.zoo.add_amimal(new Chicken(animal_growth,animal_weight,color_animal_eyes));
                    break;
                case 6:
                    System.out.println("Введите рост животного");
                    animal_growth = scanner.nextInt();
                    System.out.println("Введите вес животного");
                    animal_weight = scanner.nextInt();
                    System.out.println("Введите цвет глаз животного");
                    color_animal_eyes = scanner.next();
                    System.out.println("Введите высоту полета животного");
                    Integer flight_altitude = scanner.nextInt();
                    this.zoo.add_amimal(new Stork(animal_growth,animal_weight,color_animal_eyes,flight_altitude));
                    break;







            }
        }


        public void remove ( )
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите индекс животного которое нужно удалить");
            int value = scanner.nextInt();
            this.zoo.remove(value);
        }


        public void get_info_index ( )
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите индекс животного о котором показать информацию");
            int value = scanner.nextInt();
            this.zoo.get_info_index(value);
        }


        public void get_ifo_all ()
        {
            this.zoo.get_ifo_all();
        }


        public void make_sound_all ()
        {
            this.zoo.make_sound_all();
        }
        public void make_sound_index()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите индекс животного который должен издать звук");
            int value = scanner.nextInt();
            this.zoo.make_sound_index(value);
        }
    }

