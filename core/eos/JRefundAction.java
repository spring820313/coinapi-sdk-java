package core.eos;

/**
 * Created by Administrator on 2018/8/28.
 */

public class JRefundAction extends JAction {
    @Override
    public String actionName() { return "refund";}

    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
