package com.qmp1.ejercicio;

import java.util.List;
public class Atuendo {

    private List<Prenda> listaDePrendas;

    public Atuendo(List<Prenda> listaDePrendas) {
        this.listaDePrendas = listaDePrendas;
    }

    public List<Prenda> getListaDePrendas() {
        return listaDePrendas;
    }

    public void setListaDePrendas(List<Prenda> listaDePrendas) {
        this.listaDePrendas = listaDePrendas;
    }

    public void agregarPrenda(Prenda prendaNueva){
        this.listaDePrendas.add(prendaNueva);
    }

    public void quitarPrenda(Prenda otraPrenda){
        this.listaDePrendas.remove(otraPrenda);
    }

}
