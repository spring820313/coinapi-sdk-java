package core.mc;

import java.math.BigInteger;

import core.JEthTransactionSignParams;

/**
 * Created by Administrator on 2019/1/8.
 */

public class JMcTransactionSignParams extends JEthTransactionSignParams {
    private String via = "";
    private BigInteger systemContract = new BigInteger("0");
    private BigInteger shardingFlag = new BigInteger("0");
    private int chainId = 100;

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public BigInteger getSystemContract() {
        return systemContract;
    }

    public void setSystemContract(BigInteger systemContract) {
        this.systemContract = systemContract;
    }

    public BigInteger getShardingFlag() {
        return shardingFlag;
    }

    public void setShardingFlag(BigInteger shardingFlag) {
        this.shardingFlag = shardingFlag;
    }

    public int getChainId() {
        return chainId;
    }

    public void setChainId(int chainId) {
        this.chainId = chainId;
    }

}
