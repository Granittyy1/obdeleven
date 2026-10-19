package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfigException extends FirebaseException {
    private final Code code;

    public enum Code {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        Code(int i10) {
            this.value = i10;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.code = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Exception exc) {
        super(str, exc);
        this.code = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Code code) {
        super(str);
        this.code = code;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseRemoteConfigException(Throwable th) {
        super("Unable to parse config update message.", th);
        Code code = Code.CONFIG_UPDATE_MESSAGE_INVALID;
        this.code = code;
    }
}
