package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.h;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import p253u7.c;
import p277w7.d;
import p314z7.f;

/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        f fVar = f.f48930t;
        h hVar = new h();
        hVar.d();
        long j = hVar.f28507b;
        c cVar = new c(fVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) uRLConnectionOpenConnection, hVar, cVar).f47777a.b();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new p277w7.c((HttpURLConnection) uRLConnectionOpenConnection, hVar, cVar).f47776a.b() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e10) {
            cVar.h(j);
            cVar.k(hVar.a());
            cVar.l(url.toString());
            p277w7.h.c(cVar);
            throw e10;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new d((HttpsURLConnection) obj, new h(), new c(f.f48930t));
        }
        return obj instanceof HttpURLConnection ? new p277w7.c((HttpURLConnection) obj, new h(), new c(f.f48930t)) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        f fVar = f.f48930t;
        h hVar = new h();
        hVar.d();
        long j = hVar.f28507b;
        c cVar = new c(fVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) uRLConnectionOpenConnection, hVar, cVar).f47777a.e();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new p277w7.c((HttpURLConnection) uRLConnectionOpenConnection, hVar, cVar).f47776a.e() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e10) {
            cVar.h(j);
            cVar.k(hVar.a());
            cVar.l(url.toString());
            p277w7.h.c(cVar);
            throw e10;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        f fVar = f.f48930t;
        h hVar = new h();
        hVar.d();
        long j = hVar.f28507b;
        c cVar = new c(fVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) uRLConnectionOpenConnection, hVar, cVar).f47777a.c(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new p277w7.c((HttpURLConnection) uRLConnectionOpenConnection, hVar, cVar).f47776a.c(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e10) {
            cVar.h(j);
            cVar.k(hVar.a());
            cVar.l(url.toString());
            p277w7.h.c(cVar);
            throw e10;
        }
    }
}
