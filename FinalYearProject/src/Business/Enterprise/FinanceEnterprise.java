/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abdusamed
 */
public class FinanceEnterprise extends Enterprise {
    
    public FinanceEnterprise(String name) {
        super(name, EnterpriseType.FINANCE);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
