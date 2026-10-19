package androidx.compose.ui.platform;

import android.graphics.Outline;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.Path;

/* JADX INFO: renamed from: androidx.compose.ui.platform.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: OutlineResolver.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1250v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1250v0 f15108a = new C1250v0();

    public final void a(Outline outline, Path path) {
        if (!(path instanceof C1144u)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C1144u) path).f13800a);
    }
}
