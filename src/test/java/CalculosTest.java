import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class CalculosTest {

    @Test
    public void retonarZeroQuandoNadaForInformado(){

        Calculos numerosSomar = new Calculos();
        double esperado = 0;
        double atual = numerosSomar.soma();
        Assertions.assertEquals(esperado,atual);
}

    @Test
    public void retornarSomaQuandoValoresForemInformados(){
    Calculos numerosSomar = new Calculos();
    double atual = numerosSomar.soma(3,3);
    double esperado = 6;
    Assertions.assertEquals(esperado,atual);


}

    @Test
    public void verificaNumeroPar(){
        Calculos paraVerificar = new Calculos();
        boolean informaNumeroPar = paraVerificar.informaNumeroPar(4);
        Assertions.assertTrue(informaNumeroPar);
    }

    @Test
    public void verificaNumeroImpar(){
        Calculos paraVerificar = new Calculos();
        boolean informaNumeroPar = paraVerificar.informaNumeroPar(3);
        Assertions.assertFalse(informaNumeroPar);
    }

}