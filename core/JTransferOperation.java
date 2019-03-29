package core;

/**
 * Created by Administrator on 2018/7/10.
 */


public class JTransferOperation extends JBaseOperation {
    public JTransferOperation() {
        operType = TRANSFER_OPERATION;
    }

    private String from;
    private String to;
    private JAssetAmount amount;
    private JAssetAmount fee;
    private JMemoData memoData;

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

    public JAssetAmount getAmount() {
        return amount;
    }

    public void setAmount(JAssetAmount amount) {
        this.amount = amount;
    }

    public JAssetAmount getFee() {
        return fee;
    }

    public void setFee(JAssetAmount fee) {
        this.fee = fee;
    }

    public JMemoData getMemoData() {
        return memoData;
    }

    public void setMemoData(JMemoData memoData) {
        this.memoData = memoData;
    }

}
