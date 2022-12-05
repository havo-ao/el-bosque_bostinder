package co.edu.unbosque.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class FileCSV {
	public FileCSV() {


	}

	public ArrayList<People> loadCSVMan() throws ParseException{

		ArrayList<People> men = new ArrayList<People>();
		People user;
		People admin;

		DecimalFormat format = new DecimalFormat("#.00");
		try {

			BufferedReader br = new BufferedReader(new FileReader("datos/datos.csv"));
			CSVParser parser = CSVFormat.DEFAULT.withDelimiter(';').withHeader().parse(br);
			for (CSVRecord record : parser) {
				if (record.get("Sexo").equals("H")) {

					String nombre = record.get("Nombre") + " " + record.get("Apellido1") + " "
							+ record.get("Apellido2");
					String alias = record.get("Usuario");
					String password = record.get("Contrase�a");
					int edad = Integer.parseInt(record.get("Edad"));
					String correo = record.get("Correo");
					int height = Integer.parseInt(record.get("Altura"));
					Double salary = Double.parseDouble(record.get("Ingresos"));

					LocalDate born =  LocalDate.parse(record.get("Nacimiento")); ;
					int likes = Integer.parseInt(record.get("NumeroLikesRecibidos"));
					String state = record.get("Estado");
					String gender ="male";
					user = new Men(alias, password,correo,state,gender,nombre,born,height,salary );
					if(user.getStatus().toLowerCase().equals("Inactivo")) {
						continue;

					}
					men.add(user);
				}

			}
		}
		catch (NullPointerException e) {
			System.out.println(1);
		} catch (IOException e) {
			System.out.println(2);
		}


		return men;

	}

	public ArrayList<People> LoadCSVWoman() {

		ArrayList<People> women = new ArrayList<People>();
		People usuario;
		try {
			BufferedReader br = new BufferedReader(new FileReader("datos/datos.csv"));
			CSVParser parser = CSVFormat.DEFAULT.withDelimiter(';').withHeader().parse(br);

			for (CSVRecord record : parser) {

				if (record.get("Sexo").equals("M")) {
					String nombre = record.get("Nombre") + " " + record.get("Apellido1") + " "
							+ record.get("Apellido2");
					String alias = record.get("Usuario");
					String password = record.get("Contrase�a");
					int edad = Integer.parseInt(record.get("Edad"));
					String correo = record.get("Correo");
					String divorce = record.get("Divorcio");
					int height = Integer.parseInt(record.get("Altura"));
					LocalDate born =  LocalDate.parse(record.get("Nacimiento")); ;
					int likes = Integer.parseInt(record.get("NumeroLikesRecibidos"));
					String state = record.get("Estado");
					String gender ="female";

					//String path = "images/userpics/woman.jpeg";
					usuario = new Woman( alias, password, correo,state,gender,nombre,born,height,divorce);
					if( usuario.getStatus().toLowerCase().equals("Inactivo"))
						//						continue;	
						women.add(usuario);
				}

			}
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

		return women;


	}

}
