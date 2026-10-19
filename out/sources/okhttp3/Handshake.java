package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Handshake.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Handshake {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TlsVersion f45284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f45285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Certificate> f45286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p293xa.g f45287d;

    /* JADX INFO: compiled from: Handshake.kt */
    public static final class Companion {
        public static Handshake a(SSLSession sSLSession) throws IOException {
            final List listL;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            g gVarB = g.f45353b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionA = TlsVersion.a.a(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                listL = peerCertificates != null ? p172nb.b.l(Arrays.copyOf(peerCertificates, peerCertificates.length)) : EmptyList.f42983b;
            } catch (SSLPeerUnverifiedException unused) {
                listL = EmptyList.f42983b;
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new Handshake(tlsVersionA, gVarB, localCertificates != null ? p172nb.b.l(Arrays.copyOf(localCertificates, localCertificates.length)) : EmptyList.f42983b, new Ia.a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // Ia.a
                public final List<? extends Certificate> invoke() {
                    return listL;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, g gVar, List<? extends Certificate> localCertificates, final Ia.a<? extends List<? extends Certificate>> aVar) {
        kotlin.jvm.internal.i.e(localCertificates, "localCertificates");
        this.f45284a = tlsVersion;
        this.f45285b = gVar;
        this.f45286c = localCertificates;
        this.f45287d = kotlin.a.a(new Ia.a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$peerCertificates$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // Ia.a
            public final List<? extends Certificate> invoke() {
                try {
                    return aVar.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.f42983b;
                }
            }
        });
    }

    public final List<Certificate> a() {
        return (List) this.f45287d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f45284a == this.f45284a && kotlin.jvm.internal.i.a(handshake.f45285b, this.f45285b) && kotlin.jvm.internal.i.a(handshake.a(), a()) && kotlin.jvm.internal.i.a(handshake.f45286c, this.f45286c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f45286c.hashCode() + ((a().hashCode() + ((this.f45285b.hashCode() + ((this.f45284a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.i.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f45284a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f45285b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f45286c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.i.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
