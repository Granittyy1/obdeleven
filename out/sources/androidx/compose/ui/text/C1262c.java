package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.ui.text.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1262c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1260a f15422a = new C1260a("");

    public static final List<C1260a.c<? extends C1260a.InterfaceC0160a>> a(C1260a c1260a, int i10, int i11, Ia.l<? super C1260a.InterfaceC0160a, Boolean> lVar) {
        List<C1260a.c<? extends C1260a.InterfaceC0160a>> list;
        if (i10 == i11 || (list = c1260a.f15407b) == null) {
            return null;
        }
        if (i10 != 0 || i11 < c1260a.f15408c.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C1260a.c<? extends C1260a.InterfaceC0160a> cVar = list.get(i12);
                if ((lVar != null ? lVar.invoke(cVar.f15418a).booleanValue() : true) && b(i10, i11, cVar.f15419b, cVar.f15420c)) {
                    arrayList.add(new C1260a.c(Na.l.D(cVar.f15419b, i10, i11) - i10, Na.l.D(cVar.f15420c, i10, i11) - i10, (C1260a.InterfaceC0160a) cVar.f15418a, cVar.f15421d));
                }
            }
            return arrayList;
        }
        if (lVar == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C1260a.c<? extends C1260a.InterfaceC0160a> cVar2 = list.get(i13);
            if (lVar.invoke(cVar2.f15418a).booleanValue()) {
                arrayList2.add(cVar2);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }
}
