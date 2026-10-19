package com.google.firebase.installations.remote;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InstallationResponse {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResponseCode {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ResponseCode f28237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ResponseCode f28238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ResponseCode[] f28239d;

        static {
            ResponseCode responseCode = new ResponseCode("OK", 0);
            f28237b = responseCode;
            ResponseCode responseCode2 = new ResponseCode("BAD_CONFIG", 1);
            f28238c = responseCode2;
            f28239d = new ResponseCode[]{responseCode, responseCode2};
        }

        public ResponseCode() {
            throw null;
        }

        public static ResponseCode valueOf(String str) {
            return (ResponseCode) Enum.valueOf(ResponseCode.class, str);
        }

        public static ResponseCode[] values() {
            return (ResponseCode[]) f28239d.clone();
        }
    }

    public abstract TokenResult a();

    public abstract String b();

    public abstract String c();

    public abstract ResponseCode d();

    public abstract String e();
}
