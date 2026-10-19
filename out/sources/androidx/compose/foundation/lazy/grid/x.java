package androidx.compose.foundation.lazy.grid;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.review.ReviewException;
import java.util.HashMap;
import java.util.Locale;
import p191p5.B;
import p191p5.g;
import p191p5.h;

/* JADX INFO: compiled from: LazyGrid.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10536b;

    public x(p045d6.g gVar) {
        this.f10536b = new Handler(Looper.getMainLooper());
        this.f10535a = gVar;
    }

    public E a() {
        return (E) ((C1085f0) this.f10536b).getValue();
    }

    public B b() {
        p045d6.g gVar = (p045d6.g) this.f10535a;
        p057e6.g gVar2 = p045d6.g.f34577c;
        gVar2.a("requestInAppReview (%s)", gVar.f34579b);
        if (gVar.f34578a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", p057e6.g.b(gVar2.f34745a, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            HashMap map = p070f6.a.f34995a;
            return p191p5.j.d(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : C4.b.d((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) p070f6.a.f34996b.get(-1), ")")), null, null)));
        }
        final p191p5.h hVar = new p191p5.h();
        final p057e6.q qVar = gVar.f34578a;
        p045d6.e eVar = new p045d6.e(gVar, hVar, hVar);
        synchronized (qVar.f34763f) {
            qVar.f34762e.add(hVar);
            hVar.f45811a.c(new p191p5.c() { // from class: e6.i
                @Override // p191p5.c
                public final void e(g gVar3) {
                    q qVar2 = qVar;
                    h hVar2 = hVar;
                    synchronized (qVar2.f34763f) {
                        qVar2.f34762e.remove(hVar2);
                    }
                }
            });
        }
        synchronized (qVar.f34763f) {
            try {
                if (qVar.f34767k.getAndIncrement() > 0) {
                    p057e6.g gVar3 = qVar.f34759b;
                    Object[] objArr2 = new Object[0];
                    gVar3.getClass();
                    if (Log.isLoggable("PlayCore", 3)) {
                        p057e6.g.b(gVar3.f34745a, "Already connected to the service.", objArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        qVar.a().post(new p057e6.k(qVar, hVar, eVar));
        return hVar.f45811a;
    }

    public x(LayoutNode layoutNode, E e10) {
        this.f10535a = layoutNode;
        this.f10536b = J0.f(e10);
    }

    public x(int[] iArr, int[] iArr2) {
        this.f10535a = iArr;
        this.f10536b = iArr2;
    }
}
