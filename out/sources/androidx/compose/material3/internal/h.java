package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h implements androidx.compose.foundation.gestures.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f12526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i<Object> f12527b;

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class a implements androidx.compose.foundation.gestures.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<Object> f12528a;

        public a(i<Object> iVar) {
            this.f12528a = iVar;
        }

        @Override // androidx.compose.foundation.gestures.h
        public final void a(float f10) {
            i<Object> iVar = this.f12528a;
            iVar.f12541n.a(iVar.f(f10), 0.0f);
        }
    }

    public h(i<Object> iVar) {
        this.f12527b = iVar;
        this.f12526a = new a(iVar);
    }

    @Override // androidx.compose.foundation.gestures.i
    public final Object a(Ia.p pVar, kotlin.coroutines.c cVar) throws Throwable {
        Object objA = this.f12527b.a(MutatePriority.f9811c, new AnchoredDraggableState$draggableState$1$drag$2(this, pVar, null), (ContinuationImpl) cVar);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }
}
