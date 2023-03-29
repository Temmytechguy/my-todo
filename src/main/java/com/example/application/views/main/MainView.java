package com.example.application.views.main;

import com.example.application.data.entity.Contact;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Contacts List")
@Route("")
public class MainView extends VerticalLayout {

    Grid<Contact> grid = new Grid<Contact>();
    TextField filterText = new TextField();


    public MainView() {

        addClassName("list-view");
        setSizeFull();

        configureGrid();

    }

    private void configureGrid()
    {
        grid.addClassName("contact-grid");
        grid.setSizeFull();
        grid.setColumns("firstName", "lastName", "email");
        grid.addColumn(contact -> contact.getCompany().getName()).setHeader("Company");
        grid.addColumn(contact -> contact.getStatus().getName()).setHeader("Status");
    }
}