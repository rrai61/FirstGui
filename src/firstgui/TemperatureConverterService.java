/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgui;

/**
 *
 * @author ritu
 */
public class TemperatureConverterService {
    
    public static double convertToFarenheit(double celsius){
        double farenheit = (celsius * (9.0/5.0)) + 32.0;
        return farenheit;
    }
    
    public static double convertToCelsius(double farenheit){
       double celsius = (farenheit - 32.0) * (5.0/9.0);
       return celsius;
    }
}
