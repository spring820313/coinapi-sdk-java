package core.eos;

/**
 * Created by Administrator on 2018/8/28.
 */

public class JBuyRamAction extends JAction{
    @Override
    public String actionName() { return "buyram";}

    private String from;
    private String to;
    private JEosAsset amount;

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

    public JEosAsset getAmount() {
        return amount;
    }

    public void setAmount(JEosAsset amount) {
        this.amount = amount;
    }

}
