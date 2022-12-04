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
 * Esta clase nos permite enviar el correo a los usuarios.
 * @author Andrés Cañón, Sofía Morales, Camilo Silva, Bryan Gafaro
 *
 */
public class EnviarCorreos {
	/**
	 * Variable properties de tipo Properties
	 */
	private Properties properties;
	/**
	 * Metodo constructor de la clase correo que incializa las variables de la clase. 
	 * <b>pre</b> Las variables debieron ser creadas previamente. <br>
	 * <b>post</b> Las variables fueron inicializadas. <br>
	 */
	public EnviarCorreos() {

		properties 	= new Properties();
//		Scanner sc = new Scanner(System.in);
		
	}
	/**
	 * Este metodo se encarga de enviar los correos a los usuarios. <br>
	 * <b>pre</b> Se debe ingresar el correo del usuario al que se le desea enviar. <br>
	 * <b>post</b> El correo es enviado a la persona selccionada. <br>
	 * @param destinatariom es el correo del usurio al que se le enviará el mensaje. destinatariom != null, destinatariom != " ". <br>
	 */
	public void Enviar(String destinatariom) {

		properties.setProperty("mail.smtp.host", "smtp.gmail.com"); 
		properties.setProperty("mail.smtp.starttls.enable", "true");  
		properties.setProperty("mail.smtp.port", "587"); 
		properties.setProperty("mail.smtp.auth", "true");

		Session sesion = Session.getDefaultInstance(properties);
		String correoEnvia = "bostinderbo@gmail.com"; 
		String pasword = "pwmcuomqbjbnurei";
		
		String destinatario =destinatariom; 
		String asunto = "Registro EXITOSO";
		String mensaje = "THANKS FOR REGISTERING...<3";

		MimeMessage mail = new MimeMessage(sesion);
		try {
			
			mail.setFrom(new InternetAddress(correoEnvia));
			mail.addRecipient(Message.RecipientType.TO,new InternetAddress(destinatario)); 
			mail.setSubject(asunto);   
			mail.setText(mensaje); 
			
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
