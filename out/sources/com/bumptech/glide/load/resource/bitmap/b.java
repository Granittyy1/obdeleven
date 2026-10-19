package com.bumptech.glide.load.resource.bitmap;

import B3.k;
import B3.m;
import E3.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.gms.internal.measurement.M1;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: ImageReader.java */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: ImageReader.java */
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f24688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f24689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f24690c;

        public a(h hVar, InputStream inputStream, ArrayList arrayList) {
            M1.d(hVar, "Argument must not be null");
            this.f24689b = hVar;
            M1.d(arrayList, "Argument must not be null");
            this.f24690c = arrayList;
            this.f24688a = new k(inputStream, hVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final int a() throws IOException {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f24688a.f1516a;
            recyclableBufferedInputStream.reset();
            return com.bumptech.glide.load.a.a(this.f24689b, recyclableBufferedInputStream, this.f24690c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final Bitmap b(BitmapFactory.Options options) throws IOException {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f24688a.f1516a;
            recyclableBufferedInputStream.reset();
            return BitmapFactory.decodeStream(recyclableBufferedInputStream, null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final void c() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f24688a.f1516a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f24672d = recyclableBufferedInputStream.f24670b.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final ImageHeaderParser.ImageType d() throws IOException {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f24688a.f1516a;
            recyclableBufferedInputStream.reset();
            return com.bumptech.glide.load.a.b(this.f24689b, recyclableBufferedInputStream, this.f24690c);
        }
    }

    int a() throws IOException;

    Bitmap b(BitmapFactory.Options options) throws IOException;

    void c();

    ImageHeaderParser.ImageType d() throws IOException;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImageReader.java */
    public static final class C0261b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f24691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f24692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m f24693c;

        public C0261b(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, h hVar) {
            M1.d(hVar, "Argument must not be null");
            this.f24691a = hVar;
            M1.d(arrayList, "Argument must not be null");
            this.f24692b = arrayList;
            this.f24693c = new m(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final int a() throws Throwable {
            m mVar = this.f24693c;
            h hVar = this.f24691a;
            ArrayList arrayList = this.f24692b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i10);
                RecyclableBufferedInputStream recyclableBufferedInputStream = null;
                try {
                    RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(mVar.a().getFileDescriptor()), hVar);
                    try {
                        int iC = imageHeaderParser.c(recyclableBufferedInputStream2, hVar);
                        try {
                            recyclableBufferedInputStream2.close();
                        } catch (IOException unused) {
                        }
                        mVar.a();
                        if (iC != -1) {
                            return iC;
                        }
                    } catch (Throwable th) {
                        th = th;
                        recyclableBufferedInputStream = recyclableBufferedInputStream2;
                        if (recyclableBufferedInputStream != null) {
                            try {
                                recyclableBufferedInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        mVar.a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f24693c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final ImageHeaderParser.ImageType d() throws Throwable {
            m mVar = this.f24693c;
            h hVar = this.f24691a;
            ArrayList arrayList = this.f24692b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i10);
                RecyclableBufferedInputStream recyclableBufferedInputStream = null;
                try {
                    RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(mVar.a().getFileDescriptor()), hVar);
                    try {
                        ImageHeaderParser.ImageType imageTypeB = imageHeaderParser.b(recyclableBufferedInputStream2);
                        try {
                            recyclableBufferedInputStream2.close();
                        } catch (IOException unused) {
                        }
                        mVar.a();
                        if (imageTypeB != ImageHeaderParser.ImageType.UNKNOWN) {
                            return imageTypeB;
                        }
                    } catch (Throwable th) {
                        th = th;
                        recyclableBufferedInputStream = recyclableBufferedInputStream2;
                        if (recyclableBufferedInputStream != null) {
                            try {
                                recyclableBufferedInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        mVar.a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final void c() {
        }
    }
}
