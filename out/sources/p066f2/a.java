package p066f2;

import X1.c;
import X1.l;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.common.collect.ImmutableList;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import p114j1.A;
import p114j1.f;
import p114j1.k;
import p114j1.q;
import p114j1.r;

/* JADX INFO: compiled from: VobsubParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f34921a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f34922b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0364a f34923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Inflater f34924d;

    /* JADX INFO: renamed from: f2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VobsubParser.java */
    public static final class C0364a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f34926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f34927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f34928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f34930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Rect f34931g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f34925a = new int[4];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f34932h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f34933i = -1;

        public static int a(int[] iArr, int i10) {
            return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
        }

        public static int c(int i10, int i11) {
            return (i10 & 16777215) | ((i11 * 17) << 24);
        }

        public final void b(q qVar, boolean z10, Rect rect, int[] iArr) {
            int i10;
            int i11;
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i12 = !z10 ? 1 : 0;
            int i13 = i12 * iWidth;
            while (true) {
                int i14 = 0;
                do {
                    int i15 = 1;
                    int iG = 0;
                    while (true) {
                        if (iG >= i15 || i15 > 64) {
                            i10 = iG & 3;
                            if (iG >= 4) {
                                i11 = iG >> 2;
                                break;
                            } else {
                                i11 = iWidth;
                                break;
                            }
                        }
                        if (qVar.b() < 4) {
                            i10 = -1;
                            i11 = 0;
                            break;
                        } else {
                            iG = (iG << 4) | qVar.g(4);
                            i15 <<= 2;
                        }
                    }
                    int iMin = Math.min(i11, iWidth - i14);
                    if (iMin > 0) {
                        int i16 = i13 + iMin;
                        Arrays.fill(iArr, i13, i16, this.f34925a[i10]);
                        i14 += iMin;
                        i13 = i16;
                    }
                } while (i14 < iWidth);
                i12 += 2;
                if (i12 >= iHeight) {
                    return;
                }
                i13 = i12 * iWidth;
                qVar.c();
            }
        }
    }

    public a(List<byte[]> list) {
        int i10;
        C0364a c0364a = new C0364a();
        this.f34923c = c0364a;
        String strTrim = new String(list.get(0), StandardCharsets.UTF_8).trim();
        int i11 = A.f40996a;
        for (String str : strTrim.split("\\r?\\n", -1)) {
            if (str.startsWith("palette: ")) {
                String[] strArrSplit = str.substring(9).split(",", -1);
                c0364a.f34928d = new int[strArrSplit.length];
                for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                    int[] iArr = c0364a.f34928d;
                    try {
                        i10 = Integer.parseInt(strArrSplit[i12].trim(), 16);
                    } catch (RuntimeException unused) {
                        i10 = 0;
                    }
                    iArr[i12] = i10;
                }
            } else if (str.startsWith("size: ")) {
                String[] strArrSplit2 = str.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        c0364a.f34929e = Integer.parseInt(strArrSplit2[0]);
                        c0364a.f34930f = Integer.parseInt(strArrSplit2[1]);
                        c0364a.f34926b = true;
                    } catch (RuntimeException e10) {
                        k.g("Parsing IDX failed", e10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01e4  */
    @Override // X1.l
    public final void a(byte[] bArr, int i10, int i11, l.b bVar, f<c> fVar) {
        p102i1.a aVarA;
        Rect rect;
        r rVar = this.f34921a;
        rVar.E(i10 + i11, bArr);
        rVar.G(i10);
        if (this.f34924d == null) {
            this.f34924d = new Inflater();
        }
        Inflater inflater = this.f34924d;
        int i12 = A.f40996a;
        if (rVar.a() > 0 && (rVar.f41062a[rVar.f41063b] & 255) == 120) {
            r rVar2 = this.f34922b;
            if (A.A(rVar, rVar2, inflater)) {
                rVar.E(rVar2.f41064c, rVar2.f41062a);
            }
        }
        C0364a c0364a = this.f34923c;
        c0364a.f34927c = false;
        c0364a.f34931g = null;
        c0364a.f34932h = -1;
        c0364a.f34933i = -1;
        int iA = rVar.a();
        if (iA < 2 || rVar.A() != iA) {
            aVarA = null;
        } else {
            int[] iArr = c0364a.f34928d;
            if (iArr != null && c0364a.f34926b) {
                rVar.H(rVar.A() - 2);
                int iA2 = rVar.A();
                while (rVar.f41063b < iA2 && rVar.a() > 0) {
                    int iU = rVar.u();
                    int[] iArr2 = c0364a.f34925a;
                    switch (iU) {
                        case 0:
                        case 1:
                        case 2:
                            break;
                        case 3:
                            if (rVar.a() >= 2) {
                                int iU2 = rVar.u();
                                int iU3 = rVar.u();
                                iArr2[3] = C0364a.a(iArr, iU2 >> 4);
                                iArr2[2] = C0364a.a(iArr, iU2 & 15);
                                iArr2[1] = C0364a.a(iArr, iU3 >> 4);
                                iArr2[0] = C0364a.a(iArr, iU3 & 15);
                                c0364a.f34927c = true;
                            }
                            break;
                        case 4:
                            if (rVar.a() >= 2 && c0364a.f34927c) {
                                int iU4 = rVar.u();
                                int iU5 = rVar.u();
                                iArr2[3] = C0364a.c(iArr2[3], iU4 >> 4);
                                iArr2[2] = C0364a.c(iArr2[2], iU4 & 15);
                                iArr2[1] = C0364a.c(iArr2[1], iU5 >> 4);
                                iArr2[0] = C0364a.c(iArr2[0], iU5 & 15);
                            }
                            break;
                        case 5:
                            if (rVar.a() >= 6) {
                                int iU6 = rVar.u();
                                int iU7 = rVar.u();
                                int i13 = (iU6 << 4) | (iU7 >> 4);
                                int iU8 = ((iU7 & 15) << 8) | rVar.u();
                                int iU9 = rVar.u();
                                int iU10 = rVar.u();
                                c0364a.f34931g = new Rect(i13, (iU9 << 4) | (iU10 >> 4), iU8 + 1, (((iU10 & 15) << 8) | rVar.u()) + 1);
                            }
                            break;
                        case 6:
                            if (rVar.a() >= 4) {
                                c0364a.f34932h = rVar.A();
                                c0364a.f34933i = rVar.A();
                            }
                            break;
                    }
                }
            }
            if (c0364a.f34928d == null || !c0364a.f34926b || !c0364a.f34927c || (rect = c0364a.f34931g) == null || c0364a.f34932h == -1 || c0364a.f34933i == -1 || rect.width() < 2 || c0364a.f34931g.height() < 2) {
                aVarA = null;
            } else {
                Rect rect2 = c0364a.f34931g;
                int[] iArr3 = new int[rect2.height() * rect2.width()];
                q qVar = new q();
                rVar.G(c0364a.f34932h);
                qVar.l(rVar);
                c0364a.b(qVar, true, rect2, iArr3);
                rVar.G(c0364a.f34933i);
                qVar.l(rVar);
                c0364a.b(qVar, false, rect2, iArr3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
                p102i1.a.C0382a c0382a = new p102i1.a.C0382a();
                c0382a.f36528b = bitmapCreateBitmap;
                c0382a.f36534h = rect2.left / c0364a.f34929e;
                c0382a.f36535i = 0;
                c0382a.f36531e = rect2.top / c0364a.f34930f;
                c0382a.f36532f = 0;
                c0382a.f36533g = 0;
                c0382a.f36537l = rect2.width() / c0364a.f34929e;
                c0382a.f36538m = rect2.height() / c0364a.f34930f;
                aVarA = c0382a.a();
            }
        }
        fVar.a(new c(-9223372036854775807L, 5000000L, aVarA != null ? ImmutableList.M(aVarA) : ImmutableList.K()));
    }
}
