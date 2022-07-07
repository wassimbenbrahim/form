package com.project.cft.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.project.cft.entities.inscription;
import com.project.cft.repo.inscridao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@RequiredArgsConstructor  
@Slf4j
@Service
public class InscriServiceImpl implements InscriService {
	  @Autowired
	    private JavaMailSender mailSender;
	@Autowired
	private inscridao inscriRepository;
	@Override
	public Iterable<inscription> listAlletudients() {
		// TODO Auto-generated method stub
		return inscriRepository.findAll() ;
	}

	@Override
	public inscription getetudientById(Long id) {
		// TODO Auto-generated method stub
		return inscriRepository.findById(id).orElse(null);
	}

	@Override
	public void saveinscri(inscription inscription) {
	   
		 inscriRepository.save(inscription) ;
			
			

	}

	@Override
	public String deleteetudient(Long id) {
		inscriRepository.deleteById(id);
	        return "student removed !! " + id;		
	}
	  @Override
	    public inscription findById(Long id) {
	        return inscriRepository.findById(id).get() ;
	    }

	  public void sendSimpleEmail(String toEmail,
              String body,
              String subject) {
SimpleMailMessage message = new SimpleMailMessage();

message.setFrom("wassimpidev@gmail.com");
message.setTo(toEmail);
message.setText(body);
message.setSubject(subject);

mailSender.send(message);
System.out.println("Mail Send...");
}

	@Override
	public inscription retrieveaccepté(Long id) {
		// TODO Auto-generated method stub
		inscription inv = inscriRepository.findById(id).orElse(null);
		inv.setStatus(true);
		inscriRepository.save(inv);
		return inv;
	}
	
	public Collection<inscription> findAllacceptedstudent(){
		return inscriRepository.findAllacceptedstudent() ;
		
	}

	@Override
	public Collection<inscription> listeattente(){
		return inscriRepository.listeattente();	}

	  
	 

}
