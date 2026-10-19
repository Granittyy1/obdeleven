package androidx.datastore.core;

import Ia.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SimpleActor.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMajor, R.styleable.AppCompatTheme_windowFixedWidthMajor}, m = "invokeSuspend")
final class SimpleActor$offer$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<Object> simpleActor, kotlin.coroutines.c<? super SimpleActor$offer$2> cVar) {
        super(2, cVar);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SimpleActor$offer$2(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SimpleActor$offer$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0052 -> B:18:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.b.b(r6)
            goto L55
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            java.lang.Object r1 = r5.L$0
            Ia.p r1 = (Ia.p) r1
            kotlin.b.b(r6)
            goto L49
        L20:
            kotlin.b.b(r6)
            androidx.datastore.core.SimpleActor<java.lang.Object> r6 = r5.this$0
            java.util.concurrent.atomic.AtomicInteger r6 = r6.f17038d
            int r6 = r6.get()
            if (r6 <= 0) goto L62
        L2d:
            androidx.datastore.core.SimpleActor<java.lang.Object> r6 = r5.this$0
            kotlinx.coroutines.A r6 = r6.f17035a
            kotlin.coroutines.e r6 = r6.getCoroutineContext()
            kotlinx.coroutines.C2702l0.e(r6)
            androidx.datastore.core.SimpleActor<java.lang.Object> r6 = r5.this$0
            Ia.p<T, kotlin.coroutines.c<? super xa.r>, java.lang.Object> r1 = r6.f17036b
            r5.L$0 = r1
            r5.label = r3
            kotlinx.coroutines.channels.BufferedChannel r6 = r6.f17037c
            java.lang.Object r6 = r6.d(r5)
            if (r6 != r0) goto L49
            return r0
        L49:
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r6 = r1.invoke(r6, r5)
            if (r6 != r0) goto L55
            return r0
        L55:
            androidx.datastore.core.SimpleActor<java.lang.Object> r6 = r5.this$0
            java.util.concurrent.atomic.AtomicInteger r6 = r6.f17038d
            int r6 = r6.decrementAndGet()
            if (r6 != 0) goto L2d
            xa.r r6 = p293xa.r.f47939a
            return r6
        L62:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
