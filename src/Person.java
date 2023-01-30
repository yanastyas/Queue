public class Person {
    protected String name;
    protected String surname;
    protected int ticket;

    protected Person(String name, String surname, int ticket) {
        this.name = name;
        this.surname = surname;
        this.ticket = ticket;
    }

    protected Person(String name, String surname) {
        this(name, surname, 0);
    }

    public void ticketUse() {
        ticket--;
    }

    public boolean ticketHave() {
        return ticket > 0;
    }
}