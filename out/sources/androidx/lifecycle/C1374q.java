package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1374q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f17825a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.q$a */
    /* JADX INFO: compiled from: LifecycleDispatcher.kt */
    public static final class a extends C1365h {
        @Override // androidx.lifecycle.C1365h, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.i.e(activity, "activity");
            int i10 = J.f17740c;
            J.a.b(activity);
        }
    }
}
