package androidx.compose.ui.platform;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {R.styleable.AppCompatTheme_dropdownListPreferredItemHeight}, m = "invokeSuspend")
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ kotlinx.coroutines.channels.d<p293xa.r> $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(kotlinx.coroutines.channels.d<p293xa.r> dVar, kotlin.coroutines.c<? super GlobalSnapshotManager$ensureStarted$1> cVar) {
        super(2, cVar);
        this.$channel = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x003e A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:6:0x0011, B:17:0x0036, B:19:0x003e, B:20:0x004c, B:28:0x005d, B:14:0x0029, B:30:0x0060, B:31:0x0064, B:32:0x0065, B:33:0x0066, B:13:0x0024, B:21:0x004d, B:23:0x0053), top: B:42:0x0005, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #2 {, blocks: (B:21:0x004d, B:23:0x0053), top: B:43:0x004d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0060 A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:6:0x0011, B:17:0x0036, B:19:0x003e, B:20:0x004c, B:28:0x005d, B:14:0x0029, B:30:0x0060, B:31:0x0064, B:32:0x0065, B:33:0x0066, B:13:0x0024, B:21:0x004d, B:23:0x0053), top: B:42:0x0005, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0033 -> B:17:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r6.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.f) r1
            java.lang.Object r3 = r6.L$0
            kotlinx.coroutines.channels.p r3 = (kotlinx.coroutines.channels.p) r3
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L15
            goto L36
        L15:
            r7 = move-exception
            goto L6f
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            kotlin.b.b(r7)
            kotlinx.coroutines.channels.d<xa.r> r3 = r6.$channel
            kotlinx.coroutines.channels.f r7 = r3.iterator()     // Catch: java.lang.Throwable -> L15
            r1 = r7
        L29:
            r6.L$0 = r3     // Catch: java.lang.Throwable -> L15
            r6.L$1 = r1     // Catch: java.lang.Throwable -> L15
            r6.label = r2     // Catch: java.lang.Throwable -> L15
            java.lang.Object r7 = r1.a(r6)     // Catch: java.lang.Throwable -> L15
            if (r7 != r0) goto L36
            return r0
        L36:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L15
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L15
            if (r7 == 0) goto L66
            java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L15
            xa.r r7 = (p293xa.r) r7     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.atomic.AtomicBoolean r7 = androidx.compose.ui.platform.C1227j0.f15054b     // Catch: java.lang.Throwable -> L15
            r4 = 0
            r7.set(r4)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r7 = androidx.compose.runtime.snapshots.SnapshotKt.f13154c     // Catch: java.lang.Throwable -> L15
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L15
            androidx.compose.runtime.snapshots.GlobalSnapshot r5 = androidx.compose.runtime.snapshots.SnapshotKt.j     // Catch: java.lang.Throwable -> L5b
            androidx.collection.L<androidx.compose.runtime.snapshots.o> r5 = r5.f13192h     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L5d
            boolean r5 = r5.c()     // Catch: java.lang.Throwable -> L5b
            if (r5 != r2) goto L5d
            r4 = r2
            goto L5d
        L5b:
            r0 = move-exception
            goto L64
        L5d:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L29
            androidx.compose.runtime.snapshots.SnapshotKt.a()     // Catch: java.lang.Throwable -> L15
            goto L29
        L64:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L66:
            xa.r r7 = p293xa.r.f47939a     // Catch: java.lang.Throwable -> L15
            r7 = 0
            r3.i(r7)
            xa.r r7 = p293xa.r.f47939a
            return r7
        L6f:
            throw r7     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            p241t7.b.b(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
