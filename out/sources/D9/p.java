package D9;

import java.security.cert.Certificate;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: InternalChannelz.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f2902d = Logger.getLogger(p.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f2903e = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentSkipListMap f2904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f2906c;

    /* JADX INFO: compiled from: InternalChannelz.java */
    public static final class a {
        public a(SSLSession sSLSession) {
            sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                Certificate certificate = localCertificates[0];
            }
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    Certificate certificate2 = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e10) {
                p.f2902d.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e10);
            }
        }
    }

    public p() {
        new ConcurrentSkipListMap();
        this.f2904a = new ConcurrentSkipListMap();
        this.f2905b = new ConcurrentHashMap();
        this.f2906c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
