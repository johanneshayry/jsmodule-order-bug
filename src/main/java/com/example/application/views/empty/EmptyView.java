package com.example.application.views.empty;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Empty")
@Route(value = "")
@JsModule("./script-2.js")
@JsModule("./script-1.js")
public class EmptyView extends VerticalLayout {

    public EmptyView() {
    }

}
