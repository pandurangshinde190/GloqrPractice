package com.lcwd;


import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println(" Preparing to send message....");
		String message = "Hello ,Dear, this is message for security check .";
		String subject = "GloqrAccount : Confirmation";
		String to = "pandurangshinde190@gmail.com";
		String from = "pandurangs943@gmail.com";

		// call static function
//		sendEmail(message, subject, to, from);
		
		sendAttach(message, subject, to, from);
	}

	//this is responsible to send message with attachment
	private static void sendAttach(String message, String subject, String to, String from) 
	{
		
		// Variable for gmail host
		String host = "smtp.gmail.com";

		// get the system properties
		Properties properties = System.getProperties();
		System.out.println("PROPERTIES  = " + properties);

		
		// setting important information to properties

		// host set
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");

		// step 1: to get the session object...
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication("pandurangs943@gmail.com", "8766789525");
			}

		});
		session.setDebug(true);

		// Step 2 :compose the message(text,multimedia)
		MimeMessage mimeMessage = new MimeMessage(session);

		try 
		{

			// from email
			mimeMessage.setFrom(from);

			// adding recipient to message
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			
			// adding subject to message
			mimeMessage.setSubject(subject);
			
			
			// attachement...
			
			//file path
			String path="/home/gloqr-dev/Downloads/food.jpg";

			MimeMultipart mimeMultipart=new MimeMultipart();
			//text
			//file
			
			MimeBodyPart textMime = new MimeBodyPart();
			
			MimeBodyPart fileMime = new MimeBodyPart();
			
			try
			{
				
				textMime.setText(message);

				File file=new File(path);
				fileMime.attachFile(file);
				
				mimeMultipart.addBodyPart(textMime);
				mimeMultipart.addBodyPart(fileMime);
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			
			mimeMessage.setContent(mimeMultipart); 
			// send

			// Step 3 :sending message using transport class
			Transport.send(mimeMessage);

			System.out.println("send Succussfully");

		}
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}		
		
	}

	
	
	
	 
	// this is responsible to send email
//	private static void sendEmail(String message, String subject, String to, String from) {
//
//		// Variable for gmail host
//		String host = "smtp.gmail.com";
//
//		// get the system properties
//		Properties properties = System.getProperties();
//		System.out.println("PROPERTIES  = " + properties);
//
//		// setting important information to properties
//
//		// host set
//		properties.put("mail.smtp.host", host);
//		properties.put("mail.smtp.port", "465");
//		properties.put("mail.smtp.ssl.enable", "true");
//		properties.put("mail.smtp.auth", "true");
//
//		// step 1: to get the session object...
//		Session session = Session.getInstance(properties, new Authenticator() {
//
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				// TODO Auto-generated method stub
//				return new PasswordAuthentication("pandurangs943@gmail.com", "8766789525");
//			}
//
//		});
//		session.setDebug(true);
//
//		// Step 2 :compose the message(text,multimedia)
//		MimeMessage mimeMessage = new MimeMessage(session);
//
//		try {
//
//			// from email
//			mimeMessage.setFrom(from);
//			
//			//adding subject to message
//			mimeMessage.setSubject(subject);
//
//			// adding recipient to message
//			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//			
//			// adding subject to message
//			mimeMessage.setText(message);
//
//			// send
//
//			// Step 3 :sending message using transport class
//			Transport.send(mimeMessage);
//
//			System.out.println("send Succussfully");
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	
//	}
}
