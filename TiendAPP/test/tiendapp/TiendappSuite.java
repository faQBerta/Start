/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tiendapp.Product.ProductSuite;
import tiendapp.servProduct.ServProductSuite;
import tiendapp.utilities.UtilitiesSuite;

/**
 *
 * @author faQ
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({UtilitiesSuite.class, ServProductSuite.class, TiendAPPTest.class, ProductSuite.class})
public class TiendappSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
