package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.A;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {421, 423, 425, 432, 434, 437}, m = "invokeSuspend")
final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DragGestureNode this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @Aa.c(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {428}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<Ia.l<? super f.b, ? extends p293xa.r>, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ Ref$ObjectRef<f> $event;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DragGestureNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef<f> ref$ObjectRef, DragGestureNode dragGestureNode, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$event = ref$ObjectRef;
            this.this$0 = dragGestureNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(Ia.l<? super f.b, ? extends p293xa.r> lVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(lVar, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002d  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0045 -> B:25:0x0057). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0051 -> B:24:0x0054). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ia.l lVar;
            f fVar;
            T t8;
            Ref$ObjectRef<f> ref$ObjectRef;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                lVar = (Ia.l) this.L$0;
                fVar = this.$event.element;
                if (!(fVar instanceof f.d) || (fVar instanceof f.a)) {
                    return p293xa.r.f47939a;
                }
                t8 = 0;
                f.b bVar = fVar instanceof f.b ? (f.b) fVar : null;
                if (bVar != null) {
                    lVar.invoke(bVar);
                }
                ref$ObjectRef = this.$event;
                BufferedChannel bufferedChannel = this.this$0.f9934v;
                if (bufferedChannel != null) {
                    this.L$0 = lVar;
                    this.L$1 = ref$ObjectRef;
                    this.label = 1;
                    obj = bufferedChannel.d(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                ref$ObjectRef.element = t8;
                fVar = this.$event.element;
                if (fVar instanceof f.d) {
                }
                return p293xa.r.f47939a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            lVar = (Ia.l) this.L$0;
            kotlin.b.b(obj);
            t8 = (f) obj;
            ref$ObjectRef.element = t8;
            fVar = this.$event.element;
            if (fVar instanceof f.d) {
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(DragGestureNode dragGestureNode, kotlin.coroutines.c<? super DragGestureNode$startListeningForEvents$1> cVar) {
        super(2, cVar);
        this.this$0 = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.this$0, cVar);
        dragGestureNode$startListeningForEvents$1.L$0 = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((DragGestureNode$startListeningForEvents$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c A[PHI: r4
      0x005c: PHI (r4v7 kotlinx.coroutines.A) = 
      (r4v0 kotlinx.coroutines.A)
      (r4v3 kotlinx.coroutines.A)
      (r4v3 kotlinx.coroutines.A)
      (r4v3 kotlinx.coroutines.A)
      (r4v5 kotlinx.coroutines.A)
      (r4v8 kotlinx.coroutines.A)
     binds: [B:18:0x0054, B:45:0x00d7, B:47:0x00e6, B:41:0x00d0, B:30:0x0089, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[Catch: CancellationException -> 0x00d3, TryCatch #1 {CancellationException -> 0x00d3, blocks: (B:38:0x00b6, B:40:0x00bc, B:44:0x00d5, B:46:0x00d9), top: B:57:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5 A[Catch: CancellationException -> 0x00d3, TryCatch #1 {CancellationException -> 0x00d3, blocks: (B:38:0x00b6, B:40:0x00bc, B:44:0x00d5, B:46:0x00d9), top: B:57:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9 A[Catch: CancellationException -> 0x00d3, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x00d3, blocks: (B:38:0x00b6, B:40:0x00bc, B:44:0x00d5, B:46:0x00d9), top: B:57:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0089 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d0 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d7 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00e6 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f6 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:34:0x009f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
