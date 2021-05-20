package tests;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume= "Gigel";
		Student student = new Student(nume);
		
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParametru()
	{
		Student student = new Student();
		assertEquals("Student", student.getNume());
	}
	
	@Test
	public void testAdaugamNota()
	{
		Student student = new Student();
		student.adaugaNota(10);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testNotaAdaugataEsteCorecta()
	{
		Student student = new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testCalculeazaMedia()
	{
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(6);
		assertEquals(5.5, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMediaFaraNote()
	{
		Student student = new Student();
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMediaONote()
	{
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}
	
	
	@Test
	public void testAdaugaNotaIncorecta()
	{
		Student student = new Student();
		int nota = 12;
		//1
		try {
			//2
			student.adaugaNota(nota);
			//3
			fail("nu trebuia sa ajunga aici. Metooda trebuia sa arunce o exceptie");
		}catch (IllegalArgumentException err) {
			// TODO: handle exception
			//4
		}
		//5
	}
	
//	@Test (expected = IllegalArgumentException.class)
//	public void testAdaugaNotaIncorectaJU4() {
//		Student student= new Student();
//		int nota=14;
//		student.adaugaNota(14);
//		
//	}


	
	@Test
	public void testAreRestante()
	{
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(4);
		assertTrue("Studentul care are restanta este marcat ca neavand restanta",student.areRestante());
	}
	
	@Test
	public void testNuAreRestante()
	{
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(7);
		assertFalse("Studentul care nu are restanta este marcat ca avand restanta",student.areRestante());
	}
	
	

}
