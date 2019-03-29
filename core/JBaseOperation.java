package core;

/**
 * Created by Administrator on 2018/7/10.
 */

public class JBaseOperation {
    public JBaseOperation() {
        this.operType = NULL_OPERATION;
    }

    public int getOperType() {
        return operType;
    }

    public void setOperType(int operType) {
        this.operType = operType;
    }

    protected int operType;

    public static int NULL_OPERATION = -1;
    public static int TRANSFER_OPERATION = 0;
}
