package core.eos;

/**
 * Created by Administrator on 2018/8/28.
 */

public class JDeleteAuthAction extends JAction {
    @Override
    public String actionName() { return "deleteauth";}

    private JPermissionLevel permissionLevel;

    public JPermissionLevel getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(JPermissionLevel permissionLevel) {
        this.permissionLevel = permissionLevel;
    }
}
