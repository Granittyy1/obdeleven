package G8;

import com.voltasit.obdeleven.domain.models.CodingType;
import com.voltasit.obdeleven.domain.models.ControlUnitStatus;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: G8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C0703e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f3451A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f3452B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ProtocolType f3453C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f3454D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f3455E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final String f3456F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f3457G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final CodingType f3458H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final y f3459I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0704f f3462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0703e f3463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ControlUnitStatus f3464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f3468i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<String> f3469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f3470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f3471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3472n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3473o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f3474p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f3475q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f3476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f3477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f3478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f3479u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f3480v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f3481w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f3482x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f3483y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f3484z;

    public C0703e() {
        this(null, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, null, 0, false, null, false, null, -1, 7);
    }

    public static C0703e a(C0703e c0703e, ProtocolType protocol) {
        String vehicleId = c0703e.f3460a;
        String id = c0703e.f3461b;
        C0704f c0704f = c0703e.f3462c;
        C0703e c0703e2 = c0703e.f3463d;
        ControlUnitStatus status = c0703e.f3464e;
        String adaptations = c0703e.f3465f;
        boolean z10 = c0703e.f3466g;
        String coding = c0703e.f3467h;
        String dataById = c0703e.f3468i;
        String measurementsKwp2000 = c0703e.j;
        List<String> faults = c0703e.f3469k;
        String liveDataKwp1281 = c0703e.f3470l;
        boolean z11 = c0703e.f3471m;
        String systemDescription = c0703e.f3472n;
        boolean z12 = c0703e.f3473o;
        String hwVersion = c0703e.f3474p;
        boolean z13 = c0703e.f3475q;
        String hwNumber = c0703e.f3476r;
        boolean z14 = c0703e.f3477s;
        String swVersion = c0703e.f3478t;
        boolean z15 = c0703e.f3479u;
        String swNumber = c0703e.f3480v;
        boolean z16 = c0703e.f3481w;
        String odxName = c0703e.f3482x;
        boolean z17 = c0703e.f3483y;
        String odxVersion = c0703e.f3484z;
        boolean z18 = c0703e.f3451A;
        String systemIdentifier = c0703e.f3452B;
        int i10 = c0703e.f3454D;
        boolean z19 = c0703e.f3455E;
        String serialNumber = c0703e.f3456F;
        boolean z20 = c0703e.f3457G;
        CodingType codingType = c0703e.f3458H;
        y yVar = c0703e.f3459I;
        c0703e.getClass();
        kotlin.jvm.internal.i.e(vehicleId, "vehicleId");
        kotlin.jvm.internal.i.e(id, "id");
        kotlin.jvm.internal.i.e(status, "status");
        kotlin.jvm.internal.i.e(adaptations, "adaptations");
        kotlin.jvm.internal.i.e(coding, "coding");
        kotlin.jvm.internal.i.e(dataById, "dataById");
        kotlin.jvm.internal.i.e(measurementsKwp2000, "measurementsKwp2000");
        kotlin.jvm.internal.i.e(faults, "faults");
        kotlin.jvm.internal.i.e(liveDataKwp1281, "liveDataKwp1281");
        kotlin.jvm.internal.i.e(systemDescription, "systemDescription");
        kotlin.jvm.internal.i.e(hwVersion, "hwVersion");
        kotlin.jvm.internal.i.e(hwNumber, "hwNumber");
        kotlin.jvm.internal.i.e(swVersion, "swVersion");
        kotlin.jvm.internal.i.e(swNumber, "swNumber");
        kotlin.jvm.internal.i.e(odxName, "odxName");
        kotlin.jvm.internal.i.e(odxVersion, "odxVersion");
        kotlin.jvm.internal.i.e(systemIdentifier, "systemIdentifier");
        kotlin.jvm.internal.i.e(protocol, "protocol");
        kotlin.jvm.internal.i.e(serialNumber, "serialNumber");
        kotlin.jvm.internal.i.e(codingType, "codingType");
        return new C0703e(vehicleId, id, c0704f, c0703e2, status, adaptations, z10, coding, dataById, measurementsKwp2000, faults, liveDataKwp1281, z11, systemDescription, z12, hwVersion, z13, hwNumber, z14, swVersion, z15, swNumber, z16, odxName, z17, odxVersion, z18, systemIdentifier, protocol, i10, z19, serialNumber, z20, codingType, yVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0703e)) {
            return false;
        }
        C0703e c0703e = (C0703e) obj;
        return kotlin.jvm.internal.i.a(this.f3460a, c0703e.f3460a) && kotlin.jvm.internal.i.a(this.f3461b, c0703e.f3461b) && kotlin.jvm.internal.i.a(this.f3462c, c0703e.f3462c) && kotlin.jvm.internal.i.a(this.f3463d, c0703e.f3463d) && this.f3464e == c0703e.f3464e && kotlin.jvm.internal.i.a(this.f3465f, c0703e.f3465f) && this.f3466g == c0703e.f3466g && kotlin.jvm.internal.i.a(this.f3467h, c0703e.f3467h) && kotlin.jvm.internal.i.a(this.f3468i, c0703e.f3468i) && kotlin.jvm.internal.i.a(this.j, c0703e.j) && kotlin.jvm.internal.i.a(this.f3469k, c0703e.f3469k) && kotlin.jvm.internal.i.a(this.f3470l, c0703e.f3470l) && this.f3471m == c0703e.f3471m && kotlin.jvm.internal.i.a(this.f3472n, c0703e.f3472n) && this.f3473o == c0703e.f3473o && kotlin.jvm.internal.i.a(this.f3474p, c0703e.f3474p) && this.f3475q == c0703e.f3475q && kotlin.jvm.internal.i.a(this.f3476r, c0703e.f3476r) && this.f3477s == c0703e.f3477s && kotlin.jvm.internal.i.a(this.f3478t, c0703e.f3478t) && this.f3479u == c0703e.f3479u && kotlin.jvm.internal.i.a(this.f3480v, c0703e.f3480v) && this.f3481w == c0703e.f3481w && kotlin.jvm.internal.i.a(this.f3482x, c0703e.f3482x) && this.f3483y == c0703e.f3483y && kotlin.jvm.internal.i.a(this.f3484z, c0703e.f3484z) && this.f3451A == c0703e.f3451A && kotlin.jvm.internal.i.a(this.f3452B, c0703e.f3452B) && this.f3453C == c0703e.f3453C && this.f3454D == c0703e.f3454D && this.f3455E == c0703e.f3455E && kotlin.jvm.internal.i.a(this.f3456F, c0703e.f3456F) && this.f3457G == c0703e.f3457G && this.f3458H == c0703e.f3458H && kotlin.jvm.internal.i.a(this.f3459I, c0703e.f3459I);
    }

    public final int hashCode() {
        int iB = B1.a.b(this.f3461b, this.f3460a.hashCode() * 31, 31);
        C0704f c0704f = this.f3462c;
        int iHashCode = (iB + (c0704f == null ? 0 : c0704f.hashCode())) * 31;
        C0703e c0703e = this.f3463d;
        int iHashCode2 = (this.f3458H.hashCode() + androidx.compose.animation.D.b(B1.a.b(this.f3456F, androidx.compose.animation.D.b(p005a4.q.b(this.f3454D, (this.f3453C.hashCode() + B1.a.b(this.f3452B, androidx.compose.animation.D.b(B1.a.b(this.f3484z, androidx.compose.animation.D.b(B1.a.b(this.f3482x, androidx.compose.animation.D.b(B1.a.b(this.f3480v, androidx.compose.animation.D.b(B1.a.b(this.f3478t, androidx.compose.animation.D.b(B1.a.b(this.f3476r, androidx.compose.animation.D.b(B1.a.b(this.f3474p, androidx.compose.animation.D.b(B1.a.b(this.f3472n, androidx.compose.animation.D.b(B1.a.b(this.f3470l, p005a4.p.d(B1.a.b(this.j, B1.a.b(this.f3468i, B1.a.b(this.f3467h, androidx.compose.animation.D.b(B1.a.b(this.f3465f, (this.f3464e.hashCode() + ((iHashCode + (c0703e == null ? 0 : c0703e.hashCode())) * 31)) * 31, 31), 31, this.f3466g), 31), 31), 31), 31, this.f3469k), 31), 31, this.f3471m), 31), 31, this.f3473o), 31), 31, this.f3475q), 31), 31, this.f3477s), 31), 31, this.f3479u), 31), 31, this.f3481w), 31), 31, this.f3483y), 31), 31, this.f3451A), 31)) * 31, 31), 31, this.f3455E), 31), 31, this.f3457G)) * 31;
        y yVar = this.f3459I;
        return iHashCode2 + (yVar != null ? yVar.hashCode() : 0);
    }

    public final String toString() {
        return "ControlUnit(vehicleId=" + this.f3460a + ", id=" + this.f3461b + ", controlUnitBase=" + this.f3462c + ", parent=" + this.f3463d + ", status=" + this.f3464e + ", adaptations=" + this.f3465f + ", codingAvailable=" + this.f3466g + ", coding=" + this.f3467h + ", dataById=" + this.f3468i + ", measurementsKwp2000=" + this.j + ", faults=" + this.f3469k + ", liveDataKwp1281=" + this.f3470l + ", hasSystemDescription=" + this.f3471m + ", systemDescription=" + this.f3472n + ", hasHwVersion=" + this.f3473o + ", hwVersion=" + this.f3474p + ", hasHwNumber=" + this.f3475q + ", hwNumber=" + this.f3476r + ", hasSwVersion=" + this.f3477s + ", swVersion=" + this.f3478t + ", hasSwNumber=" + this.f3479u + ", swNumber=" + this.f3480v + ", hasOdxName=" + this.f3481w + ", odxName=" + this.f3482x + ", hasOdxVersion=" + this.f3483y + ", odxVersion=" + this.f3484z + ", hasSystemIdentifier=" + this.f3451A + ", systemIdentifier=" + this.f3452B + ", protocol=" + this.f3453C + ", scannedLogins=" + this.f3454D + ", hasSerialNumber=" + this.f3455E + ", serialNumber=" + this.f3456F + ", hasSubsystems=" + this.f3457G + ", codingType=" + this.f3458H + ", sgbd=" + this.f3459I + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0703e(String str, String str2, C0704f c0704f, C0703e c0703e, ControlUnitStatus controlUnitStatus, String str3, boolean z10, String str4, String str5, String str6, ArrayList arrayList, String str7, boolean z11, String str8, boolean z12, String str9, boolean z13, String str10, boolean z14, String str11, boolean z15, String str12, boolean z16, String str13, boolean z17, String str14, boolean z18, String str15, ProtocolType protocolType, int i10, boolean z19, String str16, boolean z20, CodingType codingType, int i11, int i12) {
        String str17 = "";
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? null : c0704f, (i11 & 8) == 0 ? c0703e : null, (i11 & 16) != 0 ? ControlUnitStatus.f30457e : controlUnitStatus, (i11 & 32) != 0 ? "" : str3, (i11 & 64) != 0 ? false : z10, (i11 & 128) != 0 ? "" : str4, (i11 & 256) != 0 ? "" : str5, (i11 & 512) != 0 ? "" : str6, (i11 & 1024) != 0 ? EmptyList.f42983b : arrayList, (i11 & 2048) != 0 ? "" : str7, (i11 & 4096) != 0 ? false : z11, (i11 & 8192) != 0 ? "" : str8, (i11 & 16384) != 0 ? false : z12, (i11 & 32768) != 0 ? str17 : str9, (i11 & 65536) != 0 ? false : z13, (i11 & 131072) != 0 ? str17 : str10, (i11 & 262144) != 0 ? false : z14, (i11 & 524288) != 0 ? str17 : str11, (i11 & 1048576) != 0 ? false : z15, (i11 & 2097152) != 0 ? str17 : str12, (i11 & 4194304) != 0 ? false : z16, (i11 & 8388608) != 0 ? str17 : str13, (i11 & 16777216) != 0 ? false : z17, (i11 & 33554432) != 0 ? str17 : str14, (i11 & 67108864) != 0 ? false : z18, (i11 & 134217728) != 0 ? str17 : str15, (i11 & 268435456) != 0 ? ProtocolType.UNKNOWN : protocolType, (i11 & 536870912) != 0 ? 0 : i10, (i11 & 1073741824) != 0 ? false : z19, (i11 & Integer.MIN_VALUE) == 0 ? str16 : "", (i12 & 1) != 0 ? false : z20, (i12 & 2) != 0 ? CodingType.UNKNOWN : codingType, null);
    }

    public C0703e(String vehicleId, String id, C0704f c0704f, C0703e c0703e, ControlUnitStatus status, String adaptations, boolean z10, String coding, String dataById, String measurementsKwp2000, List<String> faults, String liveDataKwp1281, boolean z11, String systemDescription, boolean z12, String hwVersion, boolean z13, String hwNumber, boolean z14, String swVersion, boolean z15, String swNumber, boolean z16, String odxName, boolean z17, String odxVersion, boolean z18, String systemIdentifier, ProtocolType protocol, int i10, boolean z19, String serialNumber, boolean z20, CodingType codingType, y yVar) {
        kotlin.jvm.internal.i.e(vehicleId, "vehicleId");
        kotlin.jvm.internal.i.e(id, "id");
        kotlin.jvm.internal.i.e(status, "status");
        kotlin.jvm.internal.i.e(adaptations, "adaptations");
        kotlin.jvm.internal.i.e(coding, "coding");
        kotlin.jvm.internal.i.e(dataById, "dataById");
        kotlin.jvm.internal.i.e(measurementsKwp2000, "measurementsKwp2000");
        kotlin.jvm.internal.i.e(faults, "faults");
        kotlin.jvm.internal.i.e(liveDataKwp1281, "liveDataKwp1281");
        kotlin.jvm.internal.i.e(systemDescription, "systemDescription");
        kotlin.jvm.internal.i.e(hwVersion, "hwVersion");
        kotlin.jvm.internal.i.e(hwNumber, "hwNumber");
        kotlin.jvm.internal.i.e(swVersion, "swVersion");
        kotlin.jvm.internal.i.e(swNumber, "swNumber");
        kotlin.jvm.internal.i.e(odxName, "odxName");
        kotlin.jvm.internal.i.e(odxVersion, "odxVersion");
        kotlin.jvm.internal.i.e(systemIdentifier, "systemIdentifier");
        kotlin.jvm.internal.i.e(protocol, "protocol");
        kotlin.jvm.internal.i.e(serialNumber, "serialNumber");
        kotlin.jvm.internal.i.e(codingType, "codingType");
        this.f3460a = vehicleId;
        this.f3461b = id;
        this.f3462c = c0704f;
        this.f3463d = c0703e;
        this.f3464e = status;
        this.f3465f = adaptations;
        this.f3466g = z10;
        this.f3467h = coding;
        this.f3468i = dataById;
        this.j = measurementsKwp2000;
        this.f3469k = faults;
        this.f3470l = liveDataKwp1281;
        this.f3471m = z11;
        this.f3472n = systemDescription;
        this.f3473o = z12;
        this.f3474p = hwVersion;
        this.f3475q = z13;
        this.f3476r = hwNumber;
        this.f3477s = z14;
        this.f3478t = swVersion;
        this.f3479u = z15;
        this.f3480v = swNumber;
        this.f3481w = z16;
        this.f3482x = odxName;
        this.f3483y = z17;
        this.f3484z = odxVersion;
        this.f3451A = z18;
        this.f3452B = systemIdentifier;
        this.f3453C = protocol;
        this.f3454D = i10;
        this.f3455E = z19;
        this.f3456F = serialNumber;
        this.f3457G = z20;
        this.f3458H = codingType;
        this.f3459I = yVar;
    }
}
