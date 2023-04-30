import java.util.Scanner;

public class Console_users extends Console
{
    public  void start()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирите действие");
        System.out.println("Выйти, введите -1");
        show_HashMap(getComand_map_list());
        int value = scanner.nextInt();
        while (value != -1)
        {
            action(value);
            System.out.println("Выбирите действие");
            System.out.println("Выйти, введите -1");
            show_HashMap(getComand_map_list());
            value = scanner.nextInt();
        }
    }
}
