package core;


import java.math.BigInteger;
import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */

public class JBtcTransactionSignParams extends JTransactionSignParams {

    private JBtSeed btSeed;
    private String fromAddress;
    private String sendAddress;
    private BigInteger sendValue;
    private BigInteger feePerKb;
    private String password;
    private String priKey;
    private List<JBtcVout> btcvoutFormList;
    private boolean recipientsPayFees = false;

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public int getTxType() {
        return txType;
    }

    public void setTxType(int txType) {
        this.txType = txType;
    }

    private byte[] data;
    private int txType = Constants.TX_NONE;

    public JBtSeed getBtSeed() {
        return btSeed;
    }

    public void setBtSeed(JBtSeed btSeed) {
        this.btSeed = btSeed;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }

    public BigInteger getSendValue() {
        return sendValue;
    }

    public void setSendValue(BigInteger sendValue) {
        this.sendValue = sendValue;
    }

    public BigInteger getFeePerKb() {
        return feePerKb;
    }

    public void setFeePerKb(BigInteger feePerKb) {
        this.feePerKb = feePerKb;
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

    public List<JBtcVout> getBtcvoutFormList() {
        return btcvoutFormList;
    }

    public void setBtcvoutFormList(List<JBtcVout> btcvoutFormList) {
        this.btcvoutFormList = btcvoutFormList;
    }

    public boolean getRecipientsPayFees() {
        return recipientsPayFees;
    }

    public void setRecipientsPayFees(boolean recipientsPayFees) {
        this.recipientsPayFees = recipientsPayFees;
    }
}
