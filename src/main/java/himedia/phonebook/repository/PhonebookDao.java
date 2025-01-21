package himedia.phonebook.repository;

import java.util.List;

import himedia.phonebook.repository.vo.PhonebookVo;

public interface PhonebookDao {
	public int insert(PhonebookVo phonebookVo);
	public int update(PhonebookVo phonebookVo);
	public int delete(Integer id);
	public PhonebookVo selectOne(Integer id);
	public List<PhonebookVo> selectAll();
}
