/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Network.Hospital;

/**
 *
 * @author abdusamed
 */
public class HospitalAssistanceRequest extends WorkRequest{
    private Hospital hospitalSelected;
    

    public Hospital getHospitalSelected() {
        return hospitalSelected;
    }

    public void setHospitalSelected(Hospital hospitalSelected) {
        this.hospitalSelected = hospitalSelected;
    }
    
    @Override
    public String toString(){
        return hospitalSelected.getName();
    }
}
