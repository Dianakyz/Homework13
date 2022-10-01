public class Main {
    public static void main(String[] args) {
        Author chuckPalahniuk = new Author("Чак", "Паланик");
        Author garciaMarquez = new Author("Гарсия", "Маркес");
        Book fightClub = new Book("Бойцовский клуб", chuckPalahniuk, 1996);
        Book oneHundredYearsOfSolitude = new Book("Сто лет одиночества", garciaMarquez, 1967);
        System.out.println(fightClub.bookInfo());
        oneHundredYearsOfSolitude.setPublicationYear(2012);
        System.out.println(oneHundredYearsOfSolitude.bookInfo());
    }
}