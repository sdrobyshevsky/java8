public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        PhoneBook PhoneBook = new PhoneBook();
        PhoneBook.addSave("123-11-32", "Иван Иванов", "ул. Ленина, 3");
        PhoneBook.addSave("883-47-21", "Петр Петров", "пр. Мира");
        PhoneBook.addSave("919-41-85", "Николай Николаев", "пер. Славы");
        System.out.println(PhoneBook.allSaves());
    }
}
