
package InsulinAdministrationCalculator;

import java.util.prefs.Preferences;

/**
 *
 * @author Sergiu Borlovan
 */
public class InsulinCore {
   
    Preferences systemPref = Preferences.userRoot();   

    private String notes;

    public InsulinCore(){
        this.notes = systemPref.get("InsulinCoreNotes", "");
    }   
    
    public String getNotes(){
        String s = systemPref.get("InsulinCoreNotes", notes);
        return s;
    }
    
    public void setNotes(String s){
        notes = s;
        systemPref.put("InsulinCoreNotes", s);
    }
    
    
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
    public double checkNum(String s){
        if (s.isEmpty()){
            return 0;
        }
        else{
            if (s.equals("hi")){
                return 33.4;
            }
            else{
                return Double.valueOf(s);
            }

        }
        
    }
}
