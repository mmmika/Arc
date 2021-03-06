package arc.scene.actions;

import arc.scene.Action;

/**
 * Sets the actor's {@link Element#visible(boolean) visibility}.
 * @author Nathan Sweet
 */
public class VisibleAction extends Action{
    private boolean visible;

    public boolean act(float delta){
        target.visible(visible);
        return true;
    }

    public boolean isVisible(){
        return visible;
    }

    public void setVisible(boolean visible){
        this.visible = visible;
    }
}
