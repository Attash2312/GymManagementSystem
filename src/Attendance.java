import java.text.SimpleDateFormat;
import java.util.Date;
public class Attendance {
    private Member member;
    private Date date;
    private boolean isPresent;

    public Attendance(Member member, Date date, boolean isPresent) {
        this.member = member;
        this.date = date;
        this.isPresent = isPresent;
    }

    public Attendance() {
    }

    public Member getMember()
    {
        return member;
    }

    public void setMember(Member member)
    {
        this.member = member;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public boolean isPresent()
    {
        return isPresent;
    }

    public void setPresent(boolean present)
    {
        isPresent = present;
    }

    public void markAttendance() {
        this.isPresent = true;
        System.out.println(member.getMemberName() + " marked present on " + formatDate(date));
    }

    public void displayAttendanceInfo() {
        System.out.println("Member: " + member.getMemberName());
        System.out.println("Date: " + formatDate(date));
        System.out.println("Status: " + (isPresent ? "Present" : "Absent"));
    }

    private String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }

}
