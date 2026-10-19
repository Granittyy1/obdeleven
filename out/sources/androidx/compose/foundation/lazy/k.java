package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* JADX INFO: compiled from: LazyListLayoutInfo.kt */
/* JADX INFO: loaded from: classes.dex */
public interface k {
    default long a() {
        return 0L;
    }

    default int b() {
        return 0;
    }

    default int c() {
        return 0;
    }

    int d();

    default int e() {
        return 0;
    }

    List<g> f();

    int g();

    default Orientation getOrientation() {
        return Orientation.f9957b;
    }

    int h();
}
