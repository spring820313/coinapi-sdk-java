package core.eos;

/**
 * Created by Administrator on 2018/8/28.
 */

public class JTransferAction extends JAction {
    @Override
    public String actionName() { return "transfer";}

    private String contract;
    private String from;
    private String to;
    private JEosAsset amount;
    private byte[] memo;

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

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

    public void setAmount(JEosAsset asset) {
        this.amount = asset;
    }

    public byte[] getMemo() {
        return memo;
    }

    public void setMemo(byte[] memo) {
        this.memo = memo;
    }

}
