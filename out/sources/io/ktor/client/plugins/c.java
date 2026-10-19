package io.ktor.client.plugins;

import io.ktor.http.C2476a;
import io.ktor.utils.io.ByteReadChannel;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: DefaultTransformersJvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends X9.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f40351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2476a f40352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40353c;

    public c(io.ktor.client.request.a aVar, C2476a c2476a, Object obj) {
        this.f40353c = obj;
        io.ktor.http.h hVar = aVar.f40412c;
        List<String> list = io.ktor.http.k.f40481a;
        String strG = hVar.g("Content-Length");
        this.f40351a = strG != null ? Long.valueOf(Long.parseLong(strG)) : null;
        if (c2476a == null) {
            C2476a c2476a2 = C2476a.C0457a.f40469a;
            c2476a = C2476a.C0457a.f40470b;
        }
        this.f40352b = c2476a;
    }

    @Override // X9.b
    public final Long a() {
        return this.f40351a;
    }

    @Override // X9.b
    public final C2476a b() {
        return this.f40352b;
    }

    @Override // X9.b.c
    public final ByteReadChannel d() {
        return io.ktor.utils.io.jvm.javaio.f.a((InputStream) this.f40353c);
    }
}
