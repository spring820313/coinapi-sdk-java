package core;

import java.math.BigInteger;

/**
 * Created by Administrator on 2018/3/19.
 */

public class JSmcCommonTxParams extends JSmcBaseTransactionSignParams {

    public JSmcCommonTxParams() {
        this.txType = Constants.TX_WICC_COMMON;
        this.txVersion = 1;
    }

    public String getSrcRegId() {
        return srcRegId;
    }

    public void setSrcRegId(String srcRegId) {
        this.srcRegId = srcRegId;
    }

    public String getDestAddr() {
        return destAddr;
    }

    public void setDestAddr(String destAddr) {
        this.destAddr = destAddr;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    private String srcRegId;
    private String destAddr;
    private BigInteger value;
}
