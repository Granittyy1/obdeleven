package p283x0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.collection.C0893v;
import androidx.collection.X;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p222s0.e;

/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0893v<String, Typeface> f47861a = new C0893v<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f47862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f47863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final X<String, ArrayList<A0.a<a>>> f47864d;

    static {
        m mVar = new m();
        mVar.f47874b = "fonts-androidx";
        mVar.f47875c = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), mVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f47862b = threadPoolExecutor;
        f47863c = new Object();
        f47864d = new X<>();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[EDGE_INSN: B:10:0x001e->B:24:0x003b BREAK  A[LOOP:0: B:17:0x002b->B:23:0x0038]] */
    public static a a(String str, Context context, e eVar, int i10) {
        C0893v<String, Typeface> c0893v = f47861a;
        Typeface typefaceC = c0893v.c(str);
        if (typefaceC != null) {
            return new a(typefaceC);
        }
        try {
            k kVarA = d.a(context, eVar);
            int i11 = 1;
            l[] lVarArr = kVarA.f47868b;
            int i12 = kVarA.f47867a;
            if (i12 != 0) {
                if (i12 != 1) {
                    i11 = -3;
                    break;
                }
                i11 = -2;
            } else if (lVarArr != null && lVarArr.length != 0) {
                i11 = 0;
                for (l lVar : lVarArr) {
                    int i13 = lVar.f47873e;
                    if (i13 != 0) {
                        if (i13 >= 0) {
                            i11 = i13;
                            break;
                        }
                        i11 = -3;
                        break;
                    }
                }
            }
            if (i11 != 0) {
                return new a(i11);
            }
            Typeface typefaceB = e.f46858a.b(context, lVarArr, i10);
            if (typefaceB == null) {
                return new a(-3);
            }
            c0893v.d(str, typefaceB);
            return new a(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f47865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47866b;

        public a(int i10) {
            this.f47865a = null;
            this.f47866b = i10;
        }

        public a(Typeface typeface) {
            this.f47865a = typeface;
            this.f47866b = 0;
        }
    }
}
