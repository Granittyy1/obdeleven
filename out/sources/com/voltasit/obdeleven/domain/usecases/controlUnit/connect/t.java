package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

/* JADX INFO: compiled from: ConnectToKwp1281CuUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30721a;

    public t(J8.p pVar) {
        this.f30721a = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005e -> B:19:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(com.obdeleven.service.protocol.Protocol r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToKwp1281CuUC$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToKwp1281CuUC$invoke$1 r0 = (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToKwp1281CuUC$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToKwp1281CuUC$invoke$1 r0 = new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToKwp1281CuUC$invoke$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            java.lang.String r3 = "09"
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r8 = r0.L$1
            com.parse.boltsinternal.Task r8 = (com.parse.boltsinternal.Task) r8
            java.lang.Object r2 = r0.L$0
            com.obdeleven.service.protocol.Protocol r2 = (com.obdeleven.service.protocol.Protocol) r2
            kotlin.b.b(r9)
            goto L60
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.b.b(r9)
            J8.p r9 = r7.f30721a
            java.lang.String r2 = "ConnectToKwp1281EngineUC"
            java.lang.String r5 = "ConnectToKwp1281EngineUC()"
            r9.f(r2, r5)
        L45:
            com.parse.boltsinternal.Task r9 = r8.g(r3)
            Sa.a r2 = kotlinx.coroutines.N.f43200c
            com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToKwp1281CuUC$invoke$2 r5 = new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToKwp1281CuUC$invoke$2
            r6 = 0
            r5.<init>(r9, r6)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r2 = kotlinx.coroutines.C2680e.f(r2, r5, r0)
            if (r2 != r1) goto L5e
            return r1
        L5e:
            r2 = r8
            r8 = r9
        L60:
            boolean r9 = r8.isFaulted()
            if (r9 == 0) goto L75
            C8.a$a r9 = new C8.a$a
            java.lang.Exception r8 = r8.getError()
            java.lang.String r0 = "getError(...)"
            kotlin.jvm.internal.i.d(r8, r0)
            r9.<init>(r8)
            return r9
        L75:
            java.lang.Object r8 = r8.getResult()
            java.lang.String r8 = (java.lang.String) r8
            kotlin.jvm.internal.i.b(r8)
            r9 = 0
            boolean r8 = kotlin.text.m.I(r8, r3, r9)
            if (r8 == 0) goto L8d
            C8.a$b r8 = new C8.a$b
            xa.r r9 = p293xa.r.f47939a
            r8.<init>(r9)
            return r8
        L8d:
            r8 = r2
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.domain.usecases.controlUnit.connect.t.a(com.obdeleven.service.protocol.Protocol, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
