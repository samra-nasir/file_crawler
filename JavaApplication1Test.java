/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ftahir.bese13seecs
 */
public class JavaApplication1Test {
    
    public JavaApplication1Test() {
    }
    /**
     * Test of search method, of class JavaApplication1.
     */
    @Test
    public void testSearch() throws Exception {
        System.out.println("search");
        File f1 = new File("C:\\Users\\ftahir.bese13seecs\\Desktop\\abc\\");
        assertEquals(false,JavaApplication1.createMap(f1));
        
        // TODO review the generated test code and remove the default call to fail.
        
       // fail("The test case is a prototype.");
    }
    
}
