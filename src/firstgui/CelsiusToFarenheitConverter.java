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
public class CelsiusToFarenheitConverter implements TemperatureConverterStrategy{
   
    @Override
    public double convertTemp(double celsius){
        double farenheit = (celsius * (9.0/5.0)) + 32.0;
        return farenheit;
    }
}
