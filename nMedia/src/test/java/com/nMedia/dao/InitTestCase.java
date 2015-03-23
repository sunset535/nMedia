package com.nMedia.dao;

import java.util.logging.*;

import org.junit.runner.RunWith;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

//@ContextConfiguration(locations = "classpath:applicationContext-jdbc.xml")  
@RunWith(SpringJUnit4ClassRunner.class)  
@Transactional  
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)  

public class InitTestCase  extends
AbstractTransactionalDataSourceSpringContextTests {
	private transient static Logger log = Logger
			.getLogger(InitTestCase.class.getName());

}
