
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class BrinquedoJUnitTest {
    
    @Test
    public void testeDefinirNome(){
        Brinquedo detetive = new Brinquedo();
        detetive.setNome("Detetive");
        assertEquals("Detetive", detetive.getNome());
        
    }
    
    @Test
    public void testeDefinirMarca(){
        Brinquedo caraAcara = new Brinquedo();
        caraAcara.setMarca("Estrela");
        assertEquals("Estrela", caraAcara.getMarca());
    }
    
    @Test
    public void testeDefinirModelo(){
        Brinquedo genius = new Brinquedo();
        genius.setModelo("Eletônico");
        assertEquals("Eletônico", genius.getModelo());
    }
    
    @Test
    public void testeDefinirDescricao(){
        Brinquedo bancoImobiliario = new Brinquedo();
        bancoImobiliario.setDescricao("O tabuleiro é dividido em 4 partes");
        assertEquals("O tabuleiro é dividido em 4 partes", bancoImobiliario.getDescricao());
    }
    
    @Test
    public void testeDefinirCodigo(){
        Brinquedo bonecaBebe = new Brinquedo();
        bonecaBebe.setCodigo(33950969L);
        assertEquals(33950969L, bonecaBebe.getCodigo());
    }
    
    @Test
    public void testeDefinirCodigoDeBarra(){
        Brinquedo nerf = new Brinquedo();
        nerf.setCodigoDeBarra(123456789506L);
        assertEquals(123456789506L, nerf.getCodigoDeBarra());
    }
    
    @Test
    public void testeDefinirPreco(){
        Brinquedo carrinhoHotWheels = new Brinquedo();
        carrinhoHotWheels.setPreco(22.19);
        assertEquals(22.19, carrinhoHotWheels.getPreco() ,0);
        
    }
    
    
    
}
