/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felipebatista.fomentoapp.util;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;

/**
 *
 * @author Felipe
 */
public class Criptografia {

    public static String setMD5(String valor) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(valor.getBytes(), 0, valor.length());
            return new BigInteger(1, m.digest()).toString(16);
        } catch (Exception e) {
           e.printStackTrace();
        }
        return null;
    }
}
