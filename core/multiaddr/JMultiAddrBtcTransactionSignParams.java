package core.multiaddr;

import java.math.BigInteger;
import java.util.List;

import core.Constants;

/**
 * Created by Administrator on 2018/9/17.
 */

public class JMultiAddrBtcTransactionSignParams {
    private String changeAddress;
    private BigInteger feePerKb;
    private List<JMultiAddrBtcVout> multiBtcvoutFormList;
    private List<JMultiAddrOutput> multiOutputList;
    private boolean recipientsPayFees = false;
    private byte[] data;
    private int txType = Constants.TX_NONE;

    public String getChangeAddress() {
        return changeAddress;
    }

    public void setChangeAddress(String changeAddress) {
        this.changeAddress = changeAddress;
    }

    public BigInteger getFeePerKb() {
        return feePerKb;
    }

    public void setFeePerKb(BigInteger feePerKb) {
        this.feePerKb = feePerKb;
    }

    public List<JMultiAddrBtcVout> getMultiBtcvoutFormList() {
        return multiBtcvoutFormList;
    }

    public void setMultiBtcvoutFormList(List<JMultiAddrBtcVout> multiBtcvoutFormList) {
        this.multiBtcvoutFormList = multiBtcvoutFormList;
    }

    public List<JMultiAddrOutput> getMultiOutputList() {
        return multiOutputList;
    }

    public void setMultiOutputList(List<JMultiAddrOutput> multiOutputList) {
        this.multiOutputList = multiOutputList;
    }

    public boolean isRecipientsPayFees() {
        return recipientsPayFees;
    }

    public void setRecipientsPayFees(boolean recipientsPayFees) {
        this.recipientsPayFees = recipientsPayFees;
    }

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
}
