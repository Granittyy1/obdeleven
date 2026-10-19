package A1;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p091h2.C2201a;
import p091h2.C2203c;
import p091h2.C2205e;
import p091h2.C2207g;

/* JADX INFO: renamed from: A1.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultExtractorsFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0577l implements t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f529f = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f530g = new a(new C0575j(0));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f531h = new a(new C0576k(0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImmutableList<p078g1.n> f532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public X1.e f534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f535e;

    /* JADX INFO: renamed from: A1.l$a */
    /* JADX INFO: compiled from: DefaultExtractorsFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0002a f536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f537b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: A1.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DefaultExtractorsFactory.java */
        public interface InterfaceC0002a {
            Constructor<? extends p> a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public a(InterfaceC0002a interfaceC0002a) {
            this.f536a = interfaceC0002a;
        }

        public final p a(Object... objArr) {
            Constructor<? extends p> constructorA;
            synchronized (this.f537b) {
                if (!this.f537b.get()) {
                    try {
                        constructorA = this.f536a.a();
                    } catch (ClassNotFoundException unused) {
                        this.f537b.set(true);
                        constructorA = null;
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating extension", e10);
                    }
                }
                constructorA = null;
            }
            if (constructorA == null) {
                return null;
            }
            try {
                return constructorA.newInstance(objArr);
            } catch (Exception e11) {
                throw new IllegalStateException("Unexpected error creating extractor", e11);
            }
        }
    }

    public final void a(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new C2201a());
                break;
            case 1:
                arrayList.add(new C2203c());
                break;
            case 2:
                arrayList.add(new C2205e());
                break;
            case 3:
                arrayList.add(new B1.b());
                break;
            case 4:
                p pVarA = f530g.a(0);
                if (pVarA == null) {
                    arrayList.add(new F1.c());
                } else {
                    arrayList.add(pVarA);
                }
                break;
            case 5:
                arrayList.add(new G1.a());
                break;
            case 6:
                arrayList.add(new S1.b(this.f534d, this.f533c ? 0 : 2));
                break;
            case 7:
                arrayList.add(new T1.d(0));
                break;
            case 8:
                arrayList.add(new U1.c(this.f534d, this.f533c ? 0 : 32));
                arrayList.add(new U1.g(this.f534d, this.f533c ? 0 : 16));
                break;
            case 9:
                arrayList.add(new V1.c());
                break;
            case 10:
                arrayList.add(new p091h2.y());
                break;
            case 11:
                if (this.f532b == null) {
                    this.f532b = ImmutableList.K();
                }
                arrayList.add(new p091h2.E(!this.f533c ? 1 : 0, this.f534d, new p114j1.w(0L), new C2207g(this.f532b)));
                break;
            case 12:
                arrayList.add(new p103i2.a());
                break;
            case 14:
                arrayList.add(new I1.a(this.f535e));
                break;
            case 15:
                p pVarA2 = f531h.a(new Object[0]);
                if (pVarA2 != null) {
                    arrayList.add(pVarA2);
                }
                break;
            case 16:
                arrayList.add(new C1.b(!this.f533c ? 1 : 0, this.f534d));
                break;
            case 17:
                arrayList.add(new W1.a());
                break;
            case 18:
                arrayList.add(new p115j2.a());
                break;
            case 19:
                arrayList.add(new E1.a());
                break;
            case 20:
                arrayList.add(new H1.a());
                break;
            case 21:
                arrayList.add(new D1.a());
                break;
        }
    }

    @Override // A1.t
    public final synchronized p[] c() {
        return d(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    @Override // A1.t
    public final synchronized p[] d(Uri uri, Map<String, List<String>> map) {
        p[] pVarArr;
        int i10 = 14;
        synchronized (this) {
            try {
                int[] iArr = f529f;
                ArrayList arrayList = new ArrayList(21);
                List<String> list = map.get("Content-Type");
                String str = (list == null || list.isEmpty()) ? null : list.get(0);
                if (str != null) {
                    String strM = p078g1.t.m(str);
                    strM.getClass();
                    switch (strM) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/eac3":
                            i10 = 0;
                            break;
                        case "video/mp2p":
                            i10 = 10;
                            break;
                        case "video/mp2t":
                            i10 = 11;
                            break;
                        case "video/webm":
                        case "audio/x-matroska":
                        case "application/webm":
                        case "audio/webm":
                        case "video/x-matroska":
                            i10 = 6;
                            break;
                        case "audio/amr-wb":
                        case "audio/amr":
                        case "audio/3gpp":
                            i10 = 3;
                            break;
                        case "image/avif":
                            i10 = 21;
                            break;
                        case "image/heic":
                        case "image/heif":
                            i10 = 20;
                            break;
                        case "image/jpeg":
                            break;
                        case "image/webp":
                            i10 = 18;
                            break;
                        case "application/mp4":
                        case "audio/mp4":
                        case "video/mp4":
                            i10 = 8;
                            break;
                        case "video/x-msvideo":
                            i10 = 16;
                            break;
                        case "text/vtt":
                            i10 = 13;
                            break;
                        case "image/bmp":
                            i10 = 19;
                            break;
                        case "image/png":
                            i10 = 17;
                            break;
                        case "video/x-flv":
                            i10 = 5;
                            break;
                        case "audio/ac4":
                            i10 = 1;
                            break;
                        case "audio/ogg":
                            i10 = 9;
                            break;
                        case "audio/wav":
                            i10 = 12;
                            break;
                        case "audio/flac":
                            i10 = 4;
                            break;
                        case "audio/midi":
                            i10 = 15;
                            break;
                        case "audio/mpeg":
                            i10 = 7;
                            break;
                        default:
                            i10 = -1;
                            break;
                    }
                } else {
                    i10 = -1;
                }
                if (i10 != -1) {
                    a(i10, arrayList);
                }
                int iH = I.e.h(uri);
                if (iH != -1 && iH != i10) {
                    a(iH, arrayList);
                }
                for (int i11 = 0; i11 < 21; i11++) {
                    int i12 = iArr[i11];
                    if (i12 != i10 && i12 != iH) {
                        a(i12, arrayList);
                    }
                }
                pVarArr = (p[]) arrayList.toArray(new p[arrayList.size()]);
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVarArr;
    }
}
