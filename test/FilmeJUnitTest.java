

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patrick
 */
public class FilmeJUnitTest {
    
    @Test
    public void testeDefinirTitulo(){
        Filme coracoesDeFerro = new Filme();
        coracoesDeFerro.setTitulo("Corações de Ferro");
        assertEquals("Corações de Ferro", coracoesDeFerro.getTitulo());
    }
    
    @Test
    public void testeDefinirTituloOriginal(){
        Filme coracoesDeFerro = new Filme();
        coracoesDeFerro.setTitulo("Fury");
        assertEquals("Fury", coracoesDeFerro.getTitulo());
    }
    
    @Test
    public void testeDefinirGenero(){
        Filme avatar = new Filme();
        avatar.setGenero("Ficção Científica");
        assertEquals("Ficção Científica", avatar.getGenero());
    }
    
    @Test
    public void testeDefinirDiretor(){
        Filme titanic = new Filme();
        titanic.setDiretor("James Cameron");
        assertEquals("James Cameron", titanic.getDiretor());
    }
    
    @Test
    public void testeDefinirAnoLancamento(){
        Filme gravidade = new Filme();
        gravidade.setAnoLancamento((short) 2013);
        assertEquals(2013, gravidade.getAnoLancamento());
    }
    
    @Test
    public void testeDefinirValorFaturamento(){
        Filme up = new Filme();
        up.setValorFaturamento(1750000.00);
        assertEquals(1750000.00, up.getValorFaturamento() ,0);
    }
    
    @Test
    public void testeDefinirValorOrcamento(){
        Filme malevola = new Filme();
        malevola.setValorOrcamento(1800000.00);
        assertEquals(1800000.00, malevola.getValorOrcamento() ,0);
    }
    
    @Test
    public void testeDefinirEspectadores(){
        Filme spectre = new Filme();
        spectre.setEspectadores( 9619370L);
        assertEquals(9619370, spectre.getEspectadores());
    }
    
    @Test
    public void testeDefinirClassificacao(){
        Filme skyfall = new Filme();
        skyfall.setClassificacao("Acima dos 16 anos");
        assertEquals("Acima dos 16 anos", skyfall.getClassificacao());
    }
    
    @Test
    public void testeDefinirMediaPreco(){
        Filme minions = new Filme();
        minions.setMediaPreco(30.00);
        assertEquals(30.00, minions.getMediaPreco() ,0);
    }
    
    @Test
    public void testeDefinirDataLancamentoBrasil(){
        Filme frozen = new Filme();
        //frozen.setDataLancamentoBrasil();
        //assertEquals(, frozen.getDataLancamentoBrasil());
    }
    
    @Test
    public void testeDefinirIdioma(){
        Filme avatar = new Filme();
        avatar.setIdioma("Inglês");
        assertEquals("Inglês", avatar.getIdioma());
                
    }
    

    
}
