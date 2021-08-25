/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignedproject;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pavan.reddy
 */
public class AssignFarmerTest {
    
    public AssignFarmerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testhello() {
        List<Asset> ag= new ArrayList<Asset>();
        List<Farmer> fg=new ArrayList<Farmer>();
        ag.add(new Asset(1,new Address("sanganakal",0.0,0.1),6.25));
        ag.add(new Asset(2,new Address("bangalore",0.0,0.2),12.98));
        ag.add(new Asset(3,new Address("dharward",0.0,0.3),0.75));
        ag.add(new Asset(4,new Address("bangalore",0.0,0.4),1.22));
        ag.add(new Asset(5,new Address("sanganakal",0.0,0.5),93.01));
        ag.add(new Asset(6,new Address("Hosapete",0.0,0.6),25.23));
        ag.add(new Asset(7,new Address("guntakal",0.0,0.7),0.37));
        ag.add(new Asset(8,new Address("anathapur",0.0,0.8),67.54));
        ag.add(new Asset(9,new Address("sanganakal",0.0,0.9),0.99));
        ag.add(new Asset(10,new Address("Guntakal",0.0,0.10),128.61));
        
        
         fg.add(new Farmer(1,"pavan",new Address("sangankal",0.0,0.1)));
        fg.add(new Farmer(2,"malli",new Address("bangalore",0.0,0.2)));
        fg.add(new Farmer(3,"karthk",new Address("dharward",0.0,0.3)));
        fg.add(new Farmer(4,"harsha",new Address("guntakal",0.0,0.4)));
        fg.add(new Farmer(5,"raja",new Address("anathapur",0.0,0.5)));
        
        AssignFarmers af=new AssignFarmers();
        af.AssignNearsetFarmerToAsset(fg, ag);
        
        assertEquals(fg.get(0).getId(), ag.get(0).getOwnerid().getId());
        assertEquals(fg.get(1).getId(), ag.get(1).getOwnerid().getId());
       assertEquals(fg.get(2).getId(), ag.get(2).getOwnerid().getId());
        assertEquals(fg.get(3).getId(), ag.get(3).getOwnerid().getId());
        assertEquals(fg.get(4).getId(), ag.get(4).getOwnerid().getId());
        assertEquals(fg.get(4).getId(), ag.get(5).getOwnerid().getId());
        assertEquals(fg.get(4).getId(), ag.get(6).getOwnerid().getId());
        assertEquals(fg.get(4).getId(), ag.get(7).getOwnerid().getId());
        assertEquals(fg.get(4).getId(), ag.get(8).getOwnerid().getId());
        assertEquals(fg.get(0).getId(), ag.get(9).getOwnerid().getId());
    
    }
}
