package cz.morosystems.phase2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="User Not Found") //404
public class UserNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -694354952032299587L;
	private Integer userId;

	public UserNotFoundException(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
	}
}