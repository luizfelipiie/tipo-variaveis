public class SistemaMedida { 
  
    public static void main(String[] args) {

        String sigla = "M";

        if (sigla=="P"){ 
            System.out.println("pequeno");
        } else if (sigla=="M") {
            System.out.println("médio");    
        } else if (sigla=="G") {
            System.out.println("grande");   
        } else {
            System.out.println("tamanho não identificado");
        }


    }
}