package Q6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_HeartBeatResult.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5106b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f5105a = str;
        this.f5106b = arrayList;
    }

    @Override // Q6.i
    public final List<String> a() {
        return this.f5106b;
    }

    @Override // Q6.i
    public final String b() {
        return this.f5105a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f5105a.equals(iVar.b()) && this.f5106b.equals(iVar.a());
    }

    public final int hashCode() {
        return ((this.f5105a.hashCode() ^ 1000003) * 1000003) ^ this.f5106b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f5105a + ", usedDates=" + this.f5106b + "}";
    }
}
