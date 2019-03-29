package core;

import java.math.BigInteger;

/**
 * Created by Administrator on 2018/3/19.
 */

public class JSmcBaseTransactionSignParams extends JTransactionSignParams {

    public int getTxType() {
        return txType;
    }

    public void setTxType(int txType) {
        this.txType = txType;
    }

    public int getTxVersion() {
        return txVersion;
    }

    public void setTxVersion(int txVersion) {
        this.txVersion = txVersion;
    }

    public int getValidHeight() {
        return validHeight;
    }

    public void setValidHeight(int validHeight) {
        this.validHeight = validHeight;
    }

    public BigInteger getFees() {
        return fees;
    }

    public void setFees(BigInteger fees) {
        this.fees = fees;
    }

    public JBtSeed getBtSeed() {
        return btSeed;
    }

    public void setBtSeed(JBtSeed btSeed) {
        this.btSeed = btSeed;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String priKey) {
        this.priKey = priKey;
    }

    protected JBtSeed btSeed;
    protected String password;
    protected String priKey;
    protected int txType = Constants.TX_NONE;
    protected int txVersion = 0x01;
    protected int validHeight;
    protected BigInteger fees;
}
