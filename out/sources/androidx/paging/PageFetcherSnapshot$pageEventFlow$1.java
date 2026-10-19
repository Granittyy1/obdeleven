package androidx.paging;

import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.flow.C2684a;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.sync.MutexImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {646, 168, 657}, m = "invokeSuspend")
final class PageFetcherSnapshot$pageEventFlow$1 extends SuspendLambda implements Ia.p<C<PageEvent<Object>>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ r<Object, Object> this$0;

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcherSnapshot.kt */
    @Aa.c(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {R.styleable.AppCompatTheme_radioButtonStyle}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ C<PageEvent<Object>> $$this$cancelableChannelFlow;
        int label;
        final /* synthetic */ r<Object, Object> this$0;

        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: PageFetcherSnapshot.kt */
        public static final class AnonymousClass1<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C<PageEvent<Object>> f19281b;

            public AnonymousClass1(C<PageEvent<Object>> c10) {
                this.f19281b = c10;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(PageEvent<Object> pageEvent, kotlin.coroutines.c<? super p293xa.r> cVar) {
                PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1;
                if (cVar instanceof PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) {
                    pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 = (PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) cVar;
                    int i10 = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label = i10 - Integer.MIN_VALUE;
                    } else {
                        pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 = new PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(this, cVar);
                    }
                } else {
                    pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 = new PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(this, cVar);
                }
                Object obj = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i11 = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label;
                try {
                    if (i11 == 0) {
                        kotlin.b.b(obj);
                        C<PageEvent<Object>> c10 = this.f19281b;
                        pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.label = 1;
                        if (c10.t(pageEvent, pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                } catch (ClosedSendChannelException unused) {
                }
                return p293xa.r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(r<Object, Object> rVar, C<PageEvent<Object>> c10, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = rVar;
            this.$$this$cancelableChannelFlow = c10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.this$0, this.$$this$cancelableChannelFlow, cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                C2684a c2684aF = C2688e.f(this.this$0.j);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$cancelableChannelFlow);
                this.label = 1;
                if (c2684aF.collect(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcherSnapshot.kt */
    @Aa.c(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {105}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ kotlinx.coroutines.channels.d<p293xa.r> $retryChannel;
        int label;
        final /* synthetic */ r<Object, Object> this$0;

        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3$a */
        /* JADX INFO: compiled from: PageFetcherSnapshot.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.channels.d<p293xa.r> f19282b;

            public a(kotlinx.coroutines.channels.d<p293xa.r> dVar) {
                this.f19282b = dVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                this.f19282b.n((p293xa.r) obj);
                return p293xa.r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(r rVar, kotlin.coroutines.c cVar, kotlinx.coroutines.channels.d dVar) {
            super(2, cVar);
            this.this$0 = rVar;
            this.$retryChannel = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass3(this.this$0, cVar, this.$retryChannel);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass3) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                ConflatedEventBus$special$$inlined$mapNotNull$1 conflatedEventBus$special$$inlined$mapNotNull$1 = this.this$0.f19400d;
                a aVar = new a(this.$retryChannel);
                this.label = 1;
                if (conflatedEventBus$special$$inlined$mapNotNull$1.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcherSnapshot.kt */
    @Aa.c(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {R.styleable.AppCompatTheme_textColorAlertDialogListItem}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ kotlinx.coroutines.channels.d<p293xa.r> $retryChannel;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ r<Object, Object> this$0;

        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$a */
        /* JADX INFO: compiled from: PageFetcherSnapshot.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r<Object, Object> f19283b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.A f19284c;

            /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: PageFetcherSnapshot.kt */
            public /* synthetic */ class C0193a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f19285a;

                static {
                    int[] iArr = new int[LoadType.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f19285a = iArr;
                }
            }

            public a(r<Object, Object> rVar, kotlinx.coroutines.A a10) {
                this.f19283b = rVar;
                this.f19284c = a10;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x0344  */
            /* JADX WARN: Code duplicated, block: B:103:0x0348  */
            /* JADX WARN: Code duplicated, block: B:105:0x0366 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:106:0x0367  */
            /* JADX WARN: Code duplicated, block: B:111:0x0395 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:112:0x0396  */
            /* JADX WARN: Code duplicated, block: B:114:0x039a  */
            /* JADX WARN: Code duplicated, block: B:116:0x03b2 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:120:0x03c2  */
            /* JADX WARN: Code duplicated, block: B:131:0x03d8 A[PHI: r8 r9 r10
              0x03d8: PHI (r8v44 kotlinx.coroutines.A) = (r8v22 kotlinx.coroutines.A), (r8v46 kotlinx.coroutines.A) binds: [B:90:0x02fb, B:125:0x03cc] A[DONT_GENERATE, DONT_INLINE]
              0x03d8: PHI (r9v34 androidx.paging.r<java.lang.Object, java.lang.Object>) = 
              (r9v15 androidx.paging.r<java.lang.Object, java.lang.Object>)
              (r9v36 androidx.paging.r<java.lang.Object, java.lang.Object>)
             binds: [B:90:0x02fb, B:125:0x03cc] A[DONT_GENERATE, DONT_INLINE]
              0x03d8: PHI (r10v22 androidx.paging.n) = (r10v10 androidx.paging.n), (r10v23 androidx.paging.n) binds: [B:90:0x02fb, B:125:0x03cc] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:133:0x03e0  */
            /* JADX WARN: Code duplicated, block: B:135:0x03f8 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:136:0x03f9  */
            /* JADX WARN: Code duplicated, block: B:139:0x0410 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:140:0x0411  */
            /* JADX WARN: Code duplicated, block: B:144:0x0424  */
            /* JADX WARN: Code duplicated, block: B:145:0x0428  */
            /* JADX WARN: Code duplicated, block: B:147:0x0444 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:148:0x0445  */
            /* JADX WARN: Code duplicated, block: B:153:0x0473 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:154:0x0474  */
            /* JADX WARN: Code duplicated, block: B:156:0x0478  */
            /* JADX WARN: Code duplicated, block: B:158:0x048e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:159:0x048f  */
            /* JADX WARN: Code duplicated, block: B:163:0x04a0  */
            /* JADX WARN: Code duplicated, block: B:55:0x0247  */
            /* JADX WARN: Code duplicated, block: B:58:0x0256  */
            /* JADX WARN: Code duplicated, block: B:61:0x0264  */
            /* JADX WARN: Code duplicated, block: B:62:0x0268  */
            /* JADX WARN: Code duplicated, block: B:64:0x0285 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:65:0x0286  */
            /* JADX WARN: Code duplicated, block: B:70:0x02b2 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:71:0x02b3  */
            /* JADX WARN: Code duplicated, block: B:73:0x02b9  */
            /* JADX WARN: Code duplicated, block: B:75:0x02d0 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:79:0x02e0  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code duplicated, block: B:88:0x02f2  */
            /* JADX WARN: Code duplicated, block: B:91:0x02fd  */
            /* JADX WARN: Code duplicated, block: B:93:0x0316 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:94:0x0317  */
            /* JADX WARN: Code duplicated, block: B:97:0x0330 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:98:0x0331  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [int] */
            /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.a] */
            /* JADX WARN: Type inference failed for: r2v17, types: [kotlinx.coroutines.sync.a] */
            /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.a] */
            /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.a] */
            /* JADX WARN: Type inference failed for: r2v40, types: [kotlinx.coroutines.sync.a] */
            /* JADX WARN: Type inference failed for: r2v66, types: [kotlinx.coroutines.sync.a] */
            /* JADX WARN: Type inference failed for: r2v86 */
            /* JADX WARN: Type inference failed for: r2v87 */
            /* JADX WARN: Type inference failed for: r2v89 */
            /* JADX WARN: Type inference failed for: r2v90 */
            /* JADX WARN: Type inference failed for: r2v92 */
            /* JADX WARN: Type inference failed for: r2v93 */
            public final Object a(kotlin.coroutines.c cVar) {
                PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;
                r<Object, Object> rVar;
                t.a<Object, Object> aVar;
                kotlinx.coroutines.sync.a aVar2;
                a<T> aVar3;
                n nVar;
                y<Object, Object> yVar;
                B<Object, Object> b10;
                boolean z10;
                r<Object, Object> rVar2;
                kotlinx.coroutines.A a10;
                n nVar2;
                r<Object, Object> rVar3;
                n nVar3;
                r<Object, Object> rVar4;
                kotlinx.coroutines.A a11;
                LoadType loadType;
                kotlinx.coroutines.A a12;
                r<Object, Object> rVar5;
                n nVar4;
                t.a<Object, Object> aVar4;
                kotlinx.coroutines.sync.a aVar5;
                r<Object, Object> rVar6;
                LoadType loadType2;
                r<Object, Object> rVar7;
                I i10;
                LoadType loadType3;
                r<Object, Object> rVar8;
                LoadType loadType4;
                n nVar5;
                t.a<Object, Object> aVar6;
                kotlinx.coroutines.sync.a aVar7;
                kotlinx.coroutines.A a13;
                LoadType loadType5;
                t.a<Object, Object> aVar8;
                MutexImpl mutexImpl;
                kotlinx.coroutines.sync.a aVar9;
                m mVarA;
                t<Object, Object> tVar;
                LoadType loadType6;
                n nVar6;
                kotlinx.coroutines.A a14;
                r<Object, Object> rVar9;
                t.a<Object, Object> aVar10;
                kotlinx.coroutines.sync.a aVar11;
                LoadType loadType7;
                r<Object, Object> rVar10;
                r<Object, Object> rVar11;
                t.a<Object, Object> aVar12;
                I i11;
                LoadType loadType8;
                r<Object, Object> rVar12;
                kotlinx.coroutines.A a15;
                n nVar7;
                t.a<Object, Object> aVar13;
                kotlinx.coroutines.sync.a aVar14;
                LoadType loadType9;
                t.a<Object, Object> aVar15;
                MutexImpl mutexImpl2;
                kotlinx.coroutines.sync.a aVar16;
                m mVarA2;
                t<Object, Object> tVar2;
                LoadType loadType10;
                kotlinx.coroutines.A a16;
                r<Object, Object> rVar13;
                t.a<Object, Object> aVar17;
                MutexImpl mutexImpl3;
                LoadType loadType11;
                r<Object, Object> rVar14;
                r<Object, Object> rVar15;
                kotlinx.coroutines.sync.a aVar18;
                LoadType loadType12;
                I i12;
                LoadType loadType13;
                r<Object, Object> rVar16;
                r<Object, Object> rVar17;
                kotlinx.coroutines.A a17;
                t.a<Object, Object> aVar19;
                MutexImpl mutexImpl4;
                kotlinx.coroutines.sync.a aVar20;
                r<Object, Object> rVar18;
                m mVarA3;
                if (cVar instanceof PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) {
                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 = (PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) cVar;
                    int i13 = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = i13 - Integer.MIN_VALUE;
                    } else {
                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 = new PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1(this, cVar);
                    }
                } else {
                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 = new PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1(this, cVar);
                }
                Object obj = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                ?? r10 = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label;
                LoadType loadType14 = LoadType.f19252b;
                try {
                    try {
                        try {
                            switch (r10) {
                                case 0:
                                    kotlin.b.b(obj);
                                    rVar = this.f19283b;
                                    aVar = rVar.f19406k;
                                    aVar2 = aVar.f19423a;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = this;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = aVar;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = rVar;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar2;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 1;
                                    if (aVar2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    aVar3 = this;
                                    try {
                                        t<Object, Object> tVar3 = aVar.f19424b;
                                        Pair pair = new Pair(tVar3.f19422l.d(), tVar3.a(rVar.f19404h.f19355a.f19360c));
                                        aVar2.g(null);
                                        nVar = (n) pair.a();
                                        yVar = (y) pair.b();
                                        b10 = aVar3.f19283b.f19401e;
                                        if (b10 != null) {
                                            b10.e(yVar);
                                            p293xa.r rVar19 = p293xa.r.f47939a;
                                        }
                                        z10 = nVar.f19376a instanceof m.a;
                                        rVar2 = aVar3.f19283b;
                                        a10 = aVar3.f19284c;
                                        if (z10) {
                                            nVar3 = nVar;
                                            rVar4 = rVar2;
                                            a11 = a10;
                                            loadType = loadType14;
                                            if (C0193a.f19285a[loadType.ordinal()] == 1) {
                                                rVar7 = rVar4;
                                                i10 = null;
                                                loadType3 = loadType;
                                            } else {
                                                aVar4 = rVar4.f19406k;
                                                aVar5 = aVar4.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a11;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar5;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 4;
                                                if (aVar5.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                rVar6 = rVar4;
                                                loadType2 = loadType;
                                                try {
                                                    i10 = (I) aVar4.f19424b.f19421k.get(loadType2);
                                                    aVar5.g(null);
                                                    rVar7 = rVar4;
                                                    loadType3 = loadType;
                                                    loadType = loadType2;
                                                    rVar4 = rVar6;
                                                } catch (Throwable th) {
                                                    aVar5.g(null);
                                                    throw th;
                                                }
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar4;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 5;
                                            if (r.c(rVar7, loadType3, i10, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar8 = rVar4;
                                            loadType4 = loadType;
                                            a10 = a11;
                                            nVar5 = nVar3;
                                            if (loadType4 == loadType14) {
                                                aVar6 = rVar8.f19406k;
                                                aVar7 = aVar6.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar5;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar8;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar6;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar7;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 6;
                                                if (aVar7.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                try {
                                                    mVarA = aVar6.f19424b.f19422l.a(loadType14);
                                                    aVar7.g(null);
                                                    if (!(mVarA instanceof m.a)) {
                                                        r.d(rVar8, a10);
                                                    }
                                                } catch (Throwable th2) {
                                                    aVar7.g(null);
                                                    throw th2;
                                                }
                                            }
                                            nVar2 = nVar5;
                                            rVar3 = rVar8;
                                        } else {
                                            nVar2 = nVar;
                                            rVar3 = rVar2;
                                        }
                                        a13 = a10;
                                        loadType5 = LoadType.f19253c;
                                        if (nVar2.f19377b instanceof m.a) {
                                            aVar8 = rVar3.f19406k;
                                            mutexImpl = aVar8.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar8;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutexImpl;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 7;
                                            if (mutexImpl.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar9 = mutexImpl;
                                            tVar = aVar8.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 8;
                                            if (rVar3.k(tVar, loadType5, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType6 = loadType5;
                                            nVar6 = nVar2;
                                            a14 = a13;
                                            rVar9 = rVar3;
                                            r10 = aVar9;
                                            p293xa.r rVar20 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType6.ordinal()] == 1) {
                                                i11 = null;
                                                loadType8 = loadType6;
                                                rVar12 = rVar9;
                                            } else {
                                                aVar10 = rVar9.f19406k;
                                                aVar11 = aVar10.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar11;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType6;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar9;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 9;
                                                if (aVar11.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType7 = loadType6;
                                                rVar10 = rVar9;
                                                rVar11 = rVar10;
                                                aVar12 = aVar10;
                                                try {
                                                    i11 = (I) aVar12.f19424b.f19421k.get(loadType7);
                                                    aVar11.g(null);
                                                    rVar12 = rVar10;
                                                    loadType8 = loadType7;
                                                    rVar9 = rVar11;
                                                } catch (Throwable th3) {
                                                    aVar11.g(null);
                                                    throw th3;
                                                }
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType8;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                            if (r.c(rVar12, loadType6, i11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            a15 = a14;
                                            nVar7 = nVar6;
                                            if (loadType8 == loadType14) {
                                                aVar13 = rVar9.f19406k;
                                                aVar14 = aVar13.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar7;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a15;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar14;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                                if (aVar14.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                try {
                                                    mVarA2 = aVar13.f19424b.f19422l.a(loadType14);
                                                    aVar14.g(null);
                                                    if (!(mVarA2 instanceof m.a)) {
                                                        r.d(rVar9, a15);
                                                    }
                                                } catch (Throwable th4) {
                                                    aVar14.g(null);
                                                    throw th4;
                                                }
                                            }
                                            nVar2 = nVar7;
                                            rVar3 = rVar9;
                                            a13 = a15;
                                            loadType9 = LoadType.f19254d;
                                            if (nVar2.f19378c instanceof m.a) {
                                                aVar15 = rVar3.f19406k;
                                                mutexImpl2 = aVar15.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                                if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar16 = mutexImpl2;
                                                tVar2 = aVar15.f19424b;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                                if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType10 = loadType9;
                                                r<Object, Object> rVar21 = rVar3;
                                                a16 = a13;
                                                rVar13 = rVar21;
                                                r10 = aVar16;
                                                p293xa.r rVar22 = p293xa.r.f47939a;
                                                r10.g(null);
                                                if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                    i12 = null;
                                                    loadType13 = loadType10;
                                                    rVar16 = rVar13;
                                                } else {
                                                    aVar17 = rVar13.f19406k;
                                                    mutexImpl3 = aVar17.f19423a;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                    if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    loadType11 = loadType10;
                                                    rVar14 = rVar13;
                                                    rVar15 = rVar14;
                                                    aVar18 = mutexImpl3;
                                                    loadType12 = loadType11;
                                                    try {
                                                        i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                        aVar18.g(null);
                                                        loadType10 = loadType11;
                                                        rVar16 = rVar14;
                                                        loadType13 = loadType12;
                                                        rVar13 = rVar15;
                                                    } catch (Throwable th5) {
                                                        aVar18.g(null);
                                                        throw th5;
                                                    }
                                                }
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                                if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                rVar17 = rVar13;
                                                a17 = a16;
                                                if (loadType13 == loadType14) {
                                                    aVar19 = rVar17.f19406k;
                                                    mutexImpl4 = aVar19.f19423a;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                    if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    aVar20 = mutexImpl4;
                                                    rVar18 = rVar17;
                                                    try {
                                                        mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                        aVar20.g(null);
                                                        if (!(mVarA3 instanceof m.a)) {
                                                            r.d(rVar18, a17);
                                                        }
                                                    } catch (Throwable th6) {
                                                        aVar20.g(null);
                                                        throw th6;
                                                    }
                                                }
                                            }
                                        } else {
                                            loadType9 = LoadType.f19254d;
                                            if (nVar2.f19378c instanceof m.a) {
                                                aVar15 = rVar3.f19406k;
                                                mutexImpl2 = aVar15.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                                if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar16 = mutexImpl2;
                                                tVar2 = aVar15.f19424b;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                                if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType10 = loadType9;
                                                r<Object, Object> rVar23 = rVar3;
                                                a16 = a13;
                                                rVar13 = rVar23;
                                                r10 = aVar16;
                                                p293xa.r rVar24 = p293xa.r.f47939a;
                                                r10.g(null);
                                                if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                    i12 = null;
                                                    loadType13 = loadType10;
                                                    rVar16 = rVar13;
                                                } else {
                                                    aVar17 = rVar13.f19406k;
                                                    mutexImpl3 = aVar17.f19423a;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                    if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    loadType11 = loadType10;
                                                    rVar14 = rVar13;
                                                    rVar15 = rVar14;
                                                    aVar18 = mutexImpl3;
                                                    loadType12 = loadType11;
                                                    i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                    aVar18.g(null);
                                                    loadType10 = loadType11;
                                                    rVar16 = rVar14;
                                                    loadType13 = loadType12;
                                                    rVar13 = rVar15;
                                                }
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                                if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                rVar17 = rVar13;
                                                a17 = a16;
                                                if (loadType13 == loadType14) {
                                                    aVar19 = rVar17.f19406k;
                                                    mutexImpl4 = aVar19.f19423a;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                    if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    aVar20 = mutexImpl4;
                                                    rVar18 = rVar17;
                                                    mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                    aVar20.g(null);
                                                    if (!(mVarA3 instanceof m.a)) {
                                                        r.d(rVar18, a17);
                                                    }
                                                }
                                            }
                                        }
                                        return p293xa.r.f47939a;
                                    } catch (Throwable th7) {
                                        aVar2.g(null);
                                        throw th7;
                                    }
                                case 1:
                                    aVar2 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    rVar = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    aVar = (t.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    aVar3 = (a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    t<Object, Object> tVar4 = aVar.f19424b;
                                    Pair pair2 = new Pair(tVar4.f19422l.d(), tVar4.a(rVar.f19404h.f19355a.f19360c));
                                    aVar2.g(null);
                                    nVar = (n) pair2.a();
                                    yVar = (y) pair2.b();
                                    b10 = aVar3.f19283b.f19401e;
                                    if (b10 != null) {
                                        b10.e(yVar);
                                        p293xa.r rVar110 = p293xa.r.f47939a;
                                    }
                                    z10 = nVar.f19376a instanceof m.a;
                                    rVar2 = aVar3.f19283b;
                                    a10 = aVar3.f19284c;
                                    if (z10) {
                                        nVar3 = nVar;
                                        rVar4 = rVar2;
                                        a11 = a10;
                                        loadType = loadType14;
                                        if (C0193a.f19285a[loadType.ordinal()] == 1) {
                                            rVar7 = rVar4;
                                            i10 = null;
                                            loadType3 = loadType;
                                        } else {
                                            aVar4 = rVar4.f19406k;
                                            aVar5 = aVar4.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar4;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar4;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar5;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar4;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 4;
                                            if (aVar5.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar6 = rVar4;
                                            loadType2 = loadType;
                                            i10 = (I) aVar4.f19424b.f19421k.get(loadType2);
                                            aVar5.g(null);
                                            rVar7 = rVar4;
                                            loadType3 = loadType;
                                            loadType = loadType2;
                                            rVar4 = rVar6;
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 5;
                                        if (r.c(rVar7, loadType3, i10, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        rVar8 = rVar4;
                                        loadType4 = loadType;
                                        a10 = a11;
                                        nVar5 = nVar3;
                                        if (loadType4 == loadType14) {
                                            aVar6 = rVar8.f19406k;
                                            aVar7 = aVar6.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar5;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar8;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar7;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 6;
                                            if (aVar7.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            mVarA = aVar6.f19424b.f19422l.a(loadType14);
                                            aVar7.g(null);
                                            if (!(mVarA instanceof m.a)) {
                                                r.d(rVar8, a10);
                                            }
                                        }
                                        nVar2 = nVar5;
                                        rVar3 = rVar8;
                                    } else {
                                        nVar2 = nVar;
                                        rVar3 = rVar2;
                                    }
                                    a13 = a10;
                                    loadType5 = LoadType.f19253c;
                                    if (nVar2.f19377b instanceof m.a) {
                                        aVar8 = rVar3.f19406k;
                                        mutexImpl = aVar8.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutexImpl;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 7;
                                        if (mutexImpl.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar9 = mutexImpl;
                                        tVar = aVar8.f19424b;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 8;
                                        if (rVar3.k(tVar, loadType5, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType6 = loadType5;
                                        nVar6 = nVar2;
                                        a14 = a13;
                                        rVar9 = rVar3;
                                        r10 = aVar9;
                                        p293xa.r rVar25 = p293xa.r.f47939a;
                                        r10.g(null);
                                        if (C0193a.f19285a[loadType6.ordinal()] == 1) {
                                            i11 = null;
                                            loadType8 = loadType6;
                                            rVar12 = rVar9;
                                        } else {
                                            aVar10 = rVar9.f19406k;
                                            aVar11 = aVar10.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 9;
                                            if (aVar11.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType7 = loadType6;
                                            rVar10 = rVar9;
                                            rVar11 = rVar10;
                                            aVar12 = aVar10;
                                            i11 = (I) aVar12.f19424b.f19421k.get(loadType7);
                                            aVar11.g(null);
                                            rVar12 = rVar10;
                                            loadType8 = loadType7;
                                            rVar9 = rVar11;
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                        if (r.c(rVar12, loadType6, i11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        a15 = a14;
                                        nVar7 = nVar6;
                                        if (loadType8 == loadType14) {
                                            aVar13 = rVar9.f19406k;
                                            aVar14 = aVar13.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar7;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                            if (aVar14.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            mVarA2 = aVar13.f19424b.f19422l.a(loadType14);
                                            aVar14.g(null);
                                            if (!(mVarA2 instanceof m.a)) {
                                                r.d(rVar9, a15);
                                            }
                                        }
                                        nVar2 = nVar7;
                                        rVar3 = rVar9;
                                        a13 = a15;
                                        loadType9 = LoadType.f19254d;
                                        if (nVar2.f19378c instanceof m.a) {
                                            aVar15 = rVar3.f19406k;
                                            mutexImpl2 = aVar15.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                            if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar16 = mutexImpl2;
                                            tVar2 = aVar15.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType10 = loadType9;
                                            r<Object, Object> rVar26 = rVar3;
                                            a16 = a13;
                                            rVar13 = rVar26;
                                            r10 = aVar16;
                                            p293xa.r rVar27 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                i12 = null;
                                                loadType13 = loadType10;
                                                rVar16 = rVar13;
                                            } else {
                                                aVar17 = rVar13.f19406k;
                                                mutexImpl3 = aVar17.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType11 = loadType10;
                                                rVar14 = rVar13;
                                                rVar15 = rVar14;
                                                aVar18 = mutexImpl3;
                                                loadType12 = loadType11;
                                                i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                aVar18.g(null);
                                                loadType10 = loadType11;
                                                rVar16 = rVar14;
                                                loadType13 = loadType12;
                                                rVar13 = rVar15;
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar17 = rVar13;
                                            a17 = a16;
                                            if (loadType13 == loadType14) {
                                                aVar19 = rVar17.f19406k;
                                                mutexImpl4 = aVar19.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar20 = mutexImpl4;
                                                rVar18 = rVar17;
                                                mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                aVar20.g(null);
                                                if (!(mVarA3 instanceof m.a)) {
                                                    r.d(rVar18, a17);
                                                }
                                            }
                                        }
                                    } else {
                                        loadType9 = LoadType.f19254d;
                                        if (nVar2.f19378c instanceof m.a) {
                                            aVar15 = rVar3.f19406k;
                                            mutexImpl2 = aVar15.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                            if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar16 = mutexImpl2;
                                            tVar2 = aVar15.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType10 = loadType9;
                                            r<Object, Object> rVar28 = rVar3;
                                            a16 = a13;
                                            rVar13 = rVar28;
                                            r10 = aVar16;
                                            p293xa.r rVar29 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                i12 = null;
                                                loadType13 = loadType10;
                                                rVar16 = rVar13;
                                            } else {
                                                aVar17 = rVar13.f19406k;
                                                mutexImpl3 = aVar17.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType11 = loadType10;
                                                rVar14 = rVar13;
                                                rVar15 = rVar14;
                                                aVar18 = mutexImpl3;
                                                loadType12 = loadType11;
                                                i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                aVar18.g(null);
                                                loadType10 = loadType11;
                                                rVar16 = rVar14;
                                                loadType13 = loadType12;
                                                rVar13 = rVar15;
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar17 = rVar13;
                                            a17 = a16;
                                            if (loadType13 == loadType14) {
                                                aVar19 = rVar17.f19406k;
                                                mutexImpl4 = aVar19.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar20 = mutexImpl4;
                                                rVar18 = rVar17;
                                                mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                aVar20.g(null);
                                                if (!(mVarA3 instanceof m.a)) {
                                                    r.d(rVar18, a17);
                                                }
                                            }
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 2:
                                    kotlinx.coroutines.sync.a aVar21 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                    t.a aVar22 = (t.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                    LoadType loadType15 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    kotlinx.coroutines.A a18 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    r<Object, Object> rVar30 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    n nVar8 = (n) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    t tVar5 = aVar22.f19424b;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar30;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a18;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType15;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar21;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 3;
                                    if (rVar30.k(tVar5, loadType15, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    loadType = loadType15;
                                    a12 = a18;
                                    rVar5 = rVar30;
                                    nVar4 = nVar8;
                                    r10 = aVar21;
                                    p293xa.r rVar31 = p293xa.r.f47939a;
                                    r10.g(null);
                                    a11 = a12;
                                    rVar4 = rVar5;
                                    nVar3 = nVar4;
                                    if (C0193a.f19285a[loadType.ordinal()] == 1) {
                                        rVar7 = rVar4;
                                        i10 = null;
                                        loadType3 = loadType;
                                    } else {
                                        aVar4 = rVar4.f19406k;
                                        aVar5 = aVar4.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 4;
                                        if (aVar5.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        rVar6 = rVar4;
                                        loadType2 = loadType;
                                        i10 = (I) aVar4.f19424b.f19421k.get(loadType2);
                                        aVar5.g(null);
                                        rVar7 = rVar4;
                                        loadType3 = loadType;
                                        loadType = loadType2;
                                        rVar4 = rVar6;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar3;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar4;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a11;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 5;
                                    if (r.c(rVar7, loadType3, i10, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    rVar8 = rVar4;
                                    loadType4 = loadType;
                                    a10 = a11;
                                    nVar5 = nVar3;
                                    if (loadType4 == loadType14) {
                                        aVar6 = rVar8.f19406k;
                                        aVar7 = aVar6.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a10;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar7;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 6;
                                        if (aVar7.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        mVarA = aVar6.f19424b.f19422l.a(loadType14);
                                        aVar7.g(null);
                                        if (!(mVarA instanceof m.a)) {
                                            r.d(rVar8, a10);
                                        }
                                    }
                                    nVar2 = nVar5;
                                    rVar3 = rVar8;
                                    a13 = a10;
                                    loadType5 = LoadType.f19253c;
                                    if (nVar2.f19377b instanceof m.a) {
                                        aVar8 = rVar3.f19406k;
                                        mutexImpl = aVar8.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutexImpl;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 7;
                                        if (mutexImpl.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar9 = mutexImpl;
                                        tVar = aVar8.f19424b;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 8;
                                        if (rVar3.k(tVar, loadType5, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType6 = loadType5;
                                        nVar6 = nVar2;
                                        a14 = a13;
                                        rVar9 = rVar3;
                                        r10 = aVar9;
                                        p293xa.r rVar210 = p293xa.r.f47939a;
                                        r10.g(null);
                                        if (C0193a.f19285a[loadType6.ordinal()] == 1) {
                                            i11 = null;
                                            loadType8 = loadType6;
                                            rVar12 = rVar9;
                                        } else {
                                            aVar10 = rVar9.f19406k;
                                            aVar11 = aVar10.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 9;
                                            if (aVar11.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType7 = loadType6;
                                            rVar10 = rVar9;
                                            rVar11 = rVar10;
                                            aVar12 = aVar10;
                                            i11 = (I) aVar12.f19424b.f19421k.get(loadType7);
                                            aVar11.g(null);
                                            rVar12 = rVar10;
                                            loadType8 = loadType7;
                                            rVar9 = rVar11;
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                        if (r.c(rVar12, loadType6, i11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        a15 = a14;
                                        nVar7 = nVar6;
                                        if (loadType8 == loadType14) {
                                            aVar13 = rVar9.f19406k;
                                            aVar14 = aVar13.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar7;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                            if (aVar14.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            mVarA2 = aVar13.f19424b.f19422l.a(loadType14);
                                            aVar14.g(null);
                                            if (!(mVarA2 instanceof m.a)) {
                                                r.d(rVar9, a15);
                                            }
                                        }
                                        nVar2 = nVar7;
                                        rVar3 = rVar9;
                                        a13 = a15;
                                        loadType9 = LoadType.f19254d;
                                        if (nVar2.f19378c instanceof m.a) {
                                            aVar15 = rVar3.f19406k;
                                            mutexImpl2 = aVar15.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                            if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar16 = mutexImpl2;
                                            tVar2 = aVar15.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType10 = loadType9;
                                            r<Object, Object> rVar211 = rVar3;
                                            a16 = a13;
                                            rVar13 = rVar211;
                                            r10 = aVar16;
                                            p293xa.r rVar212 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                i12 = null;
                                                loadType13 = loadType10;
                                                rVar16 = rVar13;
                                            } else {
                                                aVar17 = rVar13.f19406k;
                                                mutexImpl3 = aVar17.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType11 = loadType10;
                                                rVar14 = rVar13;
                                                rVar15 = rVar14;
                                                aVar18 = mutexImpl3;
                                                loadType12 = loadType11;
                                                i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                aVar18.g(null);
                                                loadType10 = loadType11;
                                                rVar16 = rVar14;
                                                loadType13 = loadType12;
                                                rVar13 = rVar15;
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar17 = rVar13;
                                            a17 = a16;
                                            if (loadType13 == loadType14) {
                                                aVar19 = rVar17.f19406k;
                                                mutexImpl4 = aVar19.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar20 = mutexImpl4;
                                                rVar18 = rVar17;
                                                mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                aVar20.g(null);
                                                if (!(mVarA3 instanceof m.a)) {
                                                    r.d(rVar18, a17);
                                                }
                                            }
                                        }
                                    } else {
                                        loadType9 = LoadType.f19254d;
                                        if (nVar2.f19378c instanceof m.a) {
                                            aVar15 = rVar3.f19406k;
                                            mutexImpl2 = aVar15.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                            if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar16 = mutexImpl2;
                                            tVar2 = aVar15.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType10 = loadType9;
                                            r<Object, Object> rVar213 = rVar3;
                                            a16 = a13;
                                            rVar13 = rVar213;
                                            r10 = aVar16;
                                            p293xa.r rVar214 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                i12 = null;
                                                loadType13 = loadType10;
                                                rVar16 = rVar13;
                                            } else {
                                                aVar17 = rVar13.f19406k;
                                                mutexImpl3 = aVar17.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType11 = loadType10;
                                                rVar14 = rVar13;
                                                rVar15 = rVar14;
                                                aVar18 = mutexImpl3;
                                                loadType12 = loadType11;
                                                i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                aVar18.g(null);
                                                loadType10 = loadType11;
                                                rVar16 = rVar14;
                                                loadType13 = loadType12;
                                                rVar13 = rVar15;
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar17 = rVar13;
                                            a17 = a16;
                                            if (loadType13 == loadType14) {
                                                aVar19 = rVar17.f19406k;
                                                mutexImpl4 = aVar19.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar20 = mutexImpl4;
                                                rVar18 = rVar17;
                                                mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                aVar20.g(null);
                                                if (!(mVarA3 instanceof m.a)) {
                                                    r.d(rVar18, a17);
                                                }
                                            }
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 3:
                                    kotlinx.coroutines.sync.a aVar23 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                    loadType = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    a12 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    rVar5 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    nVar4 = (n) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    r10 = aVar23;
                                    p293xa.r rVar32 = p293xa.r.f47939a;
                                    r10.g(null);
                                    a11 = a12;
                                    rVar4 = rVar5;
                                    nVar3 = nVar4;
                                    if (C0193a.f19285a[loadType.ordinal()] == 1) {
                                        rVar7 = rVar4;
                                        i10 = null;
                                        loadType3 = loadType;
                                    } else {
                                        aVar4 = rVar4.f19406k;
                                        aVar5 = aVar4.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 4;
                                        if (aVar5.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        rVar6 = rVar4;
                                        loadType2 = loadType;
                                        i10 = (I) aVar4.f19424b.f19421k.get(loadType2);
                                        aVar5.g(null);
                                        rVar7 = rVar4;
                                        loadType3 = loadType;
                                        loadType = loadType2;
                                        rVar4 = rVar6;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar3;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar4;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a11;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 5;
                                    if (r.c(rVar7, loadType3, i10, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    rVar8 = rVar4;
                                    loadType4 = loadType;
                                    a10 = a11;
                                    nVar5 = nVar3;
                                    if (loadType4 == loadType14) {
                                        aVar6 = rVar8.f19406k;
                                        aVar7 = aVar6.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a10;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar7;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 6;
                                        if (aVar7.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        mVarA = aVar6.f19424b.f19422l.a(loadType14);
                                        aVar7.g(null);
                                        if (!(mVarA instanceof m.a)) {
                                            r.d(rVar8, a10);
                                        }
                                    }
                                    nVar2 = nVar5;
                                    rVar3 = rVar8;
                                    a13 = a10;
                                    loadType5 = LoadType.f19253c;
                                    if (nVar2.f19377b instanceof m.a) {
                                        aVar8 = rVar3.f19406k;
                                        mutexImpl = aVar8.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutexImpl;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 7;
                                        if (mutexImpl.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar9 = mutexImpl;
                                        tVar = aVar8.f19424b;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 8;
                                        if (rVar3.k(tVar, loadType5, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType6 = loadType5;
                                        nVar6 = nVar2;
                                        a14 = a13;
                                        rVar9 = rVar3;
                                        r10 = aVar9;
                                        p293xa.r rVar215 = p293xa.r.f47939a;
                                        r10.g(null);
                                        if (C0193a.f19285a[loadType6.ordinal()] == 1) {
                                            i11 = null;
                                            loadType8 = loadType6;
                                            rVar12 = rVar9;
                                        } else {
                                            aVar10 = rVar9.f19406k;
                                            aVar11 = aVar10.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 9;
                                            if (aVar11.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType7 = loadType6;
                                            rVar10 = rVar9;
                                            rVar11 = rVar10;
                                            aVar12 = aVar10;
                                            i11 = (I) aVar12.f19424b.f19421k.get(loadType7);
                                            aVar11.g(null);
                                            rVar12 = rVar10;
                                            loadType8 = loadType7;
                                            rVar9 = rVar11;
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                        if (r.c(rVar12, loadType6, i11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        a15 = a14;
                                        nVar7 = nVar6;
                                        if (loadType8 == loadType14) {
                                            aVar13 = rVar9.f19406k;
                                            aVar14 = aVar13.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar7;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                            if (aVar14.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            mVarA2 = aVar13.f19424b.f19422l.a(loadType14);
                                            aVar14.g(null);
                                            if (!(mVarA2 instanceof m.a)) {
                                                r.d(rVar9, a15);
                                            }
                                        }
                                        nVar2 = nVar7;
                                        rVar3 = rVar9;
                                        a13 = a15;
                                        loadType9 = LoadType.f19254d;
                                        if (nVar2.f19378c instanceof m.a) {
                                            aVar15 = rVar3.f19406k;
                                            mutexImpl2 = aVar15.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                            if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar16 = mutexImpl2;
                                            tVar2 = aVar15.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType10 = loadType9;
                                            r<Object, Object> rVar216 = rVar3;
                                            a16 = a13;
                                            rVar13 = rVar216;
                                            r10 = aVar16;
                                            p293xa.r rVar217 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                i12 = null;
                                                loadType13 = loadType10;
                                                rVar16 = rVar13;
                                            } else {
                                                aVar17 = rVar13.f19406k;
                                                mutexImpl3 = aVar17.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType11 = loadType10;
                                                rVar14 = rVar13;
                                                rVar15 = rVar14;
                                                aVar18 = mutexImpl3;
                                                loadType12 = loadType11;
                                                i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                aVar18.g(null);
                                                loadType10 = loadType11;
                                                rVar16 = rVar14;
                                                loadType13 = loadType12;
                                                rVar13 = rVar15;
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar17 = rVar13;
                                            a17 = a16;
                                            if (loadType13 == loadType14) {
                                                aVar19 = rVar17.f19406k;
                                                mutexImpl4 = aVar19.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar20 = mutexImpl4;
                                                rVar18 = rVar17;
                                                mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                aVar20.g(null);
                                                if (!(mVarA3 instanceof m.a)) {
                                                    r.d(rVar18, a17);
                                                }
                                            }
                                        }
                                    } else {
                                        loadType9 = LoadType.f19254d;
                                        if (nVar2.f19378c instanceof m.a) {
                                            aVar15 = rVar3.f19406k;
                                            mutexImpl2 = aVar15.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                            if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar16 = mutexImpl2;
                                            tVar2 = aVar15.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType10 = loadType9;
                                            r<Object, Object> rVar218 = rVar3;
                                            a16 = a13;
                                            rVar13 = rVar218;
                                            r10 = aVar16;
                                            p293xa.r rVar219 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                i12 = null;
                                                loadType13 = loadType10;
                                                rVar16 = rVar13;
                                            } else {
                                                aVar17 = rVar13.f19406k;
                                                mutexImpl3 = aVar17.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType11 = loadType10;
                                                rVar14 = rVar13;
                                                rVar15 = rVar14;
                                                aVar18 = mutexImpl3;
                                                loadType12 = loadType11;
                                                i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                aVar18.g(null);
                                                loadType10 = loadType11;
                                                rVar16 = rVar14;
                                                loadType13 = loadType12;
                                                rVar13 = rVar15;
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar17 = rVar13;
                                            a17 = a16;
                                            if (loadType13 == loadType14) {
                                                aVar19 = rVar17.f19406k;
                                                mutexImpl4 = aVar19.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar20 = mutexImpl4;
                                                rVar18 = rVar17;
                                                mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                aVar20.g(null);
                                                if (!(mVarA3 instanceof m.a)) {
                                                    r.d(rVar18, a17);
                                                }
                                            }
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 4:
                                    rVar4 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7;
                                    loadType = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6;
                                    aVar5 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                    aVar4 = (t.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                    loadType2 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    a11 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    rVar6 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    nVar3 = (n) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    i10 = (I) aVar4.f19424b.f19421k.get(loadType2);
                                    aVar5.g(null);
                                    rVar7 = rVar4;
                                    loadType3 = loadType;
                                    loadType = loadType2;
                                    rVar4 = rVar6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar3;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar4;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a11;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 5;
                                    if (r.c(rVar7, loadType3, i10, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    rVar8 = rVar4;
                                    loadType4 = loadType;
                                    a10 = a11;
                                    nVar5 = nVar3;
                                    if (loadType4 == loadType14) {
                                        aVar6 = rVar8.f19406k;
                                        aVar7 = aVar6.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a10;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar7;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 6;
                                        if (aVar7.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        mVarA = aVar6.f19424b.f19422l.a(loadType14);
                                        aVar7.g(null);
                                        if (!(mVarA instanceof m.a)) {
                                            r.d(rVar8, a10);
                                        }
                                    }
                                    nVar2 = nVar5;
                                    rVar3 = rVar8;
                                    a13 = a10;
                                    loadType5 = LoadType.f19253c;
                                    if (nVar2.f19377b instanceof m.a) {
                                        aVar8 = rVar3.f19406k;
                                        mutexImpl = aVar8.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutexImpl;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 7;
                                        if (mutexImpl.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar9 = mutexImpl;
                                        tVar = aVar8.f19424b;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 8;
                                        if (rVar3.k(tVar, loadType5, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType6 = loadType5;
                                        nVar6 = nVar2;
                                        a14 = a13;
                                        rVar9 = rVar3;
                                        r10 = aVar9;
                                        p293xa.r rVar2110 = p293xa.r.f47939a;
                                        r10.g(null);
                                        if (C0193a.f19285a[loadType6.ordinal()] == 1) {
                                            i11 = null;
                                            loadType8 = loadType6;
                                            rVar12 = rVar9;
                                        } else {
                                            aVar10 = rVar9.f19406k;
                                            aVar11 = aVar10.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 9;
                                            if (aVar11.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType7 = loadType6;
                                            rVar10 = rVar9;
                                            rVar11 = rVar10;
                                            aVar12 = aVar10;
                                            i11 = (I) aVar12.f19424b.f19421k.get(loadType7);
                                            aVar11.g(null);
                                            rVar12 = rVar10;
                                            loadType8 = loadType7;
                                            rVar9 = rVar11;
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                        if (r.c(rVar12, loadType6, i11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        a15 = a14;
                                        nVar7 = nVar6;
                                        if (loadType8 == loadType14) {
                                            aVar13 = rVar9.f19406k;
                                            aVar14 = aVar13.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar7;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                            if (aVar14.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            mVarA2 = aVar13.f19424b.f19422l.a(loadType14);
                                            aVar14.g(null);
                                            if (!(mVarA2 instanceof m.a)) {
                                                r.d(rVar9, a15);
                                            }
                                        }
                                        nVar2 = nVar7;
                                        rVar3 = rVar9;
                                        a13 = a15;
                                        loadType9 = LoadType.f19254d;
                                        if (nVar2.f19378c instanceof m.a) {
                                            aVar15 = rVar3.f19406k;
                                            mutexImpl2 = aVar15.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                            if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar16 = mutexImpl2;
                                            tVar2 = aVar15.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType10 = loadType9;
                                            r<Object, Object> rVar2111 = rVar3;
                                            a16 = a13;
                                            rVar13 = rVar2111;
                                            r10 = aVar16;
                                            p293xa.r rVar2112 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                i12 = null;
                                                loadType13 = loadType10;
                                                rVar16 = rVar13;
                                            } else {
                                                aVar17 = rVar13.f19406k;
                                                mutexImpl3 = aVar17.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType11 = loadType10;
                                                rVar14 = rVar13;
                                                rVar15 = rVar14;
                                                aVar18 = mutexImpl3;
                                                loadType12 = loadType11;
                                                i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                aVar18.g(null);
                                                loadType10 = loadType11;
                                                rVar16 = rVar14;
                                                loadType13 = loadType12;
                                                rVar13 = rVar15;
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar17 = rVar13;
                                            a17 = a16;
                                            if (loadType13 == loadType14) {
                                                aVar19 = rVar17.f19406k;
                                                mutexImpl4 = aVar19.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar20 = mutexImpl4;
                                                rVar18 = rVar17;
                                                mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                aVar20.g(null);
                                                if (!(mVarA3 instanceof m.a)) {
                                                    r.d(rVar18, a17);
                                                }
                                            }
                                        }
                                    } else {
                                        loadType9 = LoadType.f19254d;
                                        if (nVar2.f19378c instanceof m.a) {
                                            aVar15 = rVar3.f19406k;
                                            mutexImpl2 = aVar15.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                            if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar16 = mutexImpl2;
                                            tVar2 = aVar15.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType10 = loadType9;
                                            r<Object, Object> rVar2113 = rVar3;
                                            a16 = a13;
                                            rVar13 = rVar2113;
                                            r10 = aVar16;
                                            p293xa.r rVar2114 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                i12 = null;
                                                loadType13 = loadType10;
                                                rVar16 = rVar13;
                                            } else {
                                                aVar17 = rVar13.f19406k;
                                                mutexImpl3 = aVar17.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType11 = loadType10;
                                                rVar14 = rVar13;
                                                rVar15 = rVar14;
                                                aVar18 = mutexImpl3;
                                                loadType12 = loadType11;
                                                i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                aVar18.g(null);
                                                loadType10 = loadType11;
                                                rVar16 = rVar14;
                                                loadType13 = loadType12;
                                                rVar13 = rVar15;
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar17 = rVar13;
                                            a17 = a16;
                                            if (loadType13 == loadType14) {
                                                aVar19 = rVar17.f19406k;
                                                mutexImpl4 = aVar19.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar20 = mutexImpl4;
                                                rVar18 = rVar17;
                                                mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                aVar20.g(null);
                                                if (!(mVarA3 instanceof m.a)) {
                                                    r.d(rVar18, a17);
                                                }
                                            }
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 5:
                                    loadType4 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    kotlinx.coroutines.A a19 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    r<Object, Object> rVar33 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    n nVar9 = (n) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    nVar5 = nVar9;
                                    rVar8 = rVar33;
                                    a10 = a19;
                                    if (loadType4 == loadType14) {
                                        aVar6 = rVar8.f19406k;
                                        aVar7 = aVar6.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a10;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar7;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 6;
                                        if (aVar7.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        mVarA = aVar6.f19424b.f19422l.a(loadType14);
                                        aVar7.g(null);
                                        if (!(mVarA instanceof m.a)) {
                                            r.d(rVar8, a10);
                                        }
                                    }
                                    nVar2 = nVar5;
                                    rVar3 = rVar8;
                                    a13 = a10;
                                    loadType5 = LoadType.f19253c;
                                    if (nVar2.f19377b instanceof m.a) {
                                        aVar8 = rVar3.f19406k;
                                        mutexImpl = aVar8.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutexImpl;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 7;
                                        if (mutexImpl.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar9 = mutexImpl;
                                        tVar = aVar8.f19424b;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 8;
                                        if (rVar3.k(tVar, loadType5, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType6 = loadType5;
                                        nVar6 = nVar2;
                                        a14 = a13;
                                        rVar9 = rVar3;
                                        r10 = aVar9;
                                        p293xa.r rVar2115 = p293xa.r.f47939a;
                                        r10.g(null);
                                        if (C0193a.f19285a[loadType6.ordinal()] == 1) {
                                            i11 = null;
                                            loadType8 = loadType6;
                                            rVar12 = rVar9;
                                        } else {
                                            aVar10 = rVar9.f19406k;
                                            aVar11 = aVar10.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 9;
                                            if (aVar11.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType7 = loadType6;
                                            rVar10 = rVar9;
                                            rVar11 = rVar10;
                                            aVar12 = aVar10;
                                            i11 = (I) aVar12.f19424b.f19421k.get(loadType7);
                                            aVar11.g(null);
                                            rVar12 = rVar10;
                                            loadType8 = loadType7;
                                            rVar9 = rVar11;
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                        if (r.c(rVar12, loadType6, i11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        a15 = a14;
                                        nVar7 = nVar6;
                                        if (loadType8 == loadType14) {
                                            aVar13 = rVar9.f19406k;
                                            aVar14 = aVar13.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar7;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                            if (aVar14.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            mVarA2 = aVar13.f19424b.f19422l.a(loadType14);
                                            aVar14.g(null);
                                            if (!(mVarA2 instanceof m.a)) {
                                                r.d(rVar9, a15);
                                            }
                                        }
                                        nVar2 = nVar7;
                                        rVar3 = rVar9;
                                        a13 = a15;
                                        loadType9 = LoadType.f19254d;
                                        if (nVar2.f19378c instanceof m.a) {
                                            aVar15 = rVar3.f19406k;
                                            mutexImpl2 = aVar15.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                            if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar16 = mutexImpl2;
                                            tVar2 = aVar15.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType10 = loadType9;
                                            r<Object, Object> rVar2116 = rVar3;
                                            a16 = a13;
                                            rVar13 = rVar2116;
                                            r10 = aVar16;
                                            p293xa.r rVar2117 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                i12 = null;
                                                loadType13 = loadType10;
                                                rVar16 = rVar13;
                                            } else {
                                                aVar17 = rVar13.f19406k;
                                                mutexImpl3 = aVar17.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType11 = loadType10;
                                                rVar14 = rVar13;
                                                rVar15 = rVar14;
                                                aVar18 = mutexImpl3;
                                                loadType12 = loadType11;
                                                i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                aVar18.g(null);
                                                loadType10 = loadType11;
                                                rVar16 = rVar14;
                                                loadType13 = loadType12;
                                                rVar13 = rVar15;
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar17 = rVar13;
                                            a17 = a16;
                                            if (loadType13 == loadType14) {
                                                aVar19 = rVar17.f19406k;
                                                mutexImpl4 = aVar19.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar20 = mutexImpl4;
                                                rVar18 = rVar17;
                                                mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                aVar20.g(null);
                                                if (!(mVarA3 instanceof m.a)) {
                                                    r.d(rVar18, a17);
                                                }
                                            }
                                        }
                                    } else {
                                        loadType9 = LoadType.f19254d;
                                        if (nVar2.f19378c instanceof m.a) {
                                            aVar15 = rVar3.f19406k;
                                            mutexImpl2 = aVar15.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                            if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar16 = mutexImpl2;
                                            tVar2 = aVar15.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType10 = loadType9;
                                            r<Object, Object> rVar2118 = rVar3;
                                            a16 = a13;
                                            rVar13 = rVar2118;
                                            r10 = aVar16;
                                            p293xa.r rVar2119 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                i12 = null;
                                                loadType13 = loadType10;
                                                rVar16 = rVar13;
                                            } else {
                                                aVar17 = rVar13.f19406k;
                                                mutexImpl3 = aVar17.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType11 = loadType10;
                                                rVar14 = rVar13;
                                                rVar15 = rVar14;
                                                aVar18 = mutexImpl3;
                                                loadType12 = loadType11;
                                                i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                aVar18.g(null);
                                                loadType10 = loadType11;
                                                rVar16 = rVar14;
                                                loadType13 = loadType12;
                                                rVar13 = rVar15;
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar17 = rVar13;
                                            a17 = a16;
                                            if (loadType13 == loadType14) {
                                                aVar19 = rVar17.f19406k;
                                                mutexImpl4 = aVar19.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar20 = mutexImpl4;
                                                rVar18 = rVar17;
                                                mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                aVar20.g(null);
                                                if (!(mVarA3 instanceof m.a)) {
                                                    r.d(rVar18, a17);
                                                }
                                            }
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 6:
                                    aVar7 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                    aVar6 = (t.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    a10 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    rVar8 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    nVar5 = (n) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    mVarA = aVar6.f19424b.f19422l.a(loadType14);
                                    aVar7.g(null);
                                    if (!(mVarA instanceof m.a)) {
                                        r.d(rVar8, a10);
                                    }
                                    nVar2 = nVar5;
                                    rVar3 = rVar8;
                                    a13 = a10;
                                    loadType5 = LoadType.f19253c;
                                    if (nVar2.f19377b instanceof m.a) {
                                        aVar8 = rVar3.f19406k;
                                        mutexImpl = aVar8.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = mutexImpl;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 7;
                                        if (mutexImpl.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar9 = mutexImpl;
                                        tVar = aVar8.f19424b;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 8;
                                        if (rVar3.k(tVar, loadType5, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType6 = loadType5;
                                        nVar6 = nVar2;
                                        a14 = a13;
                                        rVar9 = rVar3;
                                        r10 = aVar9;
                                        p293xa.r rVar21110 = p293xa.r.f47939a;
                                        r10.g(null);
                                        if (C0193a.f19285a[loadType6.ordinal()] == 1) {
                                            i11 = null;
                                            loadType8 = loadType6;
                                            rVar12 = rVar9;
                                        } else {
                                            aVar10 = rVar9.f19406k;
                                            aVar11 = aVar10.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 9;
                                            if (aVar11.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType7 = loadType6;
                                            rVar10 = rVar9;
                                            rVar11 = rVar10;
                                            aVar12 = aVar10;
                                            i11 = (I) aVar12.f19424b.f19421k.get(loadType7);
                                            aVar11.g(null);
                                            rVar12 = rVar10;
                                            loadType8 = loadType7;
                                            rVar9 = rVar11;
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                        if (r.c(rVar12, loadType6, i11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        a15 = a14;
                                        nVar7 = nVar6;
                                        if (loadType8 == loadType14) {
                                            aVar13 = rVar9.f19406k;
                                            aVar14 = aVar13.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar7;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar14;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                            if (aVar14.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            mVarA2 = aVar13.f19424b.f19422l.a(loadType14);
                                            aVar14.g(null);
                                            if (!(mVarA2 instanceof m.a)) {
                                                r.d(rVar9, a15);
                                            }
                                        }
                                        nVar2 = nVar7;
                                        rVar3 = rVar9;
                                        a13 = a15;
                                        loadType9 = LoadType.f19254d;
                                        if (nVar2.f19378c instanceof m.a) {
                                            aVar15 = rVar3.f19406k;
                                            mutexImpl2 = aVar15.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                            if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar16 = mutexImpl2;
                                            tVar2 = aVar15.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType10 = loadType9;
                                            r<Object, Object> rVar21111 = rVar3;
                                            a16 = a13;
                                            rVar13 = rVar21111;
                                            r10 = aVar16;
                                            p293xa.r rVar21112 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                i12 = null;
                                                loadType13 = loadType10;
                                                rVar16 = rVar13;
                                            } else {
                                                aVar17 = rVar13.f19406k;
                                                mutexImpl3 = aVar17.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType11 = loadType10;
                                                rVar14 = rVar13;
                                                rVar15 = rVar14;
                                                aVar18 = mutexImpl3;
                                                loadType12 = loadType11;
                                                i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                aVar18.g(null);
                                                loadType10 = loadType11;
                                                rVar16 = rVar14;
                                                loadType13 = loadType12;
                                                rVar13 = rVar15;
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar17 = rVar13;
                                            a17 = a16;
                                            if (loadType13 == loadType14) {
                                                aVar19 = rVar17.f19406k;
                                                mutexImpl4 = aVar19.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar20 = mutexImpl4;
                                                rVar18 = rVar17;
                                                mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                aVar20.g(null);
                                                if (!(mVarA3 instanceof m.a)) {
                                                    r.d(rVar18, a17);
                                                }
                                            }
                                        }
                                    } else {
                                        loadType9 = LoadType.f19254d;
                                        if (nVar2.f19378c instanceof m.a) {
                                            aVar15 = rVar3.f19406k;
                                            mutexImpl2 = aVar15.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                            if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar16 = mutexImpl2;
                                            tVar2 = aVar15.f19424b;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                            if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType10 = loadType9;
                                            r<Object, Object> rVar21113 = rVar3;
                                            a16 = a13;
                                            rVar13 = rVar21113;
                                            r10 = aVar16;
                                            p293xa.r rVar21114 = p293xa.r.f47939a;
                                            r10.g(null);
                                            if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                                i12 = null;
                                                loadType13 = loadType10;
                                                rVar16 = rVar13;
                                            } else {
                                                aVar17 = rVar13.f19406k;
                                                mutexImpl3 = aVar17.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                                if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                loadType11 = loadType10;
                                                rVar14 = rVar13;
                                                rVar15 = rVar14;
                                                aVar18 = mutexImpl3;
                                                loadType12 = loadType11;
                                                i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                                aVar18.g(null);
                                                loadType10 = loadType11;
                                                rVar16 = rVar14;
                                                loadType13 = loadType12;
                                                rVar13 = rVar15;
                                            }
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                            if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            rVar17 = rVar13;
                                            a17 = a16;
                                            if (loadType13 == loadType14) {
                                                aVar19 = rVar17.f19406k;
                                                mutexImpl4 = aVar19.f19423a;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                                if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                aVar20 = mutexImpl4;
                                                rVar18 = rVar17;
                                                mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                                aVar20.g(null);
                                                if (!(mVarA3 instanceof m.a)) {
                                                    r.d(rVar18, a17);
                                                }
                                            }
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 7:
                                    kotlinx.coroutines.sync.a aVar24 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                    aVar8 = (t.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                    loadType5 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    a13 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    rVar3 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    nVar2 = (n) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    aVar9 = aVar24;
                                    tVar = aVar8.f19424b;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar2;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar3;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a13;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar9;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 8;
                                    if (rVar3.k(tVar, loadType5, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    loadType6 = loadType5;
                                    nVar6 = nVar2;
                                    a14 = a13;
                                    rVar9 = rVar3;
                                    r10 = aVar9;
                                    p293xa.r rVar21115 = p293xa.r.f47939a;
                                    r10.g(null);
                                    if (C0193a.f19285a[loadType6.ordinal()] == 1) {
                                        i11 = null;
                                        loadType8 = loadType6;
                                        rVar12 = rVar9;
                                    } else {
                                        aVar10 = rVar9.f19406k;
                                        aVar11 = aVar10.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar10;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 9;
                                        if (aVar11.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType7 = loadType6;
                                        rVar10 = rVar9;
                                        rVar11 = rVar10;
                                        aVar12 = aVar10;
                                        i11 = (I) aVar12.f19424b.f19421k.get(loadType7);
                                        aVar11.g(null);
                                        rVar12 = rVar10;
                                        loadType8 = loadType7;
                                        rVar9 = rVar11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                    if (r.c(rVar12, loadType6, i11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    a15 = a14;
                                    nVar7 = nVar6;
                                    if (loadType8 == loadType14) {
                                        aVar13 = rVar9.f19406k;
                                        aVar14 = aVar13.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar7;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a15;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                        if (aVar14.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        mVarA2 = aVar13.f19424b.f19422l.a(loadType14);
                                        aVar14.g(null);
                                        if (!(mVarA2 instanceof m.a)) {
                                            r.d(rVar9, a15);
                                        }
                                    }
                                    nVar2 = nVar7;
                                    rVar3 = rVar9;
                                    a13 = a15;
                                    loadType9 = LoadType.f19254d;
                                    if (nVar2.f19378c instanceof m.a) {
                                        aVar15 = rVar3.f19406k;
                                        mutexImpl2 = aVar15.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                        if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar16 = mutexImpl2;
                                        tVar2 = aVar15.f19424b;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                        if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType10 = loadType9;
                                        r<Object, Object> rVar21116 = rVar3;
                                        a16 = a13;
                                        rVar13 = rVar21116;
                                        r10 = aVar16;
                                        p293xa.r rVar21117 = p293xa.r.f47939a;
                                        r10.g(null);
                                        if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                            i12 = null;
                                            loadType13 = loadType10;
                                            rVar16 = rVar13;
                                        } else {
                                            aVar17 = rVar13.f19406k;
                                            mutexImpl3 = aVar17.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                            if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType11 = loadType10;
                                            rVar14 = rVar13;
                                            rVar15 = rVar14;
                                            aVar18 = mutexImpl3;
                                            loadType12 = loadType11;
                                            i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                            aVar18.g(null);
                                            loadType10 = loadType11;
                                            rVar16 = rVar14;
                                            loadType13 = loadType12;
                                            rVar13 = rVar15;
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                        if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        rVar17 = rVar13;
                                        a17 = a16;
                                        if (loadType13 == loadType14) {
                                            aVar19 = rVar17.f19406k;
                                            mutexImpl4 = aVar19.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                            if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar20 = mutexImpl4;
                                            rVar18 = rVar17;
                                            mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                            aVar20.g(null);
                                            if (!(mVarA3 instanceof m.a)) {
                                                r.d(rVar18, a17);
                                            }
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 8:
                                    kotlinx.coroutines.sync.a aVar25 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                    loadType6 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    kotlinx.coroutines.A a20 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    rVar9 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    n nVar10 = (n) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    a14 = a20;
                                    nVar6 = nVar10;
                                    r10 = aVar25;
                                    p293xa.r rVar21118 = p293xa.r.f47939a;
                                    r10.g(null);
                                    if (C0193a.f19285a[loadType6.ordinal()] == 1) {
                                        i11 = null;
                                        loadType8 = loadType6;
                                        rVar12 = rVar9;
                                    } else {
                                        aVar10 = rVar9.f19406k;
                                        aVar11 = aVar10.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar10;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = aVar11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = loadType6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 9;
                                        if (aVar11.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType7 = loadType6;
                                        rVar10 = rVar9;
                                        rVar11 = rVar10;
                                        aVar12 = aVar10;
                                        i11 = (I) aVar12.f19424b.f19421k.get(loadType7);
                                        aVar11.g(null);
                                        rVar12 = rVar10;
                                        loadType8 = loadType7;
                                        rVar9 = rVar11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                    if (r.c(rVar12, loadType6, i11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    a15 = a14;
                                    nVar7 = nVar6;
                                    if (loadType8 == loadType14) {
                                        aVar13 = rVar9.f19406k;
                                        aVar14 = aVar13.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar7;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a15;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                        if (aVar14.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        mVarA2 = aVar13.f19424b.f19422l.a(loadType14);
                                        aVar14.g(null);
                                        if (!(mVarA2 instanceof m.a)) {
                                            r.d(rVar9, a15);
                                        }
                                    }
                                    nVar2 = nVar7;
                                    rVar3 = rVar9;
                                    a13 = a15;
                                    loadType9 = LoadType.f19254d;
                                    if (nVar2.f19378c instanceof m.a) {
                                        aVar15 = rVar3.f19406k;
                                        mutexImpl2 = aVar15.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                        if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar16 = mutexImpl2;
                                        tVar2 = aVar15.f19424b;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                        if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType10 = loadType9;
                                        r<Object, Object> rVar21119 = rVar3;
                                        a16 = a13;
                                        rVar13 = rVar21119;
                                        r10 = aVar16;
                                        p293xa.r rVar211110 = p293xa.r.f47939a;
                                        r10.g(null);
                                        if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                            i12 = null;
                                            loadType13 = loadType10;
                                            rVar16 = rVar13;
                                        } else {
                                            aVar17 = rVar13.f19406k;
                                            mutexImpl3 = aVar17.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                            if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType11 = loadType10;
                                            rVar14 = rVar13;
                                            rVar15 = rVar14;
                                            aVar18 = mutexImpl3;
                                            loadType12 = loadType11;
                                            i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                            aVar18.g(null);
                                            loadType10 = loadType11;
                                            rVar16 = rVar14;
                                            loadType13 = loadType12;
                                            rVar13 = rVar15;
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                        if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        rVar17 = rVar13;
                                        a17 = a16;
                                        if (loadType13 == loadType14) {
                                            aVar19 = rVar17.f19406k;
                                            mutexImpl4 = aVar19.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                            if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar20 = mutexImpl4;
                                            rVar18 = rVar17;
                                            mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                            aVar20.g(null);
                                            if (!(mVarA3 instanceof m.a)) {
                                                r.d(rVar18, a17);
                                            }
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 9:
                                    rVar10 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7;
                                    loadType6 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6;
                                    aVar11 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                    aVar12 = (t.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                    loadType7 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    a14 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    rVar11 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    nVar6 = (n) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    i11 = (I) aVar12.f19424b.f19421k.get(loadType7);
                                    aVar11.g(null);
                                    rVar12 = rVar10;
                                    loadType8 = loadType7;
                                    rVar9 = rVar11;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a14;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$7 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 10;
                                    if (r.c(rVar12, loadType6, i11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    a15 = a14;
                                    nVar7 = nVar6;
                                    if (loadType8 == loadType14) {
                                        aVar13 = rVar9.f19406k;
                                        aVar14 = aVar13.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar7;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a15;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                        if (aVar14.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        mVarA2 = aVar13.f19424b.f19422l.a(loadType14);
                                        aVar14.g(null);
                                        if (!(mVarA2 instanceof m.a)) {
                                            r.d(rVar9, a15);
                                        }
                                    }
                                    nVar2 = nVar7;
                                    rVar3 = rVar9;
                                    a13 = a15;
                                    loadType9 = LoadType.f19254d;
                                    if (nVar2.f19378c instanceof m.a) {
                                        aVar15 = rVar3.f19406k;
                                        mutexImpl2 = aVar15.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                        if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar16 = mutexImpl2;
                                        tVar2 = aVar15.f19424b;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                        if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType10 = loadType9;
                                        r<Object, Object> rVar211111 = rVar3;
                                        a16 = a13;
                                        rVar13 = rVar211111;
                                        r10 = aVar16;
                                        p293xa.r rVar211112 = p293xa.r.f47939a;
                                        r10.g(null);
                                        if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                            i12 = null;
                                            loadType13 = loadType10;
                                            rVar16 = rVar13;
                                        } else {
                                            aVar17 = rVar13.f19406k;
                                            mutexImpl3 = aVar17.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                            if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType11 = loadType10;
                                            rVar14 = rVar13;
                                            rVar15 = rVar14;
                                            aVar18 = mutexImpl3;
                                            loadType12 = loadType11;
                                            i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                            aVar18.g(null);
                                            loadType10 = loadType11;
                                            rVar16 = rVar14;
                                            loadType13 = loadType12;
                                            rVar13 = rVar15;
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                        if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        rVar17 = rVar13;
                                        a17 = a16;
                                        if (loadType13 == loadType14) {
                                            aVar19 = rVar17.f19406k;
                                            mutexImpl4 = aVar19.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                            if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar20 = mutexImpl4;
                                            rVar18 = rVar17;
                                            mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                            aVar20.g(null);
                                            if (!(mVarA3 instanceof m.a)) {
                                                r.d(rVar18, a17);
                                            }
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 10:
                                    loadType8 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    kotlinx.coroutines.A a21 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    r<Object, Object> rVar34 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    n nVar11 = (n) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    nVar7 = nVar11;
                                    rVar9 = rVar34;
                                    a15 = a21;
                                    if (loadType8 == loadType14) {
                                        aVar13 = rVar9.f19406k;
                                        aVar14 = aVar13.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = nVar7;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = rVar9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = a15;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = aVar14;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 11;
                                        if (aVar14.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        mVarA2 = aVar13.f19424b.f19422l.a(loadType14);
                                        aVar14.g(null);
                                        if (!(mVarA2 instanceof m.a)) {
                                            r.d(rVar9, a15);
                                        }
                                    }
                                    nVar2 = nVar7;
                                    rVar3 = rVar9;
                                    a13 = a15;
                                    loadType9 = LoadType.f19254d;
                                    if (nVar2.f19378c instanceof m.a) {
                                        aVar15 = rVar3.f19406k;
                                        mutexImpl2 = aVar15.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                        if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar16 = mutexImpl2;
                                        tVar2 = aVar15.f19424b;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                        if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType10 = loadType9;
                                        r<Object, Object> rVar211113 = rVar3;
                                        a16 = a13;
                                        rVar13 = rVar211113;
                                        r10 = aVar16;
                                        p293xa.r rVar211114 = p293xa.r.f47939a;
                                        r10.g(null);
                                        if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                            i12 = null;
                                            loadType13 = loadType10;
                                            rVar16 = rVar13;
                                        } else {
                                            aVar17 = rVar13.f19406k;
                                            mutexImpl3 = aVar17.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                            if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType11 = loadType10;
                                            rVar14 = rVar13;
                                            rVar15 = rVar14;
                                            aVar18 = mutexImpl3;
                                            loadType12 = loadType11;
                                            i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                            aVar18.g(null);
                                            loadType10 = loadType11;
                                            rVar16 = rVar14;
                                            loadType13 = loadType12;
                                            rVar13 = rVar15;
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                        if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        rVar17 = rVar13;
                                        a17 = a16;
                                        if (loadType13 == loadType14) {
                                            aVar19 = rVar17.f19406k;
                                            mutexImpl4 = aVar19.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                            if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar20 = mutexImpl4;
                                            rVar18 = rVar17;
                                            mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                            aVar20.g(null);
                                            if (!(mVarA3 instanceof m.a)) {
                                                r.d(rVar18, a17);
                                            }
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 11:
                                    aVar14 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                    aVar13 = (t.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    a15 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    rVar9 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    nVar7 = (n) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    mVarA2 = aVar13.f19424b.f19422l.a(loadType14);
                                    aVar14.g(null);
                                    if (!(mVarA2 instanceof m.a)) {
                                        r.d(rVar9, a15);
                                    }
                                    nVar2 = nVar7;
                                    rVar3 = rVar9;
                                    a13 = a15;
                                    loadType9 = LoadType.f19254d;
                                    if (nVar2.f19378c instanceof m.a) {
                                        aVar15 = rVar3.f19406k;
                                        mutexImpl2 = aVar15.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar15;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl2;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 12;
                                        if (mutexImpl2.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar16 = mutexImpl2;
                                        tVar2 = aVar15.f19424b;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                        if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType10 = loadType9;
                                        r<Object, Object> rVar211115 = rVar3;
                                        a16 = a13;
                                        rVar13 = rVar211115;
                                        r10 = aVar16;
                                        p293xa.r rVar211116 = p293xa.r.f47939a;
                                        r10.g(null);
                                        if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                            i12 = null;
                                            loadType13 = loadType10;
                                            rVar16 = rVar13;
                                        } else {
                                            aVar17 = rVar13.f19406k;
                                            mutexImpl3 = aVar17.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                            if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            loadType11 = loadType10;
                                            rVar14 = rVar13;
                                            rVar15 = rVar14;
                                            aVar18 = mutexImpl3;
                                            loadType12 = loadType11;
                                            i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                            aVar18.g(null);
                                            loadType10 = loadType11;
                                            rVar16 = rVar14;
                                            loadType13 = loadType12;
                                            rVar13 = rVar15;
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                        if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        rVar17 = rVar13;
                                        a17 = a16;
                                        if (loadType13 == loadType14) {
                                            aVar19 = rVar17.f19406k;
                                            mutexImpl4 = aVar19.f19423a;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                            if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            aVar20 = mutexImpl4;
                                            rVar18 = rVar17;
                                            mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                            aVar20.g(null);
                                            if (!(mVarA3 instanceof m.a)) {
                                                r.d(rVar18, a17);
                                            }
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 12:
                                    kotlinx.coroutines.sync.a aVar26 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                    aVar15 = (t.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    loadType9 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    a13 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    rVar3 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    aVar16 = aVar26;
                                    tVar2 = aVar15.f19424b;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar3;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a13;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType9;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar16;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 13;
                                    if (rVar3.k(tVar2, loadType9, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    loadType10 = loadType9;
                                    r<Object, Object> rVar211117 = rVar3;
                                    a16 = a13;
                                    rVar13 = rVar211117;
                                    r10 = aVar16;
                                    p293xa.r rVar211118 = p293xa.r.f47939a;
                                    r10.g(null);
                                    if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                        i12 = null;
                                        loadType13 = loadType10;
                                        rVar16 = rVar13;
                                    } else {
                                        aVar17 = rVar13.f19406k;
                                        mutexImpl3 = aVar17.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                        if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType11 = loadType10;
                                        rVar14 = rVar13;
                                        rVar15 = rVar14;
                                        aVar18 = mutexImpl3;
                                        loadType12 = loadType11;
                                        i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                        aVar18.g(null);
                                        loadType10 = loadType11;
                                        rVar16 = rVar14;
                                        loadType13 = loadType12;
                                        rVar13 = rVar15;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                    if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    rVar17 = rVar13;
                                    a17 = a16;
                                    if (loadType13 == loadType14) {
                                        aVar19 = rVar17.f19406k;
                                        mutexImpl4 = aVar19.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                        if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar20 = mutexImpl4;
                                        rVar18 = rVar17;
                                        mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                        aVar20.g(null);
                                        if (!(mVarA3 instanceof m.a)) {
                                            r.d(rVar18, a17);
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 13:
                                    kotlinx.coroutines.sync.a aVar27 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    loadType10 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    kotlinx.coroutines.A a22 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    rVar13 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    a16 = a22;
                                    r10 = aVar27;
                                    p293xa.r rVar211119 = p293xa.r.f47939a;
                                    r10.g(null);
                                    if (C0193a.f19285a[loadType10.ordinal()] == 1) {
                                        i12 = null;
                                        loadType13 = loadType10;
                                        rVar16 = rVar13;
                                    } else {
                                        aVar17 = rVar13.f19406k;
                                        mutexImpl3 = aVar17.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType10;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = aVar17;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = mutexImpl3;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = loadType10;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = rVar13;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 14;
                                        if (mutexImpl3.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        loadType11 = loadType10;
                                        rVar14 = rVar13;
                                        rVar15 = rVar14;
                                        aVar18 = mutexImpl3;
                                        loadType12 = loadType11;
                                        i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                        aVar18.g(null);
                                        loadType10 = loadType11;
                                        rVar16 = rVar14;
                                        loadType13 = loadType12;
                                        rVar13 = rVar15;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                    if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    rVar17 = rVar13;
                                    a17 = a16;
                                    if (loadType13 == loadType14) {
                                        aVar19 = rVar17.f19406k;
                                        mutexImpl4 = aVar19.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                        if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar20 = mutexImpl4;
                                        rVar18 = rVar17;
                                        mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                        aVar20.g(null);
                                        if (!(mVarA3 instanceof m.a)) {
                                            r.d(rVar18, a17);
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 14:
                                    rVar14 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6;
                                    loadType11 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5;
                                    aVar18 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4;
                                    aVar17 = (t.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    loadType12 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    a16 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    rVar15 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    i12 = (I) aVar17.f19424b.f19421k.get(loadType12);
                                    aVar18.g(null);
                                    loadType10 = loadType11;
                                    rVar16 = rVar14;
                                    loadType13 = loadType12;
                                    rVar13 = rVar15;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar13;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a16;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = loadType13;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$4 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$5 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$6 = null;
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 15;
                                    if (r.c(rVar16, loadType10, i12, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    rVar17 = rVar13;
                                    a17 = a16;
                                    if (loadType13 == loadType14) {
                                        aVar19 = rVar17.f19406k;
                                        mutexImpl4 = aVar19.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                        if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar20 = mutexImpl4;
                                        rVar18 = rVar17;
                                        mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                        aVar20.g(null);
                                        if (!(mVarA3 instanceof m.a)) {
                                            r.d(rVar18, a17);
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 15:
                                    loadType13 = (LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    a17 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    rVar17 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    if (loadType13 == loadType14) {
                                        aVar19 = rVar17.f19406k;
                                        mutexImpl4 = aVar19.f19423a;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0 = rVar17;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1 = a17;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2 = aVar19;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3 = mutexImpl4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.label = 16;
                                        if (mutexImpl4.f(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar20 = mutexImpl4;
                                        rVar18 = rVar17;
                                        mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                        aVar20.g(null);
                                        if (!(mVarA3 instanceof m.a)) {
                                            r.d(rVar18, a17);
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                case 16:
                                    aVar20 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$3;
                                    aVar19 = (t.a) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$2;
                                    a17 = (kotlinx.coroutines.A) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$1;
                                    rVar18 = (r) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.L$0;
                                    kotlin.b.b(obj);
                                    mVarA3 = aVar19.f19424b.f19422l.a(loadType14);
                                    aVar20.g(null);
                                    if (!(mVarA3 instanceof m.a)) {
                                        r.d(rVar18, a17);
                                    }
                                    return p293xa.r.f47939a;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Throwable th8) {
                            r10.g(null);
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        r10.g(null);
                        throw th9;
                    }
                } catch (Throwable th10) {
                    r10.g(null);
                    throw th10;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
                return a(cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(r rVar, kotlin.coroutines.c cVar, kotlinx.coroutines.channels.d dVar) {
            super(2, cVar);
            this.$retryChannel = dVar;
            this.this$0 = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, cVar, this.$retryChannel);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass4) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
                C2684a c2684aF = C2688e.f(this.$retryChannel);
                a aVar = new a(this.this$0, a10);
                this.label = 1;
                if (c2684aF.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1(r<Object, Object> rVar, kotlin.coroutines.c<? super PageFetcherSnapshot$pageEventFlow$1> cVar) {
        super(2, cVar);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.this$0, cVar);
        pageFetcherSnapshot$pageEventFlow$1.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    @Override // Ia.p
    public final Object invoke(C<PageEvent<Object>> c10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PageFetcherSnapshot$pageEventFlow$1) create(c10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C c10;
        B<Object, Object> b10;
        y<Object, Object> yVar;
        kotlinx.coroutines.sync.a aVar;
        t.a<Object, Object> aVar2;
        r<Object, Object> rVar;
        C c11;
        t.a<Object, Object> aVar3;
        MutexImpl mutexImpl;
        C c12;
        kotlinx.coroutines.sync.a aVar4;
        t.a<Object, Object> aVar5;
        m mVarA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    aVar = (kotlinx.coroutines.sync.a) this.L$3;
                    aVar2 = (t.a) this.L$2;
                    b10 = (B) this.L$1;
                    c10 = (C) this.L$0;
                    kotlin.b.b(obj);
                } else if (i10 == 2) {
                    c11 = (C) this.L$0;
                    kotlin.b.b(obj);
                    aVar3 = this.this$0.f19406k;
                    mutexImpl = aVar3.f19423a;
                    this.L$0 = c11;
                    this.L$1 = aVar3;
                    this.L$2 = mutexImpl;
                    this.label = 3;
                    if (mutexImpl.f(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c12 = c11;
                    aVar4 = mutexImpl;
                    aVar5 = aVar3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar4 = (kotlinx.coroutines.sync.a) this.L$2;
                    aVar5 = (t.a) this.L$1;
                    c12 = (C) this.L$0;
                    kotlin.b.b(obj);
                }
                try {
                    mVarA = aVar5.f19424b.f19422l.a(LoadType.f19252b);
                    aVar4.g(null);
                    if (!(mVarA instanceof m.a)) {
                        r.d(this.this$0, c12);
                    }
                    return p293xa.r.f47939a;
                } catch (Throwable th) {
                    aVar4.g(null);
                    throw th;
                }
            }
            kotlin.b.b(obj);
            c10 = (C) this.L$0;
            if (!this.this$0.f19405i.compareAndSet(false, true)) {
                throw new IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?");
            }
            C2680e.c(c10, null, null, new AnonymousClass2(this.this$0, c10, null), 3);
            BufferedChannel bufferedChannelA = kotlinx.coroutines.channels.g.a(0, 6, null);
            C2680e.c(c10, null, null, new AnonymousClass3(this.this$0, null, bufferedChannelA), 3);
            C2680e.c(c10, null, null, new AnonymousClass4(this.this$0, null, bufferedChannelA), 3);
            r<Object, Object> rVar2 = this.this$0;
            b10 = rVar2.f19401e;
            if (b10 != null) {
                yVar = rVar2.f19402f;
                if (yVar == null) {
                    t.a<Object, Object> aVar6 = rVar2.f19406k;
                    aVar = aVar6.f19423a;
                    this.L$0 = c10;
                    this.L$1 = b10;
                    this.L$2 = aVar6;
                    this.L$3 = aVar;
                    this.label = 1;
                    if (aVar.f(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar2 = aVar6;
                }
                b10.a(yVar);
            }
            rVar = this.this$0;
            this.L$0 = c10;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (rVar.f(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c11 = c10;
            aVar3 = this.this$0.f19406k;
            mutexImpl = aVar3.f19423a;
            this.L$0 = c11;
            this.L$1 = aVar3;
            this.L$2 = mutexImpl;
            this.label = 3;
            if (mutexImpl.f(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c12 = c11;
            aVar4 = mutexImpl;
            aVar5 = aVar3;
            mVarA = aVar5.f19424b.f19422l.a(LoadType.f19252b);
            aVar4.g(null);
            if (!(mVarA instanceof m.a)) {
                r.d(this.this$0, c12);
            }
            return p293xa.r.f47939a;
            y<Object, Object> yVarA = aVar2.f19424b.a(null);
            aVar.g(null);
            yVar = yVarA;
            b10.a(yVar);
            rVar = this.this$0;
            this.L$0 = c10;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (rVar.f(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c11 = c10;
            aVar3 = this.this$0.f19406k;
            mutexImpl = aVar3.f19423a;
            this.L$0 = c11;
            this.L$1 = aVar3;
            this.L$2 = mutexImpl;
            this.label = 3;
            if (mutexImpl.f(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c12 = c11;
            aVar4 = mutexImpl;
            aVar5 = aVar3;
            mVarA = aVar5.f19424b.f19422l.a(LoadType.f19252b);
            aVar4.g(null);
            if (!(mVarA instanceof m.a)) {
                r.d(this.this$0, c12);
            }
            return p293xa.r.f47939a;
        } catch (Throwable th2) {
            aVar.g(null);
            throw th2;
        }
    }
}
