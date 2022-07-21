package com.example.minhasplantinhas;

public class TodasAsPlantas {
    //Imagens são "Integer"
    //Texto é "String"
    private String nomePlanta;
    private String especiePlanta;
    private String txtAgua;
    private String txtLuz;
    private String txtAmbiente;
    private Integer imgPlanta;
//    private Integer imgAgua;
    private Integer imgLuz;
//    private Integer imgAmbiente;

    public TodasAsPlantas(String nomePlanta, String especiePlanta, String txtAgua, String txtLuz, String txtAmbiente, Integer imgPlanta, Integer imgLuz) {
        this.nomePlanta = nomePlanta;
        this.especiePlanta = especiePlanta;
        this.txtAgua = txtAgua;
        this.txtLuz = txtLuz;
        this.txtAmbiente = txtAmbiente;
        this.imgPlanta = imgPlanta;
//        this.imgAgua = imgAgua;
        this.imgLuz = imgLuz;
//        this.imgAmbiente = imgAmbiente;
    }

    public String getNomePlanta() {
        return nomePlanta;
    }

    public void setNomePlanta(String nomePlanta) {
        this.nomePlanta = nomePlanta;
    }

    public String getEspeciePlanta() {
        return especiePlanta;
    }

    public void setEspeciePlanta(String especiePlanta) {
        this.especiePlanta = especiePlanta;
    }

    public String getTxtAgua() {
        return txtAgua;
    }

    public void setTxtAgua(String txtAgua) {
        this.txtAgua = txtAgua;
    }

    public String getTxtLuz() {
        return txtLuz;
    }

    public void setTxtLuz(String txtLuz) {
        this.txtLuz = txtLuz;
    }

    public String getTxtAmbiente() {
        return txtAmbiente;
    }

    public void setTxtAmbiente(String txtAmbiente) {
        this.txtAmbiente = txtAmbiente;
    }

    public Integer getImgPlanta() {
        return imgPlanta;
    }

    public void setImgPlanta(Integer imgPlanta) {
        this.imgPlanta = imgPlanta;
    }

//    public Integer getImgAgua() {
//        return imgAgua;
//    }
//
//    public void setImgAgua(Integer imgAgua) {
//        this.imgAgua = imgAgua;
//    }

    public Integer getImgLuz() {
        return imgLuz;
    }

    public void setImgLuz(Integer imgLuz) {
        this.imgLuz = imgLuz;
    }

//    public Integer getImgAmbiente() {
//        return imgAmbiente;
//    }
//
//    public void setImgAmbiente(Integer imgAmbiente) {
//        this.imgAmbiente = imgAmbiente;
//    }
}
