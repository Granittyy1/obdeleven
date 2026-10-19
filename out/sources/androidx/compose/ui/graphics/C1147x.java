package androidx.compose.ui.graphics;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidShader.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1147x {
    public static final void a(ArrayList arrayList, List list) {
        if (arrayList == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != arrayList.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
