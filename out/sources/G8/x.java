package G8;

/* JADX INFO: compiled from: SfdWizardCompletionMonitoringParams.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f3560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3561f;

    public x(String str, String str2, String str3, String str4, Integer num, String str5) {
        this.f3556a = str;
        this.f3557b = str2;
        this.f3558c = str3;
        this.f3559d = str4;
        this.f3560e = num;
        this.f3561f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.i.a(this.f3556a, xVar.f3556a) && kotlin.jvm.internal.i.a(this.f3557b, xVar.f3557b) && kotlin.jvm.internal.i.a(this.f3558c, xVar.f3558c) && kotlin.jvm.internal.i.a(this.f3559d, xVar.f3559d) && kotlin.jvm.internal.i.a(this.f3560e, xVar.f3560e) && kotlin.jvm.internal.i.a(this.f3561f, xVar.f3561f);
    }

    public final int hashCode() {
        String str = this.f3556a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3557b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3558c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3559d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f3560e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f3561f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SfdWizardCompletionMonitoringParams(vehicleBaseId=");
        sb2.append(this.f3556a);
        sb2.append(", model=");
        sb2.append(this.f3557b);
        sb2.append(", platform=");
        sb2.append(this.f3558c);
        sb2.append(", vin=");
        sb2.append(this.f3559d);
        sb2.append(", year=");
        sb2.append(this.f3560e);
        sb2.append(", klineId=");
        return Q8.d.a(sb2, this.f3561f, ")");
    }
}
