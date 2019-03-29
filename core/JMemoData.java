package core;

/**
 * Created by Administrator on 2018/7/10.
 */

public class JMemoData {
    private String priKey;
    private String toMemoPubkey;
    private String memo;

    public String getToMemoPubkey() {
        return toMemoPubkey;
    }

    public void setToMemoPubkey(String toMemoPubkey) {
        this.toMemoPubkey = toMemoPubkey;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String priKey) {
        this.priKey = priKey;
    }

}
