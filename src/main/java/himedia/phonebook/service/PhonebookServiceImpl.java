package himedia.phonebook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.phonebook.repository.PhonebookDao;
import himedia.phonebook.repository.vo.PhonebookVo;

@Service
public class PhonebookServiceImpl implements PhonebookService {

	@Autowired
	private PhonebookDao phonebookDaoImpl;
	
	@Override
	public boolean insertPhonebook(PhonebookVo phonebookVo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePhonebook(PhonebookVo phonebookVo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePhonebook(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PhonebookVo selectPhonebook(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhonebookVo> selectPhonebookList() {
		return phonebookDaoImpl.selectAll();
	}

}
