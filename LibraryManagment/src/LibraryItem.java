
public abstract class LibraryItem {
    private String title;
    private String author;
    private String publishDate;
    private String summary;
    private boolean isBorrowed=false;


    public LibraryItem(String title, String author, String publishDate, String summary) {
        this.title= title;
        this.author= author;
        this.publishDate=publishDate;
        this.summary=summary;
    }

    public abstract void borrowItem();
    public abstract void returnItem();

    public void displayStatus(){
        System.out.println("Title: " + title + ", Author: " + author + ", Borrowed: " + isBorrowed); }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getSummary() {
        return summary;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed =isBorrowed;
    }
}
