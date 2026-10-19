package com.google.firebase.installations.remote;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TokenResult {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResponseCode {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ResponseCode f28240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ResponseCode f28241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ResponseCode f28242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ResponseCode[] f28243e;

        static {
            ResponseCode responseCode = new ResponseCode("OK", 0);
            f28240b = responseCode;
            ResponseCode responseCode2 = new ResponseCode("BAD_CONFIG", 1);
            f28241c = responseCode2;
            ResponseCode responseCode3 = new ResponseCode("AUTH_ERROR", 2);
            f28242d = responseCode3;
            f28243e = new ResponseCode[]{responseCode, responseCode2, responseCode3};
        }

        public ResponseCode() {
            throw null;
        }

        public static ResponseCode valueOf(String str) {
            return (ResponseCode) Enum.valueOf(ResponseCode.class, str);
        }

        public static ResponseCode[] values() {
            return (ResponseCode[]) f28243e.clone();
        }
    }

    public static abstract class a {
    }

    public static b.a a() {
        b.a aVar = new b.a();
        aVar.f28253b = 0L;
        return aVar;
    }

    public abstract ResponseCode b();

    public abstract String c();

    public abstract long d();
}
