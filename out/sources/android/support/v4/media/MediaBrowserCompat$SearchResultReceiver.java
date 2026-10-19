package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import p038d.b;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends b {
    @Override // p038d.b
    public final void a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.a(bundle);
        }
        if (i10 != 0 || bundle == null || !bundle.containsKey(MetricTracker.Place.SEARCH_RESULTS)) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray(MetricTracker.Place.SEARCH_RESULTS);
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
