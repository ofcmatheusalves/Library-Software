package entitis;

public class Books {

    public String title;
    public String author;
    public int date;


    public void addTitle(String title){
        this.title += title;
    }

    public void addAuthor(String author){
        this.author += author;
    }

    public void addDate (int date){
        this.date += date;
    }
}
