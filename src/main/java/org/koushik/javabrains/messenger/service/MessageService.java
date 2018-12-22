package org.koushik.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.koushik.javabrains.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		
		Message m1=new Message(2l, "Hello world", "Susan");
		Message m2=new Message(2l, "Hello world", "Susan");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;

	}

}
