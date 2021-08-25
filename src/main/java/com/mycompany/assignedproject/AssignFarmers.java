/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignedproject;

import java.util.List;

/**
 *
 * @author pavan.reddy
 */
public class AssignFarmers {
    public void AssignNearsetFarmerToAsset(List<Farmer> fg,List<Asset> ag){
        for(Asset a:ag){
            Farmer nearset=null;
            double mindist=Double.MAX_VALUE;
            for(Farmer f:fg){
                double dist=Math.sqrt(Math.pow(a.getAddress().getLatitude()-f.getAddress().getLatitude(), 2)+
                        Math.pow(a.getAddress().getLongitude()-f.getAddress().getLongitude(), 2));
                if(dist<mindist){
                    mindist=dist;
                    nearset=f;
                }
            }
            a.setOwnerid(nearset);
        }
        
    }
}
