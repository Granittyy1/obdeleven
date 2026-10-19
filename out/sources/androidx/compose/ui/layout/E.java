package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public interface E {
    F g(H h8, List<? extends D> list, long j);

    default int h(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1162h(list.get(i11), IntrinsicMinMax.f14182c, IntrinsicWidthHeight.f14184b));
        }
        return g(new C1169o(interfaceC1167m, interfaceC1167m.getLayoutDirection()), arrayList, p013b0.b.b(0, i10, 7)).getWidth();
    }

    default int i(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1162h(list.get(i11), IntrinsicMinMax.f14181b, IntrinsicWidthHeight.f14185c));
        }
        return g(new C1169o(interfaceC1167m, interfaceC1167m.getLayoutDirection()), arrayList, p013b0.b.b(i10, 0, 13)).getHeight();
    }

    default int j(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1162h(list.get(i11), IntrinsicMinMax.f14181b, IntrinsicWidthHeight.f14184b));
        }
        return g(new C1169o(interfaceC1167m, interfaceC1167m.getLayoutDirection()), arrayList, p013b0.b.b(0, i10, 7)).getWidth();
    }

    default int m(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1162h(list.get(i11), IntrinsicMinMax.f14182c, IntrinsicWidthHeight.f14185c));
        }
        return g(new C1169o(interfaceC1167m, interfaceC1167m.getLayoutDirection()), arrayList, p013b0.b.b(i10, 0, 13)).getHeight();
    }
}
