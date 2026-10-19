package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;

/* JADX INFO: compiled from: CollectionContentRequestCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface CollectionContentRequestCallback {
    void onComplete(HelpCenterCollectionContent helpCenterCollectionContent);

    void onError(int i10);

    void onFailure();
}
