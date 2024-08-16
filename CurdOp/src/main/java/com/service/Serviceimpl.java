package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dto.CurdDto;
import com.repo.Repo;

@Service
public class Serviceimpl implements CurdService {

	@Autowired
	Repo repo;

	public void savecurd(CurdDto curddto) {
		repo.save(curddto);
	}

	public void deletecurd(Integer id) {
		repo.deleteById(id);
	}

	public void updatecurd(CurdDto curddtoIp, Integer id) {
		Optional<CurdDto> obj = repo.findById(id);
		CurdDto curddto = obj.get();
		curddto.setName(curddtoIp.getName());
		curddto.setBranch(curddtoIp.getBranch());
		curddto.setMail(curddtoIp.getMail());
		repo.save(curddto);
	}

	public CurdDto getcurd(Integer id) {
		CurdDto curddto = new CurdDto();
		Optional<CurdDto> obj = repo.findById(id);
		if (obj.isPresent()) {
			curddto = obj.get();
		}
		return curddto;

	}

	
	public void testdeletecurd(Integer id) {
		repo.deleteById(id);
	}


	public List<String> getNames() {
		
		return repo.getNames();
	}

}
