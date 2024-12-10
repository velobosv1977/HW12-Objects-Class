//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author dostoyevskiy = new Author("Фёдор", "Михайлович", "Достоевский");
        Author karamzin = new Author("Николай", "Михайлович", "Карамзин");
        Author gogol = new Author("Николай", "Васильевич", "Гоголь");

        Book idiot = new Book("Идиот", dostoyevskiy, 1870);
        Book idiot2 = new Book("Идиот", dostoyevskiy, 1870);
        Book historyOfRussia = new Book("История государства Российского", karamzin, 1845);
        Book gogolCollectedWork = new Book("Собрание сочинений", gogol, 1842);

        System.out.println(idiot);
        System.out.println(historyOfRussia);
        System.out.println(gogolCollectedWork);

        System.out.println("Сравнение издания <<Идиот>>" + idiot.equals(idiot2));

        idiot.setPublicationData(1956);

        System.out.println("Сравнение издания <<Идиот>>" + idiot.equals(idiot2));
        System.out.println(idiot.getBookName() + "  " + idiot.getPublicationData());

    }
}