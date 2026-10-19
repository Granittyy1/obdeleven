package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: CertificatePinner.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CertificatePinner {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CertificatePinner f45281c = new CertificatePinner(kotlin.collections.q.s0(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<a> f45282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p281wb.c f45283b;

    /* JADX INFO: compiled from: CertificatePinner.kt */
    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            if (!kotlin.jvm.internal.i.a(null, null)) {
                return false;
            }
            aVar.getClass();
            if (!kotlin.jvm.internal.i.a(null, null)) {
                return false;
            }
            aVar.getClass();
            return kotlin.jvm.internal.i.a(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(Set<a> pins, p281wb.c cVar) {
        kotlin.jvm.internal.i.e(pins, "pins");
        this.f45282a = pins;
        this.f45283b = cVar;
    }

    public final void a(final String hostname, final List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        kotlin.jvm.internal.i.e(peerCertificates, "peerCertificates");
        b(new Ia.a<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // Ia.a
            public final List<? extends X509Certificate> invoke() throws SSLPeerUnverifiedException {
                p281wb.c cVar = this.this$0.f45283b;
                List<Certificate> listA = cVar != null ? cVar.a(hostname, peerCertificates) : peerCertificates;
                ArrayList arrayList = new ArrayList(kotlin.collections.m.y(listA, 10));
                for (Certificate certificate : listA) {
                    kotlin.jvm.internal.i.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        }, hostname);
    }

    public final void b(Ia.a aVar, String hostname) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        Set<a> set = this.f45282a;
        EmptyList emptyList = EmptyList.f42983b;
        Iterator<T> it = set.iterator();
        if (!it.hasNext()) {
            emptyList.getClass();
        } else {
            ((a) it.next()).getClass();
            kotlin.text.m.I(null, "**.", false);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (kotlin.jvm.internal.i.a(certificatePinner.f45282a, this.f45282a) && kotlin.jvm.internal.i.a(certificatePinner.f45283b, this.f45283b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f45282a.hashCode() + 1517) * 41;
        p281wb.c cVar = this.f45283b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
