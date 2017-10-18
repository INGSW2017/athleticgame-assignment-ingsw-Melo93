package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {
	
	private static AthleticGame ag;
	
	@BeforeClass
	public static void init() {
		ag=new AthleticGame("Atletica");
		
	}
	
	@After
	public void reset() {
		ag.reset();
	}
	
	@Before
	public void start() {
		ag.start();
	}
	
	@Test
	public void getWinnerNameTest() {
		ag.addArrival("Melo", Instant.now());
		ag.addArrival("Cicco", Instant.now().plusMillis(1000));
		Assert.assertEquals("Melo", ag.getWinner());	
	}
	
	@Test
	public void getWinnerTimeTest() {
		ag.addArrival("Melo", Instant.now());
		ag.addArrival("Cicco", Instant.now().plusMillis(1000));
		Assert.assertEquals(Instant.now(), ag.getArrivals().get(ag.getWinner()));
	}
}
