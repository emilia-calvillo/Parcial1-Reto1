import java.util.Scanner;
public class Calculadora {
    public  static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        String respuesta="RESTA";
        float res=0,num1 ,num2;
        while (respuesta!="SUMA" || respuesta!="RESTA" || respuesta!="MULTIPLICACION" || respuesta!="DIVISION"){
            System.out.println("Captura operacion:");
            respuesta = entrada.next();
            switch (respuesta) {
                case "SUMA" -> {
                    System.out.println("Operando 1:");
                    num1= entrada.nextLong();
                    System.out.println("Operando 2:");
                    num2=entrada.nextLong();
                    res=num1+num2;
                    System.out.println(res);
                }
                case "RESTA" -> {
                    System.out.println("Operando 1:");
                    num1= entrada.nextLong();
                    System.out.println("Operando 2:");
                    num2=entrada.nextLong();
                    res=num1-num2;
                    System.out.println(res);
                }
                case "MULTIPLICACION" -> {
                    System.out.println("Operando 1:");
                    num1= entrada.nextLong();
                    System.out.println("Operando 2:");
                    num2=entrada.nextLong();
                    res=num1*num2;
                    System.out.println(res);
                }
                case "DIVISION" -> {
                    System.out.println("Operando 1:");
                    num1= entrada.nextLong();
                    System.out.println("Operando 2:");
                    num2=entrada.nextLong();
                    res=num1/num2;
                    System.out.println(res);
                }
                default -> {
                    System.out.println("Operacion no soportada");
                    System.exit(0);
                }
            }
        }
    }
}