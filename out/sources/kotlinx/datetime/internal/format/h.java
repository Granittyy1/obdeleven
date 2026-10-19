package kotlinx.datetime.internal.format;

import androidx.compose.material.T;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: FormatStructure.kt */
/* JADX INFO: loaded from: classes2.dex */
public class h<T> implements n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43888a;

    public h(ArrayList formats) {
        kotlin.jvm.internal.i.e(formats, "formats");
        this.f43888a = formats;
    }

    @Override // kotlinx.datetime.internal.format.n
    public Wa.e<T> a() {
        ArrayList arrayList = this.f43888a;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((p) it.next()).a());
        }
        return arrayList2.size() == 1 ? (Wa.e) kotlin.collections.q.f0(arrayList2) : new Wa.a(arrayList2);
    }

    @Override // kotlinx.datetime.internal.format.n
    public kotlinx.datetime.internal.format.parser.l<T> b() {
        ArrayList arrayList = this.f43888a;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((p) it.next()).b());
        }
        return T.c(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (kotlin.jvm.internal.i.a(this.f43888a, ((h) obj).f43888a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43888a.hashCode();
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("ConcatenatedFormatStructure("), kotlin.collections.q.U(this.f43888a, ", ", null, null, null, 62), ')');
    }
}
