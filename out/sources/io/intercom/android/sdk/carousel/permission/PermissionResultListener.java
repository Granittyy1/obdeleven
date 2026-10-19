package io.intercom.android.sdk.carousel.permission;

/* JADX INFO: loaded from: classes3.dex */
public interface PermissionResultListener {
    void requestBackgroundLocationPermission();

    void showDeniedPermanently();

    void showDeniedTemporarily();

    void showGranted();
}
