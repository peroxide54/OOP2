import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        
        tasks.add("Купить продукты");
        tasks.add("Сделать домашнее задание");
        tasks.add("Позвонить родителям");
        
        System.out.println("Список задач:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.println();
        
        tasks.remove(1);
        
        System.out.println("После удаления второй задачи:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.println();
        
        String searchTask = "Сделать домашнее задание";
        if (tasks.contains(searchTask)) {
            System.out.println("Задача \"" + searchTask + "\" найдена");
        } else {
            System.out.println("Задача \"" + searchTask + "\" не найдена");
        }
        System.out.println();
        
        Collections.sort(tasks);
        
        System.out.println("Отсортированный список:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}