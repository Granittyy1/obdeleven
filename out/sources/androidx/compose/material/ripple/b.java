package androidx.compose.material.ripple;

import androidx.compose.ui.node.C1192m;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends RippleNode implements i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public l f11987A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h f11988z;

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        h hVar = this.f11988z;
        if (hVar != null) {
            y0();
            j jVar = hVar.f12001e;
            l lVar = (l) ((LinkedHashMap) jVar.f12003b).get(this);
            if (lVar != null) {
                lVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) jVar.f12003b;
                l lVar2 = (l) linkedHashMap.get(this);
                if (lVar2 != null) {
                }
                linkedHashMap.remove(this);
                hVar.f12000d.add(lVar);
            }
        }
    }

    @Override // androidx.compose.material.ripple.i
    public final void y0() {
        this.f11987A = null;
        C1192m.a(this);
    }
}
