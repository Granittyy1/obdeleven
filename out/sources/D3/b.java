package D3;

/* JADX INFO: compiled from: ActiveResources.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2712c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f2711b = i10;
        this.f2712c = obj;
    }

    /* JADX WARN: Failed to build post-dominance tree
    java.lang.ArrayIndexOutOfBoundsException: Index 37 out of bounds for length 37
    	at jadx.core.dex.visitors.blocks.DominatorTree.build(DominatorTree.java:68)
    	at jadx.core.dex.visitors.blocks.PostDominatorTree.compute(PostDominatorTree.java:32)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:93)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
     */
    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getId()" because "imPostDom" is null
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:190)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:72)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            r5 = this;
            int r0 = r5.f2711b
            switch(r0) {
                case 0: goto L55;
                case 1: goto L1e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f2712c
            p5.p r0 = (p191p5.p) r0
            java.lang.Object r0 = r0.f45832c
            monitor-enter(r0)
            java.lang.Object r1 = r5.f2712c     // Catch: java.lang.Throwable -> L18
            p5.p r1 = (p191p5.p) r1     // Catch: java.lang.Throwable -> L18
            p5.b r1 = r1.f45833d     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            r1.b()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r1 = move-exception
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
        L1e:
            java.lang.Object r0 = r5.f2712c
            o5.a r0 = (p179o5.a) r0
            java.lang.Object r1 = r0.f45219a
            monitor-enter(r1)
            boolean r2 = r0.b()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            goto L52
        L2d:
            r0 = move-exception
            goto L53
        L2f:
            java.lang.String r2 = "WakeLock"
            java.lang.String r3 = r0.j     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = " ** IS FORCE-RELEASED ON TIMEOUT **"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L2d
            android.util.Log.e(r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0.d()     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r0.b()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L4b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            goto L52
        L4b:
            r2 = 1
            r0.f45221c = r2     // Catch: java.lang.Throwable -> L2d
            r0.e()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
        L52:
            return
        L53:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r0
        L55:
            java.lang.Object r0 = r5.f2712c
            D3.c r0 = (D3.c) r0
            r0.getClass()
        L5c:
            java.lang.ref.ReferenceQueue<D3.j<?>> r1 = r0.f2714b     // Catch: java.lang.InterruptedException -> L68
            java.lang.ref.Reference r1 = r1.remove()     // Catch: java.lang.InterruptedException -> L68
            D3.c$a r1 = (D3.c.a) r1     // Catch: java.lang.InterruptedException -> L68
            r0.b(r1)     // Catch: java.lang.InterruptedException -> L68
            goto L5c
        L68:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.b.run():void");
    }
}
