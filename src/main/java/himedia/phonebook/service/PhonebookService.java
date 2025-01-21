package himedia.phonebook.service;

import java.util.List;

import himedia.phonebook.repository.vo.PhonebookVo;

public interface PhonebookService {
	public boolean insertPhonebook(PhonebookVo phonebookVo);
	public boolean updatePhonebook(PhonebookVo phonebookVo);
	public boolean deletePhonebook(Integer id);
	public PhonebookVo selectPhonebook(Integer id);
	public List<PhonebookVo> selectPhonebookList();
}
