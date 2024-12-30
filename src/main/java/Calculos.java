public class Calculos {

    public double soma(double... numeros){
        double soma = 0;

        if(numeros.length >0){
            for(double numeroSomar: numeros){
                soma += numeroSomar;
            }

        }

        return soma;
    }

    public boolean informaNumeroPar(int numero){
        if(numero % 2 ==0){
            return true;
        } return false;
    }
}
