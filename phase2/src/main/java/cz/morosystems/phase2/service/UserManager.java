package cz.morosystems.phase2.service;

import java.util.List;

import cz.morosystems.phase2.entity.UserEntity;

public interface UserManager {
	public UserEntity getUser(Integer id);
    public List<UserEntity> getAllUsers();
}
