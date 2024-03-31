import java.util.Scanner;
public class TemperaturaAgua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i=1;
        float temp, soma=0, media;


        while(i<13){
            System.out.printf("Digite a temperatura %d (ente 4° a 10°) em graus Celsius: ", i);
            temp = scanner.nextFloat();
            if (temp >= 4 && temp <= 10){
                i++;
                soma += temp;
            }
            else {
                System.out.println("O número digitado não é válido, Digite novamente!");
            }
        }
        media = soma/12;

        System.out.printf("A média de hoje das temperatura é: %.2f° C", media);
        





        scanner.close();
    }

}
