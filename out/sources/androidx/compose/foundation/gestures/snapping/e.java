package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: compiled from: LazyGridSnapLayoutInfoProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final int a(androidx.compose.foundation.lazy.grid.g gVar, Orientation orientation) {
        return (int) (orientation == Orientation.f9957b ? gVar.e() & 4294967295L : gVar.e() >> 32);
    }
}
