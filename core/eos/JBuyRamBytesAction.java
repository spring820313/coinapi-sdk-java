package core.eos;

/**
 * Created by Administrator on 2018/8/28.
 */

public class JBuyRamBytesAction extends JAction {
    @Override
    public String actionName() { return "buyrambytes";}

    private String from;
    private String to;
    private int bytes;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

}
