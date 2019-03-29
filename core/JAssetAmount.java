package core;

import java.math.BigInteger;

/**
 * Created by Administrator on 2018/7/10.
 */

public class JAssetAmount {
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    private String assetId;
    private BigInteger value;
}
