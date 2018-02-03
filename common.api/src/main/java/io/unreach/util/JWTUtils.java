package io.unreach.util;

import java.io.UnsupportedEncodingException;
import java.util.Date;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

/**
 * @author joe
 * @date 2018/1/17
 */
public class JWTUtils {

    private static String secret = "unreach-login";

    public static long exTime = 365 * 24 * 60 * 60 * 1000;

    /**
     * 创建token
     *
     * @param id
     * @param ttlMillis
     * @return
     */
    public static String createJWT(String id, long ttlMillis) {

        Algorithm algorithm = null;
        try {
            algorithm = Algorithm.HMAC256(secret);
        } catch (UnsupportedEncodingException e) {
        }

        long now = System.currentTimeMillis();

        String token = JWT.create()
            .withIssuer("unreach")
            .withJWTId(id).withExpiresAt(new Date(now + ttlMillis))
            .sign(algorithm);

        return token;
    }

    /**
     * 解析token ，生成accountID
     *
     * @param token
     */
    public static String parseJWT(String token) {
        Algorithm algorithm = null;
        try {
            algorithm = Algorithm.HMAC256(secret);
        } catch (UnsupportedEncodingException e) {
        }
        JWTVerifier verifier = JWT.require(algorithm)
            .withIssuer("unreach")
            .build(); //Reusable verifier instance
        try {
            DecodedJWT jwt = verifier.verify(token);
            return jwt.getId();
        } catch (Exception e) {

        }
        return null;

    }

    public static void main(String[] args) {

        String token = createJWT("123",exTime);
        System.out.println(token);

        System.out.println(parseJWT(token));


    }

}
