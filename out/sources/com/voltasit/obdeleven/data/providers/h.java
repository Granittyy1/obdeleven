package com.voltasit.obdeleven.data.providers;

import com.voltasit.parse.Parse;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: EncryptionProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements J8.i {
    @Override // J8.i
    public final String c(int i10) {
        String strInvokeNativeFunction = Parse.invokeNativeFunction(i10);
        kotlin.jvm.internal.i.d(strInvokeNativeFunction, "invokeNativeFunction(...)");
        return strInvokeNativeFunction;
    }

    @Override // J8.i
    public final byte[] d() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    @Override // J8.i
    public final byte[] e(byte[] bArr, byte[] key, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        kotlin.jvm.internal.i.e(key, "key");
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        kotlin.jvm.internal.i.d(cipher, "getInstance(...)");
        cipher.init(2, new SecretKeySpec(secretKeySpec.getEncoded(), "AES"), new IvParameterSpec(bArr2));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        kotlin.jvm.internal.i.d(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    @Override // J8.i
    public final byte[] f(byte[] data, byte[] bArr, byte[] iv) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        kotlin.jvm.internal.i.e(data, "data");
        kotlin.jvm.internal.i.e(iv, "iv");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        kotlin.jvm.internal.i.d(cipher, "getInstance(...)");
        cipher.init(1, new SecretKeySpec(secretKeySpec.getEncoded(), "AES"), new IvParameterSpec(iv));
        byte[] bArrDoFinal = cipher.doFinal(data);
        kotlin.jvm.internal.i.d(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }
}
