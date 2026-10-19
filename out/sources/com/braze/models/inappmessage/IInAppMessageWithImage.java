package com.braze.models.inappmessage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageWithImage {
    Bitmap getBitmap();

    boolean getImageDownloadSuccessful();

    String getImageUrl();

    String getLocalImageUrl();

    String getRemoteImageUrl();

    void setBitmap(Bitmap bitmap);

    void setImageDownloadSuccessful(boolean z10);

    void setLocalImageUrl(String str);

    void setRemoteImageUrl(String str);

    static /* synthetic */ void getImageDownloadSuccessful$annotations() {
    }
}
