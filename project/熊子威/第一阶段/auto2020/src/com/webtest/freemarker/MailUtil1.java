package com.webtest.freemarker;

import java.io.UnsupportedEncodingException;
import javax.mail.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtil1 {
	static String server = "smtp.163.com";
	static String protocol = "smtp";
	static String from = "ÐÜ×ÓÍþ";
	static String user = "xzw252462163@163.com";
	static String password = "ELAEYKEUDTKAXIHE";

	public static void sendEmail(String email, String subject, String body) throws UnsupportedEncodingException {
		try {
			Properties props = new Properties();
			props.put("mail.transport.protocol", protocol);
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.host",server);
			Session session = Session.getDefaultInstance(props, new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(user, password);
					
				}
			});
			MimeMessage msg = new MimeMessage(session);
			msg.setSentDate(new Date());

			InternetAddress fromAddress = new InternetAddress(user, from, "UTF-8");
			msg.setFrom(fromAddress);
			String emailList[] = email.split(",");
			InternetAddress[] toAddress = new InternetAddress[emailList.length];

			for (int i = 0; i < emailList.length; i++) {
				toAddress[i] = new InternetAddress(emailList[i]);
			}
			// msg.setRecipients(Message.RecipientType.TO, toAddress);
			msg.addRecipients(Message.RecipientType.TO, toAddress);
			msg.setSubject(subject, "UTF-8");
			msg.setContent(body, "text/html;charset=utf-8");
			msg.saveChanges();
			Transport.send(msg, msg.getAllRecipients());
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) throws UnsupportedEncodingException {
		MailUtil1.sendEmail("xzw252462163@163.com", "ceshi", "ce");
	}

}