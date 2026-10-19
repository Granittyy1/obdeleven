package p078g1;

import java.util.Objects;
import p114j1.A;

/* JADX INFO: compiled from: Label.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35353b;

    static {
        A.B(0);
        A.B(1);
    }

    public o(String str, String str2) {
        this.f35352a = A.G(str);
        this.f35353b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return Objects.equals(this.f35352a, oVar.f35352a) && Objects.equals(this.f35353b, oVar.f35353b);
    }

    public final int hashCode() {
        int iHashCode = this.f35353b.hashCode() * 31;
        String str = this.f35352a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
