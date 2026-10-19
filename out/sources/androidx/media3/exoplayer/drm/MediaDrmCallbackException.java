package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p140l1.e;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {
    public final long bytesLoaded;
    public final e dataSpec;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uriAfterRedirects;
}
