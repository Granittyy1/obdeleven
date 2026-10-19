package p006a5;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f8058b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f8059a;

    static {
        c cVar = new c();
        cVar.f8059a = null;
        f8058b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f8058b;
        synchronized (cVar) {
            try {
                if (cVar.f8059a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f8059a = new b(context);
                }
                bVar = cVar.f8059a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
