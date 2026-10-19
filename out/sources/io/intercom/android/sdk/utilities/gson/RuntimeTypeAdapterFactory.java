package io.intercom.android.sdk.utilities.gson;

import L7.a;
import M7.b;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.j;
import com.google.gson.m;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RuntimeTypeAdapterFactory<T> implements m {
    private final Class<?> baseType;
    private final boolean maintainType;
    private final String typeFieldName;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final Map<String, Class<?>> labelToIgnoreSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToIgnoreLabel = new LinkedHashMap();

    private RuntimeTypeAdapterFactory(Class<?> cls, String str, boolean z10) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.maintainType = z10;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str, boolean z10) {
        return new RuntimeTypeAdapterFactory<>(cls, str, z10);
    }

    @Override // com.google.gson.m
    public <R> TypeAdapter<R> create(Gson gson, a<R> aVar) {
        if (aVar.getRawType() != this.baseType) {
            return null;
        }
        gson.getClass();
        final TypeAdapter<T> typeAdapterE = gson.e(a.get(g.class));
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            TypeAdapter<T> typeAdapterF = gson.f(this, a.get((Class) entry.getValue()));
            linkedHashMap.put(entry.getKey(), typeAdapterF);
            linkedHashMap2.put(entry.getValue(), typeAdapterF);
        }
        for (Map.Entry<String, Class<?>> entry2 : this.labelToIgnoreSubtype.entrySet()) {
            TypeAdapter<T> typeAdapterF2 = gson.f(this, a.get((Class) entry2.getValue()));
            linkedHashMap3.put(entry2.getKey(), typeAdapterF2);
            linkedHashMap4.put(entry2.getValue(), typeAdapterF2);
        }
        return new TypeAdapter<R>() { // from class: io.intercom.android.sdk.utilities.gson.RuntimeTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            public R read(M7.a aVar2) throws IOException {
                g gVarRemove;
                g gVar = (g) typeAdapterE.read(aVar2);
                if (RuntimeTypeAdapterFactory.this.maintainType) {
                    gVarRemove = gVar.d().f28826b.get(RuntimeTypeAdapterFactory.this.typeFieldName);
                } else {
                    gVarRemove = gVar.d().f28826b.remove(RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                if (gVarRemove != null) {
                    TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(gVarRemove.e());
                    if (typeAdapter == null) {
                        typeAdapter = (TypeAdapter) linkedHashMap3.get("UnSupported");
                    }
                    return (R) typeAdapter.fromJsonTree(gVar);
                }
                throw new JsonParseException("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(b bVar, R r10) throws IOException {
                Class<?> cls = r10.getClass();
                String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                if (typeAdapter == null) {
                    throw new JsonParseException("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
                }
                i iVarD = typeAdapter.toJsonTree(r10).d();
                if (RuntimeTypeAdapterFactory.this.maintainType) {
                    typeAdapterE.write(bVar, iVarD);
                    return;
                }
                i iVar = new i();
                String str2 = RuntimeTypeAdapterFactory.this.typeFieldName;
                LinkedTreeMap<String, g> linkedTreeMap = iVarD.f28826b;
                if (linkedTreeMap.containsKey(str2)) {
                    throw new JsonParseException("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                String str3 = RuntimeTypeAdapterFactory.this.typeFieldName;
                j jVar = new j(str);
                LinkedTreeMap<String, g> linkedTreeMap2 = iVar.f28826b;
                linkedTreeMap2.put(str3, jVar);
                Iterator it = ((LinkedTreeMap.b) linkedTreeMap.entrySet()).iterator();
                while (((LinkedTreeMap.d) it).hasNext()) {
                    Map.Entry entryA = ((LinkedTreeMap.b.a) it).a();
                    String str4 = (String) entryA.getKey();
                    g gVar = (g) entryA.getValue();
                    if (gVar == null) {
                        gVar = h.f28825b;
                    }
                    linkedTreeMap2.put(str4, gVar);
                }
                typeAdapterE.write(bVar, iVar);
            }
        }.nullSafe();
    }

    public RuntimeTypeAdapterFactory<T> registerIgnoredSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        this.labelToIgnoreSubtype.put(str, cls);
        this.subtypeToIgnoreLabel.put(cls, str);
        return this;
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str, false);
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type", false);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
