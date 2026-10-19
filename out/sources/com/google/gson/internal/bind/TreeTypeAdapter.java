package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k<T> f28901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f<T> f28902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gson f28903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L7.a<T> f28904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f28905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f28906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile TypeAdapter<T> f28907g;

    public static final class SingleTypeFactory implements m {
        @Override // com.google.gson.m
        public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
            aVar.getRawType();
            throw null;
        }
    }

    public final class a {
    }

    public TreeTypeAdapter() {
        throw null;
    }

    public TreeTypeAdapter(k<T> kVar, f<T> fVar, Gson gson, L7.a<T> aVar, m mVar, boolean z10) {
        this.f28901a = kVar;
        this.f28902b = fVar;
        this.f28903c = gson;
        this.f28904d = aVar;
        this.f28905e = mVar;
        this.f28906f = z10;
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final TypeAdapter<T> a() {
        return this.f28901a != null ? this : b();
    }

    public final TypeAdapter<T> b() {
        TypeAdapter<T> typeAdapter = this.f28907g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> typeAdapterF = this.f28903c.f(this.f28905e, this.f28904d);
        this.f28907g = typeAdapterF;
        return typeAdapterF;
    }

    @Override // com.google.gson.TypeAdapter
    public final T read(M7.a aVar) throws IOException {
        boolean z10;
        g gVar;
        f<T> fVar = this.f28902b;
        if (fVar == null) {
            return b().read(aVar);
        }
        try {
            try {
                aVar.y0();
                z10 = false;
                try {
                    gVar = TypeAdapters.f28937z.read(aVar);
                } catch (EOFException e10) {
                    e = e10;
                    if (!z10) {
                        throw new JsonSyntaxException(e);
                    }
                    gVar = h.f28825b;
                }
            } catch (EOFException e11) {
                e = e11;
                z10 = true;
            }
            if (this.f28906f) {
                gVar.getClass();
                if (gVar instanceof h) {
                    return null;
                }
            }
            this.f28904d.getType();
            return (T) fVar.a();
        } catch (MalformedJsonException e12) {
            throw new JsonSyntaxException(e12);
        } catch (IOException e13) {
            throw new JsonIOException(e13);
        } catch (NumberFormatException e14) {
            throw new JsonSyntaxException(e14);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(M7.b bVar, T t8) throws IOException {
        k<T> kVar = this.f28901a;
        if (kVar == null) {
            b().write(bVar, t8);
            return;
        }
        if (this.f28906f && t8 == null) {
            bVar.x();
            return;
        }
        this.f28904d.getType();
        TypeAdapters.f28937z.write(bVar, kVar.a());
    }
}
