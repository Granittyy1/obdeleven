package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.h;
import java.io.IOException;
import okhttp3.A;
import okhttp3.InterfaceC2754e;
import okhttp3.f;
import okhttp3.p;
import okhttp3.r;
import okhttp3.u;
import okhttp3.y;
import okhttp3.z;
import p253u7.c;
import p277w7.g;

/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfOkHttpClient {
    public static void a(z zVar, c cVar, long j, long j10) throws IOException {
        u uVar = zVar.f45680b;
        if (uVar == null) {
            return;
        }
        cVar.l(uVar.f45661a.j().toString());
        cVar.d(uVar.f45662b);
        y yVar = uVar.f45664d;
        if (yVar != null) {
            long jContentLength = yVar.contentLength();
            if (jContentLength != -1) {
                cVar.f(jContentLength);
            }
        }
        A a10 = zVar.f45686h;
        if (a10 != null) {
            long jB = a10.b();
            if (jB != -1) {
                cVar.j(jB);
            }
            r rVarC = a10.c();
            if (rVarC != null) {
                cVar.i(rVarC.f45590a);
            }
        }
        cVar.e(zVar.f45683e);
        cVar.h(j);
        cVar.k(j10);
        cVar.b();
    }

    @Keep
    public static void enqueue(InterfaceC2754e interfaceC2754e, f fVar) {
        h hVar = new h();
        interfaceC2754e.C(new g(fVar, p314z7.f.f48930t, hVar, hVar.f28507b));
    }

    @Keep
    public static z execute(InterfaceC2754e interfaceC2754e) throws IOException {
        c cVar = new c(p314z7.f.f48930t);
        h hVar = new h();
        long j = hVar.f28507b;
        try {
            z zVarK = interfaceC2754e.k();
            a(zVarK, cVar, j, hVar.a());
            return zVarK;
        } catch (IOException e10) {
            u uVarRequest = interfaceC2754e.request();
            if (uVarRequest != null) {
                p pVar = uVarRequest.f45661a;
                if (pVar != null) {
                    cVar.l(pVar.j().toString());
                }
                String str = uVarRequest.f45662b;
                if (str != null) {
                    cVar.d(str);
                }
            }
            cVar.h(j);
            cVar.k(hVar.a());
            p277w7.h.c(cVar);
            throw e10;
        }
    }
}
