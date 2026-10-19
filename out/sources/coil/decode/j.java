package coil.decode;

import java.io.EOFException;
import okio.ByteString;
import p318zb.C2839f;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: FrameDelayRewritingSource.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j extends p318zb.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteString f22888d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2839f f22889c;

    static {
        ByteString byteString = ByteString.f45705d;
        f22888d = ByteString.a.b("0021F904");
    }

    public j(InterfaceC2841h interfaceC2841h) {
        super(interfaceC2841h);
        this.f22889c = new C2839f();
    }

    public final boolean b(long j) {
        C2839f c2839f = this.f22889c;
        long j10 = c2839f.f49074c;
        if (j10 >= j) {
            return true;
        }
        long j11 = j - j10;
        return super.l0(c2839f, j11) == j11;
    }

    @Override // p318zb.n, p318zb.H
    public final long l0(C2839f c2839f, long j) throws EOFException {
        long j10;
        b(j);
        C2839f c2839f2 = this.f22889c;
        long j11 = -1;
        if (c2839f2.f49074c == 0) {
            return j == 0 ? 0L : -1L;
        }
        long jY = 0;
        while (true) {
            ByteString byteString = f22888d;
            long jS = j11;
            while (true) {
                jS = this.f22889c.s(byteString.k(0), jS + 1, Long.MAX_VALUE);
                if (jS == j11 || (b(byteString.e()) && c2839f2.c0(jS, byteString))) {
                    break;
                }
                j11 = -1;
            }
            if (jS == j11) {
                break;
            }
            jY += Na.l.y(c2839f2.l0(c2839f, jS + ((long) 4)), 0L);
            if (b(5L) && c2839f2.p(4L) == 0) {
                if (((c2839f2.p(1L) & 255) | ((c2839f2.p(2L) & 255) << 8)) < 2) {
                    c2839f.Z0(c2839f2.p(0L));
                    c2839f.Z0(10);
                    c2839f.Z0(0);
                    c2839f2.skip(3L);
                }
            }
            j11 = -1;
        }
        if (jY < j) {
            j10 = 0;
            jY += Na.l.y(c2839f2.l0(c2839f, j - jY), 0L);
        } else {
            j10 = 0;
        }
        if (jY == j10) {
            return -1L;
        }
        return jY;
    }
}
