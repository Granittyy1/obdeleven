package androidx.compose.ui.node;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class M {
    public static final androidx.compose.ui.h.c a(InterfaceC1184e interfaceC1184e, int i10) {
        androidx.compose.ui.h.c cVar = interfaceC1184e.getNode().f13990g;
        if (cVar == null || (cVar.f13988e & i10) == 0) {
            return null;
        }
        while (cVar != null) {
            int i11 = cVar.f13987d;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return cVar;
            }
            cVar = cVar.f13990g;
        }
        return null;
    }
}
