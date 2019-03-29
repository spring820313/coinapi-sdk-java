package core;

/**
 * Created by Administrator on 2018/9/25.
 */

public class JHdKeys {
    private String symbol;
    private int coinType = -1;
    private String hdMasterPriKey;
    private String hdMasterPubKey;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getCoinType() {
        return coinType;
    }

    public void setCoinType(int coinType) {
        this.coinType = coinType;
    }

    public String getHdMasterPriKey() {
        return hdMasterPriKey;
    }

    public void setHdMasterPriKey(String hdMasterPriKey) {
        this.hdMasterPriKey = hdMasterPriKey;
    }

    public String getHdMasterPubKey() {
        return hdMasterPubKey;
    }

    public void setHdMasterPubKey(String hdMasterPubKey) {
        this.hdMasterPubKey = hdMasterPubKey;
    }
}
