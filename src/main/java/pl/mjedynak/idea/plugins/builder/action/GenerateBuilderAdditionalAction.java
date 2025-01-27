package pl.mjedynak.idea.plugins.builder.action;

import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class GenerateBuilderAdditionalAction extends AbstractBuilderAdditionalAction {

    private static final String TEXT = "Create New Builder...";
    private static final Icon ICON = IconLoader.getIcon("/actions/intentionBulb.png", GenerateBuilderAdditionalAction.class);

    @NotNull
    @Override
    public String getText() {
        return TEXT;
    }

    @Override
    public Icon getIcon() {
        return ICON;
    }

    @Override
    public void execute() {
    }
}
