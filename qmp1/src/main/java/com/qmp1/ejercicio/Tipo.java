package com.qmp1.ejercicio;

public class Tipo {

    public static enum TipoPrenda { ZAPATOS, CAMISA_MANGAS_CORTAS, CAMISA_MANGAS_LARGAS, PANTALON }

    public static enum Categoria{ PARTE_SUPERIOR, CALZADO, PARTE_INFERIOR, ACCESORIOS }

    private TipoPrenda tipoPrenda;
    private Categoria categoria;

    public Tipo(TipoPrenda tipoPrenda, Categoria categoria) {
        this.tipoPrenda = tipoPrenda;
        this.categoria = categoria;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(TipoPrenda tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
