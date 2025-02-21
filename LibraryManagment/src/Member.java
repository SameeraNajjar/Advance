public class Member {
    private String memberName;
    private String memberID;
    public Member(String memberName, String memberID) {
        this.memberName = memberName;
        this.memberID = memberID;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getMemberID() {
        return memberID;
    }
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
    public void displayMemberInfo() {
        System.out.println(" Name: " + memberName);
        System.out.println("Membership ID: " + memberID);
    }
}
