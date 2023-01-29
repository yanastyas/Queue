public class Person {
    String name;
    String surname;
    public int ticket;

    public Person(String name, String surname, int ticket) {
        this.name = name;
        this.surname = surname;
        this.ticket = ticket;
    }

    public Person(String name, String surname) {
        this(name, surname, 0);
    }

    public void ticketUse() {
        ticket--;
    }

    public boolean ticketHave() {
        return ticket > 0;
    }
}