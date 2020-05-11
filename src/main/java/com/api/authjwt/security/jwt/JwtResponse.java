package com.api.authjwt.security.jwt;

public class JwtResponse {
	
	private String token;
    private String tokenHeader = "Bearer";
    
    public JwtResponse (String token) {
        this.token = token;
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTokenHeader() {
		return tokenHeader;
	}

	public void setTokenHeader(String tokenHeader) {
		this.tokenHeader = tokenHeader;
	}
    
    

}
