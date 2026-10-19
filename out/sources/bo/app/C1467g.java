package bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: bo.app.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1467g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f21098a;

    /* JADX INFO: renamed from: bo.app.g$a */
    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21100c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(0);
            this.f21099b = str;
            this.f21100c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error while retrieving disk for key " + this.f21099b + " diskKey " + this.f21100c;
        }
    }

    /* JADX INFO: renamed from: bo.app.g$b */
    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.f21101b = str;
            this.f21102c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get bitmap from disk cache for key " + this.f21101b + " diskKey " + this.f21102c;
        }
    }

    /* JADX INFO: renamed from: bo.app.g$c */
    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21104c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.f21103b = str;
            this.f21104c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to load image from disk cache: " + this.f21103b + '/' + this.f21104c;
        }
    }

    /* JADX INFO: renamed from: bo.app.g$d */
    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(0);
            this.f21105b = str;
            this.f21106c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error while producing output stream or compressing bitmap for key " + this.f21105b + " diskKey " + this.f21106c;
        }
    }

    public C1467g(File file, int i10, int i11, long j) throws IOException {
        m0 m0VarA = m0.a(file, i10, i11, j);
        kotlin.jvm.internal.i.d(m0VarA, "open(directory, appVersion, valueCount, maxSize)");
        this.f21098a = m0VarA;
    }

    private final String c(String str) {
        return String.valueOf(str.hashCode());
    }

    public final void a(String key, Bitmap bitmap) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(bitmap, "bitmap");
        String strC = c(key);
        try {
            m0.c cVarA = this.f21098a.a(strC);
            OutputStream outputStreamA = cVarA.a(0);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamA);
                outputStreamA.flush();
                p293xa.r rVar = p293xa.r.f47939a;
                p241t7.b.n(outputStreamA, null);
                cVarA.b();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p241t7.b.n(outputStreamA, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th3, new d(key, strC));
        }
    }

    public final Bitmap b(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        String strC = c(key);
        try {
            m0.d dVarB = this.f21098a.b(strC);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(dVarB.a(0));
                p241t7.b.n(dVarB, null);
                return bitmapDecodeStream;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p241t7.b.n(dVarB, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            brazeLogger.brazelog(this, BrazeLogger.Priority.E, th3, new b(key, strC));
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new c(key, strC), 3, (Object) null);
            return null;
        }
    }

    public final boolean a(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        String strC = c(key);
        try {
            m0.d dVarB = this.f21098a.b(strC);
            boolean z10 = dVarB != null;
            p241t7.b.n(dVarB, null);
            return z10;
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new a(key, strC));
            return false;
        }
    }
}
