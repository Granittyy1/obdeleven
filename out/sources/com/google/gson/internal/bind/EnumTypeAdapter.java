package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f28863d = new m() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.m
        public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f28864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f28865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f28866c;

    public EnumTypeAdapter() {
        throw null;
    }

    public EnumTypeAdapter(Class cls) {
        this.f28864a = new HashMap();
        this.f28865b = new HashMap();
        this.f28866c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r10 = (Enum) field2.get(null);
                String strName = r10.name();
                String string = r10.toString();
                I7.b bVar = (I7.b) field2.getAnnotation(I7.b.class);
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        this.f28864a.put(str, r10);
                    }
                }
                this.f28864a.put(strName, r10);
                this.f28865b.put(string, r10);
                this.f28866c.put(r10, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(M7.a aVar) throws IOException {
        if (aVar.y0() == JsonToken.j) {
            aVar.n0();
            return null;
        }
        String strR0 = aVar.r0();
        Enum r10 = (Enum) this.f28864a.get(strR0);
        return r10 == null ? (Enum) this.f28865b.get(strR0) : r10;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(M7.b bVar, Object obj) throws IOException {
        Enum r10 = (Enum) obj;
        bVar.j0(r10 == null ? null : (String) this.f28866c.get(r10));
    }
}
