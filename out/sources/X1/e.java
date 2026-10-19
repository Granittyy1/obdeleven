package X1;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: DefaultSubtitleParserFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements l.a {
    @Override // X1.l.a
    public final boolean c(p078g1.n nVar) {
        String str = nVar.f35302n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // X1.l.a
    public final l d(p078g1.n nVar) {
        String str = nVar.f35302n;
        if (str != null) {
            List<byte[]> list = nVar.f35305q;
            switch (str) {
                case "application/dvbsubs":
                    return new Z1.a(list);
                case "application/pgs":
                    return new p003a2.a();
                case "application/x-mp4-vtt":
                    return new g2.a();
                case "text/vtt":
                    return new g2.f();
                case "application/x-quicktime-tx3g":
                    return new p054e2.a(list);
                case "text/x-ssa":
                    return new p015b2.b(list);
                case "application/vobsub":
                    return new p066f2.a(list);
                case "application/x-subrip":
                    return new p028c2.a();
                case "application/ttml+xml":
                    return new p041d2.d();
            }
        }
        throw new IllegalArgumentException(B7.b.c("Unsupported MIME type: ", str));
    }

    @Override // X1.l.a
    public final int e(p078g1.n nVar) {
        String str = nVar.f35302n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(B7.b.c("Unsupported MIME type: ", str));
    }
}
