package com.voltasit.obdeleven.domain.usecases.controlUnit;

/* JADX INFO: compiled from: ObserveControlUnitUpdatesUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.e f30747a;

    public e(J8.e eVar) {
        this.f30747a = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:24:0x0065, B:26:0x006d, B:20:0x0053, B:27:0x0082, B:19:0x004b), top: B:32:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.channels.p] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.channels.p] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:24:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(Ia.l r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.voltasit.obdeleven.domain.usecases.controlUnit.ObserveControlUnitUpdatesUC$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            com.voltasit.obdeleven.domain.usecases.controlUnit.ObserveControlUnitUpdatesUC$invoke$1 r0 = (com.voltasit.obdeleven.domain.usecases.controlUnit.ObserveControlUnitUpdatesUC$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.voltasit.obdeleven.domain.usecases.controlUnit.ObserveControlUnitUpdatesUC$invoke$1 r0 = new com.voltasit.obdeleven.domain.usecases.controlUnit.ObserveControlUnitUpdatesUC$invoke$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.channels.f r9 = (kotlinx.coroutines.channels.f) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.p r2 = (kotlinx.coroutines.channels.p) r2
            java.lang.Object r5 = r0.L$0
            Ia.l r5 = (Ia.l) r5
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L34
            goto L65
        L34:
            r9 = move-exception
            goto L8a
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.b.b(r10)
            J8.e r10 = r8.f30747a
            kotlinx.coroutines.channels.a r10 = r10.a()
            kotlinx.coroutines.channels.BufferedChannel r2 = r10.m()
            kotlinx.coroutines.channels.BufferedChannel$a r10 = new kotlinx.coroutines.channels.BufferedChannel$a     // Catch: java.lang.Throwable -> L34
            r10.<init>()     // Catch: java.lang.Throwable -> L34
            r7 = r10
            r10 = r9
            r9 = r7
        L53:
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L34
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L34
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L34
            r0.label = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r5 = r9.a(r0)     // Catch: java.lang.Throwable -> L34
            if (r5 != r1) goto L62
            return r1
        L62:
            r7 = r5
            r5 = r10
            r10 = r7
        L65:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L34
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto L82
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L34
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L34
            short r10 = r10.shortValue()     // Catch: java.lang.Throwable -> L34
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L34
            java.lang.Short r6 = new java.lang.Short     // Catch: java.lang.Throwable -> L34
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L34
            r5.invoke(r6)     // Catch: java.lang.Throwable -> L34
            r10 = r5
            goto L53
        L82:
            xa.r r9 = p293xa.r.f47939a     // Catch: java.lang.Throwable -> L34
            r2.i(r3)
            xa.r r9 = p293xa.r.f47939a
            return r9
        L8a:
            r2.i(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.domain.usecases.controlUnit.e.a(Ia.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
