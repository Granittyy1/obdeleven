package androidx.core.view;

import android.content.Context;
import android.view.GestureDetector;

/* JADX INFO: renamed from: androidx.core.view.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: GestureDetectorCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1297l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f16942a;

    public C1297l(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f16942a = new GestureDetector(context, onGestureListener, null);
    }
}
