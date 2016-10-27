/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpc;

/**
 *
 * @author sisley1
 */
public final class Outils {
    
    public static int TextMoisToInt(String mois)
    {
        int iMois = 1;
        
        GespersonnelInterface G1 = new GespersonnelInterface();
        
        for(int i=0; i<= G1.mois.length-1; i++)
        {
            if(G1.mois[i] == mois){
                iMois = i;
                break;
            }
        }
        
        iMois++;
        return iMois;
    }
}
