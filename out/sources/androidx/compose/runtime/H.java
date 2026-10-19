package androidx.compose.runtime;

import java.util.ArrayList;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<Object> f12845a;

    public final boolean a(C1074a c1074a) {
        ArrayList<Object> arrayList = this.f12845a;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (kotlin.jvm.internal.i.a(obj, c1074a) || ((obj instanceof H) && ((H) obj).a(c1074a))) {
                return true;
            }
        }
        return false;
    }

    public final H b() {
        Object obj;
        ArrayList<Object> arrayList = this.f12845a;
        if (arrayList == null) {
            obj = null;
            break;
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                obj = null;
                break;
            }
            obj = arrayList.get(size);
            if (obj instanceof H) {
                ((H) obj).getClass();
                break;
            }
            size--;
        }
        H h8 = obj instanceof H ? (H) obj : null;
        return h8 != null ? h8.b() : this;
    }

    public final boolean c(C1074a c1074a) {
        ArrayList<Object> arrayList = this.f12845a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof C1074a) {
                    if (kotlin.jvm.internal.i.a(obj, c1074a)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof H) && !((H) obj).c(c1074a)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f12845a = null;
                return false;
            }
        }
        return true;
    }
}
