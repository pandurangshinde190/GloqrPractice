package com.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	
	List<Contact> list=new ArrayList<Contact>();
	public ContactServiceImpl()
	{
		list.add(new Contact(1L,"pandurangs190@gmail.com","Abhi", 123L));
		list.add(new Contact(2L,"salim1509997@gmail.com","Salim", 456L));
		list.add(new Contact(3L,"rohan@gmail.com","Rohan", 789L));	
		list.add(new Contact(4L,"amit@gmail.com","Amit", 789L));	
		
	}
	
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(Contact->Contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
