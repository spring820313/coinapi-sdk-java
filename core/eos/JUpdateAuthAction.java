package core.eos;

/**
 * Created by Administrator on 2018/8/28.
 */

public class JUpdateAuthAction extends JAction {
    @Override
    public String actionName() { return "updateauth";}

    private JPermissionLevel permissionLevel;
    private String parent;
    private JAuthority authority;

    public JPermissionLevel getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(JPermissionLevel permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public JAuthority getAuthority() {
        return authority;
    }

    public void setAuthority(JAuthority authority) {
        this.authority = authority;
    }
}
