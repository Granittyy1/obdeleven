package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.RunnableC1240q;
import com.google.firebase.messaging.U;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PreDrawListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f28498b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<View> f28499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U f28500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RunnableC1240q f28501e;

    public e(View view, U u10, RunnableC1240q runnableC1240q) {
        this.f28499c = new AtomicReference<>(view);
        this.f28500d = u10;
        this.f28501e = runnableC1240q;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View andSet = this.f28499c.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.f28498b;
        handler.post(this.f28500d);
        handler.postAtFrontOfQueue(this.f28501e);
        return true;
    }
}
