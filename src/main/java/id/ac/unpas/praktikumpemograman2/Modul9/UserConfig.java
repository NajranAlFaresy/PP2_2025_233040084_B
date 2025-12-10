/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul9;

import java.io.Serializable;
/**
 *
 * @author NAJRAN AL-FARESY
 */
public class UserConfig implements Serializable{
    private String username;
    private int fontsize;
    
    private String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public int getFontsize() {
        return fontsize;
    }
    
    public void setFontsize() {
        this.fontsize = fontsize;
    }
}
