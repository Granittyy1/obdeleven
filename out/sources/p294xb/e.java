package p294xb;

import java.io.IOException;
import kotlin.jvm.internal.i;
import kotlin.text.l;
import kotlin.text.m;
import kotlin.text.n;
import okhttp3.InterfaceC2754e;
import okhttp3.f;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.g;
import okhttp3.o;
import okhttp3.u;
import okhttp3.z;
import p172nb.b;

/* JADX INFO: compiled from: RealWebSocket.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f47979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f47980c;

    public e(d dVar, u uVar) {
        this.f47979b = dVar;
        this.f47980c = uVar;
    }

    @Override // okhttp3.f
    public final void onFailure(InterfaceC2754e call, IOException iOException) {
        i.e(call, "call");
        this.f47979b.b(iOException, null);
    }

    @Override // okhttp3.f
    public final void onResponse(InterfaceC2754e call, z zVar) {
        i.e(call, "call");
        c cVar = zVar.f45691n;
        try {
            this.f47979b.a(zVar, cVar);
            g gVarC = cVar.c();
            o oVar = zVar.f45685g;
            int size = oVar.size();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            Integer numA = null;
            Integer numA2 = null;
            while (i11 < size) {
                if (m.D(oVar.k(i11), "Sec-WebSocket-Extensions", true)) {
                    String strV = oVar.v(i11);
                    int i12 = i10;
                    while (i12 < strV.length()) {
                        int iG = b.g(strV, ',', i12, i10, 4);
                        int iF = b.f(strV, ';', i12, iG);
                        String strZ = b.z(strV, i12, iF);
                        int i13 = iF + 1;
                        if (strZ.equalsIgnoreCase("permessage-deflate")) {
                            if (z10) {
                                z13 = true;
                            }
                            i12 = i13;
                            while (i12 < iG) {
                                int iF2 = b.f(strV, ';', i12, iG);
                                int iF3 = b.f(strV, '=', i12, iF2);
                                String strZ2 = b.z(strV, i12, iF3);
                                String strB0 = iF3 < iF2 ? n.b0(b.z(strV, iF3 + 1, iF2)) : null;
                                i12 = iF2 + 1;
                                if (strZ2.equalsIgnoreCase("client_max_window_bits")) {
                                    if (numA != null) {
                                        z13 = true;
                                    }
                                    numA = strB0 != null ? l.A(strB0) : null;
                                    if (numA == null) {
                                        z13 = true;
                                    }
                                } else if (strZ2.equalsIgnoreCase("client_no_context_takeover")) {
                                    if (z11) {
                                        z13 = true;
                                    }
                                    if (strB0 != null) {
                                        z13 = true;
                                    }
                                    z11 = true;
                                } else if (strZ2.equalsIgnoreCase("server_max_window_bits")) {
                                    if (numA2 != null) {
                                        z13 = true;
                                    }
                                    numA2 = strB0 != null ? l.A(strB0) : null;
                                    if (numA2 == null) {
                                        z13 = true;
                                    }
                                } else if (strZ2.equalsIgnoreCase("server_no_context_takeover")) {
                                    if (z12) {
                                        z13 = true;
                                    }
                                    if (strB0 != null) {
                                        z13 = true;
                                    }
                                    z12 = true;
                                } else {
                                    z13 = true;
                                }
                            }
                            z10 = true;
                        } else {
                            z13 = true;
                            i12 = i13;
                        }
                        i10 = 0;
                    }
                }
                i11++;
                i10 = 0;
            }
            this.f47979b.f47953d = new g(z10, numA, z11, numA2, z12, z13);
            if (z13 || numA != null || (numA2 != null && !new Na.i(8, 15, 1).A(numA2.intValue()))) {
                d dVar = this.f47979b;
                synchronized (dVar) {
                    dVar.f47963o.clear();
                    dVar.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.f47979b.c(b.f45032g + " WebSocket " + this.f47980c.f45661a.h(), gVarC);
                d dVar2 = this.f47979b;
                dVar2.f47950a.onOpen(dVar2, zVar);
                this.f47979b.d();
            } catch (Exception e10) {
                this.f47979b.b(e10, null);
            }
        } catch (IOException e11) {
            this.f47979b.b(e11, zVar);
            b.c(zVar);
            if (cVar != null) {
                cVar.a(true, true, null);
            }
        }
    }
}
