package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Excluder implements m, Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Excluder f28827d = new Excluder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<com.google.gson.a> f28828b = Collections.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<com.google.gson.a> f28829c = Collections.emptyList();

    public final boolean a(Class<?> cls, boolean z10) {
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            K7.a.AbstractC0062a abstractC0062a = K7.a.f4367a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator<com.google.gson.a> it = (z10 ? this.f28828b : this.f28829c).iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() throws CloneNotSupportedException {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.gson.m
    public final <T> TypeAdapter<T> create(final Gson gson, final L7.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        final boolean zA = a(rawType, true);
        final boolean zA2 = a(rawType, false);
        if (zA || zA2) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public volatile TypeAdapter<T> f28830a;

                @Override // com.google.gson.TypeAdapter
                public final T read(M7.a aVar2) throws IOException {
                    if (zA2) {
                        aVar2.Z0();
                        return null;
                    }
                    TypeAdapter<T> typeAdapterF = this.f28830a;
                    if (typeAdapterF == null) {
                        typeAdapterF = gson.f(Excluder.this, aVar);
                        this.f28830a = typeAdapterF;
                    }
                    return typeAdapterF.read(aVar2);
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(M7.b bVar, T t8) throws IOException {
                    if (zA) {
                        bVar.x();
                        return;
                    }
                    TypeAdapter<T> typeAdapterF = this.f28830a;
                    if (typeAdapterF == null) {
                        typeAdapterF = gson.f(Excluder.this, aVar);
                        this.f28830a = typeAdapterF;
                    }
                    typeAdapterF.write(bVar, t8);
                }
            };
        }
        return null;
    }
}
