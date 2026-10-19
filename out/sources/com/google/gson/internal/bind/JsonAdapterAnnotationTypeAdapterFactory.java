package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.k;
import com.google.gson.m;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f28867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f28868e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.gson.internal.c f28869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f28870c = new ConcurrentHashMap();

    public static class DummyTypeAdapterFactory implements m {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.m
        public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ DummyTypeAdapterFactory(int i10) {
            this();
        }
    }

    static {
        int i10 = 0;
        f28867d = new DummyTypeAdapterFactory(i10);
        f28868e = new DummyTypeAdapterFactory(i10);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.c cVar) {
        this.f28869b = cVar;
    }

    public final TypeAdapter<?> a(com.google.gson.internal.c cVar, Gson gson, L7.a<?> aVar, I7.a aVar2, boolean z10) {
        TypeAdapter<?> treeTypeAdapter;
        Object objI = cVar.b(L7.a.get((Class) aVar2.value()), true).i();
        boolean zNullSafe = aVar2.nullSafe();
        if (objI instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) objI;
        } else if (objI instanceof m) {
            m mVar = (m) objI;
            if (z10) {
                m mVar2 = (m) this.f28870c.putIfAbsent(aVar.getRawType(), mVar);
                if (mVar2 != null) {
                    mVar = mVar2;
                }
            }
            treeTypeAdapter = mVar.create(gson, aVar);
        } else {
            boolean z11 = objI instanceof k;
            if (!z11 && !(objI instanceof f)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objI.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z11 ? (k) objI : null, objI instanceof f ? (f) objI : null, gson, aVar, z10 ? f28867d : f28868e, zNullSafe);
            zNullSafe = false;
        }
        return (treeTypeAdapter == null || !zNullSafe) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }

    @Override // com.google.gson.m
    public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
        I7.a aVar2 = (I7.a) aVar.getRawType().getAnnotation(I7.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (TypeAdapter<T>) a(this.f28869b, gson, aVar, aVar2, true);
    }
}
