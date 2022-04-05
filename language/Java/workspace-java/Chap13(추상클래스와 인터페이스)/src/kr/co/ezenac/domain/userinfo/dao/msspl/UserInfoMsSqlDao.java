package kr.co.ezenac.domain.userinfo.dao.msspl;

import kr.co.ezenac.domain.userinfo.UserInfo;
import kr.co.ezenac.domain.userinfo.dao.UserInfoDao;

public class UserInfoMsSqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into MsSql DB userId = "+userInfo.getUserId());

	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into MsSql DB userId = "+userInfo.getUserId());

	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete into MsSql DB userId = "+userInfo.getUserId());

	}

}
