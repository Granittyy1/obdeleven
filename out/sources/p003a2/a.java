package p003a2;

import X1.c;
import X1.l;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import p114j1.A;
import p114j1.f;
import p114j1.r;

/* JADX INFO: compiled from: PgsParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f7999a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f8000b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0112a f8001c = new C0112a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Inflater f8002d;

    /* JADX INFO: renamed from: a2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PgsParser.java */
    public static final class C0112a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f8003a = new r();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f8004b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8007e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8008f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8009g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8010h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8011i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // X1.l
    public final void a(byte[] bArr, int i10, int i11, l.b bVar, f<c> fVar) {
        char c10;
        ArrayList arrayList;
        r rVar;
        int i12;
        boolean z10;
        p102i1.a aVarA;
        boolean z11;
        r rVar2;
        int i13;
        int i14;
        int iX;
        ?? r10;
        int i15 = 4;
        int i16 = 128;
        r rVar3 = this.f7999a;
        rVar3.E(i10 + i11, bArr);
        rVar3.G(i10);
        if (this.f8002d == null) {
            this.f8002d = new Inflater();
        }
        Inflater inflater = this.f8002d;
        int i17 = A.f40996a;
        char c11 = 255;
        if (rVar3.a() > 0 && (rVar3.f41062a[rVar3.f41063b] & 255) == 120) {
            r rVar4 = this.f8000b;
            if (A.A(rVar3, rVar4, inflater)) {
                rVar3.E(rVar4.f41064c, rVar4.f41062a);
            }
        }
        C0112a c0112a = this.f8001c;
        ?? r11 = 0;
        c0112a.f8006d = 0;
        c0112a.f8007e = 0;
        c0112a.f8008f = 0;
        c0112a.f8009g = 0;
        c0112a.f8010h = 0;
        c0112a.f8011i = 0;
        r rVar5 = c0112a.f8003a;
        rVar5.D(0);
        c0112a.f8005c = false;
        ArrayList arrayList2 = new ArrayList();
        while (rVar3.a() >= 3) {
            int i18 = rVar3.f41064c;
            int iU = rVar3.u();
            int iA = rVar3.A();
            int i19 = rVar3.f41063b + iA;
            if (i19 > i18) {
                rVar3.G(i18);
                i12 = i16;
                r10 = r11;
                c10 = c11;
                rVar = rVar5;
                arrayList = arrayList2;
                aVarA = null;
            } else {
                int[] iArr = c0112a.f8004b;
                if (iU != i16) {
                    switch (iU) {
                        case 20:
                            if (iA % 5 != 2) {
                                c10 = c11;
                                rVar2 = rVar5;
                                arrayList = arrayList2;
                            } else {
                                rVar3.H(2);
                                Arrays.fill(iArr, (int) r11);
                                int i20 = iA / 5;
                                for (?? r12 = r11; r12 < i20; r12++) {
                                    int iU2 = rVar3.u();
                                    double dU = rVar3.u();
                                    double dU2 = rVar3.u() - 128;
                                    double dU3 = rVar3.u() - 128;
                                    iArr[iU2] = A.g((int) ((dU3 * 1.772d) + dU), 0, 255) | (rVar3.u() << 24) | (A.g((int) ((1.402d * dU2) + dU), 0, 255) << 16) | (A.g((int) ((dU - (0.34414d * dU3)) - (dU2 * 0.71414d)), 0, 255) << 8);
                                    arrayList2 = arrayList2;
                                    c11 = 255;
                                    rVar5 = rVar5;
                                }
                                c10 = c11;
                                rVar2 = rVar5;
                                arrayList = arrayList2;
                                c0112a.f8005c = true;
                            }
                            break;
                        case 21:
                            if (iA >= i15) {
                                rVar3.H(3);
                                int i21 = iA - 4;
                                if (((rVar3.u() & i16) != 0 ? 1 : r11) == 0) {
                                    i13 = rVar5.f41063b;
                                    i14 = rVar5.f41064c;
                                    if (i13 < i14 && i21 > 0) {
                                        int iMin = Math.min(i21, i14 - i13);
                                        rVar3.f(rVar5.f41062a, i13, iMin);
                                        rVar5.G(i13 + iMin);
                                    }
                                } else if (i21 >= 7 && (iX = rVar3.x()) >= i15) {
                                    c0112a.f8010h = rVar3.A();
                                    c0112a.f8011i = rVar3.A();
                                    rVar5.D(iX - i15);
                                    i21 = iA - 11;
                                    i13 = rVar5.f41063b;
                                    i14 = rVar5.f41064c;
                                    if (i13 < i14) {
                                        int iMin2 = Math.min(i21, i14 - i13);
                                        rVar3.f(rVar5.f41062a, i13, iMin2);
                                        rVar5.G(i13 + iMin2);
                                    }
                                }
                            }
                            c10 = c11;
                            rVar2 = rVar5;
                            arrayList = arrayList2;
                            break;
                        case 22:
                            if (iA >= 19) {
                                c0112a.f8006d = rVar3.A();
                                c0112a.f8007e = rVar3.A();
                                rVar3.H(11);
                                c0112a.f8008f = rVar3.A();
                                c0112a.f8009g = rVar3.A();
                            }
                            c10 = c11;
                            rVar2 = rVar5;
                            arrayList = arrayList2;
                            break;
                        default:
                            c10 = c11;
                            rVar2 = rVar5;
                            arrayList = arrayList2;
                            break;
                    }
                    rVar = rVar2;
                    z11 = false;
                    i12 = 128;
                    aVarA = null;
                } else {
                    c10 = c11;
                    r rVar6 = rVar5;
                    arrayList = arrayList2;
                    if (c0112a.f8006d == 0 || c0112a.f8007e == 0 || c0112a.f8010h == 0 || c0112a.f8011i == 0) {
                        rVar = rVar6;
                    } else {
                        rVar = rVar6;
                        int i22 = rVar.f41064c;
                        if (i22 != 0 && rVar.f41063b == i22 && c0112a.f8005c) {
                            rVar.G(0);
                            int i23 = c0112a.f8010h * c0112a.f8011i;
                            int[] iArr2 = new int[i23];
                            int i24 = 0;
                            while (i24 < i23) {
                                int iU3 = rVar.u();
                                if (iU3 != 0) {
                                    iArr2[i24] = iArr[iU3];
                                    i24++;
                                } else {
                                    int iU4 = rVar.u();
                                    if (iU4 != 0) {
                                        int iU5 = ((iU4 & 64) == 0 ? iU4 & 63 : ((iU4 & 63) << 8) | rVar.u()) + i24;
                                        Arrays.fill(iArr2, i24, iU5, (iU4 & 128) == 0 ? iArr[0] : iArr[rVar.u()]);
                                        i24 = iU5;
                                    }
                                }
                            }
                            i12 = 128;
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, c0112a.f8010h, c0112a.f8011i, Bitmap.Config.ARGB_8888);
                            p102i1.a.C0382a c0382a = new p102i1.a.C0382a();
                            c0382a.f36528b = bitmapCreateBitmap;
                            float f10 = c0112a.f8008f;
                            float f11 = c0112a.f8006d;
                            c0382a.f36534h = f10 / f11;
                            c0382a.f36535i = 0;
                            float f12 = c0112a.f8009g;
                            float f13 = c0112a.f8007e;
                            c0382a.f36531e = f12 / f13;
                            c0382a.f36532f = 0;
                            c0382a.f36533g = 0;
                            c0382a.f36537l = c0112a.f8010h / f11;
                            c0382a.f36538m = c0112a.f8011i / f13;
                            aVarA = c0382a.a();
                            z10 = false;
                        }
                        c0112a.f8006d = z10 ? 1 : 0;
                        c0112a.f8007e = z10 ? 1 : 0;
                        c0112a.f8008f = z10 ? 1 : 0;
                        c0112a.f8009g = z10 ? 1 : 0;
                        c0112a.f8010h = z10 ? 1 : 0;
                        c0112a.f8011i = z10 ? 1 : 0;
                        rVar.D(z10 ? 1 : 0);
                        c0112a.f8005c = z10;
                        z11 = z10;
                    }
                    i12 = 128;
                    z10 = false;
                    aVarA = null;
                    c0112a.f8006d = z10 ? 1 : 0;
                    c0112a.f8007e = z10 ? 1 : 0;
                    c0112a.f8008f = z10 ? 1 : 0;
                    c0112a.f8009g = z10 ? 1 : 0;
                    c0112a.f8010h = z10 ? 1 : 0;
                    c0112a.f8011i = z10 ? 1 : 0;
                    rVar.D(z10 ? 1 : 0);
                    c0112a.f8005c = z10;
                    z11 = z10;
                }
                rVar3.G(i19);
                r10 = z11;
            }
            ArrayList arrayList3 = arrayList;
            if (aVarA != null) {
                arrayList3.add(aVarA);
            }
            rVar5 = rVar;
            c11 = c10;
            arrayList2 = arrayList3;
            i15 = 4;
            r11 = r10;
            i16 = i12;
        }
        fVar.a(new c(-9223372036854775807L, -9223372036854775807L, arrayList2));
    }
}
