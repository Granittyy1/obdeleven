package p197pb;

import D2.V;
import S4.o;
import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import okhttp3.A;
import okhttp3.C;
import okhttp3.C2750a;
import okhttp3.CertificatePinner;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.d;
import okhttp3.internal.connection.e;
import okhttp3.internal.connection.f;
import okhttp3.internal.connection.j;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.p;
import okhttp3.q;
import okhttp3.t;
import okhttp3.u;
import okhttp3.y;
import okhttp3.z;
import p172nb.b;
import p293xa.r;

/* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f45955a;

    public h(t client) {
        i.e(client, "client");
        this.f45955a = client;
    }

    public static int c(z zVar, int i10) {
        String strC = z.c("Retry-After", zVar);
        if (strC == null) {
            return i10;
        }
        if (!new Regex("\\d+").e(strC)) {
            return BrazeLogger.SUPPRESS;
        }
        Integer numValueOf = Integer.valueOf(strC);
        i.d(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    public final u a(z zVar, c cVar) throws IOException {
        String strC;
        f fVar;
        C c10 = (cVar == null || (fVar = cVar.f45456g) == null) ? null : fVar.f45499b;
        int i10 = zVar.f45683e;
        u uVar = zVar.f45680b;
        String str = uVar.f45662b;
        if (i10 != 307 && i10 != 308) {
            if (i10 == 401) {
                this.f45955a.f45617h.getClass();
                return null;
            }
            if (i10 == 421) {
                y yVar = uVar.f45664d;
                if ((yVar != null && yVar.isOneShot()) || cVar == null || i.a(cVar.f45452c.f45469b.f45308h.f45574d, cVar.f45456g.f45499b.f45278a.f45308h.f45574d)) {
                    return null;
                }
                f fVar2 = cVar.f45456g;
                synchronized (fVar2) {
                    fVar2.f45507k = true;
                }
                return zVar.f45680b;
            }
            if (i10 == 503) {
                z zVar2 = zVar.f45688k;
                if ((zVar2 == null || zVar2.f45683e != 503) && c(zVar, BrazeLogger.SUPPRESS) == 0) {
                    return zVar.f45680b;
                }
                return null;
            }
            if (i10 == 407) {
                i.b(c10);
                if (c10.f45279b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                this.f45955a.f45623o.getClass();
                return null;
            }
            if (i10 == 408) {
                if (!this.f45955a.f45616g) {
                    return null;
                }
                y yVar2 = uVar.f45664d;
                if (yVar2 != null && yVar2.isOneShot()) {
                    return null;
                }
                z zVar3 = zVar.f45688k;
                if ((zVar3 == null || zVar3.f45683e != 408) && c(zVar, 0) <= 0) {
                    return zVar.f45680b;
                }
                return null;
            }
            switch (i10) {
                case CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        t tVar = this.f45955a;
        if (!tVar.f45618i || (strC = z.c("Location", zVar)) == null) {
            return null;
        }
        u uVar2 = zVar.f45680b;
        p pVar = uVar2.f45661a;
        pVar.getClass();
        p.a aVarG = pVar.g(strC);
        p pVarA = aVarG != null ? aVarG.a() : null;
        if (pVarA == null) {
            return null;
        }
        if (!i.a(pVarA.f45571a, uVar2.f45661a.f45571a) && !tVar.j) {
            return null;
        }
        u.a aVarB = uVar2.b();
        if (o.m(str)) {
            boolean zEquals = str.equals("PROPFIND");
            int i11 = zVar.f45683e;
            boolean z10 = zEquals || i11 == 308 || i11 == 307;
            if (str.equals("PROPFIND") || i11 == 308 || i11 == 307) {
                aVarB.e(str, z10 ? uVar2.f45664d : null);
            } else {
                aVarB.e("GET", null);
            }
            if (!z10) {
                aVarB.f45669c.g("Transfer-Encoding");
                aVarB.f45669c.g("Content-Length");
                aVarB.f45669c.g("Content-Type");
            }
        }
        if (!b.a(uVar2.f45661a, pVarA)) {
            aVarB.f45669c.g("Authorization");
        }
        aVarB.f45667a = pVarA;
        return aVarB.a();
    }

    public final boolean b(IOException iOException, e eVar, u uVar, boolean z10) {
        j jVar;
        boolean zA;
        f fVar;
        y yVar;
        if (!this.f45955a.f45616g) {
            return false;
        }
        if ((z10 && (((yVar = uVar.f45664d) != null && yVar.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z10)) {
            return false;
        }
        d dVar = eVar.j;
        i.b(dVar);
        int i10 = dVar.f45474g;
        if (i10 == 0 && dVar.f45475h == 0 && dVar.f45476i == 0) {
            zA = false;
        } else if (dVar.j != null) {
            zA = true;
        } else {
            C c10 = null;
            if (i10 <= 1 && dVar.f45475h <= 1 && dVar.f45476i <= 0 && (fVar = dVar.f45470c.f45485k) != null) {
                synchronized (fVar) {
                    if (fVar.f45508l == 0 && b.a(fVar.f45499b.f45278a.f45308h, dVar.f45469b.f45308h)) {
                        c10 = fVar.f45499b;
                    }
                }
            }
            if (c10 != null) {
                dVar.j = c10;
            } else {
                j.a aVar = dVar.f45472e;
                if ((aVar == null || !aVar.a()) && (jVar = dVar.f45473f) != null) {
                    zA = jVar.a();
                }
            }
            zA = true;
        }
        return zA;
    }

    @Override // okhttp3.q
    public final z intercept(q.a aVar) throws IOException {
        z zVarA;
        SSLSocketFactory sSLSocketFactory;
        p281wb.d dVar;
        CertificatePinner certificatePinner;
        f fVar = (f) aVar;
        u uVar = fVar.f45947e;
        e eVar = fVar.f45943a;
        List listD0 = EmptyList.f42983b;
        z zVar = null;
        int i10 = 0;
        u request = uVar;
        while (true) {
            boolean z10 = true;
            while (true) {
                eVar.getClass();
                i.e(request, "request");
                if (eVar.f45487m != null) {
                    throw new IllegalStateException("Check failed.");
                }
                synchronized (eVar) {
                    if (eVar.f45489o) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                    }
                    if (eVar.f45488n) {
                        throw new IllegalStateException("Check failed.");
                    }
                    r rVar = r.f47939a;
                }
                if (z10) {
                    okhttp3.internal.connection.i iVar = eVar.f45480e;
                    p pVar = request.f45661a;
                    boolean z11 = pVar.j;
                    t tVar = eVar.f45477b;
                    if (z11) {
                        SSLSocketFactory sSLSocketFactory2 = tVar.f45625q;
                        if (sSLSocketFactory2 == null) {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                        p281wb.d dVar2 = tVar.f45629u;
                        certificatePinner = tVar.f45630v;
                        sSLSocketFactory = sSLSocketFactory2;
                        dVar = dVar2;
                    } else {
                        sSLSocketFactory = null;
                        dVar = null;
                        certificatePinner = null;
                    }
                    eVar.j = new d(iVar, new C2750a(pVar.f45574d, pVar.f45575e, tVar.f45621m, tVar.f45624p, sSLSocketFactory, dVar, certificatePinner, tVar.f45623o, tVar.f45628t, tVar.f45627s, tVar.f45622n), eVar, eVar.f45481f);
                }
                try {
                    if (eVar.f45491q) {
                        throw new IOException("Canceled");
                    }
                    try {
                        zVarA = fVar.a(request);
                    } catch (IOException e10) {
                        if (!b(e10, eVar, request, !(e10 instanceof ConnectionShutdownException))) {
                            List suppressed = listD0;
                            i.e(suppressed, "suppressed");
                            Iterator it = suppressed.iterator();
                            while (it.hasNext()) {
                                V.e(e10, (Exception) it.next());
                            }
                            throw e10;
                        }
                        listD0 = kotlin.collections.q.d0(listD0, e10);
                        eVar.d(true);
                        z10 = false;
                    } catch (RouteException e11) {
                        List suppressed2 = listD0;
                        if (!b(e11.c(), eVar, request, false)) {
                            IOException iOExceptionB = e11.b();
                            i.e(iOExceptionB, "<this>");
                            i.e(suppressed2, "suppressed");
                            Iterator it2 = suppressed2.iterator();
                            while (it2.hasNext()) {
                                V.e(iOExceptionB, (Exception) it2.next());
                            }
                            throw iOExceptionB;
                        }
                        listD0 = kotlin.collections.q.d0(suppressed2, e11.b());
                        eVar.d(true);
                        z10 = false;
                    }
                } catch (Throwable th) {
                    eVar.d(true);
                    throw th;
                }
            }
            if (zVar != null) {
                z.a aVarI = zVarA.i();
                z.a aVarI2 = zVar.i();
                aVarI2.f45699g = null;
                z zVarA2 = aVarI2.a();
                if (zVarA2.f45686h != null) {
                    throw new IllegalArgumentException("priorResponse.body != null");
                }
                aVarI.j = zVarA2;
                zVarA = aVarI.a();
            }
            zVar = zVarA;
            c cVar = eVar.f45487m;
            request = a(zVar, cVar);
            if (request == null) {
                if (cVar != null && cVar.f45454e) {
                    if (eVar.f45486l) {
                        throw new IllegalStateException("Check failed.");
                    }
                    eVar.f45486l = true;
                    eVar.f45482g.j();
                }
                eVar.d(false);
                return zVar;
            }
            y yVar = request.f45664d;
            if (yVar != null && yVar.isOneShot()) {
                eVar.d(false);
                return zVar;
            }
            A a10 = zVar.f45686h;
            if (a10 != null) {
                b.c(a10);
            }
            i10++;
            if (i10 > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i10);
            }
            eVar.d(true);
            listD0 = listD0;
        }
    }
}
