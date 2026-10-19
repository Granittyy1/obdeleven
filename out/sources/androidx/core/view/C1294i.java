package androidx.core.view;

import android.content.Context;
import android.view.VelocityTracker;
import androidx.core.widget.NestedScrollView;
import com.braze.support.BrazeLogger;

/* JADX INFO: renamed from: androidx.core.view.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DifferentialMotionFlingController.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1294i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NestedScrollView.c f16934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VelocityTracker f16935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16937e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16938f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16939g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f16940h = {BrazeLogger.SUPPRESS, 0};

    public C1294i(Context context, NestedScrollView.c cVar) {
        this.f16933a = context;
        this.f16934b = cVar;
    }
}
