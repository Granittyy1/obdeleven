package K3;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: compiled from: BitmapEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements A3.f<Bitmap> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A3.c<Integer> f4246c = A3.c.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A3.c<Bitmap.CompressFormat> f4247d = new A3.c<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, A3.c.f575e);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E3.h f4248b;

    public c(E3.h hVar) {
        this.f4248b = hVar;
    }

    @Override // A3.a
    public final boolean f(Object obj, File file, A3.d dVar) throws Throwable {
        boolean z10;
        Bitmap bitmap = (Bitmap) ((D3.o) obj).get();
        A3.c<Bitmap.CompressFormat> cVar = f4247d;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) dVar.c(cVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i10 = X3.f.f7206a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) dVar.c(f4246c)).intValue();
        OutputStream cVar2 = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    E3.h hVar = this.f4248b;
                    if (hVar != null) {
                        try {
                            cVar2 = new B3.c(fileOutputStream, hVar);
                        } catch (IOException unused) {
                            cVar2 = fileOutputStream;
                            Log.isLoggable("BitmapEncoder", 3);
                            if (cVar2 != null) {
                                try {
                                    cVar2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            z10 = false;
                        } catch (Throwable th) {
                            th = th;
                            cVar2 = fileOutputStream;
                            if (cVar2 != null) {
                                try {
                                    cVar2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        cVar2 = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, cVar2);
                    cVar2.close();
                    try {
                        cVar2.close();
                    } catch (IOException unused4) {
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (IOException unused5) {
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(compressFormat);
                X3.j.c(bitmap);
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(dVar.c(cVar));
                bitmap.hasAlpha();
            }
            return z10;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // A3.f
    public final EncodeStrategy g(A3.d dVar) {
        return EncodeStrategy.f24522c;
    }
}
