package androidx.emoji2.text;

import A0.f;
import J4.i;
import R0.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p283x0.k;
import p283x0.l;

/* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c.AbstractC0181c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f17362d = new a();

    /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
    public static class a {
    }

    /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
    public static class b implements c.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f17363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p283x0.e f17364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f17365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f17366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handler f17367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ThreadPoolExecutor f17368f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f17369g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c.h f17370h;

        public b(Context context, p283x0.e eVar) {
            a aVar = e.f17362d;
            this.f17366d = new Object();
            f.f(context, "Context cannot be null");
            this.f17363a = context.getApplicationContext();
            this.f17364b = eVar;
            this.f17365c = aVar;
        }

        @Override // androidx.emoji2.text.c.g
        public final void a(c.h hVar) {
            synchronized (this.f17366d) {
                this.f17370h = hVar;
            }
            synchronized (this.f17366d) {
                try {
                    if (this.f17370h == null) {
                        return;
                    }
                    if (this.f17368f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new R0.a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f17369g = threadPoolExecutor;
                        this.f17368f = threadPoolExecutor;
                    }
                    this.f17368f.execute(new j(0, this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.f17366d) {
                try {
                    this.f17370h = null;
                    Handler handler = this.f17367e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.f17367e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f17369g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f17368f = null;
                    this.f17369g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final l c() {
            try {
                a aVar = this.f17365c;
                Context context = this.f17363a;
                p283x0.e eVar = this.f17364b;
                aVar.getClass();
                k kVarA = p283x0.d.a(context, eVar);
                int i10 = kVarA.f47867a;
                if (i10 != 0) {
                    throw new RuntimeException(i.c(i10, "fetchFonts failed (", ")"));
                }
                l[] lVarArr = kVarA.f47868b;
                if (lVarArr == null || lVarArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return lVarArr[0];
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }
}
