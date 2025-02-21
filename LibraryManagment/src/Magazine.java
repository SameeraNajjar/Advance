public  class Magazine extends LibraryItem{
    private int edition;
    public Magazine(String title, String author, String publishDate, String summary,int edition) {
        super (title, author, publishDate, summary);
        this.edition = edition;
    }
    @Override
    public void borrowItem() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("The Magazine " + getTitle() + " has been borrowed.");
        } else {
            System.out.println("The Magazine " + getTitle() + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("The Magazine " + getTitle() + " has been returned.");
        } else {
            System.out.println("The Magazine " + getTitle() + " was not borrowed.");
        }
    }
}
