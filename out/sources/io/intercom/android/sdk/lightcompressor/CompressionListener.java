package io.intercom.android.sdk.lightcompressor;

/* JADX INFO: compiled from: CompressionInterface.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface CompressionListener {
    void onCancelled(int i10);

    void onFailure(int i10, String str);

    void onProgress(int i10, float f10);

    void onStart(int i10);

    void onSuccess(int i10, long j, String str);
}
