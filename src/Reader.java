public class Reader {
    String name;
    int number;
    String ph;
    double birth;
    long phoneNumber;
    public void takeBook(Book book){
        System.out.println("Взял(а) книгу: ");
        book.bookInfo();
    }
    public String returnBook(){
        return name+ " вернул(а) книгу";
    }
    public void vyvod(){
        System.out.println("имя: "+ name + " дата рождения: " + birth + " номер телефона: " + phoneNumber
                + " номер в списке: "
                + number + " факультет: "+ ph);
    }
}
