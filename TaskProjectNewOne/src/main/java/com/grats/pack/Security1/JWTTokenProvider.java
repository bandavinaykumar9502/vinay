package com.grats.pack.Security1;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTTokenProvider {

	public String generateToken(Authentication authentication) {
		String email = authentication.getName();
		
		Instant now = Instant.now();
		Instant expireTime = now.plus(1,ChronoUnit.HOURS);
		Date currentDate = Date.from(now);
		Date expiration = Date.from(expireTime);
		
		
//		Date currentDate = new Date();
//		Date expireDate = new Date(currentDate.getTime()+3600000);//3600000=milli seconds
		
		String token = Jwts.builder()
				.setSubject(email)
				.setIssuedAt(currentDate)
				.setExpiration(expiration)
				.signWith(SignatureAlgorithm.HS512, "JWTSecurityKey").compact();
		return token;
	}
	
	public String getEmailFromToken(String token) {
		Claims claims = Jwts.parser().setSigningKey("JWTSecurityKey")
		.parseClaimsJws(token).getBody();	
		return claims.getSubject();
		
	}
}
