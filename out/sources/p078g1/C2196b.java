package p078g1;

import android.net.Uri;
import com.obdeleven.service.core.b;
import java.util.Arrays;
import p114j1.A;

/* JADX INFO: renamed from: g1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AdPlaybackState.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2196b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2196b f35233c = new C2196b(new a[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f35234d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f35236b;

    /* JADX INFO: renamed from: g1.b$a */
    /* JADX INFO: compiled from: AdPlaybackState.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public final Uri[] f35239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p[] f35240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f35241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long[] f35242f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String[] f35243g;

        static {
            b.b(0, 1, 2, 3, 4);
            b.b(5, 6, 7, 8, 9);
            A.B(10);
        }

        public a(int i10, int i11, int[] iArr, p[] pVarArr, long[] jArr, String[] strArr) {
            Uri uri;
            int i12 = 0;
            p241t7.b.e(iArr.length == pVarArr.length);
            this.f35237a = i10;
            this.f35238b = i11;
            this.f35241e = iArr;
            this.f35240d = pVarArr;
            this.f35242f = jArr;
            this.f35239c = new Uri[pVarArr.length];
            while (true) {
                Uri[] uriArr = this.f35239c;
                if (i12 >= uriArr.length) {
                    this.f35243g = strArr;
                    return;
                }
                p pVar = pVarArr[i12];
                if (pVar == null) {
                    uri = null;
                } else {
                    p.f fVar = pVar.f35356b;
                    fVar.getClass();
                    uri = fVar.f35384a;
                }
                uriArr[i12] = uri;
                i12++;
            }
        }

        public final int a(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f35241e;
                if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35237a == aVar.f35237a && this.f35238b == aVar.f35238b && Arrays.equals(this.f35240d, aVar.f35240d) && Arrays.equals(this.f35241e, aVar.f35241e) && Arrays.equals(this.f35242f, aVar.f35242f) && Arrays.equals(this.f35243g, aVar.f35243g);
        }

        public final int hashCode() {
            int i10 = ((this.f35237a * 31) + this.f35238b) * 31;
            int i11 = (int) 0;
            return (((((Arrays.hashCode(this.f35242f) + ((Arrays.hashCode(this.f35241e) + ((Arrays.hashCode(this.f35240d) + ((i10 + i11) * 31)) * 31)) * 31)) * 31) + i11) * 961) + Arrays.hashCode(this.f35243g)) * 31;
        }
    }

    static {
        a aVar = new a(-1, -1, new int[0], new p[0], new long[0], new String[0]);
        int[] iArr = aVar.f35241e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f35242f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f35234d = new a(0, aVar.f35238b, iArrCopyOf, (p[]) Arrays.copyOf(aVar.f35240d, 0), jArrCopyOf, (String[]) Arrays.copyOf(aVar.f35243g, 0));
        A.B(1);
        A.B(2);
        A.B(3);
        A.B(4);
    }

    public C2196b(a[] aVarArr) {
        this.f35235a = aVarArr.length;
        this.f35236b = aVarArr;
    }

    public final a a(int i10) {
        return i10 < 0 ? f35234d : this.f35236b[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2196b.class != obj.getClass()) {
            return false;
        }
        C2196b c2196b = (C2196b) obj;
        return this.f35235a == c2196b.f35235a && Arrays.equals(this.f35236b, c2196b.f35236b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f35236b) + (((((this.f35235a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f35236b;
            if (i10 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=0, ads=[");
            aVarArr[i10].getClass();
            for (int i11 = 0; i11 < aVarArr[i10].f35241e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = aVarArr[i10].f35241e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(aVarArr[i10].f35242f[i11]);
                sb2.append(')');
                if (i11 < aVarArr[i10].f35241e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }
}
