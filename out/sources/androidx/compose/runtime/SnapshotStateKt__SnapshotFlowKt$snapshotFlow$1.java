package androidx.compose.runtime;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: SnapshotFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {142, 146, 169}, m = "invokeSuspend")
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements Ia.p<InterfaceC2687d<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.a<Object> $block;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(Ia.a<Object> aVar, kotlin.coroutines.c<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> cVar) {
        super(2, cVar);
        this.$block = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, cVar);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC2687d<Object> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(interfaceC2687d, cVar)).invokeSuspend(p293xa.r.f47939a);
        return CoroutineSingletons.f43038b;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0147 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x012e A[Catch: all -> 0x005a, TryCatch #3 {all -> 0x005a, blocks: (B:39:0x00fe, B:41:0x0102, B:44:0x010d, B:46:0x0122, B:48:0x012e, B:50:0x0138, B:64:0x0173, B:67:0x0182, B:71:0x019a, B:73:0x01a5, B:84:0x01ce, B:85:0x01d1, B:53:0x0147, B:59:0x015b, B:15:0x0052, B:68:0x018f, B:70:0x0197, B:81:0x01c9, B:82:0x01cc), top: B:108:0x0052, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0138 A[Catch: all -> 0x005a, TryCatch #3 {all -> 0x005a, blocks: (B:39:0x00fe, B:41:0x0102, B:44:0x010d, B:46:0x0122, B:48:0x012e, B:50:0x0138, B:64:0x0173, B:67:0x0182, B:71:0x019a, B:73:0x01a5, B:84:0x01ce, B:85:0x01d1, B:53:0x0147, B:59:0x015b, B:15:0x0052, B:68:0x018f, B:70:0x0197, B:81:0x01c9, B:82:0x01cc), top: B:108:0x0052, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0156  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:118:0x0150
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
