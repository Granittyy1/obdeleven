package com.bumptech.glide;

import H3.q;
import H3.r;
import H3.s;
import H3.u;
import Q2.C0727d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Registry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f24460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S3.a f24461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3.d f24462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S3.e f24463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B3.f f24464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P3.f f24465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S3.b f24466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0727d f24467h = new C0727d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S3.c f24468i = new S3.c();
    public final Y3.a.c j;

    public static class MissingComponentException extends RuntimeException {
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException() {
            throw null;
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException() {
            throw null;
        }
    }

    public Registry() {
        Y3.a.c cVar = new Y3.a.c(new A0.e(20), new Y3.b(), new Y3.c());
        this.j = cVar;
        this.f24460a = new s(cVar);
        this.f24461b = new S3.a();
        S3.d dVar = new S3.d();
        this.f24462c = dVar;
        this.f24463d = new S3.e();
        this.f24464e = new B3.f();
        this.f24465f = new P3.f();
        this.f24466g = new S3.b();
        List listAsList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.addAll(listAsList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (dVar) {
            try {
                ArrayList<String> arrayList2 = new ArrayList(dVar.f5490a);
                dVar.f5490a.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    dVar.f5490a.add((String) it.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        dVar.f5490a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, A3.a aVar) {
        S3.a aVar2 = this.f24461b;
        synchronized (aVar2) {
            aVar2.f5483a.add(new S3.a.C0078a(cls, aVar));
        }
    }

    public final void b(Class cls, A3.f fVar) {
        S3.e eVar = this.f24463d;
        synchronized (eVar) {
            eVar.f5495a.add(new S3.e.a(cls, fVar));
        }
    }

    public final void c(Class cls, Class cls2, r rVar) {
        s sVar = this.f24460a;
        synchronized (sVar) {
            u uVar = sVar.f3670a;
            synchronized (uVar) {
                try {
                    u.b bVar = new u.b(cls, cls2, rVar);
                    ArrayList arrayList = uVar.f3685a;
                    arrayList.add(arrayList.size(), bVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            sVar.f3671b.f3672a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, A3.e eVar) {
        S3.d dVar = this.f24462c;
        synchronized (dVar) {
            dVar.a(str).add(new S3.d.a<>(cls, cls2, eVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        S3.b bVar = this.f24466g;
        synchronized (bVar) {
            arrayList = bVar.f5486a;
        }
        if (arrayList.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return arrayList;
    }

    public final <Model> List<q<Model, ?>> f(Model model) {
        List<q<Model, ?>> listUnmodifiableList;
        s sVar = this.f24460a;
        sVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (sVar) {
            s.a.C0046a c0046a = (s.a.C0046a) sVar.f3671b.f3672a.get(cls);
            listUnmodifiableList = c0046a == null ? null : c0046a.f3673a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(sVar.f3670a.b(cls));
                if (((s.a.C0046a) sVar.f3671b.f3672a.put(cls, new s.a.C0046a(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + model.getClass());
        }
        int size = listUnmodifiableList.size();
        List<q<Model, ?>> listEmptyList = Collections.emptyList();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            q<Model, ?> qVar = listUnmodifiableList.get(i10);
            if (qVar.b(model)) {
                if (z10) {
                    listEmptyList = new ArrayList<>(size - i10);
                    z10 = false;
                }
                listEmptyList.add(qVar);
            }
        }
        if (!listEmptyList.isEmpty()) {
            return listEmptyList;
        }
        throw new NoModelLoaderAvailableException("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + model);
    }

    public final void g(B3.e.a aVar) {
        B3.f fVar = this.f24464e;
        synchronized (fVar) {
            fVar.f1505a.put(aVar.a(), aVar);
        }
    }

    public final void h(Class cls, Class cls2, P3.e eVar) {
        P3.f fVar = this.f24465f;
        synchronized (fVar) {
            fVar.f4924a.add(new P3.f.a(cls, cls2, eVar));
        }
    }
}
