package com.qmp1.ejercicio;

public class Prenda {
    private Tipo tipoPrenda;
    private String material;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(Tipo tipoPrenda, String material, Color colorPrimario, Color colorSecundario) {
        this.tipoPrenda = tipoPrenda;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

    public Prenda(Tipo tipoPrenda, String material, Color colorPrimario) {
        this.tipoPrenda = tipoPrenda;
        this.material = material;
        this.colorPrimario = colorPrimario;
    }

    public Tipo getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(Tipo tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }
}
