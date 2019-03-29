package core;

import java.math.BigInteger;

/**
 * Created by Administrator on 2018/3/14.
 */

public class JQtumTransactionSignParams extends JBtcTransactionSignParams {

    public BigInteger getGasLimit() {
        return gasLimit;
    }

    public void setGasLimit(BigInteger gasLimit) {
        this.gasLimit = gasLimit;
    }

    public BigInteger getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(BigInteger gasPrice) {
        this.gasPrice = gasPrice;
    }

    public BigInteger getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(BigInteger tokenValue) {
        this.tokenValue = tokenValue;
    }

    public String getTokenAddress() {
        return tokenAddress;
    }

    public void setTokenAddress(String tokenAddress) {
        this.tokenAddress = tokenAddress;
    }

    private BigInteger gasLimit;
    private BigInteger gasPrice;
    private BigInteger tokenValue;
    private String tokenAddress;
}
