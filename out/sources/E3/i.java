package E3;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: LruBitmapPool.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config f3064f = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f3065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Bitmap.Config> f3066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f3067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3069e;

    /* JADX INFO: compiled from: LruBitmapPool.java */
    public static final class a {
    }

    public i(long j) {
        k kVar = new k();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f3068d = j;
        this.f3065a = kVar;
        this.f3066b = setUnmodifiableSet;
        this.f3067c = new a();
    }

    @Override // E3.c
    public final void a(int i10) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i10 >= 40 || i10 >= 20) {
            e();
        } else if (i10 >= 20 || i10 == 15) {
            g(this.f3068d / 2);
        }
    }

    @Override // E3.c
    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapF = f(i10, i11, config);
        if (bitmapF != null) {
            return bitmapF;
        }
        if (config == null) {
            config = f3064f;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // E3.c
    public final synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f3065a.getClass();
                if (X3.j.c(bitmap) <= this.f3068d && this.f3066b.contains(bitmap.getConfig())) {
                    this.f3065a.getClass();
                    int iC = X3.j.c(bitmap);
                    this.f3065a.e(bitmap);
                    this.f3067c.getClass();
                    this.f3069e += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.f3065a.getClass();
                        k.c(X3.j.c(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.f3065a);
                    }
                    g(this.f3068d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f3065a.getClass();
                k.c(X3.j.c(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.f3066b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // E3.c
    public final Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapF = f(i10, i11, config);
        if (bitmapF != null) {
            bitmapF.eraseColor(0);
            return bitmapF;
        }
        if (config == null) {
            config = f3064f;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // E3.c
    public final void e() {
        Log.isLoggable("LruBitmapPool", 3);
        g(0L);
    }

    public final synchronized Bitmap f(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f3065a.b(i10, i11, config != null ? config : f3064f);
            if (bitmapB != null) {
                long j = this.f3069e;
                this.f3065a.getClass();
                this.f3069e = j - ((long) X3.j.c(bitmapB));
                this.f3067c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f3065a.getClass();
                k.c(X3.j.b(i10, i11, config), config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f3065a.getClass();
                k.c(X3.j.b(i10, i11, config), config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f3065a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void g(long j) {
        while (this.f3069e > j) {
            k kVar = this.f3065a;
            Bitmap bitmapC = kVar.f3076b.c();
            if (bitmapC != null) {
                kVar.a(Integer.valueOf(X3.j.c(bitmapC)), bitmapC);
            }
            if (bitmapC == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.f3065a);
                }
                this.f3069e = 0L;
                return;
            }
            this.f3067c.getClass();
            long j10 = this.f3069e;
            this.f3065a.getClass();
            this.f3069e = j10 - ((long) X3.j.c(bitmapC));
            if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f3065a.getClass();
                k.c(X3.j.c(bitmapC), bitmapC.getConfig());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f3065a);
            }
            bitmapC.recycle();
        }
    }
}
