package himedia.phonebook.exceptions;

import himedia.phonebook.repository.vo.PhonebookVo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhonebookDaoException extends RuntimeException {
	private PhonebookVo phonebookVo = null;

	public PhonebookDaoException(String message, Throwable cause, PhonebookVo vo) {
		super(message, cause);
		this.phonebookVo = vo;
	}
	
}
