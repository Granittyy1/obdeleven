package androidx.paging;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.N;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: compiled from: PagingDataPresenter.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class PagingDataPresenter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.e f19293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f19294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public G f19295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u<T> f19296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableCombinedLoadStateCollection f19297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList<Ia.a<p293xa.r>> f19298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SingleRunner f19299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f19300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f19301i;
    public final StateFlowImpl j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.flow.s f19302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f19303l;

    /* JADX INFO: compiled from: PagingDataPresenter.kt */
    public static final class a implements G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19305b;

        @Override // androidx.paging.G
        public final void a() {
            this.f19304a = true;
        }

        @Override // androidx.paging.G
        public final void b() {
            this.f19305b = true;
        }
    }

    public PagingDataPresenter(kotlin.coroutines.e mainContext, PagingData<T> pagingData) {
        u<T> uVar;
        PageEvent.Insert<T> insertInvoke;
        kotlin.jvm.internal.i.e(mainContext, "mainContext");
        this.f19293a = mainContext;
        this.f19295c = new a();
        u<Object> uVar2 = u.f19426e;
        PageEvent.Insert<T> insertInvoke2 = pagingData != null ? pagingData.f19291d.invoke() : null;
        if (insertInvoke2 != null) {
            uVar = new u<>(insertInvoke2);
        } else {
            uVar = (u<T>) u.f19426e;
            kotlin.jvm.internal.i.c(uVar, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
        }
        this.f19296d = uVar;
        MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = new MutableCombinedLoadStateCollection();
        if (pagingData != null && (insertInvoke = pagingData.f19291d.invoke()) != null) {
            mutableCombinedLoadStateCollection.d(insertInvoke.f19264e, insertInvoke.f19265f);
        }
        this.f19297e = mutableCombinedLoadStateCollection;
        CopyOnWriteArrayList<Ia.a<p293xa.r>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f19298f = copyOnWriteArrayList;
        this.f19299g = new SingleRunner(0);
        this.j = kotlinx.coroutines.flow.B.a(Boolean.FALSE);
        this.f19302k = mutableCombinedLoadStateCollection.f19258c;
        this.f19303l = kotlinx.coroutines.flow.w.a(0, 64, BufferOverflow.f43244c);
        copyOnWriteArrayList.add(new Ia.a<p293xa.r>(this) { // from class: androidx.paging.PagingDataPresenter.1
            final /* synthetic */ PagingDataPresenter<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // Ia.a
            public final p293xa.r invoke() {
                kotlinx.coroutines.flow.v vVar = this.this$0.f19303l;
                p293xa.r rVar = p293xa.r.f47939a;
                vVar.f(rVar);
                return rVar;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(PagingDataPresenter pagingDataPresenter, List list, int i10, int i11, boolean z10, n nVar, n nVar2, j jVar, ContinuationImpl continuationImpl) {
        PagingDataPresenter$presentNewList$1 pagingDataPresenter$presentNewList$1;
        u<T> uVar;
        j jVar2;
        List<T> list2;
        List<T> list3;
        pagingDataPresenter.getClass();
        if (continuationImpl instanceof PagingDataPresenter$presentNewList$1) {
            pagingDataPresenter$presentNewList$1 = (PagingDataPresenter$presentNewList$1) continuationImpl;
            int i12 = pagingDataPresenter$presentNewList$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                pagingDataPresenter$presentNewList$1.label = i12 - Integer.MIN_VALUE;
            } else {
                pagingDataPresenter$presentNewList$1 = new PagingDataPresenter$presentNewList$1(pagingDataPresenter, continuationImpl);
            }
        } else {
            pagingDataPresenter$presentNewList$1 = new PagingDataPresenter$presentNewList$1(pagingDataPresenter, continuationImpl);
        }
        Object obj = pagingDataPresenter$presentNewList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i13 = pagingDataPresenter$presentNewList$1.label;
        if (i13 == 0) {
            kotlin.b.b(obj);
            if (z10 && nVar == null) {
                throw new IllegalArgumentException("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
            }
            pagingDataPresenter.f19300h = false;
            uVar = new u<>(i10, i11, list);
            u<T> uVar2 = pagingDataPresenter.f19296d;
            kotlin.jvm.internal.i.c(uVar2, "null cannot be cast to non-null type androidx.paging.PlaceholderPaddedList<T of androidx.paging.PagingDataPresenter>");
            pagingDataPresenter.f19296d = uVar;
            pagingDataPresenter.f19294b = jVar;
            new x.e(uVar, uVar2);
            pagingDataPresenter$presentNewList$1.L$0 = pagingDataPresenter;
            pagingDataPresenter$presentNewList$1.L$1 = list;
            pagingDataPresenter$presentNewList$1.L$2 = nVar;
            pagingDataPresenter$presentNewList$1.L$3 = nVar2;
            pagingDataPresenter$presentNewList$1.L$4 = jVar;
            pagingDataPresenter$presentNewList$1.L$5 = uVar;
            pagingDataPresenter$presentNewList$1.I$0 = i10;
            pagingDataPresenter$presentNewList$1.I$1 = i11;
            pagingDataPresenter$presentNewList$1.Z$0 = z10;
            pagingDataPresenter$presentNewList$1.label = 1;
            if (pagingDataPresenter.c() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = pagingDataPresenter$presentNewList$1.Z$0;
            i11 = pagingDataPresenter$presentNewList$1.I$1;
            i10 = pagingDataPresenter$presentNewList$1.I$0;
            u<T> uVar3 = (u) pagingDataPresenter$presentNewList$1.L$5;
            jVar = (j) pagingDataPresenter$presentNewList$1.L$4;
            nVar2 = (n) pagingDataPresenter$presentNewList$1.L$3;
            nVar = (n) pagingDataPresenter$presentNewList$1.L$2;
            list = (List) pagingDataPresenter$presentNewList$1.L$1;
            PagingDataPresenter pagingDataPresenter2 = (PagingDataPresenter) pagingDataPresenter$presentNewList$1.L$0;
            kotlin.b.b(obj);
            uVar = uVar3;
            pagingDataPresenter = pagingDataPresenter2;
        }
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            StringBuilder sb2 = new StringBuilder("Presenting data (\n                            |   first item: ");
            F f10 = (F) kotlin.collections.q.P(list);
            Object objW = null;
            sb2.append((f10 == null || (list3 = f10.f19232b) == null) ? null : kotlin.collections.q.P(list3));
            sb2.append("\n                            |   last item: ");
            F f11 = (F) kotlin.collections.q.W(list);
            if (f11 != null && (list2 = f11.f19232b) != null) {
                objW = kotlin.collections.q.W(list2);
            }
            sb2.append(objW);
            sb2.append("\n                            |   placeholdersBefore: ");
            sb2.append(i10);
            sb2.append("\n                            |   placeholdersAfter: ");
            sb2.append(i11);
            sb2.append("\n                            |   hintReceiver: ");
            sb2.append(jVar);
            sb2.append("\n                            |   sourceLoadStates: ");
            sb2.append(nVar);
            sb2.append("\n                        ");
            String string = sb2.toString();
            if (nVar2 != null) {
                string = string + "|   mediatorLoadStates: " + nVar2 + '\n';
            }
            kotlin.text.i.w(string + "|)");
        }
        if (z10) {
            MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = pagingDataPresenter.f19297e;
            kotlin.jvm.internal.i.b(nVar);
            mutableCombinedLoadStateCollection.d(nVar, nVar2);
        }
        if (uVar.getSize() == 0 && (jVar2 = pagingDataPresenter.f19294b) != null) {
            int i14 = uVar.f19428b / 2;
            Integer numX = kotlin.collections.k.X(((F) kotlin.collections.q.O(uVar.f19427a)).f19231a);
            kotlin.jvm.internal.i.b(numX);
            jVar2.a(new I.b(i14, i14, numX.intValue(), uVar.f()));
        }
        return p293xa.r.f47939a;
    }

    public final Object b(PagingData<T> pagingData, kotlin.coroutines.c<p293xa.r> cVar) {
        Object objA = this.f19299g.a(0, new PagingDataPresenter$collectFrom$2(this, pagingData, null), (ContinuationImpl) cVar);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }

    public abstract p293xa.r c();

    public final l<T> d() {
        u<T> uVar = this.f19296d;
        int i10 = uVar.f19429c;
        int i11 = uVar.f19430d;
        ArrayList arrayList = uVar.f19427a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kotlin.collections.p.z(arrayList2, ((F) it.next()).f19232b);
        }
        return new l<>(arrayList2, i10, i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagingDataPresenter() {
        this(kotlinx.coroutines.internal.q.f43500a, null);
        Sa.b bVar = N.f43198a;
    }
}
