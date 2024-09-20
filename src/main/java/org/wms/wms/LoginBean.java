package org.wms.wms;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import org.wms.wms.model.Usuario;

import java.io.Serializable;

@Named
@ViewScoped
public class LoginBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private Usuario usuario = new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String efetuaLogin() {
        if ("user@example.com".equals(usuario.getEmail()) && "password".equals(usuario.getSenha())) {
            return "home.xhtml?faces-redirect=true";
        } else {
            // Adicionar mensagem de erro
            return null;
        }
    }
}