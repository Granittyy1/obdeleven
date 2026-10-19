package F3;

import C4.v;
import android.util.Log;
import androidx.media3.exoplayer.I;
import com.google.android.datatransport.Priority;
import com.google.firebase.sessions.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: InternalCacheDiskCacheFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements A3.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3221b;

    public /* synthetic */ e(Object obj) {
        this.f3221b = obj;
    }

    public void a(p pVar) {
        ((p311z4.h) ((p096h7.b) this.f3221b).get()).b("FIREBASE_APPQUALITY_SESSION", new p311z4.c("json"), new I(this)).a(new p311z4.a(pVar, Priority.f25231b, null), new v(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // A3.a
    public boolean f(Object obj, File file, A3.d dVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        E3.h hVar = (E3.h) this.f3221b;
        byte[] bArr = (byte[]) hVar.d(byte[].class, 65536);
        boolean z10 = false;
        ?? r10 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i10 = inputStream.read(bArr);
                        r10 = -1;
                        if (i10 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i10);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        hVar.h(bArr);
                        r10 = fileOutputStream;
                    } catch (Throwable th) {
                        th = th;
                        r10 = fileOutputStream2;
                        if (r10 != 0) {
                            try {
                                r10.close();
                            } catch (IOException unused3) {
                            }
                        }
                        hVar.h(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                hVar.h(bArr);
                z10 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
        }
        return z10;
    }

    public e() {
        this.f3221b = new LinkedHashSet();
    }
}
