/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_calculator;

/**
 *
 * @author usuario
 */
class WebServiceClient {

    public static double suma(double num1, double num2) {
        cliente_calculator.Calculate_Service service = new cliente_calculator.Calculate_Service();
        cliente_calculator.Calculate port = service.getCalculatePort();
        return port.suma(num1, num2);
    }

    public static double resta(double num1, double num2) {
        cliente_calculator.Calculate_Service service = new cliente_calculator.Calculate_Service();
        cliente_calculator.Calculate port = service.getCalculatePort();
        return port.resta(num1, num2);
    }

    public static double multiplicacion(double num1, double num2) {
        cliente_calculator.Calculate_Service service = new cliente_calculator.Calculate_Service();
        cliente_calculator.Calculate port = service.getCalculatePort();
        return port.multiplicacion(num1, num2);
    }

    public static double division(double num1, double num2) {
        cliente_calculator.Calculate_Service service = new cliente_calculator.Calculate_Service();
        cliente_calculator.Calculate port = service.getCalculatePort();
        return port.division(num1, num2);
    }

    public static double raiz(double num) {
        cliente_calculator.Calculate_Service service = new cliente_calculator.Calculate_Service();
        cliente_calculator.Calculate port = service.getCalculatePort();
        return port.raiz(num);
    }

    public static int potencia(double base, double exponente) {
        cliente_calculator.Calculate_Service service = new cliente_calculator.Calculate_Service();
        cliente_calculator.Calculate port = service.getCalculatePort();
        return port.potencia(base, exponente);
    }
}
