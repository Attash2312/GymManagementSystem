public class Member {
    private String memberId;
    private String memberName;
    private int age;
    private String membershipType;
    private double balance;

    public Member(String memberId, String memberName, int age, String membershipType) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.age = age;
        this.membershipType = membershipType;
        this.balance = 0.0;  // Initialize balance to zero
    }

    public String getMemberId()
    {
        return memberId;
    }

    public void setMemberId(String memberId)
    {
        this.memberId = memberId;
    }

    public String getMemberName()
    {
        return memberName;
    }

    public void setMemberName(String memberName)
    {
        this.memberName = memberName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getMembershipType()
    {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Payment of $" + amount + " successfully made. New balance: $" + this.balance);
        } else {
            System.out.println("Invalid payment amount. Please enter a positive value.");
        }
    }

    public void displayMemberInfo() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + memberName);
        System.out.println("Age: " + age);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Balance: $" + balance);
    }

}
