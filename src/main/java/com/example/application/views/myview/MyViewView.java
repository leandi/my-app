package com.example.application.views.myview;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@PageTitle("My View")
@Menu(icon = "line-awesome/svg/pencil-ruler-solid.svg", order = 4)
@Route(value = "my-view")
@AnonymousAllowed
public class MyViewView extends Composite<VerticalLayout> {

    public MyViewView() {
        RichTextEditor richTextEditor = new RichTextEditor();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        richTextEditor.setWidth("100%");
        getContent().add(richTextEditor);
    }
}
