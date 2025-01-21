package himedia.phonebook.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.phonebook.mappers.PhonebookMapper;
import himedia.phonebook.repository.vo.PhonebookVo;

@Repository
public class PhonebookDaoImpl implements PhonebookDao {
	@Autowired
	private PhonebookMapper phonebookMapper;
	
	@Override
	public int insert(PhonebookVo phonebookVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(PhonebookVo phonebookVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PhonebookVo selectOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhonebookVo> selectAll() {
		List<PhonebookVo> list = phonebookMapper.selectAll();
		return list;
	}

}
