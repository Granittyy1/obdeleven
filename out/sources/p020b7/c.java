package p020b7;

import Cb.a;
import Q8.b;
import java.util.Comparator;
import kotlin.jvm.internal.i;
import okio.internal.g;

/* JADX INFO: compiled from: VerticalViewGroupMeasure.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20610b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20610b) {
            case 0:
                e eVar = (e) obj;
                e eVar2 = (e) obj2;
                if (eVar.a() > eVar2.a()) {
                    return -1;
                }
                return eVar.a() < eVar2.a() ? 1 : 0;
            case 1:
                return a.e(Boolean.valueOf(i.a(((b) obj).f5127b, "Unknown")), Boolean.valueOf(i.a(((b) obj2).f5127b, "Unknown")));
            default:
                return a.e(((g) obj).f45728a, ((g) obj2).f45728a);
        }
    }
}
