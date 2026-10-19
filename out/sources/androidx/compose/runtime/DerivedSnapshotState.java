package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DerivedSnapshotState<T> extends androidx.compose.runtime.snapshots.p implements InterfaceC1116x<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.a<T> f12822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I0<T> f12823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a<T> f12824e = new a<>(SnapshotKt.k().g());

    /* JADX INFO: compiled from: DerivedState.kt */
    public static final class a<T> extends androidx.compose.runtime.snapshots.q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f12825h = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f12826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public androidx.collection.H f12828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f12829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12830g;

        public a(long j) {
            super(j);
            androidx.collection.H<Object> h8 = androidx.collection.P.f9118a;
            kotlin.jvm.internal.i.c(h8, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f12828e = h8;
            this.f12829f = f12825h;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final void a(androidx.compose.runtime.snapshots.q qVar) {
            kotlin.jvm.internal.i.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) qVar;
            this.f12828e = aVar.f12828e;
            this.f12829f = aVar.f12829f;
            this.f12830g = aVar.f12830g;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final androidx.compose.runtime.snapshots.q b() {
            return new a(SnapshotKt.k().g());
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final androidx.compose.runtime.snapshots.q c(long j) {
            return new a(j);
        }

        public final boolean d(DerivedSnapshotState derivedSnapshotState, androidx.compose.runtime.snapshots.g gVar) {
            boolean z10;
            boolean z11;
            Object obj = SnapshotKt.f13154c;
            synchronized (obj) {
                z10 = true;
                z11 = (this.f12826c == gVar.g() && this.f12827d == gVar.h()) ? false : true;
            }
            if (this.f12829f == f12825h || (z11 && this.f12830g != e(derivedSnapshotState, gVar))) {
                z10 = false;
            }
            if (z10 && z11) {
                synchronized (obj) {
                    this.f12826c = gVar.g();
                    this.f12827d = gVar.h();
                    p293xa.r rVar = p293xa.r.f47939a;
                }
            }
            return z10;
        }

        public final int e(DerivedSnapshotState derivedSnapshotState, androidx.compose.runtime.snapshots.g gVar) throws Throwable {
            androidx.collection.H h8;
            int i10;
            int i11;
            long[] jArr;
            int i12;
            androidx.compose.runtime.snapshots.q qVarA;
            int i13 = 1;
            synchronized (SnapshotKt.f13154c) {
                h8 = this.f12828e;
            }
            char c10 = 7;
            if (!(h8.f9107e != 0)) {
                return 7;
            }
            androidx.compose.runtime.collection.c<InterfaceC1117y> cVarC = J0.c();
            InterfaceC1117y[] interfaceC1117yArr = cVarC.f12943b;
            int i14 = cVarC.f12945d;
            for (int i15 = 0; i15 < i14; i15++) {
                interfaceC1117yArr[i15].start();
            }
            try {
                Object[] objArr = h8.f9104b;
                int[] iArr = h8.f9105c;
                long[] jArr2 = h8.f9103a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int iIdentityHashCode = 7;
                    int i16 = 0;
                    while (true) {
                        long j = jArr2[i16];
                        if ((((~j) << c10) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j & 255) < 128) {
                                    int i20 = (i16 << 3) + i19;
                                    androidx.compose.runtime.snapshots.o oVar = (androidx.compose.runtime.snapshots.o) objArr[i20];
                                    if (iArr[i20] == i13) {
                                        if (oVar instanceof DerivedSnapshotState) {
                                            try {
                                                DerivedSnapshotState derivedSnapshotState2 = (DerivedSnapshotState) oVar;
                                                qVarA = derivedSnapshotState2.A((a) SnapshotKt.j(derivedSnapshotState2.f12824e, gVar), gVar, false, derivedSnapshotState2.f12822c);
                                            } catch (Throwable th) {
                                                th = th;
                                                InterfaceC1117y[] interfaceC1117yArr2 = cVarC.f12943b;
                                                int i21 = cVarC.f12945d;
                                                for (int i22 = 0; i22 < i21; i22++) {
                                                    interfaceC1117yArr2[i22].a();
                                                }
                                                throw th;
                                            }
                                        } else {
                                            qVarA = SnapshotKt.j(oVar.k(), gVar);
                                        }
                                        iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(qVarA)) * 31) + Long.hashCode(qVarA.f13225a);
                                    }
                                    i12 = 8;
                                } else {
                                    jArr2 = jArr2;
                                    i12 = i17;
                                }
                                j >>= i12;
                                i19++;
                                i17 = i12;
                                i13 = 1;
                                jArr2 = jArr2;
                            }
                            i11 = i13;
                            jArr = jArr2;
                            if (i18 != i17) {
                                break;
                            }
                        } else {
                            i11 = i13;
                            jArr = jArr2;
                        }
                        if (i16 == length) {
                            break;
                        }
                        i16 += i11;
                        i13 = i11;
                        jArr2 = jArr;
                        c10 = 7;
                    }
                    i10 = iIdentityHashCode;
                } else {
                    i10 = 7;
                }
                p293xa.r rVar = p293xa.r.f47939a;
                InterfaceC1117y[] interfaceC1117yArr3 = cVarC.f12943b;
                int i23 = cVarC.f12945d;
                for (int i24 = 0; i24 < i23; i24++) {
                    interfaceC1117yArr3[i24].a();
                }
                return i10;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedSnapshotState(Ia.a<? extends T> aVar, I0<T> i10) {
        this.f12822c = aVar;
        this.f12823d = i10;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final a<T> A(a<T> aVar, androidx.compose.runtime.snapshots.g gVar, boolean z10, Ia.a<? extends T> aVar2) {
        int i10;
        I0<T> i11;
        int i12;
        int i13;
        a<T> aVar3 = aVar;
        int i14 = 1;
        if (aVar3.d(this, gVar)) {
            if (z10) {
                androidx.compose.runtime.collection.c<InterfaceC1117y> cVarC = J0.c();
                InterfaceC1117y[] interfaceC1117yArr = cVarC.f12943b;
                int i15 = cVarC.f12945d;
                for (int i16 = 0; i16 < i15; i16++) {
                    interfaceC1117yArr[i16].start();
                }
                try {
                    androidx.collection.H h8 = aVar3.f12828e;
                    androidx.compose.runtime.internal.f fVar = K0.f12863a;
                    androidx.compose.runtime.internal.b bVar = (androidx.compose.runtime.internal.b) fVar.a();
                    if (bVar == null) {
                        bVar = new androidx.compose.runtime.internal.b(0);
                        fVar.b(bVar);
                    }
                    int i17 = bVar.f13052a;
                    Object[] objArr = h8.f9104b;
                    int[] iArr = h8.f9105c;
                    long[] jArr = h8.f9103a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j = jArr[i18];
                            long[] jArr2 = jArr;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i19 = 8;
                                int i20 = 8 - ((~(i18 - length)) >>> 31);
                                int i21 = 0;
                                while (i21 < i20) {
                                    if ((j & 255) < 128) {
                                        int i22 = (i18 << 3) + i21;
                                        androidx.compose.runtime.snapshots.o oVar = (androidx.compose.runtime.snapshots.o) objArr[i22];
                                        bVar.f13052a = i17 + iArr[i22];
                                        Ia.l<Object, p293xa.r> lVarE = gVar.e();
                                        if (lVarE != null) {
                                            lVarE.invoke(oVar);
                                        }
                                        i13 = 8;
                                    } else {
                                        i13 = i19;
                                    }
                                    j >>= i13;
                                    i21++;
                                    i19 = i13;
                                    i14 = 1;
                                }
                                int i23 = i19;
                                i12 = i14;
                                if (i20 != i23) {
                                    break;
                                }
                            } else {
                                i12 = i14;
                            }
                            if (i18 == length) {
                                break;
                            }
                            i18 += i12;
                            i14 = i12;
                            jArr = jArr2;
                        }
                    }
                    bVar.f13052a = i17;
                    p293xa.r rVar = p293xa.r.f47939a;
                } finally {
                    InterfaceC1117y[] interfaceC1117yArr2 = cVarC.f12943b;
                    int i24 = cVarC.f12945d;
                    for (int i25 = 0; i25 < i24; i25++) {
                        interfaceC1117yArr2[i25].a();
                    }
                }
            }
            return aVar3;
        }
        final androidx.collection.H h10 = new androidx.collection.H((Object) null);
        androidx.compose.runtime.internal.f fVar2 = K0.f12863a;
        final androidx.compose.runtime.internal.b bVar2 = (androidx.compose.runtime.internal.b) fVar2.a();
        if (bVar2 == null) {
            i10 = 0;
            bVar2 = new androidx.compose.runtime.internal.b(0);
            fVar2.b(bVar2);
        } else {
            i10 = 0;
        }
        final int i26 = bVar2.f13052a;
        androidx.compose.runtime.collection.c<InterfaceC1117y> cVarC2 = J0.c();
        InterfaceC1117y[] interfaceC1117yArr3 = cVarC2.f12943b;
        int i27 = cVarC2.f12945d;
        for (int i28 = i10; i28 < i27; i28++) {
            interfaceC1117yArr3[i28].start();
        }
        try {
            bVar2.f13052a = i26 + 1;
            Object objC = androidx.compose.runtime.snapshots.g.a.c(aVar2, new Ia.l<Object, p293xa.r>(this) { // from class: androidx.compose.runtime.DerivedSnapshotState$currentRecord$result$1$1$result$1
                final /* synthetic */ DerivedSnapshotState<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // Ia.l
                public final p293xa.r invoke(Object obj) {
                    if (obj == this.this$0) {
                        throw new IllegalStateException("A derived state calculation cannot read itself");
                    }
                    if (obj instanceof androidx.compose.runtime.snapshots.o) {
                        int i29 = bVar2.f13052a;
                        androidx.collection.H<androidx.compose.runtime.snapshots.o> h11 = h10;
                        int i30 = i29 - i26;
                        int iA = h11.a(obj);
                        h11.g(Math.min(i30, iA >= 0 ? h11.f9105c[iA] : BrazeLogger.SUPPRESS), obj);
                    }
                    return p293xa.r.f47939a;
                }
            });
            bVar2.f13052a = i26;
            InterfaceC1117y[] interfaceC1117yArr4 = cVarC2.f12943b;
            int i29 = cVarC2.f12945d;
            while (i10 < i29) {
                interfaceC1117yArr4[i10].a();
                i10++;
            }
            Object obj = SnapshotKt.f13154c;
            synchronized (obj) {
                try {
                    androidx.compose.runtime.snapshots.g gVarK = SnapshotKt.k();
                    Object obj2 = aVar3.f12829f;
                    if (obj2 == a.f12825h || (i11 = this.f12823d) == null || !i11.a((T) objC, (T) obj2)) {
                        a<T> aVar4 = this.f12824e;
                        synchronized (obj) {
                            androidx.compose.runtime.snapshots.q qVarM = SnapshotKt.m(aVar4, this);
                            qVarM.a(aVar4);
                            qVarM.f13225a = gVarK.g();
                            aVar3 = (a) qVarM;
                            aVar3.f12828e = h10;
                            aVar3.f12830g = aVar3.e(this, gVarK);
                            aVar3.f12829f = objC;
                        }
                        return aVar3;
                    }
                    aVar3.f12828e = h10;
                    aVar3.f12830g = aVar3.e(this, gVarK);
                } catch (Throwable th) {
                    throw th;
                }
            }
            androidx.compose.runtime.internal.b bVar3 = (androidx.compose.runtime.internal.b) K0.f12863a.a();
            if (bVar3 != null && bVar3.f13052a == 0) {
                SnapshotKt.k().m();
                synchronized (obj) {
                    androidx.compose.runtime.snapshots.g gVarK2 = SnapshotKt.k();
                    aVar3.f12826c = gVarK2.g();
                    aVar3.f12827d = gVarK2.h();
                    p293xa.r rVar2 = p293xa.r.f47939a;
                }
            }
            return aVar3;
        } catch (Throwable th2) {
            InterfaceC1117y[] interfaceC1117yArr5 = cVarC2.f12943b;
            int i30 = cVarC2.f12945d;
            while (i10 < i30) {
                interfaceC1117yArr5[i10].a();
                i10++;
            }
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1116x
    public final I0<T> a() {
        return this.f12823d;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final void e(androidx.compose.runtime.snapshots.q qVar) {
        this.f12824e = (a) qVar;
    }

    @Override // androidx.compose.runtime.N0
    public final T getValue() {
        Ia.l<Object, p293xa.r> lVarE = SnapshotKt.k().e();
        if (lVarE != null) {
            lVarE.invoke(this);
        }
        androidx.compose.runtime.snapshots.g gVarK = SnapshotKt.k();
        return (T) A((a) SnapshotKt.j(this.f12824e, gVarK), gVarK, true, this.f12822c).f12829f;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final androidx.compose.runtime.snapshots.q k() {
        return this.f12824e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        a aVar = (a) SnapshotKt.i(this.f12824e);
        sb2.append(aVar.d(this, SnapshotKt.k()) ? String.valueOf(aVar.f12829f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }

    @Override // androidx.compose.runtime.InterfaceC1116x
    public final a x() {
        androidx.compose.runtime.snapshots.g gVarK = SnapshotKt.k();
        return A((a) SnapshotKt.j(this.f12824e, gVarK), gVarK, false, this.f12822c);
    }
}
