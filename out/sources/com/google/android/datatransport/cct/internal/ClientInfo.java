package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class ClientInfo {

    public enum ClientType {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        ClientType(int i10) {
            this.value = i10;
        }
    }

    public abstract B4.a a();

    public abstract ClientType b();
}
