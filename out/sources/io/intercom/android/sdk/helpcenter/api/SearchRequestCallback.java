package io.intercom.android.sdk.helpcenter.api;

import java.util.List;

/* JADX INFO: compiled from: SearchRequestCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface SearchRequestCallback {
    void onComplete(List<HelpCenterArticleSearchResult> list);

    void onError(int i10);

    void onFailure();
}
