package p223s1;

import C.g;
import K1.b;
import Q1.c;
import p078g1.n;

/* JADX INFO: compiled from: MetadataDecoderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0530a f46872a = new C0530a();

    /* JADX INFO: renamed from: s1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MetadataDecoderFactory.java */
    public class C0530a implements a {
        public final g a(n nVar) {
            String str = nVar.f35302n;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new b();
                    case "application/x-icy":
                        return new N1.a();
                    case "application/id3":
                        return new O1.g(null);
                    case "application/x-emsg":
                        return new L1.b();
                    case "application/x-scte35":
                        return new c();
                }
            }
            throw new IllegalArgumentException(B7.b.c("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean b(n nVar) {
            String str = nVar.f35302n;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }
}
