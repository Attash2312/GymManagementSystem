public class Trainer {
    private String trainerId;
    private String trainerName;
    private int age;
    private String specialization;

    public Trainer(String trainerId, String trainerName, int age, String specialization) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.age = age;
        this.specialization = specialization;
    }

    public String getTrainerId()
    {
        return trainerId;
    }

    public void setTrainerId(String trainerId)
    {
        this.trainerId = trainerId;
    }

    public String getTrainerName()
    {
        return trainerName;
    }

    public void setTrainerName(String trainerName)
    {
        this.trainerName = trainerName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }

    public void createWorkoutPlan(Member member) {
        // Add logic to create a workout plan for the member
        System.out.println("Workout plan created for " + member.getMemberName() + " by Trainer " + trainerName);
    }

    public void displayTrainerInfo() {
        System.out.println("Trainer ID: " + trainerId);
        System.out.println("Trainer Name: " + trainerName);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
    }

}
