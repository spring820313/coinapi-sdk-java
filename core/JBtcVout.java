package core;

import java.math.BigInteger;

/**
 * Created by Administrator on 2017/12/29.
 */

public class JBtcVout {
    private String hash;
    private BigInteger value;
    private int n;
    private boolean coinBase;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public boolean isCoinBase() {
        return coinBase;
    }

    public void setCoinBase(boolean coinBase) {
        this.coinBase = coinBase;
    }
}
