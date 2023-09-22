/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author snehayenduri
 */
public class VitalSignsHistory {
    
    private ArrayList<VitalSigns> history;

    public VitalSignsHistory() {
        
        history = new ArrayList<>();
        
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    
    public VitalSigns addVitalSign(double temperature, double bloodPressure, int pulse, String date){
        
        VitalSigns vitalSign = new VitalSigns(temperature, bloodPressure, pulse, date);
        
        history.add(vitalSign);
        
        return vitalSign;
    }
    
     public void deleteVitalSign(VitalSigns vitalSign){
         history.remove(vitalSign);
     }
    
    
}
