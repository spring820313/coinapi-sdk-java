package core.xrp;

import java.math.BigInteger;

import core.JBtSeed;
import core.JTransactionSignParams;

/**
 * Created by Administrator on 2019/1/5.
 */

public class JXrpTransactionSignParams extends JTransactionSignParams {
    public JBtSeed getBtSeed() {
        return btSeed;
    }

    public void setBtSeed(JBtSeed btSeed) {
        this.btSeed = btSeed;
    }

    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String priKey) {
        this.priKey = priKey;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    public BigInteger getFees() {
        return fees;
    }

    public void setFees(BigInteger fees) {
        this.fees = fees;
    }

    public int getDestinationTag() {
        return destinationTag;
    }

    public void setDestinationTag(int destinationTag) {
        this.destinationTag = destinationTag;
    }

    public byte[] getMemo() {
        return memo;
    }

    public void setMemo(byte[] memo) {
        this.memo = memo;
    }

    private JBtSeed btSeed = null;
    private String priKey;
    private String password;
    private String from;
    private String to;
    private int sequence;
    private BigInteger value;
    private BigInteger fees;
    private int destinationTag;
    private byte[] memo = null;
}
