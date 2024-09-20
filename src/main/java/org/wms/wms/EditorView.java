package org.wms.wms;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;

@Named("editorView")
@ViewScoped
public class EditorView implements Serializable {
    private static final long serialVersionUID = 1L;
    private String text;
    private String text2;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}