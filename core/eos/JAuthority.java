package core.eos;

import java.util.List;

/**
 * Created by Administrator on 2018/8/28.
 */

public class JAuthority {
    private int threshold;
    private List<JKeyPermissionWeight> keys;

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public List<JKeyPermissionWeight> getKeys() {
        return keys;
    }

    public void setKeys(List<JKeyPermissionWeight> keys) {
        this.keys = keys;
    }
}
