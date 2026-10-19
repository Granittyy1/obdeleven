package D4;

import C4.o;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_BackendRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2787b;

    public a() {
        throw null;
    }

    public a(ArrayList arrayList, byte[] bArr) {
        this.f2786a = arrayList;
        this.f2787b = bArr;
    }

    @Override // D4.e
    public final Iterable<o> a() {
        return this.f2786a;
    }

    @Override // D4.e
    public final byte[] b() {
        return this.f2787b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f2786a.equals(eVar.a())) {
            if (Arrays.equals(this.f2787b, eVar instanceof a ? ((a) eVar).f2787b : eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2786a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2787b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f2786a + ", extras=" + Arrays.toString(this.f2787b) + "}";
    }
}
