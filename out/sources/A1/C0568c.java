package A1;

import androidx.media3.common.ParserException;
import com.braze.Constants;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: renamed from: A1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Ac4Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0568c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f464a = {2002, 2000, 1920, 1601, 1600, 1001, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 960, 800, 800, 480, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 2048};

    /* JADX INFO: renamed from: A1.c$a */
    /* JADX INFO: compiled from: Ac4Util.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f470f;
    }

    /* JADX INFO: renamed from: A1.c$b */
    /* JADX INFO: compiled from: Ac4Util.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f473c;

        public b(int i10, int i11, int i12) {
            this.f471a = i10;
            this.f472b = i11;
            this.f473c = i12;
        }
    }

    public static void a(int i10, p114j1.r rVar) {
        rVar.D(7);
        byte[] bArr = rVar.f41062a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static b b(p114j1.q qVar) {
        int i10;
        int i11;
        int iG = qVar.g(16);
        int iG2 = qVar.g(16);
        if (iG2 == 65535) {
            iG2 = qVar.g(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iG2 + i10;
        if (iG == 44097) {
            i12 += 2;
        }
        if (qVar.g(2) == 3) {
            do {
                qVar.g(2);
            } while (qVar.f());
        }
        int iG3 = qVar.g(10);
        if (qVar.f() && qVar.g(3) > 0) {
            qVar.o(2);
        }
        int i13 = qVar.f() ? 48000 : 44100;
        int iG4 = qVar.g(4);
        int[] iArr = f464a;
        if (i13 == 44100 && iG4 == 13) {
            i11 = iArr[iG4];
        } else if (i13 != 48000 || iG4 >= 14) {
            i11 = 0;
        } else {
            int i14 = iArr[iG4];
            int i15 = iG3 % 5;
            if (i15 == 1) {
                if (iG4 != 3 || iG4 == 8) {
                    i11 = i14 + 1;
                } else {
                    i11 = i14;
                }
            } else if (i15 != 2) {
                if (i15 == 3) {
                    if (iG4 != 3) {
                    }
                    i11 = i14 + 1;
                } else if (i15 == 4 && (iG4 == 3 || iG4 == 8 || iG4 == 11)) {
                    i11 = i14 + 1;
                } else {
                    i11 = i14;
                }
            } else if (iG4 == 8 || iG4 == 11) {
                i11 = i14 + 1;
            } else {
                i11 = i14;
            }
        }
        return new b(i13, i12, i11);
    }

    public static void c(p114j1.q qVar, a aVar) throws ParserException {
        int iG = qVar.g(5);
        qVar.o(2);
        if (qVar.f()) {
            qVar.o(5);
        }
        if (iG >= 7 && iG <= 10) {
            qVar.n();
        }
        if (qVar.f()) {
            int iG2 = qVar.g(3);
            if (aVar.f466b == -1 && iG >= 0 && iG <= 15 && (iG2 == 0 || iG2 == 1)) {
                aVar.f466b = iG;
            }
            if (qVar.f()) {
                e(qVar);
            }
        }
    }

    public static void d(p114j1.q qVar, a aVar) throws ParserException {
        qVar.o(2);
        boolean zF = qVar.f();
        int iG = qVar.g(8);
        for (int i10 = 0; i10 < iG; i10++) {
            qVar.o(2);
            if (qVar.f()) {
                qVar.o(5);
            }
            if (zF) {
                qVar.o(24);
            } else {
                if (qVar.f()) {
                    if (!qVar.f()) {
                        qVar.o(4);
                    }
                    aVar.f467c = qVar.g(6) + 1;
                }
                qVar.o(4);
            }
        }
        if (qVar.f()) {
            qVar.o(3);
            if (qVar.f()) {
                e(qVar);
            }
        }
    }

    public static void e(p114j1.q qVar) throws ParserException {
        int iG = qVar.g(6);
        if (iG < 2 || iG > 42) {
            throw ParserException.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iG)));
        }
        qVar.o(iG * 8);
    }
}
