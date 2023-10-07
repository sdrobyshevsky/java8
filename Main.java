public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        PhoneBook addressBook = new PhoneBook();
        addressBook.addSave("123-11-32", "Иван Иванов", "ул. Ленина, 3");
        addressBook.addSave("883-47-21", "Петр Петров", "пр. Мира");
        addressBook.addSave("919-41-85", "Николай Николаев", "пер. Славы");
        System.out.println(addressBook.allSaves());
    }
}