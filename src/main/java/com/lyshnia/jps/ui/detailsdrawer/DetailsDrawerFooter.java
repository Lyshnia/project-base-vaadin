package com.lyshnia.jps.ui.detailsdrawer;

import com.lyshnia.jps.ui.FlexBoxLayout;
import com.lyshnia.jps.ui.size.Horizontal;
import com.lyshnia.jps.ui.size.Right;
import com.lyshnia.jps.ui.size.Vertical;
import com.lyshnia.jps.ui.util.LumoStyles;
import com.lyshnia.jps.ui.util.UIUtils;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.shared.Registration;

public class DetailsDrawerFooter extends FlexBoxLayout {

    private Button save;
    private Button cancel;

    public DetailsDrawerFooter() {
        setBackgroundColor(LumoStyles.Color.Contrast._5);
        setPadding(Horizontal.RESPONSIVE_L, Vertical.S);
        setSpacing(Right.S);
        setWidthFull();

        save = UIUtils.createPrimaryButton("Save");
        cancel = UIUtils.createTertiaryButton("Cancel");
        add(save, cancel);
    }

    public Registration addSaveListener(
            ComponentEventListener<ClickEvent<Button>> listener) {
        return save.addClickListener(listener);
    }

    public Registration addCancelListener(
            ComponentEventListener<ClickEvent<Button>> listener) {
        return cancel.addClickListener(listener);
    }

}
