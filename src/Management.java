import java.util.Date;

public class Management {
    public static void main(String[] args) {
        // Create a Member
        Member member = new Member("M001","Attash",25,"Premium");

        // Display member information
        member.displayMemberInfo();

        // Process membership payment
        PaymentHandler paymentHandler = new PaymentHandler();
        paymentHandler.processMembershipPayment(member, 50.0);

        // Display updated member information
        member.displayMemberInfo();

        // Create Cardio Equipment
        CardioEquipment cardioEquipment = new CardioEquipment("Treadmill", 5, 1000, "Running", "Treadmill",30,20);

        // Display cardio equipment information
        cardioEquipment.displayCardioEquipmentInfo();

        // Create Weighted Equipment
        WeightedEquipment weightedEquipment = new WeightedEquipment("Dumbbell Set", 10, 50.0, "Free Weights",70, "resistance bands");

        // Display weighted equipment information
        weightedEquipment.displayWeightedEquipmentInfo();

        // Create a Trainer
        Trainer trainer = new Trainer("T001", "Azeem", 30, "Fitness");

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
