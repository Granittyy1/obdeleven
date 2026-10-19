package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    private final int httpStatusCode;

    public FirebaseRemoteConfigServerException(int i10, String str) {
        super(str);
        this.httpStatusCode = i10;
    }

    public final int a() {
        return this.httpStatusCode;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.httpStatusCode = i10;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(String str, int i10, int i11) {
        super(str, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
        this.httpStatusCode = i10;
    }
}
