package org.paola;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by jpicado on 7/20/17.
 */

@ManagedBean
@SessionScoped
public class HelloWorldBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        System.out.println("get name:" + this.name);
        return name;
    }

    public void setName(String name) {
        System.out.println("set name:" + this.name);
        this.name = name;
    }
}
