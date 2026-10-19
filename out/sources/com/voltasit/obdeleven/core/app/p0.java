package com.voltasit.obdeleven.core.app;

import com.parse.boltsinternal.Continuation;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30140c;

    public /* synthetic */ p0(Object obj, int i10, Object obj2) {
        this.f30138a = i10;
        this.f30139b = obj;
        this.f30140c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x017f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0195  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ab  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v13 z8.c, still in use, count: 2, list:
          (r8v13 z8.c) from 0x016b: IGET (r8v13 z8.c) A[WRAPPED] (LINE:364) z8.c.a u9.D
          (r8v13 z8.c) from 0x017d: PHI (r8 I:??) = (r8v1 z8.c), (r8v13 z8.c) binds: [B:55:0x017c, B:106:0x017d] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // com.parse.boltsinternal.Continuation
    public final java.lang.Object then(com.parse.boltsinternal.Task r13) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.core.app.p0.then(com.parse.boltsinternal.Task):java.lang.Object");
    }
}
