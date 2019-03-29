package core;

import java.math.BigInteger;

/**
 * Created by Administrator on 2018/3/19.
 */

public class JBetItem
{
    public byte getPlayType() {
        return playType;
    }

    public void setPlayType(byte playType) {
        this.playType = playType;
    }

    public byte getBetType() {
        return betType;
    }

    public void setBetType(byte betType) {
        this.betType = betType;
    }

    public BigInteger getMoney() {
        return money;
    }

    public void setMoney(BigInteger money) {
        this.money = money;
    }

    private byte playType;
    private byte betType;
    private BigInteger money;
}
