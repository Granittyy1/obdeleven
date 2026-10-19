package androidx.paging;

import android.os.Build;
import android.util.Log;
import java.util.Collection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PageFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {136}, m = "invokeSuspend")
final class PageFetcher$flow$1 extends SuspendLambda implements Ia.p<C<PagingData<Object>>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ RemoteMediator<Object, Object> $remoteMediator;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ q<Object, Object> this$0;

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$flow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcher.kt */
    @Aa.c(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {R.styleable.AppCompatTheme_dialogTheme, R.styleable.AppCompatTheme_dialogTheme}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<InterfaceC2687d<? super Boolean>, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ A<Object, Object> $remoteMediatorAccessor;
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(A<Object, Object> a10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$remoteMediatorAccessor, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(InterfaceC2687d<? super Boolean> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(interfaceC2687d, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0041  */
        /* JADX WARN: Code duplicated, block: B:23:0x0050 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC2687d interfaceC2687d;
            RemoteMediator.InitializeAction initializeAction;
            Boolean boolValueOf;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
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
            A<Object, Object> a10 = this.$remoteMediatorAccessor;
            if (a10 != null) {
                this.L$0 = interfaceC2687d;
                this.label = 1;
                obj = a10.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                initializeAction = null;
            }
            boolValueOf = Boolean.valueOf(initializeAction == RemoteMediator.InitializeAction.f19322b);
            this.L$0 = null;
            this.label = 2;
            if (interfaceC2687d.emit(boolValueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
            initializeAction = (RemoteMediator.InitializeAction) obj;
            boolValueOf = Boolean.valueOf(initializeAction == RemoteMediator.InitializeAction.f19322b);
            this.L$0 = null;
            this.label = 2;
            if (interfaceC2687d.emit(boolValueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$flow$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcher.kt */
    @Aa.c(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {R.styleable.AppCompatTheme_listChoiceBackgroundIndicator, R.styleable.AppCompatTheme_listMenuViewStyle}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.q<q.a<Object, Object>, Boolean, kotlin.coroutines.c<? super q.a<Object, Object>>, Object> {
        final /* synthetic */ A<Object, Object> $remoteMediatorAccessor;
        /* synthetic */ Object L$0;
        Object L$1;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ q<Object, Object> this$0;

        /* JADX INFO: renamed from: androidx.paging.PageFetcher$flow$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: PageFetcher.kt */
        public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Ia.a<p293xa.r> {
            @Override // Ia.a
            public final p293xa.r invoke() {
                q qVar = (q) this.receiver;
                qVar.f19388d.a(Boolean.TRUE);
                return p293xa.r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(q qVar, A a10, kotlin.coroutines.c cVar) {
            super(3, cVar);
            this.this$0 = qVar;
        }

        @Override // Ia.q
        public final Object invoke(q.a<Object, Object> aVar, Boolean bool, kotlin.coroutines.c<? super q.a<Object, Object>> cVar) {
            boolean zBooleanValue = bool.booleanValue();
            A<Object, Object> a10 = this.$remoteMediatorAccessor;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, a10, cVar);
            anonymousClass2.L$0 = aVar;
            anonymousClass2.Z$0 = zBooleanValue;
            return anonymousClass2.invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0072  */
        /* JADX WARN: Code duplicated, block: B:32:0x0075  */
        /* JADX WARN: Code duplicated, block: B:46:0x0096  */
        /* JADX WARN: Code duplicated, block: B:47:0x0099  */
        /* JADX WARN: Code duplicated, block: B:49:0x009c  */
        /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            q.a aVar;
            Object objA;
            A<Object, Object> a10;
            y yVar;
            PagingSource pagingSource;
            Object objE;
            PagingSource pagingSource2;
            Collection collection;
            Collection collection2;
            y yVar2;
            Collection collection3;
            Integer num;
            Object refreshKey;
            Integer num2;
            y<Key, Value> yVar3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    aVar = (q.a) this.L$0;
                    kotlin.b.b(obj);
                    objA = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pagingSource2 = (PagingSource) this.L$1;
                    aVar = (q.a) this.L$0;
                    kotlin.b.b(obj);
                    objE = obj;
                }
                yVar = (y) objE;
                pagingSource = pagingSource2;
                if (yVar != null) {
                    collection = yVar.f19453a;
                } else {
                    collection = null;
                }
                collection2 = collection;
                if ((collection2 != null || collection2.isEmpty()) && aVar != null && (yVar2 = aVar.f19392b) != null && (collection3 = yVar2.f19453a) != null && (!collection3.isEmpty())) {
                }
                if (yVar != null) {
                    num = yVar.f19454b;
                } else {
                    num = null;
                }
                if (num == null) {
                    if (aVar != null || (yVar3 = aVar.f19392b) == 0) {
                        num2 = null;
                    } else {
                        num2 = yVar3.f19454b;
                    }
                    if (num2 != null) {
                        yVar = aVar.f19392b;
                    }
                }
                if (yVar == null) {
                    refreshKey = this.this$0.f19386b;
                } else {
                    refreshKey = pagingSource.getRefreshKey(yVar);
                    if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                        String message = "Refresh key " + refreshKey + " returned from PagingSource " + pagingSource;
                        kotlin.jvm.internal.i.e(message, "message");
                    }
                }
                Object obj2 = refreshKey;
                if (aVar != null) {
                    aVar.f19391a.f19407l.i(null);
                }
                if (aVar != null) {
                    aVar.f19393c.i(null);
                }
                q<Object, Object> qVar = this.this$0;
                return new q.a(new r(obj2, pagingSource, qVar.f19387c, (ConflatedEventBus$special$$inlined$mapNotNull$1) qVar.f19389e.f10041c, this.$remoteMediatorAccessor, yVar, new AnonymousClass1(0, this.this$0, q.class, "refresh", "refresh()V", 0)), yVar, C2702l0.a());
            }
            kotlin.b.b(obj);
            aVar = (q.a) this.L$0;
            if (this.Z$0 && (a10 = this.$remoteMediatorAccessor) != null) {
                a10.d();
            }
            q<Object, Object> qVar2 = this.this$0;
            PagingSource pagingSource3 = aVar != null ? aVar.f19391a.f19398b : null;
            this.L$0 = aVar;
            this.label = 1;
            objA = q.a(qVar2, pagingSource3, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            PagingSource pagingSource4 = (PagingSource) objA;
            if (aVar != null) {
                r<Key, Value> rVar = aVar.f19391a;
                this.L$0 = aVar;
                this.L$1 = pagingSource4;
                this.label = 2;
                objE = rVar.e(this);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                pagingSource2 = pagingSource4;
                yVar = (y) objE;
                pagingSource = pagingSource2;
            } else {
                yVar = null;
                pagingSource = pagingSource4;
            }
            if (yVar != null) {
                collection = yVar.f19453a;
            } else {
                collection = null;
            }
            collection2 = collection;
            yVar = collection2 != null ? yVar2 : yVar2;
            if (yVar != null) {
                num = yVar.f19454b;
            } else {
                num = null;
            }
            if (num == null) {
                if (aVar != null) {
                    num2 = null;
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    yVar = aVar.f19392b;
                }
            }
            if (yVar == null) {
                refreshKey = this.this$0.f19386b;
            } else {
                refreshKey = pagingSource.getRefreshKey(yVar);
                if (Build.ID != null) {
                    String message2 = "Refresh key " + refreshKey + " returned from PagingSource " + pagingSource;
                    kotlin.jvm.internal.i.e(message2, "message");
                }
            }
            Object obj3 = refreshKey;
            if (aVar != null) {
                aVar.f19391a.f19407l.i(null);
            }
            if (aVar != null) {
                aVar.f19393c.i(null);
            }
            q<Object, Object> qVar3 = this.this$0;
            return new q.a(new r(obj3, pagingSource, qVar3.f19387c, (ConflatedEventBus$special$$inlined$mapNotNull$1) qVar3.f19389e.f10041c, this.$remoteMediatorAccessor, yVar, new AnonymousClass1(0, this.this$0, q.class, "refresh", "refresh()V", 0)), yVar, C2702l0.a());
        }
    }

    /* JADX INFO: compiled from: PageFetcher.kt */
    public /* synthetic */ class a implements InterfaceC2687d, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C<PagingData<Object>> f19273b;

        public a(C<PagingData<Object>> c10) {
            this.f19273b = c10;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return new FunctionReferenceImpl(2, this.f19273b, C.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            Object objT = this.f19273b.t((PagingData) obj, cVar);
            return objT == CoroutineSingletons.f43038b ? objT : p293xa.r.f47939a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2687d) && (obj instanceof kotlin.jvm.internal.f)) {
                return b().equals(((kotlin.jvm.internal.f) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1(q qVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(this.this$0, cVar);
        pageFetcher$flow$1.L$0 = obj;
        return pageFetcher$flow$1;
    }

    @Override // Ia.p
    public final Object invoke(C<PagingData<Object>> c10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PageFetcher$flow$1) create(c10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C c10 = (C) this.L$0;
            InterfaceC2686c interfaceC2686cA = FlowExtKt.a(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new kotlinx.coroutines.flow.t(new FlowExtKt$simpleScan$1(null, new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new AnonymousClass1(null, null), (ConflatedEventBus$special$$inlined$mapNotNull$1) this.this$0.f19388d.f10041c), new AnonymousClass2(this.this$0, null, null), null))), new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(this.this$0, null, null));
            a aVar = new a(c10);
            this.label = 1;
            if (interfaceC2686cA.collect(aVar, this) == coroutineSingletons) {
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
