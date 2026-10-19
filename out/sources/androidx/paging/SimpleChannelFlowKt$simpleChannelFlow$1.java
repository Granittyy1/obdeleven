package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SimpleChannelFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", l = {R.styleable.AppCompatTheme_checkedTextViewStyle}, m = "invokeSuspend")
public final class SimpleChannelFlowKt$simpleChannelFlow$1<T> extends SuspendLambda implements Ia.p<InterfaceC2687d<? super T>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<C<T>, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SimpleChannelFlow.kt */
    @Aa.c(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", l = {R.styleable.AppCompatTheme_dropdownListPreferredItemHeight, R.styleable.AppCompatTheme_editTextBackground}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ InterfaceC2687d<T> $$this$flow;
        final /* synthetic */ Ia.p<C<T>, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(InterfaceC2687d<? super T> interfaceC2687d, Ia.p<? super C<T>, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$$this$flow = interfaceC2687d;
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$flow, this.$block, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0076 -> B:7:0x0018). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1 for r8v1 'this'  kotlin.coroutines.c
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
                int r1 = r8.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L23
                if (r1 != r3) goto L1b
                java.lang.Object r1 = r8.L$1
                kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.f) r1
                java.lang.Object r5 = r8.L$0
                kotlinx.coroutines.i0 r5 = (kotlinx.coroutines.InterfaceC2694i0) r5
                kotlin.b.b(r9)
            L18:
                r9 = r5
                r5 = r1
                goto L4d
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r1 = r8.L$1
                kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.f) r1
                java.lang.Object r5 = r8.L$0
                kotlinx.coroutines.i0 r5 = (kotlinx.coroutines.InterfaceC2694i0) r5
                kotlin.b.b(r9)
                goto L5e
            L2f:
                kotlin.b.b(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.A r9 = (kotlinx.coroutines.A) r9
                r1 = 0
                r5 = 6
                kotlinx.coroutines.channels.BufferedChannel r1 = kotlinx.coroutines.channels.g.a(r1, r5, r2)
                androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 r5 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1
                Ia.p<androidx.paging.C<T>, kotlin.coroutines.c<? super xa.r>, java.lang.Object> r6 = r8.$block
                r5.<init>(r1, r6, r2)
                r6 = 3
                kotlinx.coroutines.z0 r9 = kotlinx.coroutines.C2680e.c(r9, r2, r2, r5, r6)
                kotlinx.coroutines.channels.BufferedChannel$a r5 = new kotlinx.coroutines.channels.BufferedChannel$a
                r5.<init>()
            L4d:
                r8.L$0 = r9
                r8.L$1 = r5
                r8.label = r4
                java.lang.Object r1 = r5.a(r8)
                if (r1 != r0) goto L5a
                return r0
            L5a:
                r7 = r5
                r5 = r9
                r9 = r1
                r1 = r7
            L5e:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L79
                java.lang.Object r9 = r1.next()
                kotlinx.coroutines.flow.d<T> r6 = r8.$$this$flow
                r8.L$0 = r5
                r8.L$1 = r1
                r8.label = r3
                java.lang.Object r9 = r6.emit(r9, r8)
                if (r9 != r0) goto L18
                return r0
            L79:
                r5.i(r2)
                xa.r r9 = p293xa.r.f47939a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleChannelFlowKt$simpleChannelFlow$1(Ia.p<? super C<T>, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super SimpleChannelFlowKt$simpleChannelFlow$1> cVar) {
        super(2, cVar);
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1(this.$block, cVar);
        simpleChannelFlowKt$simpleChannelFlow$1.L$0 = obj;
        return simpleChannelFlowKt$simpleChannelFlow$1;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1) create((InterfaceC2687d) obj, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((InterfaceC2687d) this.L$0, this.$block, null);
            this.label = 1;
            if (kotlinx.coroutines.B.d(anonymousClass1, this) == coroutineSingletons) {
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
