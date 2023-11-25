import java.util.Date;
public class Attendance {
    private Member member;
    private Date date;
    private boolean isPresent;

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


}
