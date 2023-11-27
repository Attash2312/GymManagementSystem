import java.util.Date;

public class Management {
    public static void main(String[] args) {
        // Create a Member
        Member member = new Member();
        member.setMemberId("M001");
        member.setMemberName("John Doe");
        member.setAge(25);
        member.setMembershipType("Premium");

        // Display member information
        member.displayMemberInfo();

        // Process membership payment
        PaymentHandler paymentHandler = new PaymentHandler();
        paymentHandler.processMembershipPayment(member, 50.0);

        // Display updated member information
        member.displayMemberInfo();

        // Create Cardio Equipment
        CardioEquipment cardioEquipment = new CardioEquipment("Treadmill", 5, "Running", 10, 3);

        // Display cardio equipment information
        cardioEquipment.displayCardioEquipmentInfo();

        // Create Weighted Equipment
        WeightedEquipment weightedEquipment = new WeightedEquipment("Dumbbell Set", 10, 50.0, "Free Weights");

        // Display weighted equipment information
        weightedEquipment.displayWeightedEquipmentInfo();

        // Create a Trainer
        Trainer trainer = new Trainer("T001", "Jane Smith", 30, "Fitness");

        // Display trainer information
        trainer.displayTrainerInfo();

        // Create Attendance
        Attendance attendance = new Attendance(member, new Date(), true);

        // Display attendance information
        attendance.displayAttendanceInfo();

        // Mark attendance
        attendance.markAttendance();
        attendance.displayAttendanceInfo();

        // Create Workout Plan
        trainer.createWorkoutPlan(member);
    }
}
