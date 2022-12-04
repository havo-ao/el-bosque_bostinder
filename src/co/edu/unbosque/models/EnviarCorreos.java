/**
 * 
 */
package co.edu.unbosque.models;
/**
 * 
 */
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 * Esta clase nos permite enviar el correo
 * @author Sofia Morales, Andres Cañon
 *
 */
public class EnviarCorreos {

	private Properties properties;

	public EnviarCorreos() {

		properties 	= new Properties();
//		Scanner sc = new Scanner(System.in);
		
	}
	public void Enviar(String destinatariom) {

		properties.setProperty("mail.smtp.host", "smtp.gmail.com"); //cual es el host
		properties.setProperty("mail.smtp.starttls.enable", "true"); //tls 
		properties.setProperty("mail.smtp.port", "587"); //host  //si no sirve pon el otro son servers gratis
		properties.setProperty("mail.smtp.auth", "true");//autenticacion

		Session sesion = Session.getDefaultInstance(properties);
		String correoEnvia = "bostinderbo@gmail.com"; //el correo que envio
		String pasword = "pwmcuomqbjbnurei";
		//String des = sc.nextLine();
		String destinatario =destinatariom; //que atrape lo del textfield de andres que seria tipo ventana.getText
		String asunto = "Registro EXITOSO";
		String mensaje = "THANKS FOR REGISTERING...<3";

		MimeMessage mail = new MimeMessage(sesion);
		try {
			//Esto para redactar
			mail.setFrom(new InternetAddress(correoEnvia));
			mail.addRecipient(Message.RecipientType.TO,new InternetAddress(destinatario)); //hago lo de enviar el correo
			mail.setSubject(asunto);   //ps el asunto escribirlo
			mail.setText(mensaje); //Setear el cuerpo 
			//Esto es pa enviarlo
			Transport transporte = sesion.getTransport("smtp"); //el server
			transporte.connect(correoEnvia,pasword);
			transporte.close();
			System.out.println("envio exitoso");


		} catch (AddressException e) {
			System.out.println("error adress");		} 
		catch (MessagingException e) {
			System.out.println("ERROR MESSAGING");	
		}

	}
}
