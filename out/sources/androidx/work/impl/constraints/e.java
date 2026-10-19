package androidx.work.impl.constraints;

import Q2.z;
import androidx.work.k;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.C2702l0;

/* JADX INFO: compiled from: WorkConstraintsTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20406a = 0;

    static {
        i.d(k.d("WorkConstraintsTracker"), "tagWithPrefix(\"WorkConstraintsTracker\")");
    }

    public static final C2700k0 a(WorkConstraintsTracker workConstraintsTracker, z zVar, AbstractC2712w dispatcher, d listener) {
        i.e(workConstraintsTracker, "<this>");
        i.e(dispatcher, "dispatcher");
        i.e(listener, "listener");
        C2700k0 c2700k0A = C2702l0.a();
        C2680e.c(B.a(dispatcher.plus(c2700k0A)), null, null, new WorkConstraintsTrackerKt$listen$1(workConstraintsTracker, zVar, listener, null), 3);
        return c2700k0A;
    }
}
