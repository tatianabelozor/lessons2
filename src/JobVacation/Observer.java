/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JobVacation;

import java.util.List;

/**
 *
 * @author User
 */
public interface Observer {
    public void HandleEvent(List<String> vacations);
    
}
