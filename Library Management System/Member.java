public class Member {
    private int memberId;
    private String name;
    private String telNo;

    public Member(int memberId, String name, String telNo) {
        this.memberId = memberId;
        this.name = name;
        this.telNo = telNo;
    }

    public void display() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + name);
        System.out.println("Member Tel No: " + telNo);
    }

    public int getMemberId() {
        return memberId;
    }

}