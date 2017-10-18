package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	
	@Test
	public void addArrivalTest() {
		AthleticGame ag=new AthleticGame("Atletica");
		ag.addArrival("Melo", Instant.now());
		
		Assert.assertEquals(1, ag.getArrivals().size());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void getPartecipantTest() {
		AthleticGame ag=new AthleticGame("Atletica");
		ag.addArrival("Melo", Instant.now());
		
		ag.getParecipiantTime("Carmelo");
		
	}
}
