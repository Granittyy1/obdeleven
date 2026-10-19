package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.voltasit.obdeleven.ui.activity.o;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: FirstDrawDoneListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f28492b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<View> f28493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f28494d;

    public b(View view, o oVar) {
        this.f28493c = new AtomicReference<>(view);
        this.f28494d = oVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View andSet = this.f28493c.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.firebase.perf.util.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b bVar = this.f28490b;
                bVar.getClass();
                andSet.getViewTreeObserver().removeOnDrawListener(bVar);
            }
        });
        this.f28492b.postAtFrontOfQueue(this.f28494d);
    }
}
