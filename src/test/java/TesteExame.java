import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TesteExame {

    @Test
    public void deveVerificarTrigliceridesInvalido() {
        try {
            Exame exame = new Exame();
            exame.setTriglicerides(0);
            exame.verificarTriglicerides();
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Triglicerides não pode ser igual ou abaixo zero", e.getMessage());
        }
    }

    @Test
    public void deveVerificarTrigliceridesDesejavel() {
        Exame exame = new Exame();
        exame.setTriglicerides(149);
        assertEquals("Nivel desejavel", exame.verificarTriglicerides());
    }

    @Test
    public void deveVerificarTrigliceridesLimitrofe() {
        Exame exame = new Exame();
        exame.setTriglicerides(150);
        assertEquals("Nivel limitrofe", exame.verificarTriglicerides());
    }

    @Test
    public void deveVerificarTrigliceridesAlto() {
        Exame exame = new Exame();
        exame.setTriglicerides(200);
        assertEquals("Nivel alto", exame.verificarTriglicerides());
    }

    @Test
    public void deveVerificarTrigliceridesMuitoAlto() {
        Exame exame = new Exame();
        exame.setTriglicerides(501);
        assertEquals("Nivel muito alto", exame.verificarTriglicerides());
    }

    @Test
    public void deveVerificarColesterolTotalInvalido() {
        try {
            Exame exame = new Exame();
            exame.setColesterolTotal(0);
            exame.verificarColesterolTotal();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Colesterol total não pode ser igual ou abaixo zero", e.getMessage());
        }
    }

    @Test
    public void deveVerificarColesterolTotalDesejavel() {
        Exame exame = new Exame();
        exame.setColesterolTotal(199);
        assertEquals("Nivel desejavel", exame.verificarColesterolTotal());
    }

    @Test
    public void deveVerificarColesterolTotalLimitrofe() {
        Exame exame = new Exame();
        exame.setColesterolTotal(201);
        assertEquals("Nivel limitrofe", exame.verificarColesterolTotal());
    }

    @Test
    public void deveVerificarColesterolTotalElevado() {
        Exame exame = new Exame();
        exame.setColesterolTotal(241);
        assertEquals("Nivel elevado", exame.verificarColesterolTotal());
    }

    @Test
    public void deveVerificarColesterolHdlInvalido() {
        try {
            Exame exame = new Exame();
            exame.setColesterolHDL(0);
            exame.verificarColesterolHdl();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Colesterol HDL não pode ser igual ou abaixo zero", e.getMessage());
        }
    }

    @Test
    public void deveVerificarColesterolHdlBaixo() {
        Exame exame = new Exame();
        exame.setColesterolHDL(39);
        assertEquals("Nivel baixo", exame.verificarColesterolHdl());
    }

    @Test
    public void deveVerificarColesterolHdlNormal() {
        Exame exame = new Exame();
        exame.setColesterolHDL(41);
        assertEquals("Nivel normal", exame.verificarColesterolHdl());
    }

    @Test
    public void deveVerificarColesterolHdlDesejavel() {
        Exame exame = new Exame();
        exame.setColesterolHDL(61);
        assertEquals("Nivel desejavel", exame.verificarColesterolHdl());
    }

    @Test
    public void deveVerificarColesterolLdlInvalido() {
        try {
            Exame exame = new Exame();
            exame.setColesterolLDL(0);
            exame.verificarColesterolLdl();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Colesterol LDL não pode ser igual ou abaixo zero", e.getMessage());
        }
    }

    @Test
    public void deveVerificarColesterolLdlOtimo() {
        Exame exame = new Exame();
        exame.setColesterolLDL(99);
        assertEquals("Nivel otimo", exame.verificarColesterolLdl());
    }

    @Test
    public void deveVerificarColesterolLdlDesejavel() {
        Exame exame = new Exame();
        exame.setColesterolLDL(101);
        assertEquals("Nivel desejavel", exame.verificarColesterolLdl());
    }

    @Test
    public void deveVerificarColesterolLdlLimitrofe() {
        Exame exame = new Exame();
        exame.setColesterolLDL(130);
        assertEquals("Nivel limitrofe", exame.verificarColesterolLdl());
    }

    @Test
    public void deveVerificarColesterolLdlAlto() {
        Exame exame = new Exame();
        exame.setColesterolLDL(160);
        assertEquals("Nivel alto", exame.verificarColesterolLdl());
    }

    @Test
    public void deveVerificarColesterolLdlMuitoAlto() {
        Exame exame = new Exame();
        exame.setColesterolLDL(191);
        assertEquals("Nivel muito alto", exame.verificarColesterolLdl());
    }

    @Test
    public void deveVerificarColesterolVldlInvalido() {
        try {
            Exame exame = new Exame();
            exame.setColesterolVLDL(0);
            exame.verificarColesterolVldl();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Colesterol VLDL não pode ser igual ou abaixo zero", e.getMessage());
        }
    }

    @Test
    public void deveVerificarColesterolVldlDesejavel() {
        Exame exame = new Exame();
        exame.setColesterolVLDL(29);
        assertEquals("Nivel desejavel", exame.verificarColesterolVldl());
    }

    @Test
    public void deveVerificarColesterolVldlLimitrofe() {
        Exame exame = new Exame();
        exame.setColesterolVLDL(30);
        assertEquals("Nivel limitrofe", exame.verificarColesterolVldl());
    }

    @Test
    public void deveVerificarColesterolVldlElevado() {
        Exame exame = new Exame();
        exame.setColesterolVLDL(41);
        assertEquals("Nivel elevado", exame.verificarColesterolVldl());
    }

    @Test
    public void deveVerificarGlicoseInvalido() {
        try {
            Exame exame = new Exame();
            exame.setGlicose(0);
            exame.verificarGlicose();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Glicose não pode ser igual ou abaixo zero", e.getMessage());
        }
    }

    @Test
    public void deveVerificarGlicoseHipoglicemia() {
        Exame exame = new Exame();
        exame.setGlicose(59);
        assertEquals("Hipoglicemia", exame.verificarGlicose());
    }

    @Test
    public void deveVerificarGlicoseDesejavel() {
        Exame exame = new Exame();
        exame.setGlicose(61);
        assertEquals("Glicose desejavel", exame.verificarGlicose());
    }

    @Test
    public void deveVerificarGlicoseGlicemiaJejumInapropriada() {
        Exame exame = new Exame();
        exame.setGlicose(100);
        assertEquals("Glicemia de jejum inapropriado", exame.verificarGlicose());
    }

    @Test
    public void deveVerificarGlicoseDiabetes() {
        Exame exame = new Exame();
        exame.setGlicose(126);
        assertEquals("Diabetes", exame.verificarGlicose());
    }



}
