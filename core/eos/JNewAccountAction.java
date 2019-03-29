package core.eos;

/**
 * Created by Administrator on 2018/8/28.
 */

public class JNewAccountAction extends JAction {
    @Override
    public String actionName() { return "newaccount";}

    private String creator;
    private String accountName;
    private JAuthority owner;
    private JAuthority active;

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public JAuthority getOwner() {
        return owner;
    }

    public void setOwner(JAuthority owner) {
        this.owner = owner;
    }

    public JAuthority getActive() {
        return active;
    }

    public void setActive(JAuthority active) {
        this.active = active;
    }

}
