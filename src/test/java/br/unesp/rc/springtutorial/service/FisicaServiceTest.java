/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.springtutorial.service;

import br.unesp.rc.springtutorial.entity.Fisica;
import br.unesp.rc.springtutorial.utils.InstanceGenerator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author marcospaulo
 */
@SpringBootTest
public class FisicaServiceTest {
    
   private Fisica entity;

    @Autowired
    private FisicaService fs = new FisicaService();
    
    @Test
    @DisplayName("FisicaService.save(Fisica)")
    void testSave() {
        entity = InstanceGenerator.getPessoaFisica("222.333.444-55", "user1");
        System.out.println(entity);
        
        Fisica f = fs.save(entity);
        System.out.println("----------------------------------------");
        System.out.println(f);
        System.out.println("----------------------------------------");
        
        assertEquals(entity, f);
    }
    
    @Test
    @DisplayName("FisicaService.findByCpf(cpf)")
    void testFindByCpf() {
        entity = InstanceGenerator.getPessoaFisica("222.333.444-55", "user1");

        String cpf = "222.333.444-55";
        Fisica f = fs.findByCpf(cpf);
        System.out.println("----------------------------------------");
        System.out.println(f);
        System.out.println("----------------------------------------");       
        
        assertEquals(entity, f);
    }
    
    
    @Test
    @DisplayName("FisicaService.Delete(Fisica)")
    public void testDelete() {
        Fisica f = fs.findByCpf("222.333.444-55");
        System.out.println("----------------------------------------");
        fs.delete(f);
        Fisica expected = fs.findByCpf("222.333.444-55");
        assertNotEquals(expected,f);
        
    }

    @Disabled
    @Test
    public void testUpdate() {
        //...
    }
    
    @Disabled
    @DisplayName("FisicaService.findAll()")
    public void testFindAll() {
        System.out.println("findAll");        
        
        Fisica expResult = null;
        List<Fisica> result = fs.findAll();
        assertNotEquals(expResult, result);        
    }
    
}
