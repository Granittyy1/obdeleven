package A1;

/* JADX INFO: compiled from: SeekPoint.java */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G f419c = new G(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f421b;

    public G(long j, long j10) {
        this.f420a = j;
        this.f421b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G.class != obj.getClass()) {
            return false;
        }
        G g10 = (G) obj;
        return this.f420a == g10.f420a && this.f421b == g10.f421b;
    }

    public final int hashCode() {
        return (((int) this.f420a) * 31) + ((int) this.f421b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f420a);
        sb2.append(", position=");
        return p005a4.o.d(this.f421b, "]", sb2);
    }
}
