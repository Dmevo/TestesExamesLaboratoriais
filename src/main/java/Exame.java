public class Exame {

    private int triglicerides;
    private int colesterolTotal;
    private int colesterolHDL;
    private int colesterolLDL;
    private int colesterolVLDL;
    private int glicose;

    public void setTriglicerides(int triglicerides) {
        this.triglicerides = triglicerides;
    }

    public void setColesterolTotal(int colesterolTotal) {
        this.colesterolTotal = colesterolTotal;
    }

    public void setColesterolHDL(int colesterolHDL) {
        this.colesterolHDL = colesterolHDL;
    }

    public void setColesterolLDL(int colesterolLDL) {
        this.colesterolLDL = colesterolLDL;
    }

    public void setColesterolVLDL(int colesterolVLDL) {
        this.colesterolVLDL = colesterolVLDL;
    }

    public void setGlicose(int glicose) {
        this.glicose = glicose;
    }

    public String verificarTriglicerides() {
        int trigliceridesDesejavel = 150;
        int trigliceridesLimitrofe = 199;
        int trigliceridesAlto = 499;
        int trigliceridesMuitoAlto = 500;

        if (this.triglicerides <= 0) {
            throw new IllegalArgumentException("Triglicerides não pode ser igual ou abaixo zero");
        }else{
            if (this.triglicerides < trigliceridesDesejavel){
                return "Nivel desejavel";
            }else {
                if (this.triglicerides <= trigliceridesLimitrofe) {
                    return "Nivel limitrofe";
                }else {
                    if (this.triglicerides <= trigliceridesAlto){
                        return "Nivel alto";
                    }else {
                        if (this.triglicerides >= trigliceridesMuitoAlto) {
                            return "Nivel muito alto";
                        }
                    }
                }
            }
        }

    return null;
    }

    public String verificarColesterolTotal() {
        int colesterolTotalDesejavel = 200;
        int colesterolTotalLimitrofe = 239;
        int colesterolTotalElevado = 240;

        if (this.colesterolTotal <= 0) {
            throw new IllegalArgumentException("Colesterol total não pode ser igual ou abaixo zero");
        }else {
            if (this.colesterolTotal < colesterolTotalDesejavel) {
                return "Nivel desejavel";
            }else {
                if (this.colesterolTotal <= colesterolTotalLimitrofe) {
                    return "Nivel limitrofe";
                }else {
                    if (this.colesterolTotal >= colesterolTotalElevado) {
                        return "Nivel elevado";
                    }
                }
            }
        }
        return null;
    }

    public String verificarColesterolHdl() {
        int colesterolHdlBaixo = 40;
        int colesterolHdlNormalElevado = 60;

        if (this.colesterolHDL <= 0) {
            throw new IllegalArgumentException("Colesterol HDL não pode ser igual ou abaixo zero");
        }else{
            if (this.colesterolHDL < 40) {
                return "Nivel baixo";
            }else{
                if (this.colesterolHDL <= 60) {
                    return "Nivel normal";
                }else{
                    if (this.colesterolHDL > 60) {
                        return "Nivel desejavel";
                    }
                }
            }
        }
        return null;
    }

    public String verificarColesterolLdl() {
        int colesterolLdlOtimo = 100;
        int colesterolLdlDesejavel = 129;
        int colesterolLdlLimitrofe = 159;
        int colesterolLdlAlto = 189;
        int colesterolLdlMuitoAlto = 190;

        if (this.colesterolLDL <= 0) {
            throw new IllegalArgumentException("Colesterol LDL não pode ser igual ou abaixo zero");
        }else {
            if (this.colesterolLDL < colesterolLdlOtimo) {
                return "Nivel otimo";
            }else {
                if (this.colesterolLDL <= colesterolLdlDesejavel) {
                    return "Nivel desejavel";
                }else {
                    if (this.colesterolLDL <= colesterolLdlLimitrofe) {
                        return "Nivel limitrofe";
                    }else {
                        if (this.colesterolLDL <= colesterolLdlAlto) {
                            return "Nivel alto";
                        }else{
                            if(this.colesterolLDL >= colesterolLdlMuitoAlto) {
                                return "Nivel muito alto";
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public String verificarColesterolVldl() {
        int colesterolVldlDesejavel = 30;
        int colesterolVldlLimitrofeElevado = 40;

        if (this.colesterolVLDL <= 0) {
            throw new IllegalArgumentException("Colesterol VLDL não pode ser igual ou abaixo zero");
        }else {
            if (this.colesterolVLDL < colesterolVldlDesejavel) {
                return "Nivel desejavel";
            }else {
                if (this.colesterolVLDL <= colesterolVldlLimitrofeElevado) {
                    return "Nivel limitrofe";
                }else {
                    if (this.colesterolVLDL > colesterolVldlLimitrofeElevado) {
                        return "Nivel elevado";
                    }
                }
            }
        }


        return null;
    }

    public String verificarGlicose() {
        int glicoseHipoglicemia = 60;
        int glicoseDesejavel = 99;
        int glicoseGlicemiaJejumInapropriadaDiabetes = 125;

        if (this.glicose <= 0) {
            throw new IllegalArgumentException("Glicose não pode ser igual ou abaixo zero");
        }else {
            if(this.glicose < glicoseHipoglicemia) {
                return "Hipoglicemia";
            }else {
                if (this.glicose <= glicoseDesejavel) {
                    return "Glicose desejavel";
                }else {
                    if (this.glicose <= glicoseGlicemiaJejumInapropriadaDiabetes) {
                        return "Glicemia de jejum inapropriado";
                    }else{
                        if(this.glicose > glicoseGlicemiaJejumInapropriadaDiabetes) {
                            return "Diabetes";
                        }
                    }
                }
            }
        }
        return null;
    }



}
