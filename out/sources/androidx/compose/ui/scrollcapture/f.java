package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.graphics.Rect;
import android.media.metrics.PlaybackMetrics;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder a(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget c(AndroidComposeView androidComposeView, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(androidComposeView, rect, point, scrollCaptureCallback);
    }
}
