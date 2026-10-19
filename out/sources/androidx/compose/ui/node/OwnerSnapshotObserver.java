package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.Arrays;

/* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OwnerSnapshotObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SnapshotStateObserver f14552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<LayoutNode, p293xa.r> f14553b = new Ia.l<LayoutNode, p293xa.r>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        @Override // Ia.l
        public final p293xa.r invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            if (layoutNode2.c()) {
                LayoutNode.d0(layoutNode2, false, 7);
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.l<LayoutNode, p293xa.r> f14554c = new Ia.l<LayoutNode, p293xa.r>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        @Override // Ia.l
        public final p293xa.r invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            if (layoutNode2.c()) {
                LayoutNode.f0(layoutNode2, false, 7);
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.l<LayoutNode, p293xa.r> f14555d = new Ia.l<LayoutNode, p293xa.r>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        @Override // Ia.l
        public final p293xa.r invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            if (layoutNode2.c()) {
                layoutNode2.P();
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.l<LayoutNode, p293xa.r> f14556e = new Ia.l<LayoutNode, p293xa.r>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        @Override // Ia.l
        public final p293xa.r invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            if (layoutNode2.c()) {
                layoutNode2.e0(false);
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ia.l<LayoutNode, p293xa.r> f14557f = new Ia.l<LayoutNode, p293xa.r>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        @Override // Ia.l
        public final p293xa.r invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            if (layoutNode2.c()) {
                layoutNode2.e0(false);
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ia.l<LayoutNode, p293xa.r> f14558g = new Ia.l<LayoutNode, p293xa.r>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        @Override // Ia.l
        public final p293xa.r invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            if (layoutNode2.c()) {
                layoutNode2.c0(false);
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Ia.l<LayoutNode, p293xa.r> f14559h = new Ia.l<LayoutNode, p293xa.r>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        @Override // Ia.l
        public final p293xa.r invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            if (layoutNode2.c()) {
                layoutNode2.c0(false);
            }
            return p293xa.r.f47939a;
        }
    };

    public OwnerSnapshotObserver(Ia.l<? super Ia.a<p293xa.r>, p293xa.r> lVar) {
        this.f14552a = new SnapshotStateObserver(lVar);
    }

    public final void a() {
        SnapshotStateObserver snapshotStateObserver = this.f14552a;
        OwnerSnapshotObserver$clearInvalidObservations$1 ownerSnapshotObserver$clearInvalidObservations$1 = new Ia.l<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // Ia.l
            public final Boolean invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((V) obj).a0());
            }
        };
        synchronized (snapshotStateObserver.f13173g) {
            try {
                androidx.compose.runtime.collection.c<SnapshotStateObserver.a> cVar = snapshotStateObserver.f13172f;
                int i10 = cVar.f12945d;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    SnapshotStateObserver.a aVar = cVar.f12943b[i12];
                    aVar.e(ownerSnapshotObserver$clearInvalidObservations$1);
                    if (!(aVar.f13181f.f9131e != 0)) {
                        i11++;
                    } else if (i11 > 0) {
                        SnapshotStateObserver.a[] aVarArr = cVar.f12943b;
                        aVarArr[i12 - i11] = aVarArr[i12];
                    }
                }
                int i13 = i10 - i11;
                Arrays.fill(cVar.f12943b, i13, i10, (Object) null);
                cVar.f12945d = i13;
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T extends V> void b(T t8, Ia.l<? super T, p293xa.r> lVar, Ia.a<p293xa.r> aVar) {
        this.f14552a.d(t8, lVar, aVar);
    }
}
