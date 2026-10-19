package io.ktor.client.call;

import io.ktor.client.HttpClient;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SavedCall.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f40265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f40266h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HttpClient client, V9.b bVar, io.ktor.client.statement.c cVar, byte[] bArr) {
        super(client);
        i.e(client, "client");
        this.f40265g = bArr;
        this.f40263c = new d(this, bVar);
        this.f40264d = new e(this, bArr, cVar);
        this.f40266h = true;
    }

    @Override // io.ktor.client.call.a
    public final boolean b() {
        return this.f40266h;
    }

    @Override // io.ktor.client.call.a
    public final Object e() {
        return h.a(this.f40265g);
    }
}
