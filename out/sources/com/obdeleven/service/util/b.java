package com.obdeleven.service.util;

import J4.i;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: Converter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f29554a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f29554a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < str.length()) {
            int i11 = i10 + 2;
            sb2.append((char) Integer.parseInt(str.substring(i10, i11), 16));
            i10 = i11;
        }
        return sb2.toString();
    }

    public static String c(String str) {
        byte[] bytes = str.getBytes();
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bytes) {
            sb2.append(String.format("%02X", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    public static String d(int i10, String str) {
        int i11 = Integer.parseInt(str);
        Locale locale = Locale.US;
        return String.format(i.c(i10, "%0", "X"), Integer.valueOf(i11));
    }

    public static byte[] e(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    public static byte[] f(int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        return byteBufferAllocate.array();
    }

    public static String g(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 4; i11++) {
            sb2.append(String.format("%02X", Integer.valueOf((i10 >> (i11 * 8)) & 255)));
        }
        return sb2.toString();
    }

    public static ArrayList h(int i10, String str) {
        ArrayList arrayList = new ArrayList(((str.length() + i10) - 1) / i10);
        int i11 = 0;
        while (i11 < str.length()) {
            int i12 = i11 + i10;
            arrayList.add(Short.valueOf(Integer.valueOf(str.substring(i11, Math.min(str.length(), i12)), 16).shortValue()));
            i11 = i12;
        }
        return arrayList;
    }
}
