package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", l = {R.styleable.AppCompatTheme_panelMenuListWidth}, m = "invokeSuspend")
public final class FlowExtKt$simpleTransformLatest$1<R> extends SuspendLambda implements Ia.p<C<R>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC2686c<T> $this_simpleTransformLatest;
    final /* synthetic */ Ia.q<InterfaceC2687d<? super R>, T, kotlin.coroutines.c<? super p293xa.r>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExt.kt */
    @Aa.c(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", l = {R.styleable.AppCompatTheme_popupMenuStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1<T> extends SuspendLambda implements Ia.p<T, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ C1427c<R> $collector;
        final /* synthetic */ Ia.q<InterfaceC2687d<? super R>, T, kotlin.coroutines.c<? super p293xa.r>, Object> $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ia.q<? super InterfaceC2687d<? super R>, ? super T, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, C1427c<R> c1427c, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$transform = qVar;
            this.$collector = c1427c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, this.$collector, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(Object obj, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(obj, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.FlowExtKt$simpleTransformLatest$1$1<T> for r4v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                kotlin.b.b(r5)
                goto L27
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                kotlin.b.b(r5)
                java.lang.Object r5 = r4.L$0
                Ia.q<kotlinx.coroutines.flow.d<? super R>, T, kotlin.coroutines.c<? super xa.r>, java.lang.Object> r1 = r4.$transform
                androidx.paging.c<R> r3 = r4.$collector
                r4.label = r2
                java.lang.Object r5 = r1.invoke(r3, r5, r4)
                if (r5 != r0) goto L27
                return r0
            L27:
                xa.r r5 = p293xa.r.f47939a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$simpleTransformLatest$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$simpleTransformLatest$1(InterfaceC2686c<? extends T> interfaceC2686c, Ia.q<? super InterfaceC2687d<? super R>, ? super T, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowExtKt$simpleTransformLatest$1> cVar) {
        super(2, cVar);
        this.$this_simpleTransformLatest = interfaceC2686c;
        this.$transform = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        FlowExtKt$simpleTransformLatest$1 flowExtKt$simpleTransformLatest$1 = new FlowExtKt$simpleTransformLatest$1(this.$this_simpleTransformLatest, this.$transform, cVar);
        flowExtKt$simpleTransformLatest$1.L$0 = obj;
        return flowExtKt$simpleTransformLatest$1;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((FlowExtKt$simpleTransformLatest$1) create((C) obj, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C c10 = (C) this.L$0;
            InterfaceC2686c<T> interfaceC2686c = this.$this_simpleTransformLatest;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, new C1427c(c10), null);
            this.label = 1;
            if (C2688e.e(interfaceC2686c, anonymousClass1, this) == coroutineSingletons) {
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
