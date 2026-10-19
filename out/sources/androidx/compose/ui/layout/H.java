package androidx.compose.ui.layout;

import java.util.Map;

/* JADX INFO: compiled from: MeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
public interface H extends InterfaceC1167m {
    default F L0(int i10, int i11, Map map, Ia.l lVar) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            R.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new G(i10, i11, map, this, lVar);
    }

    default F y1(int i10, int i11, Map<AbstractC1155a, Integer> map, Ia.l<? super Y.a, p293xa.r> lVar) {
        return L0(i10, i11, map, lVar);
    }
}
