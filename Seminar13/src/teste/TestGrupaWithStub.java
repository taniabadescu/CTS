package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import clase.Grupa;
import clase.IStudent;
import dubluri.StudentStub;

public class TestGrupaWithStub {

	Grupa grupa;
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitate() {
		grupa= new Grupa(1077);
		IStudent s1= new StudentStub();
		
		grupa.adaugaStudent(s1);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

}
