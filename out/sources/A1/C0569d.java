package A1;

import androidx.media3.common.ParserException;
import java.util.ArrayList;

/* JADX INFO: renamed from: A1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AvcConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0569d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f482i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f484l;

    public C0569d(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f474a = arrayList;
        this.f475b = i10;
        this.f476c = i11;
        this.f477d = i12;
        this.f478e = i13;
        this.f479f = i14;
        this.f480g = i15;
        this.f481h = i16;
        this.f482i = i17;
        this.j = i18;
        this.f483k = f10;
        this.f484l = str;
    }

    public static C0569d a(p114j1.r rVar) throws ParserException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        String str;
        int i17;
        try {
            rVar.H(4);
            int iU = (rVar.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = rVar.u() & 31;
            for (int i18 = 0; i18 < iU2; i18++) {
                int iA = rVar.A();
                int i19 = rVar.f41063b;
                rVar.H(iA);
                byte[] bArr = rVar.f41062a;
                byte[] bArr2 = p114j1.d.f41012a;
                byte[] bArr3 = new byte[iA + 4];
                System.arraycopy(p114j1.d.f41012a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i19, bArr3, 4, iA);
                arrayList.add(bArr3);
            }
            int iU3 = rVar.u();
            for (int i20 = 0; i20 < iU3; i20++) {
                int iA2 = rVar.A();
                int i21 = rVar.f41063b;
                rVar.H(iA2);
                byte[] bArr4 = rVar.f41062a;
                byte[] bArr5 = p114j1.d.f41012a;
                byte[] bArr6 = new byte[iA2 + 4];
                System.arraycopy(p114j1.d.f41012a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i21, bArr6, 4, iA2);
                arrayList.add(bArr6);
            }
            if (iU2 > 0) {
                k1.e.m mVarJ = p127k1.e.j((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i22 = mVarJ.f41449e;
                int i23 = mVarJ.f41450f;
                int i24 = mVarJ.f41452h + 8;
                int i25 = mVarJ.f41453i + 8;
                int i26 = mVarJ.f41459p;
                int i27 = mVarJ.f41460q;
                int i28 = mVarJ.f41461r;
                int i29 = mVarJ.f41462s;
                float f11 = mVarJ.f41451g;
                int i30 = mVarJ.f41445a;
                int i31 = mVarJ.f41446b;
                int i32 = mVarJ.f41447c;
                byte[] bArr7 = p114j1.d.f41012a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i30), Integer.valueOf(i31), Integer.valueOf(i32));
                i15 = i27;
                i16 = i28;
                i17 = i29;
                f10 = f11;
                i11 = i23;
                i12 = i24;
                i13 = i25;
                i14 = i26;
                i10 = i22;
            } else {
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                f10 = 1.0f;
                str = null;
                i17 = 16;
            }
            return new C0569d(arrayList, iU, i10, i11, i12, i13, i14, i15, i16, i17, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a(e10, "Error parsing AVC config");
        }
    }
}
