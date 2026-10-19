package I8;

import java.util.ArrayList;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: OriginalAppValue.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3928b;

    public d(String id, ArrayList arrayList) {
        i.e(id, "id");
        this.f3927a = id;
        this.f3928b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.f3927a, dVar.f3927a) && this.f3928b.equals(dVar.f3928b);
    }

    public final int hashCode() {
        return this.f3928b.hashCode() + (this.f3927a.hashCode() * 31);
    }

    public final String toString() {
        return "OriginalAppValue(id=" + this.f3927a + ", commands=" + this.f3928b + ")";
    }
}
