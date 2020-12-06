package com.webtest.freemarker;

import java.io.File;
import java.io.UnsupportedEncodingException;
import javax.mail.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;

//import javax.activation.DataHandler;
//import javax.activation.FileDataSource;
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
	static String from = "周心羽";
	static String user = "zhouxinyu00420@163.com";
	static String password = "zxy721025";

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
					"	<div style=\"font-size:12px\">鑷姩鍖栨祴璇曟姤鍛�-----${date?string(\"yyyy-MM-dd HH:mm:ss\")}\r\n" + 
					"<br/>鏈鍏辫繍琛岃嚜鍔ㄥ寲case:${casesize}涓紝鍏朵腑FAIL:${failcasesize}涓猏r\n" + 
					"\r\n" + 
					"<br/>\r\n" + 
					"<br/>\r\n" + 
					"<div>\r\n" + 
					"  <table width=\"100%\"  border=\"1\" cellspacing=\"0\"  style=\"font-size:12px; font-family:'MS Serif', 'New York', serif;\">\r\n" + 
					"  \r\n" + 
					"  \r\n" + 
					"   <!-- 澶辫触case鍒楄〃-->\r\n" + 
					"  <#if failedList?size gt 0>\r\n" + 
					"   <tr   height=\"40\">\r\n" + 
					"    <th  colspan=\"4\" align=\"left\" nowrap bgcolor=\"#66CC33\"   scope=\"col\"><div style=\"color:red; \">浠ヤ笅case鎵ц澶辫触锛�</div>\r\n" + 
					"    </th>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr bgcolor=\"#FFCC66\" height=\"35\">\r\n" + 
					"    <th  width=\"8%\"  nowrap scope=\"col\">搴忓彿</th>\r\n" + 
					"    <th  width=\"15%\"    scope=\"col\">test method</th>\r\n" + 
					"    <th  width=\"45%\"   nowrap scope=\"col\">case title</th>\r\n" + 
					"    <th    nowrap scope=\"col\">娴嬭瘯缁撹</th>\r\n" + 
					"  </tr>\r\n" + 
					"\r\n" + 
					"  <#list failedList as case>\r\n" + 
					"  <tr >\r\n" + 
					"    <td align=\"center\">${case_index+1}</td>\r\n" + 
					"    <td>${case.getMethod()}</td>\r\n" + 
					"    <td>${case.getAttribute(\"name\")}</td>\r\n" + 
					"    <td>\r\n" + 
					"    	<div style=\"color:red;\">fail</div>\r\n" + 
					"    </td>\r\n" + 
					"  </tr>\r\n" + 
					"  </#list>\r\n" + 
					"  </#if>\r\n" + 
					"  \r\n" + 
					"  <!--鎴愬姛case鍒楄〃-->\r\n" + 
					"  <#if (passedList?size gt 0)>\r\n" + 
					"  <tr   height=\"40\">\r\n" + 
					"    <th  colspan=\"4\" align=\"left\" nowrap bgcolor=\"#66CC33\"   scope=\"col\">浠ヤ笅case鎵ц鎴愬姛</th>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr bgcolor=\"#FFCC66\" height=\"35\">\r\n" + 
					"    <th  width=\"8%\" nowrap  scope=\"col\">搴忓彿</th>\r\n" + 
					"    <th  width=\"15%\"    scope=\"col\">test method</th>\r\n" + 
					"    <th  width=\"45%\"   nowrap scope=\"col\">case title</th>\r\n" + 
					"    <th    nowrap scope=\"col\">娴嬭瘯缁撹</th>\r\n" + 
					"  </tr>\r\n" + 
					"\r\n" + 
					"  <#list passedList as case>\r\n" + 
					"  <tr >\r\n" + 
					"    <td align=\"center\">${case_index+1}</td>\r\n" + 
					"    <td>${case.getMethod()}</td>\r\n" + 
					"    <td>${case.getAttribute(\"name\")}</td>\r\n" + 
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
		MailUtil.sendEmail("zhouxinyu00420@163.com", "周心羽-2018011866","zxy");
		
	}

}
