public class App {
    public static void main(String[] args) throws Exception {
        
        int nota = 70;
        int media = 60;
        int faltas = 5;
        int maxfaltas = 5;

        if(nota >= media && faltas <= maxfaltas){
            System.out.println("Aprovado");
        }else if(nota >= 40 && faltas <= maxfaltas){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");

        }
        int pos = 8;

        switch(pos){
            case 1:
                System.out.println("Primeiro Lugar!");
                break;
            case 2:
                System.out.println("Segundo Lugar!");
                break;
            case 3: 
                System.out.println("Terceiro lugar!");
                break;
            case 4: case 5: case 6:
                System.out.println("Ganhou medalha de participação!");
                break;
            default:
                System.out.println("Não ganhou nenhuma medalha!");
        }
    }
}
