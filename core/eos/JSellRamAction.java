package core.eos;

/**
 * Created by Administrator on 2018/8/28.
 */

public class JSellRamAction extends JAction {
    @Override
    public String actionName() { return "sellram";}

    private String from;
    private long bytes;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public long getBytes() {
        return bytes;
    }

    public void setBytes(long bytes) {
        this.bytes = bytes;
    }
}
