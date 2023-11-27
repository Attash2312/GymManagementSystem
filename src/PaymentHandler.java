public class PaymentHandler {
    public boolean processMembershipPayment(Member member, double amount) {

        if (member.getBalance() >= amount) {
            member.setBalance(member.getBalance() - amount);
            System.out.println("Membership payment of $" + amount + " processed for " + member.getMemberName());
            return true;
        } else {
            System.out.println("Insufficient funds for membership payment.");
            return false;
        }
    }

}