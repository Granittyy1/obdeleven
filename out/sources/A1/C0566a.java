package A1;

import androidx.media3.common.ParserException;

/* JADX INFO: renamed from: A1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AacUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0566a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f453a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f454b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: A1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AacUtil.java */
    public static final class C0000a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f457c;

        public C0000a(String str, int i10, int i11) {
            this.f455a = i10;
            this.f456b = i11;
            this.f457c = str;
        }
    }

    public static int a(p114j1.q qVar) throws ParserException {
        int iG = qVar.g(4);
        if (iG == 15) {
            if (qVar.b() >= 24) {
                return qVar.g(24);
            }
            throw ParserException.a(null, "AAC header insufficient data");
        }
        if (iG < 13) {
            return f453a[iG];
        }
        throw ParserException.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static C0000a b(p114j1.q qVar, boolean z10) throws ParserException {
        int iG = qVar.g(5);
        if (iG == 31) {
            iG = qVar.g(6) + 32;
        }
        int iA = a(qVar);
        int iG2 = qVar.g(4);
        String strB = J4.i.b(iG, "mp4a.40.");
        if (iG == 5 || iG == 29) {
            iA = a(qVar);
            int iG3 = qVar.g(5);
            if (iG3 == 31) {
                iG3 = qVar.g(6) + 32;
            }
            iG = iG3;
            if (iG == 22) {
                iG2 = qVar.g(4);
            }
        }
        if (z10) {
            if (iG != 1 && iG != 2 && iG != 3 && iG != 4 && iG != 6 && iG != 7 && iG != 17) {
                switch (iG) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.b("Unsupported audio object type: " + iG);
                }
            }
            if (qVar.f()) {
                p114j1.k.f("Unexpected frameLengthFlag = 1");
            }
            if (qVar.f()) {
                qVar.o(14);
            }
            boolean zF = qVar.f();
            if (iG2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iG == 6 || iG == 20) {
                qVar.o(3);
            }
            if (zF) {
                if (iG == 22) {
                    qVar.o(16);
                }
                if (iG == 17 || iG == 19 || iG == 20 || iG == 23) {
                    qVar.o(3);
                }
                qVar.o(1);
            }
            switch (iG) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iG4 = qVar.g(2);
                    if (iG4 == 2 || iG4 == 3) {
                        throw ParserException.b("Unsupported epConfig: " + iG4);
                    }
                    break;
            }
        }
        int i10 = f454b[iG2];
        if (i10 != -1) {
            return new C0000a(strB, iA, i10);
        }
        throw ParserException.a(null, null);
    }
}
