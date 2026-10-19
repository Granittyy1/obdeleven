package androidx.paging.compose;

import A8.f;
import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import androidx.paging.C1428d;
import androidx.paging.PagingData;
import androidx.paging.PagingDataPresenter;
import androidx.paging.j;
import androidx.paging.l;
import androidx.paging.n;
import kotlin.collections.q;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.u;
import p293xa.r;

/* JADX INFO: compiled from: LazyPagingItems.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2686c<PagingData<T>> f19332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f19333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f19334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f19335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1085f0 f19336e;

    /* JADX INFO: compiled from: LazyPagingItems.kt */
    public static final class a extends PagingDataPresenter<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b<T> f19337m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, e eVar, PagingData<T> pagingData) {
            super(eVar, pagingData);
            this.f19337m = bVar;
        }

        @Override // androidx.paging.PagingDataPresenter
        public final r c() {
            b<T> bVar = this.f19337m;
            bVar.f19335d.setValue(bVar.f19334c.d());
            return r.f47939a;
        }
    }

    public b(InterfaceC2686c<PagingData<T>> flow) {
        i.e(flow, "flow");
        this.f19332a = flow;
        e value = AndroidUiDispatcher.f14804m.getValue();
        this.f19333b = value;
        a aVar = new a(this, value, flow instanceof u ? (PagingData) q.P(((u) flow).a()) : null);
        this.f19334c = aVar;
        this.f19335d = J0.f(aVar.d());
        C1428d c1428d = (C1428d) aVar.f19302k.f43418b.getValue();
        if (c1428d == null) {
            n nVar = c.f19338a;
            c1428d = new C1428d(nVar.f19376a, nVar.f19377b, nVar.f19378c, nVar, null);
        }
        this.f19336e = J0.f(c1428d);
    }

    public final Object a(SuspendLambda suspendLambda) {
        Object objCollect = this.f19334c.f19302k.f43418b.collect(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2(new androidx.paging.compose.a(this)), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (objCollect != coroutineSingletons) {
            objCollect = r.f47939a;
        }
        return objCollect == coroutineSingletons ? objCollect : r.f47939a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T b(int i10) {
        Object value;
        Object value2;
        a aVar = this.f19334c;
        StateFlowImpl stateFlowImpl = aVar.j;
        do {
            value = stateFlowImpl.getValue();
            ((Boolean) value).getClass();
        } while (!stateFlowImpl.d(value, Boolean.TRUE));
        aVar.f19300h = true;
        aVar.f19301i = i10;
        if (Build.ID != null && Log.isLoggable("Paging", 2)) {
            String message = "Accessing item index[" + i10 + ']';
            i.e(message, "message");
        }
        j jVar = aVar.f19294b;
        if (jVar != null) {
            jVar.a(aVar.f19296d.d(i10));
        }
        androidx.paging.u<T> uVar = aVar.f19296d;
        if (i10 < 0) {
            uVar.getClass();
        } else if (i10 < uVar.getSize()) {
            int i11 = i10 - uVar.f19429c;
            if (i11 >= 0 && i11 < uVar.f19428b) {
                uVar.e(i11);
            }
            StateFlowImpl stateFlowImpl2 = aVar.j;
            do {
                value2 = stateFlowImpl2.getValue();
                ((Boolean) value2).getClass();
            } while (!stateFlowImpl2.d(value2, Boolean.FALSE));
            return (T) ((l) this.f19335d.getValue()).get(i10);
        }
        StringBuilder sbE = f.e(i10, "Index: ", ", Size: ");
        sbE.append(uVar.getSize());
        throw new IndexOutOfBoundsException(sbE.toString());
    }

    public final C1428d c() {
        return (C1428d) this.f19336e.getValue();
    }

    public final void d() {
        a aVar = this.f19334c;
        aVar.getClass();
        if (Build.ID != null) {
            Log.isLoggable("Paging", 3);
        }
        aVar.f19295c.b();
    }
}
