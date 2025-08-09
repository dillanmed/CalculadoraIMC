import java.util.Scanner;

public class CalculadoraImc {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();
            System.out.println("Digite seu peso: ");
            double peso = scanner.nextDouble();

            if(altura <= 0 || peso <= 0){
                System.out.println("Altura e Peso devem ser Maiores que zero");
                scanner.close();
                return;
            }

            double IMC = peso /(altura * altura);

            System.out.println(String.format("Seu indice de massa corporal é de: %.2f", IMC));
            System.out.println();

            String classificacao;

            if(IMC <= 18.5){
                classificacao = ("Abaixo do Peso");
            }
            else if (IMC <= 24.9){
                classificacao = "Peso Ideal";
            }
            else if(IMC <= 29.9){
                classificacao = "Levemento Acima do Peso";
            }
            else if(IMC <= 34.9){
                classificacao = "Obesidade Grau I";
            }
            else if(IMC <= 39.9){
                classificacao = "Obesidade Grau II";
            }
            else{
                classificacao = "Obesidade Grau III";
            }
            System.out.println("Classificação = "+classificacao);
            scanner.close();
        }

    }



