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

public class MailUtil {
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
			
			msg.setContent(
					"<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"UTF-8\">\r\n" + 
					"<title>Insert title here</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"	<div style=\"font-size:12px\">自动化测试报告-----2020-12-1 13:22:34\r\n" + 
					"<br/>本次共运行自动化50个，其中FAIL:0个\r\n" + 
					"\r\n" + 
					"<br/>\r\n" + 
					"<br/>\r\n" + 
					"<div>\r\n" + 
					"  <table width=\"100%\"  border=\"1\" cellspacing=\"0\"  style=\"font-size:12px; font-family:'MS Serif', 'New York', serif;\">\r\n" + 
					"  \r\n" + 
					"  \r\n" + 
					"  <!--成功case列表-->\r\n" + 
					
					"  <tr   height=\"40\">\r\n" + 
					"    <th  colspan=\"4\" align=\"left\" nowrap bgcolor=\"#66CC33\"   scope=\"col\">以下case执行成功</th>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr bgcolor=\"#FFCC66\" height=\"35\">\r\n" + 
					"    <th  width=\"8%\" nowrap  scope=\"col\">序号</th>\r\n" + 
					"    <th  width=\"15%\"    scope=\"col\">test method</th>\r\n" + 
					"    <th  width=\"45%\"   nowrap scope=\"col\">case title</th>\r\n" + 
					"    <th    nowrap scope=\"col\">测试结论</th>\r\n" + 
					"  </tr>\r\n" + 
					"\r\n" + 
					
					"  <tr >\r\n" + 
					"    <td align=\"center\">1</td>\r\n" + 
					"    <td>test1()[pri:1,"+
					"					 instance:com.lw.selenium.Demo]</td>\r\n" + 
					"    <td></td>\r\n" + 
					"    <td>\r\n" + 
					"    	PASS\r\n" + 
					"    </td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr >\r\n" + 
					"    <td align=\"center\">2</td>\r\n" + 
					"    <td>test2()[pri:2," + 
					"					 instance:com.lw.selenium.Demo]</td>\r\n" + 
					"    <td></td>\r\n" + 
					"    <td>\r\n" + 
					"    	PASS\r\n" + 
					"    </td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr >\r\n" + 
					"    <td align=\"center\">3</td>\r\n" + 
					"    <td>test3()[pri:3," + 
					"					instance:com.lw.selenium.Demo]</td>\r\n" + 
					"    <td></td>\r\n" + 
					"    <td>\r\n" + 
					"    	PASS\r\n" + 
					"    </td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr >\r\n" + 
					"    <td align=\"center\">4</td>\r\n" + 
					"    <td>test4()[pri:4," + 
					"					instance:com.lw.selenium.Demo]</td>\r\n" + 
					"    <td></td>\r\n" + 
					"    <td>\r\n" + 
					"    	PASS\r\n" + 
					"    </td>\r\n" + 
					"  </tr>\r\n" + 
					
					"  </#list>\r\n" + 
					"   </#if>\r\n" + 
					"\r\n" + 
					"</table>\r\n" + 
					"</div>\r\n" + 
					"</body>\r\n" + 
					"</html>", "text/html;charset=utf-8");
			msg.saveChanges();
			Transport.send(msg, msg.getAllRecipients());
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) throws UnsupportedEncodingException, MessagingException {
		
//		MimeMultipart mimeMultipart = new MimeMultipart();
//		MimeBodyPart mimeBodyPart = new MimeBodyPart();
//		mimeBodyPart.setContent(mimeMultipart,"text/html;charest=utf-8");
//		DataHandler dataHandler = new DataHandler(new FileDataSource("D:\\java_workplace\\auto2020\\conf\\reportTemplate.html"));
//		mimeBodyPart.setDataHandler(dataHandler);
//		mimeBodyPart.setFileName(MimeUtility.encodeText(dataHandler.getName()));
//		mimeMultipart.addBodyPart(mimeBodyPart);
//		mimeMultipart.setSubType("mixed");
//		File file = new File("D:\\java_workplace\\auto2020\\conf\\reportTemplate.html");
		MailUtil.sendEmail("testliangwei@163.com", "梁微-2018011845","lw");
		
	}

}