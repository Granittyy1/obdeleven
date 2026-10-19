package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import java.util.List;

/* JADX INFO: compiled from: CollectionRequestCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface CollectionRequestCallback {
    void onComplete(List<HelpCenterCollection> list);

    void onError(int i10);

    void onFailure();
}
