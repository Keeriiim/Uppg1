import java.util.Scanner;

class uppg1{
    public static void main(String args[]){  
        Scanner scan = new Scanner(System.in);

        double celcius = scan.nextDouble();

        double fahrenheit = celcius * 1.8 + 32;
        double kelvin = celcius + 273.15;


/*Celsius ->  Kelvin K = °C + 273,15
Fahrenheit  -> Celsius °C = (°F − 32) / 1,8
Fahrenheit  -> Kelvin K = (°F + 459,67) / 1,8
Kelvin  -> Fahrenheit °F = K · 1,8 − 459,67
Kelvin  -> Celsius °C = K − 273,15

Skriv ett program som tar emot en Celcius temperatur och omvandlar
till Fahrenheit, sen till Kelvin och slutligen tillbaka till din Celcius.

Skriv ut Celcius, Fahrenheit och Kelvin
*/

        System.out.println("Celcius " + celcius + "°C " + "\n"  + "Fahrenheit " +  fahrenheit + "°F " + "\n" + "Kelvin " + kelvin +("K"));  

       }  
   }  