package p222s0;

import P3.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.collection.C0893v;
import androidx.collection.X;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p068f4.h;
import p211r0.f;
import p283x0.b;
import p283x0.c;
import p283x0.g;
import p283x0.i;
import p283x0.j;
import p283x0.n;

/* JADX INFO: compiled from: TypefaceCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f46858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0893v<String, Typeface> f46859b;

    /* JADX INFO: compiled from: TypefaceCompat.java */
    public static class a extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public f.e f46860f;
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f46858a = new i();
        } else if (i10 >= 28) {
            f46858a = new h();
        } else {
            f46858a = new g();
        }
        f46859b = new C0893v<>(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    public static Typeface a(Context context, r0.e.b bVar, Resources resources, int i10, String str, int i11, int i12, f.e eVar, boolean z10) {
        Typeface typefaceA;
        Typeface typefaceCreate;
        int i13 = 1;
        if (bVar instanceof p211r0.e.C0523e) {
            p211r0.e.C0523e c0523e = (p211r0.e.C0523e) bVar;
            String str2 = c0523e.f46247d;
            typefaceA = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (eVar != null) {
                    new Handler(Looper.getMainLooper()).post(new h(eVar, i13, typefaceCreate));
                }
                return typefaceCreate;
            }
            if (!z10 ? eVar != null : c0523e.f46246c != 0) {
                i13 = 0;
            }
            int i14 = z10 ? c0523e.f46245b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            a aVar = new a();
            aVar.f46860f = eVar;
            p283x0.e eVar2 = c0523e.f46244a;
            c cVar = new c(aVar, handler);
            if (i13 != 0) {
                C0893v<String, Typeface> c0893v = j.f47861a;
                String str3 = eVar2.f47850e + "-" + i12;
                Typeface typefaceC = j.f47861a.c(str3);
                if (typefaceC != null) {
                    handler.post(new p283x0.a(aVar, typefaceC));
                    typefaceA = typefaceC;
                } else if (i14 == -1) {
                    j.a aVarA = j.a(str3, context, eVar2, i12);
                    cVar.a(aVarA);
                    typefaceA = aVarA.f47865a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    j.a aVar2 = (j.a) j.f47862b.submit(new p283x0.f(str3, context, eVar2, i12)).get(i14, TimeUnit.MILLISECONDS);
                                    cVar.a(aVar2);
                                    typefaceA = aVar2.f47865a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e10) {
                                throw e10;
                            }
                        } catch (ExecutionException e11) {
                            throw new RuntimeException(e11);
                        }
                    } catch (InterruptedException unused2) {
                        cVar.f47844b.post(new b(cVar.f47843a, -3));
                    }
                }
            } else {
                C0893v<String, Typeface> c0893v2 = j.f47861a;
                String str4 = eVar2.f47850e + "-" + i12;
                Typeface typefaceC2 = j.f47861a.c(str4);
                if (typefaceC2 != null) {
                    handler.post(new p283x0.a(aVar, typefaceC2));
                    typefaceA = typefaceC2;
                } else {
                    g gVar = new g(cVar);
                    synchronized (j.f47863c) {
                        try {
                            X<String, ArrayList<A0.a<j.a>>> x10 = j.f47864d;
                            ArrayList<A0.a<j.a>> arrayList = x10.get(str4);
                            if (arrayList != null) {
                                arrayList.add(gVar);
                            } else {
                                ArrayList<A0.a<j.a>> arrayList2 = new ArrayList<>();
                                arrayList2.add(gVar);
                                x10.put(str4, arrayList2);
                                p283x0.h hVar = new p283x0.h(str4, context, eVar2, i12);
                                ThreadPoolExecutor threadPoolExecutor = j.f47862b;
                                i iVar = new i(str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                n nVar = new n();
                                nVar.f47877b = hVar;
                                nVar.f47878c = iVar;
                                nVar.f47879d = handler2;
                                threadPoolExecutor.execute(nVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            typefaceA = f46858a.a(context, (r0.e.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    new Handler(Looper.getMainLooper()).post(new h(eVar, i13, typefaceA));
                } else {
                    eVar.a(-3);
                }
            }
        }
        if (typefaceA != null) {
            f46859b.d(b(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
