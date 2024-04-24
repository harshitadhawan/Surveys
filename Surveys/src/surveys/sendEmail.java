package surveys;


//package com.mkyong;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.swing.*;

public class sendEmail {

    public sendEmail() {

    }

    public void send(String sender, String recipient, String password, String subject, String content) {
        Properties prop = new Properties();
        prop.put("mail.stmp.auth*", "true");// set the authentication to true
        prop.put("mail.stmp.starttls.enable*", "true ");
        prop.put("mail.stmp.host*", "stmp.gamil.com");
        prop.put("mail.stmp.port*", "587");
        Session ses = Session.getInstance(prop, new javax.mail.Authenticator() {
            private PasswordAuthentication getPassWordAuthentication() {
                return new PasswordAuthentication(sender, password);
            }
        });
        try {
            Message msg = new MimeMessage(ses);
            msg.setFrom(new InternetAddress(sender));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            msg.setSubject(subject);
            msg.setContent(content,"text/html;charset=utf-8");
            Transport.send(msg);
            sent();

        } catch (AddressException e) {
           // e.printStackTrace();
        } catch (MessagingException m) {
            throw new RuntimeException(m);
        }
    }
    private void sent() { // a nitification saying that the email is //sucessfully sent
        JDialog d = new JDialog();
        d.setTitle("Notice");
        d.setBounds(1366 / 2 - 100, 768 / 2 - 75, 200, 150);
        JLabel label = new JLabel("Your Email has been sent!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        d.getContentPane().add(label);
        d.setVisible(true);
    }

        }
    

