import java.util.ArrayList;

public class Library {

    private ArrayList<LibraryItem> items;
    private ArrayList<Member> members;
    public Library() {
        items = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addLibraryItem(LibraryItem item) {
        items.add(item);
    }

    public void borrowLibraryItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.borrowItem();
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void returnLibraryItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.returnItem();
                return;
            }
        }
    }
    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayStatus();
            System.out.println("__________________________________________________________");
        }
    }
    public LibraryItem searchItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Item found:");
                return item;
            }
        }
        return null;
    }
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member " + member.getMemberName() + " has been added.");
    }


    public void displayAllMembers() {
        if (members.isEmpty()) {
            System.out.println("No members in the library.");
        } else {
            for (Member member : members) {
                member.displayMemberInfo();
                System.out.println();
            }
        }
    }

}


