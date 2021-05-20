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
