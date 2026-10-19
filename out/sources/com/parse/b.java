package com.parse;

import com.obdeleven.service.model.f;
import com.parse.boltsinternal.Continuation;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29563b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f29562a = i10;
        this.f29563b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x016d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0183  */
    /* JADX WARN: Code duplicated, block: B:63:0x0199  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0196 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v13 z8.c, still in use, count: 2, list:
          (r6v13 z8.c) from 0x0159: IGET (r6v13 z8.c) A[WRAPPED] (LINE:346) z8.c.a u9.D
          (r6v13 z8.c) from 0x016b: PHI (r6 I:??) = (r6v1 z8.c), (r6v13 z8.c) binds: [B:52:0x016a, B:80:0x016b] A[DONT_GENERATE, DONT_INLINE]
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
    public final java.lang.Object then(com.parse.boltsinternal.Task r11) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.parse.b.then(com.parse.boltsinternal.Task):java.lang.Object");
    }

    public /* synthetic */ b(f fVar, boolean z10) {
        this.f29562a = 7;
        this.f29563b = fVar;
    }
}
