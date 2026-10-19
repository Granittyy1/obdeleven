package com.bumptech.glide;

import K3.h;
import K3.l;
import U3.g;
import X3.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.widget.ImageView;
import androidx.collection.C0873a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: RequestBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class d<TranscodeType> extends T3.a<d<TranscodeType>> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f24487A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f24488B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Context f24489u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f24490v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Class<TranscodeType> f24491w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f24492x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f<?, ? super TranscodeType> f24493y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f24494z;

    /* JADX INFO: compiled from: RequestBuilder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f24496b;

        static {
            int[] iArr = new int[Priority.values().length];
            f24496b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24496b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24496b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24496b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f24495a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24495a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24495a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24495a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24495a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24495a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24495a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24495a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(b bVar, e eVar, Class<TranscodeType> cls, Context context) {
        T3.d dVar;
        this.f24490v = eVar;
        this.f24491w = cls;
        this.f24489u = context;
        C0873a c0873a = eVar.f24498b.f24472d.f24483f;
        f<?, ? super TranscodeType> fVar = (f) c0873a.get(cls);
        if (fVar == null) {
            for (Map.Entry entry : (C0873a.C0118a) c0873a.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    fVar = (f) entry.getValue();
                }
            }
        }
        this.f24493y = fVar == null ? c.j : fVar;
        this.f24492x = bVar.f24472d;
        Iterator<T3.c<Object>> it = eVar.f24506k.iterator();
        while (it.hasNext()) {
            t(it.next());
        }
        synchronized (eVar) {
            dVar = eVar.f24507l;
        }
        a(dVar);
    }

    public final void t(T3.c cVar) {
        if (cVar != null) {
            if (this.f24487A == null) {
                this.f24487A = new ArrayList();
            }
            this.f24487A.add(cVar);
        }
    }

    @Override // T3.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final d<TranscodeType> a(T3.a<?> aVar) {
        M1.c(aVar);
        return (d) super.a(aVar);
    }

    @Override // T3.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final d<TranscodeType> clone() {
        d<TranscodeType> dVar = (d) super.clone();
        dVar.f24493y = dVar.f24493y.clone();
        return dVar;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x011a */
    /* JADX WARN: Bottom block not found for handler: all -> 0x011e */
    /* JADX WARN: Code duplicated, block: B:59:0x00ff A[Catch: all -> 0x0115, TryCatch #1 {, blocks: (B:57:0x00eb, B:59:0x00ff, B:60:0x0103), top: B:78:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0103 A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #1 {, blocks: (B:57:0x00eb, B:59:0x00ff, B:60:0x0103), top: B:78:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(U3.g r19, T3.a r20, X3.e.a r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.w(U3.g, T3.a, X3.e$a):void");
    }

    public final void x(ImageView imageView) {
        T3.a aVarH;
        g dVar;
        char[] cArr = j.f7214a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        M1.c(imageView);
        if (!T3.a.g(this.f5800b, 2048) && this.f5809l && imageView.getScaleType() != null) {
            switch (a.f24495a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarH = clone().h(DownsampleStrategy.f24662c, new K3.g());
                    break;
                case 2:
                    aVarH = clone().h(DownsampleStrategy.f24661b, new h());
                    aVarH.f5816s = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVarH = clone().h(DownsampleStrategy.f24660a, new l());
                    aVarH.f5816s = true;
                    break;
                case 6:
                    aVarH = clone().h(DownsampleStrategy.f24661b, new h());
                    aVarH.f5816s = true;
                    break;
                default:
                    aVarH = this;
                    break;
            }
        } else {
            aVarH = this;
        }
        this.f24492x.f24480c.getClass();
        Class<TranscodeType> cls = this.f24491w;
        if (Bitmap.class.equals(cls)) {
            dVar = new U3.b(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            dVar = new U3.d(imageView);
        }
        w(dVar, aVarH, X3.e.f7203a);
    }

    public final void y(T3.c cVar) {
        this.f24487A = null;
        t(cVar);
    }
}
