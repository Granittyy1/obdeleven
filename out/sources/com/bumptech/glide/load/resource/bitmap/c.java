package com.bumptech.glide.load.resource.bitmap;

import A3.e;
import D3.o;
import E3.h;
import X3.d;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: StreamBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f24694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f24695b;

    /* JADX INFO: compiled from: StreamBitmapDecoder.java */
    public static class a implements com.bumptech.glide.load.resource.bitmap.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclableBufferedInputStream f24696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f24697b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, d dVar) {
            this.f24696a = recyclableBufferedInputStream;
            this.f24697b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public final void a() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f24696a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f24672d = recyclableBufferedInputStream.f24670b.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public final void b(E3.c cVar, Bitmap bitmap) throws IOException {
            IOException iOException = this.f24697b.f7202c;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                cVar.c(bitmap);
                throw iOException;
            }
        }
    }

    public c(com.bumptech.glide.load.resource.bitmap.a aVar, h hVar) {
        this.f24694a = aVar;
        this.f24695b = hVar;
    }

    @Override // A3.e
    public final boolean a(InputStream inputStream, A3.d dVar) throws IOException {
        return true;
    }

    @Override // A3.e
    public final o<Bitmap> b(InputStream inputStream, int i10, int i11, A3.d dVar) throws IOException {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        boolean z10;
        d dVar2;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof RecyclableBufferedInputStream) {
            z10 = false;
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream2;
        } else {
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream2, this.f24695b);
            z10 = true;
        }
        ArrayDeque arrayDeque = d.f7200d;
        synchronized (arrayDeque) {
            dVar2 = (d) arrayDeque.poll();
        }
        if (dVar2 == null) {
            dVar2 = new d();
        }
        d dVar3 = dVar2;
        dVar3.f7201b = recyclableBufferedInputStream;
        X3.h hVar = new X3.h(dVar3);
        a aVar = new a(recyclableBufferedInputStream, dVar3);
        try {
            com.bumptech.glide.load.resource.bitmap.a aVar2 = this.f24694a;
            K3.d dVarA = aVar2.a(new b.a(aVar2.f24685c, hVar, aVar2.f24686d), i10, i11, dVar, aVar);
            dVar3.f7202c = null;
            dVar3.f7201b = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar3);
            }
            return dVarA;
        } finally {
            dVar3.f7202c = null;
            dVar3.f7201b = null;
            ArrayDeque arrayDeque2 = d.f7200d;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar3);
                if (z10) {
                    recyclableBufferedInputStream.c();
                }
            }
        }
    }
}
