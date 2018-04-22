package com.saravanan.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Recipient's email ID needs to be mentioned.
	      String to = "saravanan.eeeee3131@above-inc.com";

	      // Sender's email ID needs to be mentioned
	      String from = "saravanane31@gmail.com";
	     /* final String username = "manishaspatil";//change accordingly
	      final String password = "******";//change accordingly
*/
	      // Assuming you are sending email through relay.jangosmtp.net
	      String host = "outbound.cisco.com";

	      Properties props = new Properties();
	     /* props.put("mail.smtp.auth", "true");*/
	     /* props.put("mail.smtp.starttls.enable", "true");*/
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.socketFactory.port", "25");
	      props.put("mail.smtp.port", "25");

	      Session session = Session.getDefaultInstance(props);
	      // Get the Session object.
	     /* Session session = Session.getInstance(props,
	         new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	               return new PasswordAuthentication("relay@eaascisco.com", "eaa@P@ssw0rd");
		   }
	         });*/

	      try {
		   // Create a default MimeMessage object.
		   Message message = new MimeMessage(session);
		
		   // Set From: header field of the header.
		   message.setFrom(new InternetAddress(from));
		
		   // Set To: header field of the header.
		   message.setRecipients(Message.RecipientType.TO,
	               InternetAddress.parse(to));
		
		   // Set Subject: header field
		   message.setSubject("Testing Subject");
		
		   // Now set the actual message
		   message.setText("Hello, this is sample for to check send " +
			"email using JavaMailAPI ");

		   // Send message
		   Transport.send(message);

		   System.out.println("Sent message successfully....");

	      }catch(SendFailedException ex){
	    	  ex.printStackTrace();
	      }
	      catch (MessagingException e) {
	         throw new RuntimeException(e);
	      }
	}

}
