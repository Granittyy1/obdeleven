package com.facebook.login;

import android.util.Base64;
import com.facebook.FacebookException;
import java.security.MessageDigest;
import kotlin.text.Regex;

/* JADX INFO: compiled from: PKCEUtil.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B {
    public static final String a(String codeVerifier) throws FacebookException {
        kotlin.jvm.internal.i.e(codeVerifier, "codeVerifier");
        if (!b(codeVerifier)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        try {
            byte[] bytes = codeVerifier.getBytes(kotlin.text.a.f43121c);
            kotlin.jvm.internal.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            kotlin.jvm.internal.i.d(strEncodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
            return strEncodeToString;
        } catch (Exception e10) {
            throw new FacebookException(e10);
        }
    }

    public static final boolean b(String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").e(str);
    }
}
