package O3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;

/* JADX INFO: compiled from: GifFrameLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p310z3.e f4818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f4819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.e f4821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E3.c f4822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.d<Bitmap> f4825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f4826i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f4827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f4828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public A3.g<Bitmap> f4829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f4830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4833q;

    /* JADX INFO: compiled from: GifFrameLoader.java */
    public static class a extends U3.c<Bitmap> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Handler f4834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f4835f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f4836g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Bitmap f4837h;

        public a(Handler handler, int i10, long j) {
            this.f4834e = handler;
            this.f4835f = i10;
            this.f4836g = j;
        }

        @Override // U3.g
        public final void b(Object obj) {
            this.f4837h = (Bitmap) obj;
            Handler handler = this.f4834e;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f4836g);
        }

        @Override // U3.g
        public final void j(Drawable drawable) {
            this.f4837h = null;
        }
    }

    /* JADX INFO: compiled from: GifFrameLoader.java */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: GifFrameLoader.java */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            g gVar = g.this;
            if (i10 == 1) {
                gVar.b((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            gVar.f4821d.l((a) message.obj);
            return false;
        }
    }

    public g(com.bumptech.glide.b bVar, p310z3.e eVar, int i10, int i11, J3.a aVar, Bitmap bitmap) {
        E3.c cVar = bVar.f24470b;
        com.bumptech.glide.c cVar2 = bVar.f24472d;
        Context baseContext = cVar2.getBaseContext();
        com.bumptech.glide.e eVarE = com.bumptech.glide.b.c(baseContext).e(baseContext);
        Context baseContext2 = cVar2.getBaseContext();
        com.bumptech.glide.e eVarE2 = com.bumptech.glide.b.c(baseContext2).e(baseContext2);
        eVarE2.getClass();
        com.bumptech.glide.d<Bitmap> dVarU = new com.bumptech.glide.d(eVarE2.f24498b, eVarE2, Bitmap.class, eVarE2.f24499c).a(com.bumptech.glide.e.f24497m).a(((T3.d) ((T3.d) new T3.d().d(D3.h.f2746a).s()).p()).i(i10, i11));
        this.f4820c = new ArrayList();
        this.f4821d = eVarE;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f4822e = cVar;
        this.f4819b = handler;
        this.f4825h = dVarU;
        this.f4818a = eVar;
        c(aVar, bitmap);
    }

    public final void a() {
        int i10;
        int i11;
        if (!this.f4823f || this.f4824g) {
            return;
        }
        a aVar = this.f4830n;
        if (aVar != null) {
            this.f4830n = null;
            b(aVar);
            return;
        }
        this.f4824g = true;
        p310z3.e eVar = this.f4818a;
        p310z3.c cVar = eVar.f48818l;
        int i12 = cVar.f48796c;
        if (i12 <= 0 || (i11 = eVar.f48817k) < 0) {
            i10 = 0;
        } else {
            i10 = (i11 < 0 || i11 >= i12) ? -1 : ((p310z3.b) cVar.f48798e.get(i11)).f48792i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i10);
        eVar.b();
        this.f4827k = new a(this.f4819b, eVar.f48817k, jUptimeMillis);
        com.bumptech.glide.d<Bitmap> dVarU = this.f4825h.a((T3.d) new T3.d().o(new W3.b(Double.valueOf(Math.random()))));
        dVarU.f24494z = eVar;
        dVarU.f24488B = true;
        dVarU.w(this.f4827k, dVarU, X3.e.f7203a);
    }

    public final void b(a aVar) {
        this.f4824g = false;
        boolean z10 = this.j;
        Handler handler = this.f4819b;
        if (z10) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f4823f) {
            this.f4830n = aVar;
            return;
        }
        if (aVar.f4837h != null) {
            Bitmap bitmap = this.f4828l;
            if (bitmap != null) {
                this.f4822e.c(bitmap);
                this.f4828l = null;
            }
            a aVar2 = this.f4826i;
            this.f4826i = aVar;
            ArrayList arrayList = this.f4820c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a();
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(A3.g<Bitmap> gVar, Bitmap bitmap) {
        M1.d(gVar, "Argument must not be null");
        this.f4829m = gVar;
        M1.d(bitmap, "Argument must not be null");
        this.f4828l = bitmap;
        this.f4825h = this.f4825h.a(new T3.d().q(gVar, true));
        this.f4831o = X3.j.c(bitmap);
        this.f4832p = bitmap.getWidth();
        this.f4833q = bitmap.getHeight();
    }
}
