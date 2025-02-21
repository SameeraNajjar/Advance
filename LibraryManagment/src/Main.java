public class Main {
    public static void main(String[] args) {
        Library library = new Library();


        library.addLibraryItem(new Book("book1", "book1 author", "(2024, 1, 13)", "book1 ", "book1 "));
        library.addLibraryItem(new Magazine("Magazine1", "Magazine1 author", "(2023, 5, 31)", "\"Magazine1.", 10));

        Member member1 = new Member("member1", "1");
        Member member2 = new Member("member2", "S2");
        library.addMember(member1);
        library.addMember(member2);

        System.out.println("\n--- Displaying all members ---");
        library.displayAllMembers();

        System.out.println("\n--- Displaying all items ---");
        library.displayAllItems();
        System.out.println("\n--- Searching and displaying library items ---");
        library.searchItem("book1");
        library.searchItem("Magazine1");
        library.searchItem("Title");
        
        System.out.println("\n--- Borrowing items ---");
        library.borrowLibraryItem("book1");
        System.out.println("\n--- Returning items ---");
        library.returnLibraryItem("book1");

    }
}