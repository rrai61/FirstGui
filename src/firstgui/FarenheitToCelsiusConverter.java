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
public class FarenheitToCelsiusConverter implements TemperatureConverterStrategy{
    @Override
    public double convertTemp(double farenheit){
       double celsius = (farenheit - 32.0) * (5.0/9.0);
       return celsius;
    }
}
