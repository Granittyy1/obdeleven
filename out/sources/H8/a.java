package H8;

import Q8.d;
import com.voltasit.obdeleven.domain.models.integrity.IntegrityTokenType;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntegrityToken.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3740b;

    public a(String str) {
        IntegrityTokenType integrityTokenType = IntegrityTokenType.f30558b;
        this.f3739a = str;
        this.f3740b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f3739a.equals(aVar.f3739a)) {
            return false;
        }
        IntegrityTokenType integrityTokenType = IntegrityTokenType.f30558b;
        return i.a(this.f3740b, aVar.f3740b);
    }

    public final int hashCode() {
        int iHashCode = (IntegrityTokenType.f30558b.hashCode() + (this.f3739a.hashCode() * 31)) * 31;
        String str = this.f3740b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntegrityToken(token=");
        sb2.append(this.f3739a);
        sb2.append(", type=");
        sb2.append(IntegrityTokenType.f30558b);
        sb2.append(", keyId=");
        return d.a(sb2, this.f3740b, ")");
    }
}
