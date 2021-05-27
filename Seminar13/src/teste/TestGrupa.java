package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TestGrupa {
	

	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1076);
		assertEquals(1076, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorBoundaryInf()
	{
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorBoundarySup()
	{
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorError()
	{
		Grupa grupa = new Grupa(1101);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorSub1000()
	{
		Grupa grupa = new Grupa(999);
	}
	
	@Test(timeout = 500)
	public void tetsConstructorPerformance()
	{
		Grupa grupa = new Grupa(1076);
	}

	@Test
	public void tetsConstructorLista()
	{
		Grupa grupa = new Grupa(1076);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1076);
		for(int i=0;i<7;i++)
		{
			Student student = new Student("Anca");
			student.adaugaNota(4);
			student.adaugaNota(5);
			student.adaugaNota(6);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<5;i++)
		{
			Student student = new Student("Bianca");
			student.adaugaNota(8);
			student.adaugaNota(9);
			student.adaugaNota(9);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.41, grupa.getPromovabilitate(),0.05);
	}
	
	@Test
	public void testProbabilitateBoundryInf()
	{
		Grupa grupa = new Grupa(1076);
		
		for(int i=0;i<7;i++)
		{
			Student student = new Student("Anca");
			student.adaugaNota(4);
			student.adaugaNota(5);
			student.adaugaNota(6);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	public void testProbabilitateBoundrySup()
	{
		Grupa grupa = new Grupa(1076);
		
		for(int i=0;i<7;i++)
		{
			Student student = new Student("Anca");
			student.adaugaNota(7);
			student.adaugaNota(5);
			student.adaugaNota(6);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}
	
	@Test(expected =IllegalArgumentException.class)
	public void testPromovabilitateCross()
	{
	
		Grupa grupa= new Grupa(1076);
		grupa.getPromovabilitate();
	}

	
	
	
}
