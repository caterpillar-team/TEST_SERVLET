package com.example.app.domain.common.service;

public interface MemberService {

	boolean deleteMember(int id) throws Exception;

	boolean login(String username, String password) throws Exception;
}
