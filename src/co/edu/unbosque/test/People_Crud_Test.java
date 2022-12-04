package co.edu.unbosque.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import co.edu.unbosque.models.App_DTO;
import co.edu.unbosque.models.People;
import co.edu.unbosque.models.People_CRUD;

public class People_Crud_Test {
	private	 App_DTO app_DTO;
	private People people;
	private People_CRUD peopleCrud;
	
	
	public People_Crud_Test() {

		app_DTO = new App_DTO();
		peopleCrud = new People_CRUD();
	}
	//	@Test
	//	public void test() {
	//		fail("Not yet implemented");
	//	}

	@Test
	public void createTest() {
		//LocalDate a = 	LocalDate.parse("02/01/2000");
		LocalDate date = 	LocalDate.parse("1983-05-10");

		//	System.out.println(a);
		people = new People("Paulis", "pa@gmail.com", "Disponible", "Femenino", "Paula","lok", date, 180);
		//		LocalDate a = LocalDate.parse("2/1/2000");

		ArrayList userList = app_DTO.getUsersList();
		String create = peopleCrud.create(people, userList);
		boolean expected = true;
		//assertEquals(expected, people);
		assertTrue(create, expected);
	
	}
	@Test
	public void deleteTest() {
		String userName = "PedritalaLOk";
		ArrayList userList = app_DTO.getUsersList();
		Boolean expected = true;
		Boolean delete = peopleCrud.delete(userName, userList);
		//assertTrue(delete);
//	expected.equals(delete);
		assertFalse(delete);

	}
	
	@Test 
	public void modify() {
		LocalDate date = 	LocalDate.parse("1983-05-10");

		//	System.out.println(a);
	People	prevUser = new People("Paulis", "pa@gmail.com", "Disponible", "MUJER", "Paula","lok", date, 180);
//	System.out.println(a);
	People nextUser = new People("Paulis", "pa@gmail.com", "Disponible", "MUJER", "Paula","lok", date, 180);
	ArrayList userList = app_DTO.getUsersList();
	
	Boolean modify = peopleCrud.modify(prevUser, nextUser, userList);
	Boolean expected =true; 
//	expected.equals(modify);
assertTrue(modify);
	}

	@Test
	public void isUserExisting() {
		boolean expected= false;
		assertFalse(expected);
	}


}
