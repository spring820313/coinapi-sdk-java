package core;

/**
 * Created by Administrator on 2017/12/29.
 */

public class JEncryptedData {
    public byte[] getInitialisationVector() {
        return initialisationVector;
    }

    public void setInitialisationVector(byte[] initialisationVector) {
        this.initialisationVector = initialisationVector;
    }

    public byte[] getEncryptedBytes() {
        return encryptedBytes;
    }

    public void setEncryptedBytes(byte[] encryptedBytes) {
        this.encryptedBytes = encryptedBytes;
    }

    private byte[] initialisationVector;
    private byte[] encryptedBytes;
}
