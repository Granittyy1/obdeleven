package androidx.compose.ui.input.pointer;

import androidx.collection.C0891t;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: InternalPointerEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1154e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0891t<q> f14073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f14074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14075c;

    public C1154e(C0891t<q> c0891t, s sVar) {
        this.f14073a = c0891t;
        this.f14074b = sVar;
    }

    public final boolean a(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) this.f14074b.f14118a;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            if (p.a(((t) obj).f14120a, j)) {
                break;
            }
            i10++;
        }
        t tVar = (t) obj;
        if (tVar != null) {
            return tVar.f14127h;
        }
        return false;
    }
}
