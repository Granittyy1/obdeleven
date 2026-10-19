package com.braze.support;

import Ia.l;
import android.content.Context;
import android.content.SharedPreferences;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import kotlin.text.n;
import p293xa.r;

/* JADX INFO: loaded from: classes.dex */
public final class StringUtils {
    public static final String CACHE_SUFFIX_PREFERENCES_FILE = "com.appboy.support.stringutils.cachefilesuffix";
    public static final String MD5_HASH_OF_THE_STRING_NULL = "37a6259cc0c1dae299a7866489dff0bd";
    private static final String NULL_USER_ID_SUBSTITUTE_STRING = "null";
    public static final String SUFFIX_CACHE_USER_ID_HASH_VALUE = "user_id_hash_value";
    public static final String SUFFIX_CACHE_USER_ID_KEY = "user_id_key";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("StringUtils");

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24325b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The saved user id hash was null or empty.";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24327c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.f24326b = str;
            this.f24327c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Generating MD5 for user id: " + this.f24326b + " apiKey: " + this.f24327c;
        }
    }

    public static final int countOccurrences(String str, String subString) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(subString, "subString");
        return n.e0(str, new String[]{subString}, 0, 6).size() - 1;
    }

    public static final String emptyToNull(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (n.S(str)) {
            return null;
        }
        return str;
    }

    public static final long getByteSize(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        byte[] bytes = str.getBytes(kotlin.text.a.f43120b);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes.length;
    }

    public static final String getCacheFileSuffix(Context context, String str) {
        kotlin.jvm.internal.i.e(context, "context");
        return getCacheFileSuffix(context, str, null);
    }

    public static final String getMd5Hash(String str) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.i.e(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(kotlin.text.a.f43120b);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest(bytes))}, 1));
    }

    private static final String getSuffixFromUserIdHashAndApiKey(String str, String str2) {
        if (str2 == null || n.S(str2)) {
            return B7.b.c(".", str);
        }
        return "." + str + '.' + str2;
    }

    public static final void ifNonEmpty(String str, l<? super String, r> block) {
        kotlin.jvm.internal.i.e(block, "block");
        if (str == null || str.length() == 0) {
            return;
        }
        block.invoke(str);
    }

    public static final boolean isBlank(String str) {
        if (str != null) {
            return n.S(str);
        }
        return false;
    }

    public static final boolean isNullOrBlank(String str) {
        return str == null || n.S(str);
    }

    public static final boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static final String truncateToByteLength(String str, int i10) {
        kotlin.jvm.internal.i.e(str, "<this>");
        if (getByteSize(str) <= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.i.d(charArray, "this as java.lang.String).toCharArray()");
        int byteSize = 0;
        for (char c10 : charArray) {
            byteSize += (int) getByteSize(String.valueOf(c10));
            if (byteSize > i10) {
                break;
            }
            sb2.append(c10);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "truncatedStringBuilder.toString()");
        return string;
    }

    public static final String getCacheFileSuffix(Context context, String str, String str2) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.i.e(context, "context");
        String str3 = str == null ? NULL_USER_ID_SUBSTITUTE_STRING : str;
        if (str3.equals(NULL_USER_ID_SUBSTITUTE_STRING)) {
            return getSuffixFromUserIdHashAndApiKey(MD5_HASH_OF_THE_STRING_NULL, str2);
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(CACHE_SUFFIX_PREFERENCES_FILE, 0);
        String string = sharedPreferences.getString(SUFFIX_CACHE_USER_ID_KEY, null);
        if (string != null && string.equals(str3)) {
            String string2 = sharedPreferences.getString(SUFFIX_CACHE_USER_ID_HASH_VALUE, null);
            if (string2 != null && string2.length() != 0) {
                return getSuffixFromUserIdHashAndApiKey(string2, str2);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) a.f24325b, 6, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, (Ia.a) new b(str3, str2), 4, (Object) null);
        String md5Hash = getMd5Hash(str3);
        sharedPreferences.edit().putString(SUFFIX_CACHE_USER_ID_KEY, str3).putString(SUFFIX_CACHE_USER_ID_HASH_VALUE, md5Hash).apply();
        return getSuffixFromUserIdHashAndApiKey(md5Hash, str2);
    }

    public static /* synthetic */ void getCACHE_SUFFIX_PREFERENCES_FILE$annotations() {
    }

    public static /* synthetic */ void getMD5_HASH_OF_THE_STRING_NULL$annotations() {
    }

    public static /* synthetic */ void getSUFFIX_CACHE_USER_ID_HASH_VALUE$annotations() {
    }

    public static /* synthetic */ void getSUFFIX_CACHE_USER_ID_KEY$annotations() {
    }
}
