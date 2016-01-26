package cz.morosystems.phase2.dao;

import java.util.List;
import cz.morosystems.phase2.entity.UserEntity;

public interface UserDAO {
	public UserEntity getUser(Integer id);
    public List<UserEntity> getAllUsers();
}