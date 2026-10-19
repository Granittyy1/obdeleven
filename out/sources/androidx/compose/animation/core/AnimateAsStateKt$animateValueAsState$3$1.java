package androidx.compose.animation.core;

import androidx.compose.runtime.N0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AnimateAsState.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {418}, m = "invokeSuspend")
final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ N0<InterfaceC0906f<Object>> $animSpec$delegate;
    final /* synthetic */ Animatable<Object, Object> $animatable;
    final /* synthetic */ kotlinx.coroutines.channels.d<Object> $channel;
    final /* synthetic */ N0<Ia.l<Object, p293xa.r>> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnimateAsState.kt */
    @Aa.c(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {427}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ N0<InterfaceC0906f<Object>> $animSpec$delegate;
        final /* synthetic */ Animatable<Object, Object> $animatable;
        final /* synthetic */ N0<Ia.l<Object, p293xa.r>> $listener$delegate;
        final /* synthetic */ Object $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Object obj, Animatable<Object, Object> animatable, N0<? extends InterfaceC0906f<Object>> n10, N0<? extends Ia.l<Object, p293xa.r>> n11, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$newTarget = obj;
            this.$animatable = animatable;
            this.$animSpec$delegate = n10;
            this.$listener$delegate = n11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                if (!kotlin.jvm.internal.i.a(this.$newTarget, this.$animatable.f9340e.getValue())) {
                    Animatable<Object, Object> animatable = this.$animatable;
                    Object obj2 = this.$newTarget;
                    N0<InterfaceC0906f<Object>> n10 = this.$animSpec$delegate;
                    P<Float> p10 = C0902b.f9523a;
                    InterfaceC0906f<Object> value = n10.getValue();
                    this.label = 1;
                    if (Animatable.c(animatable, obj2, value, null, this, 12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return p293xa.r.f47939a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            N0<Ia.l<Object, p293xa.r>> n11 = this.$listener$delegate;
            P<Float> p11 = C0902b.f9523a;
            Ia.l<Object, p293xa.r> value2 = n11.getValue();
            if (value2 != null) {
                value2.invoke(this.$animatable.d());
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimateAsStateKt$animateValueAsState$3$1(kotlinx.coroutines.channels.d<Object> dVar, Animatable<Object, Object> animatable, N0<? extends InterfaceC0906f<Object>> n10, N0<? extends Ia.l<Object, p293xa.r>> n11, kotlin.coroutines.c<? super AnimateAsStateKt$animateValueAsState$3$1> cVar) {
        super(2, cVar);
        this.$channel = dVar;
        this.$animatable = animatable;
        this.$animSpec$delegate = n10;
        this.$listener$delegate = n11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, cVar);
        animateAsStateKt$animateValueAsState$3$1.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:12:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0037
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r11.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r11.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.f) r1
            java.lang.Object r3 = r11.L$0
            kotlinx.coroutines.A r3 = (kotlinx.coroutines.A) r3
            kotlin.b.b(r12)
            goto L38
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            kotlin.b.b(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.A r12 = (kotlinx.coroutines.A) r12
            kotlinx.coroutines.channels.d<java.lang.Object> r1 = r11.$channel
            kotlinx.coroutines.channels.f r1 = r1.iterator()
            r3 = r12
        L2b:
            r11.L$0 = r3
            r11.L$1 = r1
            r11.label = r2
            java.lang.Object r12 = r1.a(r11)
            if (r12 != r0) goto L38
            return r0
        L38:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L66
            java.lang.Object r12 = r1.next()
            kotlinx.coroutines.channels.d<java.lang.Object> r4 = r11.$channel
            java.lang.Object r4 = r4.g()
            java.lang.Object r4 = kotlinx.coroutines.channels.h.b(r4)
            if (r4 != 0) goto L52
            r6 = r12
            goto L53
        L52:
            r6 = r4
        L53:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 r12 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1
            androidx.compose.animation.core.Animatable<java.lang.Object, java.lang.Object> r7 = r11.$animatable
            androidx.compose.runtime.N0<androidx.compose.animation.core.f<java.lang.Object>> r8 = r11.$animSpec$delegate
            androidx.compose.runtime.N0<Ia.l<java.lang.Object, xa.r>> r9 = r11.$listener$delegate
            r10 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r4 = 3
            r5 = 0
            kotlinx.coroutines.C2680e.c(r3, r5, r5, r12, r4)
            goto L2b
        L66:
            xa.r r12 = p293xa.r.f47939a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
