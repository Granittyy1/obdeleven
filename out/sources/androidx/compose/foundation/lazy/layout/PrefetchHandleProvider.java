package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.foundation.lazy.layout.H.a;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.node.e0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PrefetchHandleProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0983s f10672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubcomposeLayoutState f10673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f10674c;

    /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
    public final class HandleAndRequestImpl implements H.b, U {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f10677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SubcomposeLayoutState.a f10678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f10679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f10680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f10681g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public a f10682h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f10683i;
        public long j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f10684k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f10685l = Pa.d.b();

        /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
        public final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<H> f10687a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List<U>[] f10688b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f10689c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f10690d;

            public a(List<H> list) {
                this.f10687a = list;
                this.f10688b = new List[list.size()];
                if (list.isEmpty()) {
                    p245u.c.a("NestedPrefetchController shouldn't be created with no states");
                }
            }
        }

        public HandleAndRequestImpl(int i10, long j, T t8) {
            this.f10675a = i10;
            this.f10676b = j;
            this.f10677c = t8;
        }

        /* JADX WARN: Code duplicated, block: B:129:0x0159 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x0149 A[Catch: all -> 0x0138, TryCatch #1 {all -> 0x0138, blocks: (B:62:0x00ff, B:64:0x0107, B:66:0x010d, B:70:0x011c, B:72:0x0128, B:74:0x0135, B:73:0x012b, B:77:0x013a, B:78:0x0141, B:80:0x0149, B:84:0x015b, B:85:0x0162, B:86:0x016e), top: B:122:0x00ff }] */
        /* JADX WARN: Code duplicated, block: B:84:0x015b A[Catch: all -> 0x0138, LOOP:1: B:78:0x0141->B:84:0x015b, LOOP_END, TryCatch #1 {all -> 0x0138, blocks: (B:62:0x00ff, B:64:0x0107, B:66:0x010d, B:70:0x011c, B:72:0x0128, B:74:0x0135, B:73:0x012b, B:77:0x013a, B:78:0x0141, B:80:0x0149, B:84:0x015b, B:85:0x0162, B:86:0x016e), top: B:122:0x00ff }] */
        @Override // androidx.compose.foundation.lazy.layout.U
        public final boolean a(RunnableC0966a.C0131a c0131a) {
            long j;
            List<U> list;
            List<U> list2;
            long j10;
            PrefetchHandleProvider prefetchHandleProvider = PrefetchHandleProvider.this;
            InterfaceC0985u interfaceC0985u = (InterfaceC0985u) ((LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1) prefetchHandleProvider.f10672a.f10733b).invoke();
            if (this.f10680f) {
                return false;
            }
            int iB = interfaceC0985u.b();
            int i10 = this.f10675a;
            if (i10 < 0 || i10 >= iB) {
                return false;
            }
            Object objF = interfaceC0985u.f(i10);
            this.j = c0131a.a();
            this.f10685l = Pa.d.b();
            this.f10684k = 0L;
            boolean z10 = this.f10678d != null;
            T t8 = this.f10677c;
            if (!z10) {
                long j11 = this.j;
                long j12 = t8.a(objF).f10709a;
                if ((!this.f10683i || j11 <= 0) && j12 >= j11) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    if (this.f10678d != null) {
                        p245u.c.a("Request was already composed!");
                    }
                    Object objC = interfaceC0985u.c(i10);
                    this.f10678d = prefetchHandleProvider.f10673b.a().e(objC, prefetchHandleProvider.f10672a.a(objC, i10, objF));
                    p293xa.r rVar = p293xa.r.f47939a;
                    Trace.endSection();
                    e();
                    long j13 = this.f10684k;
                    C0967b c0967b = t8.f10692a;
                    long j14 = c0967b.f10709a;
                    if (j14 == 0) {
                        j10 = j13;
                    } else {
                        long j15 = 4;
                        j10 = (j13 / j15) + ((j14 / j15) * ((long) 3));
                    }
                    c0967b.f10709a = j10;
                    C0967b c0967bA = t8.a(objF);
                    long j16 = c0967bA.f10709a;
                    if (j16 != 0) {
                        long j17 = 4;
                        j13 = (j13 / j17) + ((j16 / j17) * ((long) 3));
                    }
                    c0967bA.f10709a = j13;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            if (!this.f10683i) {
                if (!this.f10681g) {
                    if (this.j <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.f10682h = d();
                        this.f10681g = true;
                        p293xa.r rVar2 = p293xa.r.f47939a;
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                a aVar = this.f10682h;
                if (aVar != null) {
                    List<U>[] listArr = aVar.f10688b;
                    int i11 = aVar.f10689c;
                    List<H> list3 = aVar.f10687a;
                    if (i11 < list3.size()) {
                        if (HandleAndRequestImpl.this.f10680f) {
                            p245u.c.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:nested");
                        while (aVar.f10689c < list3.size()) {
                            try {
                                if (listArr[aVar.f10689c] != null) {
                                    list = listArr[aVar.f10689c];
                                    kotlin.jvm.internal.i.b(list);
                                    while (aVar.f10690d < list.size()) {
                                        if (list.get(aVar.f10690d).a(c0131a)) {
                                            aVar.f10690d++;
                                        }
                                    }
                                    aVar.f10690d = 0;
                                    aVar.f10689c++;
                                } else if (c0131a.a() > 0) {
                                    int i12 = aVar.f10689c;
                                    H h8 = list3.get(i12);
                                    Ia.l<Q, p293xa.r> lVar = h8.f10585b;
                                    if (lVar == null) {
                                        list2 = EmptyList.f42983b;
                                    } else {
                                        H.a aVar2 = h8.new a();
                                        lVar.invoke(aVar2);
                                        list2 = aVar2.f10588a;
                                    }
                                    listArr[i12] = list2;
                                    list = listArr[aVar.f10689c];
                                    kotlin.jvm.internal.i.b(list);
                                    while (aVar.f10690d < list.size()) {
                                        if (list.get(aVar.f10690d).a(c0131a)) {
                                            aVar.f10690d++;
                                        }
                                    }
                                    aVar.f10690d = 0;
                                    aVar.f10689c++;
                                }
                                Trace.endSection();
                                return true;
                            } catch (Throwable th3) {
                                Trace.endSection();
                                throw th3;
                            }
                        }
                        p293xa.r rVar3 = p293xa.r.f47939a;
                        Trace.endSection();
                    }
                }
                e();
            }
            if (!this.f10679e) {
                long j18 = this.f10676b;
                if (!p013b0.a.k(j18)) {
                    long j19 = this.j;
                    long j20 = t8.a(objF).f10710b;
                    if ((!this.f10683i || j19 <= 0) && j20 >= j19) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        c(j18);
                        p293xa.r rVar4 = p293xa.r.f47939a;
                        Trace.endSection();
                        e();
                        long j21 = this.f10684k;
                        C0967b c0967b2 = t8.f10692a;
                        long j22 = c0967b2.f10710b;
                        if (j22 == 0) {
                            j = j21;
                        } else {
                            long j23 = 4;
                            j = (j21 / j23) + ((j22 / j23) * ((long) 3));
                        }
                        c0967b2.f10710b = j;
                        C0967b c0967bA2 = t8.a(objF);
                        long j24 = c0967bA2.f10710b;
                        if (j24 != 0) {
                            long j25 = 4;
                            j21 = (j21 / j25) + ((j24 / j25) * ((long) 3));
                        }
                        c0967bA2.f10710b = j21;
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.H.b
        public final void b() {
            this.f10683i = true;
        }

        public final void c(long j) {
            if (this.f10680f) {
                p245u.c.a("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.f10679e) {
                p245u.c.a("Request was already measured!");
            }
            this.f10679e = true;
            SubcomposeLayoutState.a aVar = this.f10678d;
            if (aVar == null) {
                p245u.c.b("performComposition() must be called before performMeasure()");
                throw new KotlinNothingValueException();
            }
            int iB = aVar.b();
            for (int i10 = 0; i10 < iB; i10++) {
                aVar.a(i10, j);
            }
        }

        @Override // androidx.compose.foundation.lazy.layout.H.b
        public final void cancel() {
            if (this.f10680f) {
                return;
            }
            this.f10680f = true;
            SubcomposeLayoutState.a aVar = this.f10678d;
            if (aVar != null) {
                aVar.dispose();
            }
            this.f10678d = null;
        }

        public final a d() {
            SubcomposeLayoutState.a aVar = this.f10678d;
            if (aVar == null) {
                p245u.c.b("Should precompose before resolving nested prefetch states");
                throw new KotlinNothingValueException();
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            aVar.c(new Ia.l<e0, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ia.l
                public final TraversableNode$Companion$TraverseDescendantsAction invoke(e0 e0Var) {
                    T t8;
                    e0 e0Var2 = e0Var;
                    kotlin.jvm.internal.i.c(e0Var2, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                    H h8 = ((Y) e0Var2).f10699p;
                    Ref$ObjectRef<List<H>> ref$ObjectRef2 = ref$ObjectRef;
                    List<H> list = ref$ObjectRef2.element;
                    if (list != null) {
                        list.add(h8);
                        t8 = list;
                    } else {
                        t8 = kotlin.collections.l.t(h8);
                    }
                    ref$ObjectRef2.element = t8;
                    return TraversableNode$Companion$TraverseDescendantsAction.f14570c;
                }
            });
            List list = (List) ref$ObjectRef.element;
            if (list != null) {
                return new a(list);
            }
            return null;
        }

        public final void e() {
            long jB = Pa.d.b();
            long jA = Pa.e.a.C0073a.a(jB, this.f10685l);
            long j = jA >> 1;
            int i10 = Pa.b.f4973e;
            if ((((int) jA) & 1) != 0) {
                if (j > 9223372036854L) {
                    j = Long.MAX_VALUE;
                } else {
                    j = j < -9223372036854L ? Long.MIN_VALUE : j * ((long) 1000000);
                }
            }
            this.f10684k = j;
            this.j -= j;
            this.f10685l = jB;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleAndRequestImpl { index = ");
            sb2.append(this.f10675a);
            sb2.append(", constraints = ");
            sb2.append((Object) p013b0.a.l(this.f10676b));
            sb2.append(", isComposed = ");
            sb2.append(this.f10678d != null);
            sb2.append(", isMeasured = ");
            sb2.append(this.f10679e);
            sb2.append(", isCanceled = ");
            return C4.v.f(sb2, this.f10680f, " }");
        }
    }

    public PrefetchHandleProvider(C0983s c0983s, SubcomposeLayoutState subcomposeLayoutState, V v10) {
        this.f10672a = c0983s;
        this.f10673b = subcomposeLayoutState;
        this.f10674c = v10;
    }
}
