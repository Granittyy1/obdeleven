package io.intercom.android.sdk;

/* JADX INFO: compiled from: IntercomStatusCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface IntercomStatusCallback {
    void onFailure(IntercomError intercomError);

    void onSuccess();
}
