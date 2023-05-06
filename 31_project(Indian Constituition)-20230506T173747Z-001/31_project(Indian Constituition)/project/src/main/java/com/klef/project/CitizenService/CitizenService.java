package com.klef.project.CitizenService;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.klef.project.domain.Citizen;
import com.klef.project.repository.CitizenRepository;

@Service
@Transactional
public class CitizenService {
  private final CitizenRepository MyRepository;
  
  public CitizenService( CitizenRepository MyRepository) {
    this.MyRepository=MyRepository;
  }
  
  public void save(Citizen model) {
    MyRepository.save(model);
  }

  public Citizen findByEmailAndPassword(String email, String password) {
    return  MyRepository.findByEmailAndPassword(email, password);
  }
}