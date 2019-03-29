package core;

/**
 * Created by Administrator on 2018/9/12.
 */

public class JOmniTransactionSignParams extends JBtcTransactionSignParams{
    private int height;
    private long minRelayTxFee;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long getMinRelayTxFee() {
        return minRelayTxFee;
    }

    public void setMinRelayTxFee(long minRelayTxFee) {
        this.minRelayTxFee = minRelayTxFee;
    }
}
