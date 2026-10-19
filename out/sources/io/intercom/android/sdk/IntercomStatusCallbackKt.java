package io.intercom.android.sdk;

/* JADX INFO: compiled from: IntercomStatusCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomStatusCallbackKt {
    private static final IntercomStatusCallback noStatusCallback = new IntercomStatusCallback() { // from class: io.intercom.android.sdk.IntercomStatusCallbackKt$noStatusCallback$1
        @Override // io.intercom.android.sdk.IntercomStatusCallback
        public void onFailure(IntercomError intercomError) {
            kotlin.jvm.internal.i.e(intercomError, "intercomError");
        }

        @Override // io.intercom.android.sdk.IntercomStatusCallback
        public void onSuccess() {
        }
    };

    public static final IntercomStatusCallback getNoStatusCallback() {
        return noStatusCallback;
    }
}
