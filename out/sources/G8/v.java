package G8;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ServerSettings.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3552h;

    public v(int i10, int i11, List unsupportedCountries, ArrayList arrayList, boolean z10, int i12, boolean z11, String str) {
        kotlin.jvm.internal.i.e(unsupportedCountries, "unsupportedCountries");
        this.f3545a = i10;
        this.f3546b = i11;
        this.f3547c = unsupportedCountries;
        this.f3548d = arrayList;
        this.f3549e = z10;
        this.f3550f = i12;
        this.f3551g = z11;
        this.f3552h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f3545a == vVar.f3545a && this.f3546b == vVar.f3546b && kotlin.jvm.internal.i.a(this.f3547c, vVar.f3547c) && this.f3548d.equals(vVar.f3548d) && this.f3549e == vVar.f3549e && this.f3550f == vVar.f3550f && this.f3551g == vVar.f3551g && this.f3552h.equals(vVar.f3552h);
    }

    public final int hashCode() {
        return this.f3552h.hashCode() + androidx.compose.animation.D.b(p005a4.q.b(this.f3550f, androidx.compose.animation.D.b((this.f3548d.hashCode() + ((this.f3547c.hashCode() + p005a4.q.b(this.f3546b, Integer.hashCode(this.f3545a) * 31, 31)) * 31)) * 31, 31, this.f3549e), 31), 31, this.f3551g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServerSettings(minSupportedVersion=");
        sb2.append(this.f3545a);
        sb2.append(", minConnectVersion=");
        sb2.append(this.f3546b);
        sb2.append(", unsupportedCountries=");
        sb2.append(this.f3547c);
        sb2.append(", btFirmwareList=");
        sb2.append(this.f3548d);
        sb2.append(", isRatingDialogEnabled=");
        sb2.append(this.f3549e);
        sb2.append(", ratingDialogCount=");
        sb2.append(this.f3550f);
        sb2.append(", isVagRatingDialogAfterPurchaseEnabled=");
        sb2.append(this.f3551g);
        sb2.append(", adMobAdId=");
        return Q8.d.a(sb2, this.f3552h, ")");
    }
}
