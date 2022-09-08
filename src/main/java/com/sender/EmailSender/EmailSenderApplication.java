package com.sender.EmailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {
	@Autowired
	private EmailSenderService senderService;
	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmail("#YourEmail",
				"This is the Email Sender",
				"My name is Gustavo but you can call me Gus or SUS XD");
	}

}
