import java.util.*;

public class Main {

    public static List<Person> generateClients() {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Алена", "Панченко", 1));
        person.add(new Person("Радион", "Лизаркин", 1));
        person.add(new Person("Илья", "Конник", 5));
        person.add(new Person("Николай", "Бабкин", 2));
        person.add(new Person("Галина", "Виноградская", 2));
        person.add(new Person("Камила", "Адуева", 0));
        return person;

    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать на аттракцион - ПРЫЖОК С ПАРАШЮТОМ!");
        System.out.println();
        List<Person> clients = generateClients();
        Queue<Person> queue = new LinkedList<>();
        for (Person p : clients) {
            queue.offer(p);
        }
        do {
            Person client = queue.poll();
            System.out.println(client.name + " " + client.surname + " осталось ПРЫЖКОВ С ПАРАШЮТОМ - " + client.ticket);
            client.ticketUse();
            if (client.ticketHave()) {
                queue.offer(client);
            }
        } while (queue.size() != 0);
    }
}
