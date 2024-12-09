//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author dostoyevskiy = new Author("Фёдор", "Михайлович", "Достоевский");
        Author karamzin = new Author("Николай", "Михайлович", "Карамзин");
        Author gogol = new Author("Николай", "Васильевич", "Гоголь");

        Book idiot = new Book("Идиот", dostoyevskiy, 1870);
        Book historyOfRussia = new Book("История государства Российского", karamzin, 1845);
        Book gogolCollectedWork = new Book("Собрание сочинений", gogol, 1842);

        System.out.println(idiot.getBookName() + "  " + idiot.getPublicationData());
        System.out.println(historyOfRussia.getBookName() + "  " + historyOfRussia.getPublicationData());
        System.out.println(gogolCollectedWork.getBookName() + "  " + gogolCollectedWork.getPublicationData());

        idiot.setPublicationData(1956);
        System.out.println(idiot.getBookName() + "  " + idiot.getPublicationData());

    }
}