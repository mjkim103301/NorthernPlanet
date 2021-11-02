package com.pyhu.northernplanet.api.service;

import com.pyhu.northernplanet.common.dto.UserOauthDto;
import org.apache.catalina.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {

  /**
   * TokenAuthenticationFilter 만들 때 사용 UserDetails 반환.
   *
   * @param oauthId 소셜 로그인 key값
   * @return userName, password
   */
  UserDetails loadUserByOauthId(String oauthId);

  /**
   * oauthUserId로 사용자 정보 UserOauthDto 반환.
   *
   * @param oauthId 사용자 OAuthId
   * @return { 사용자 아이디, 이메일, 사용자 이름, 프로필 사진, oAuthId }
   */
  UserOauthDto getOauthUserByOauthId(String oauthId);

  /**
   * oauthId 로 userId 반환
   *
   * @param oauthId
   * @return 사용자 아이디
   */
  Long getUserIdByOauthId(int oauthId);

  /**
   * email로 사용자 정보 가져오기
   * @param email
   * @return { 사용자 아이디, 이메일, 사용자 이름, 프로필 사진, oAuthId }
   */
  UserOauthDto getUserByEmail(String email);
}
