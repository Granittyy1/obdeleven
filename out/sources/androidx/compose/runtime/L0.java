package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class L0 implements Iterator<Object>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0 f12869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H f12871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12873f;

    public L0(A0 a10, int i10, H h8, C.g gVar) {
        this.f12869b = a10;
        this.f12870c = i10;
        this.f12871d = h8;
        this.f12872e = a10.f12777i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> arrayList = this.f12871d.f12845a;
        return arrayList != null && this.f12873f < arrayList.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        ArrayList<Object> arrayList = this.f12871d.f12845a;
        if (arrayList != null) {
            int i10 = this.f12873f;
            this.f12873f = i10 + 1;
            obj = arrayList.get(i10);
        } else {
            obj = null;
        }
        boolean z10 = obj instanceof C1074a;
        A0 a10 = this.f12869b;
        if (z10) {
            return new B0(a10, ((C1074a) obj).f12935a, this.f12872e);
        }
        if (!(obj instanceof H)) {
            C1090i.d("Unexpected group information structure");
            throw new KotlinNothingValueException();
        }
        C1110s0 c1110s0 = new C1110s0();
        return new M0(a10, this.f12870c, (H) obj, c1110s0);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
