package com.google.gson.internal.bind;

import androidx.compose.foundation.gestures.d;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ReflectiveTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends ReflectiveTypeAdapterFactory.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f28959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Method f28960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TypeAdapter f28961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TypeAdapter f28962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f28963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f28964i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Field field, boolean z10, Method method, TypeAdapter typeAdapter, TypeAdapter typeAdapter2, boolean z11, boolean z12) {
        super(str, field);
        this.f28959d = z10;
        this.f28960e = method;
        this.f28961f = typeAdapter;
        this.f28962g = typeAdapter2;
        this.f28963h = z11;
        this.f28964i = z12;
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final void a(M7.a aVar, int i10, Object[] objArr) throws JsonParseException, IOException {
        Object obj = this.f28962g.read(aVar);
        if (obj != null || !this.f28963h) {
            objArr[i10] = obj;
            return;
        }
        throw new JsonParseException("null is not allowed as value for record component '" + this.f28897c + "' of primitive type; at path " + aVar.s());
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final void b(M7.a aVar, Object obj) throws IllegalAccessException, IOException {
        Object obj2 = this.f28962g.read(aVar);
        if (obj2 == null && this.f28963h) {
            return;
        }
        boolean z10 = this.f28959d;
        Field field = this.f28896b;
        if (z10) {
            ReflectiveTypeAdapterFactory.a(obj, field);
        } else if (this.f28964i) {
            throw new JsonIOException(B7.b.c("Cannot set value of 'static final' ", K7.a.d(field, false)));
        }
        field.set(obj, obj2);
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final void c(M7.b bVar, Object obj) throws IllegalAccessException, IOException {
        Object objInvoke;
        Field field = this.f28896b;
        boolean z10 = this.f28959d;
        Method method = this.f28960e;
        if (z10) {
            if (method == null) {
                ReflectiveTypeAdapterFactory.a(obj, field);
            } else {
                ReflectiveTypeAdapterFactory.a(obj, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e10) {
                throw new JsonIOException(d.b("Accessor ", K7.a.d(method, false), " threw exception"), e10.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        bVar.p(this.f28895a);
        this.f28961f.write(bVar, objInvoke);
    }
}
