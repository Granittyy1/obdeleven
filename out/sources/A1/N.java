package A1;

import android.util.Base64;
import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: VorbisUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f444a;

        public a(String[] strArr) {
            this.f444a = strArr;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f445a;

        public b(boolean z10) {
            this.f445a = z10;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f452g;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr) {
            this.f446a = i10;
            this.f447b = i11;
            this.f448c = i12;
            this.f449d = i13;
            this.f450e = i14;
            this.f451f = i15;
            this.f452g = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static p078g1.s b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            int i11 = p114j1.A.f40996a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                p114j1.k.f("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(M1.a.d(new p114j1.r(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    p114j1.k.g("Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new R1.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new p078g1.s(arrayList);
    }

    public static a c(p114j1.r rVar, boolean z10, boolean z11) throws ParserException {
        if (z10) {
            d(3, rVar, false);
        }
        rVar.s((int) rVar.l(), StandardCharsets.UTF_8);
        long jL = rVar.l();
        String[] strArr = new String[(int) jL];
        for (int i10 = 0; i10 < jL; i10++) {
            strArr[i10] = rVar.s((int) rVar.l(), StandardCharsets.UTF_8);
        }
        if (z11 && (rVar.u() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new a(strArr);
    }

    public static boolean d(int i10, p114j1.r rVar, boolean z10) throws ParserException {
        if (rVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + rVar.a());
        }
        if (rVar.u() != i10) {
            if (z10) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i10));
        }
        if (rVar.u() == 118 && rVar.u() == 111 && rVar.u() == 114 && rVar.u() == 98 && rVar.u() == 105 && rVar.u() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }
}
