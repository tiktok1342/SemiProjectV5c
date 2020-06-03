package yang.spring.mvc.vo;

public class ReplyVO {

    private String rno;
    private String relpy;
    private String userid;
    private String regdate;
    private String thunbup;
    private String bno;
    private String refno;

    public ReplyVO() {
    }

    public ReplyVO(String rno, String relpy, String userid, String regdate, String thunbup, String bno, String refno) {
        this.rno = rno;
        this.relpy = relpy;
        this.userid = userid;
        this.regdate = regdate;
        this.thunbup = thunbup;
        this.bno = bno;
        this.refno = refno;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public String getRelpy() {
        return relpy;
    }

    public void setRelpy(String relpy) {
        this.relpy = relpy;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getThunbup() {
        return thunbup;
    }

    public void setThunbup(String thunbup) {
        this.thunbup = thunbup;
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno;
    }

    public String getRefno() {
        return refno;
    }

    public void setRefno(String refno) {
        this.refno = refno;
    }
};