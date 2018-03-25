/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsulinAdministrationCalculator;

/**
 *
 * @author Sergiu Borlovan
 */
public class InsulinCore {
   
   
    //1 unit of insulin per 10g of carbs
    public int insulinForCarbs(String s){
        double num = this.checkNum(s);
        int result;
        if (num < 0){
            return 0;
        }
        result = (int) Math.round((double)num / 10);
        return result;
    }
    
    //The aim for the BM value is 7 and no correction is to be given unless
    //the readings are 10 or over.
    //1 unit of insulin will lower the BM value by 3 mmol/L.
    public int insulinForCorrection(String s){
        double num = this.checkNum(s);
        int result;
        if (num <= 7){
            return 0;
        }
        if (num >= 33.4){
            return 8;
        }
        result = (int) Math.round(((int)num - 7) / 3);
        return result;
    }
    
    //BM readings of 33.3 and over are displayed as "hi".
    //The lowest possible value is assumed, which is 33.4
    public double checkNum(String num){
        if (num.isEmpty()){
            return 0;
        }
        else{
            if (num.equals("hi")){
                return 33.4;
            }
            else{
                return Double.valueOf(num);
            }

        }
        
    }
}
