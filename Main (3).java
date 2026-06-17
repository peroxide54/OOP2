public class Main {
    private String title;
    private String author;
    private int year;
    
    public Main(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Main book1 = new Main("Война и мир", "Лев Толстой", 1869);
        Main book2 = new Main("Преступление и наказание", "Федор Достоевский", 1866);
        
        System.out.println("Книга 1:");
        book1.displayInfo();
        
        System.out.println("Книга 2:");
        book2.displayInfo();
        
        book1.setYear(1873);
        System.out.println("Обновленная информация о книге 1:");
        book1.displayInfo();
    }
}