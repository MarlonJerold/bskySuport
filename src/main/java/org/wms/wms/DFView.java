package org.wms.wms;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import org.primefaces.PrimeFaces;
import org.primefaces.model.DialogFrameworkOptions;

@Named("dfView")
@RequestScoped
public class DFView {

    public void viewCreatePost() {
        DialogFrameworkOptions options = DialogFrameworkOptions.builder()
                .resizable(true)
                .modal(true)
                .build();

        PrimeFaces.current().dialog().openDynamic("viewPost", options, null);
    }

}