package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", l = {232, R.styleable.AppCompatTheme_selectableItemBackgroundBorderless}, m = "invokeSuspend")
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends SuspendLambda implements Ia.q<InterfaceC2687d<? super C1432h>, Integer, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ LoadType $loadType$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(kotlin.coroutines.c cVar, r rVar, LoadType loadType) {
        super(3, cVar);
        this.this$0 = rVar;
        this.$loadType$inlined = loadType;
    }

    @Override // Ia.q
    public final Object invoke(InterfaceC2687d<? super C1432h> interfaceC2687d, Integer num, kotlin.coroutines.c<? super p293xa.r> cVar) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(cVar, this.this$0, this.$loadType$inlined);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.L$0 = interfaceC2687d;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.L$1 = num;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC2687d<? super C1432h> interfaceC2687d;
        final int iIntValue;
        t.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        InterfaceC2686c<C1432h> flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1;
        Object obj2 = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    iIntValue = this.I$0;
                    aVar2 = (kotlinx.coroutines.sync.a) this.L$2;
                    aVar = (t.a) this.L$1;
                    interfaceC2687d = (InterfaceC2687d) this.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            interfaceC2687d = (InterfaceC2687d) this.L$0;
            iIntValue = ((Number) this.L$1).intValue();
            aVar = this.this$0.f19406k;
            aVar2 = aVar.f19423a;
            this.L$0 = interfaceC2687d;
            this.L$1 = aVar;
            this.L$2 = aVar2;
            this.I$0 = iIntValue;
            this.label = 1;
            if (aVar2.f(null, this) == obj2) {
                return obj2;
            }
            p pVar = aVar.f19424b.f19422l;
            if (kotlin.jvm.internal.i.a(pVar.a(this.$loadType$inlined), m.c.f19373b)) {
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(new C1432h[0]);
                aVar2.g(null);
            } else {
                if (!(pVar.a(this.$loadType$inlined) instanceof m.a)) {
                    pVar.c(this.$loadType$inlined, m.c.f19374c);
                }
                p293xa.r rVar = p293xa.r.f47939a;
                aVar2.g(null);
                kotlinx.coroutines.flow.v vVarA = this.this$0.f19404h.a(this.$loadType$inlined);
                int i11 = iIntValue == 0 ? 0 : 1;
                if (i11 < 0) {
                    throw new IllegalArgumentException(J4.i.b(i11, "Drop count should be non-negative, but had ").toString());
                }
                final kotlinx.coroutines.flow.i iVar = new kotlinx.coroutines.flow.i(vVarA, i11);
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 = new InterfaceC2686c<C1432h>() { // from class: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1

                    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC2687d f19279b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ int f19280c;

                        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Aa.c(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", l = {223}, m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(kotlin.coroutines.c cVar) {
                                super(cVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC2687d interfaceC2687d, int i10) {
                            this.f19279b = interfaceC2687d;
                            this.f19280c = i10;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC2687d
                        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                kotlin.b.b(obj2);
                                C1432h c1432h = new C1432h(this.f19280c, (I) obj);
                                anonymousClass1.label = 1;
                                if (this.f19279b.emit(c1432h, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj2);
                            }
                            return p293xa.r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public final Object collect(InterfaceC2687d<? super C1432h> interfaceC2687d2, kotlin.coroutines.c cVar) throws Throwable {
                        Object objCollect = iVar.collect(new AnonymousClass2(interfaceC2687d2, iIntValue), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
                    }
                };
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (interfaceC2687d instanceof kotlinx.coroutines.flow.E) {
                throw ((kotlinx.coroutines.flow.E) interfaceC2687d).f43315b;
            }
            Object objCollect = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.collect(interfaceC2687d, this);
            if (objCollect != obj2) {
                objCollect = p293xa.r.f47939a;
            }
            if (objCollect == obj2) {
                return obj2;
            }
            return p293xa.r.f47939a;
        } catch (Throwable th) {
            aVar2.g(null);
            throw th;
        }
    }
}
