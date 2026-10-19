package androidx.compose.ui.graphics;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidPathMeasure.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1145v implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f13804a;

    public C1145v(PathMeasure pathMeasure) {
        this.f13804a = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.e0
    public final boolean a(float f10, float f11, Path path) {
        if (!(path instanceof C1144u)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f13804a.getSegment(f10, f11, ((C1144u) path).f13800a, true);
    }

    @Override // androidx.compose.ui.graphics.e0
    public final void b(Path path) {
        android.graphics.Path path2;
        if (path == null) {
            path2 = null;
        } else {
            if (!(path instanceof C1144u)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path2 = ((C1144u) path).f13800a;
        }
        this.f13804a.setPath(path2, false);
    }

    @Override // androidx.compose.ui.graphics.e0
    public final float getLength() {
        return this.f13804a.getLength();
    }
}
