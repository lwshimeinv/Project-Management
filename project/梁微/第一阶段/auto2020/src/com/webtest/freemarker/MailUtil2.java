package com.webtest.freemarker;

import java.io.File;
import java.io.UnsupportedEncodingException;
import javax.mail.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

public class MailUtil2 {
	static String server = "smtp.163.com";
	static String protocol = "smtp";
	static String from = "梁微";
	static String user = "testliangwei@163.com";
	static String password = "XQHDCVXVXKWDCZJC";

	public static void sendEmail(String email, String subject,String body) throws UnsupportedEncodingException {
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
			
			msg.setContent( body, "text/html;charset=utf-8");
			msg.saveChanges();
			Transport.send(msg, msg.getAllRecipients());
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) throws UnsupportedEncodingException, MessagingException {
		
		MimeMultipart mimeMultipart = new MimeMultipart();
		MimeBodyPart mimeBodyPart = new MimeBodyPart();
		mimeBodyPart.setContent(mimeMultipart,"text/html;charest=utf-8");
		DataHandler dataHandler = new DataHandler(new FileDataSource("D:\\java_workplace\\auto2020\\conf\\reportTemplate.html"));
		mimeBodyPart.setDataHandler(dataHandler);
		mimeBodyPart.setFileName(MimeUtility.encodeText(dataHandler.getName()));
		mimeMultipart.addBodyPart(mimeBodyPart);
		mimeMultipart.setSubType("mixed");
		MailUtil.sendEmail("testliangwei@163.com", "梁微-2018011845","lw");
		
	}

}