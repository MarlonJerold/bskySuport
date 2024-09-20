package org.wms.wms;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.primefaces.PrimeFaces;

import java.io.Serializable;

@Named("dfProductsView")
@ViewScoped
public class dfPostView implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private ThreadBean threadBean;

    public void openNew() {
        PrimeFaces.current().executeScript("PF('dfProducts').show()");
    }

    public void closeDialog() {
        PrimeFaces.current().executeScript("PF('dfProducts').hide()");
    }

    public ThreadBean getThreadBean() {
        return threadBean;
    }

    public void setThreadBean(ThreadBean threadBean) {
        this.threadBean = threadBean;
    }
}

