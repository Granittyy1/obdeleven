package okhttp3.internal.connection;

import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: ConnectionSpecSelector.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<okhttp3.h> f45446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45449d;

    public b(List<okhttp3.h> connectionSpecs) {
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        this.f45446a = connectionSpecs;
    }

    public final okhttp3.h a(SSLSocket sSLSocket) throws IOException {
        okhttp3.h hVar;
        int i10;
        boolean z10;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i11 = this.f45447b;
        List<okhttp3.h> list = this.f45446a;
        int size = list.size();
        while (true) {
            if (i11 >= size) {
                hVar = null;
                break;
            }
            hVar = list.get(i11);
            if (hVar.b(sSLSocket)) {
                this.f45447b = i11 + 1;
                break;
            }
            i11++;
        }
        if (hVar == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb2.append(this.f45449d);
            sb2.append(", modes=");
            sb2.append(list);
            sb2.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.i.b(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            kotlin.jvm.internal.i.d(string, "toString(this)");
            sb2.append(string);
            throw new UnknownServiceException(sb2.toString());
        }
        int i12 = this.f45447b;
        int size2 = list.size();
        while (true) {
            i10 = 0;
            if (i12 >= size2) {
                z10 = false;
                break;
            }
            if (list.get(i12).b(sSLSocket)) {
                z10 = true;
                break;
            }
            i12++;
        }
        this.f45448c = z10;
        boolean z11 = this.f45449d;
        String[] strArr = hVar.f45376c;
        if (strArr != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.i.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = p172nb.b.p(enabledCipherSuites, strArr, okhttp3.g.f45354c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = hVar.f45377d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.i.d(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = p172nb.b.p(enabledProtocols2, strArr2, p317za.b.f49025b);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.i.d(supportedCipherSuites, "supportedCipherSuites");
        okhttp3.g.a aVar = okhttp3.g.f45354c;
        byte[] bArr = p172nb.b.f45026a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (aVar.compare(supportedCipherSuites[i10], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i10++;
        }
        if (z11 && i10 != -1) {
            kotlin.jvm.internal.i.d(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i10];
            kotlin.jvm.internal.i.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        okhttp3.h.a aVar2 = new okhttp3.h.a();
        aVar2.f45378a = hVar.f45374a;
        aVar2.f45379b = strArr;
        aVar2.f45380c = strArr2;
        aVar2.f45381d = hVar.f45375b;
        kotlin.jvm.internal.i.d(cipherSuitesIntersection, "cipherSuitesIntersection");
        aVar2.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.i.d(tlsVersionsIntersection, "tlsVersionsIntersection");
        aVar2.d((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        okhttp3.h hVarA = aVar2.a();
        if (hVarA.c() != null) {
            sSLSocket.setEnabledProtocols(hVarA.f45377d);
        }
        if (hVarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(hVarA.f45376c);
        }
        return hVar;
    }
}
