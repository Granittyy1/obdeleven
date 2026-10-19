package coil.fetch;

import A8.p;
import D2.V;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import coil.decode.y;
import coil.network.HttpException;
import coil.request.CachePolicy;
import coil.util.o;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.m;
import kotlin.text.n;
import kotlinx.coroutines.C2693i;
import okhttp3.A;
import okhttp3.C2753d;
import okhttp3.InterfaceC2754e;
import okhttp3.r;
import okhttp3.u;
import okhttp3.z;
import p318zb.B;
import p318zb.C;
import p318zb.v;

/* JADX INFO: compiled from: HttpUriFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HttpUriFetcher implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2753d f22963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2753d f22964g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final coil.request.k f22966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p293xa.g<InterfaceC2754e.a> f22967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p293xa.g<coil.disk.a> f22968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22969e;

    /* JADX INFO: compiled from: HttpUriFetcher.kt */
    public static final class a implements h.a<Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p293xa.g<InterfaceC2754e.a> f22970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p293xa.g<coil.disk.a> f22971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22972c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p293xa.g<? extends InterfaceC2754e.a> gVar, p293xa.g<? extends coil.disk.a> gVar2, boolean z10) {
            this.f22970a = gVar;
            this.f22971b = gVar2;
            this.f22972c = z10;
        }

        @Override // coil.fetch.h.a
        public final h a(Object obj, coil.request.k kVar) {
            Uri uri = (Uri) obj;
            if (kotlin.jvm.internal.i.a(uri.getScheme(), "http") || kotlin.jvm.internal.i.a(uri.getScheme(), "https")) {
                return new HttpUriFetcher(uri.toString(), kVar, this.f22970a, this.f22971b, this.f22972c);
            }
            return null;
        }
    }

    static {
        C2753d.a aVar = new C2753d.a();
        aVar.f45349a = true;
        aVar.f45350b = true;
        f22963f = aVar.a();
        C2753d.a aVar2 = new C2753d.a();
        aVar2.f45349a = true;
        aVar2.f45352d = true;
        f22964g = aVar2.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpUriFetcher(String str, coil.request.k kVar, p293xa.g<? extends InterfaceC2754e.a> gVar, p293xa.g<? extends coil.disk.a> gVar2, boolean z10) {
        this.f22965a = str;
        this.f22966b = kVar;
        this.f22967c = gVar;
        this.f22968d = gVar2;
        this.f22969e = z10;
    }

    public static String d(String str, r rVar) {
        String strB;
        String str2 = rVar != null ? rVar.f45590a : null;
        if ((str2 == null || m.I(str2, "text/plain", false)) && (strB = coil.util.k.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return n.m0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fa A[Catch: Exception -> 0x01f7, TryCatch #3 {Exception -> 0x01f7, blocks: (B:97:0x01f3, B:98:0x01f6, B:61:0x012f, B:101:0x01fa, B:102:0x01ff), top: B:111:0x012f }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0202  */
    /* JADX WARN: Code duplicated, block: B:112:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0143 A[Catch: Exception -> 0x0167, TRY_ENTER, TryCatch #4 {Exception -> 0x0167, blocks: (B:87:0x01b9, B:89:0x01bf, B:91:0x01e4, B:93:0x01e9, B:92:0x01e7, B:95:0x01ed, B:96:0x01f2, B:63:0x0137, B:66:0x0143, B:68:0x014f, B:70:0x015d, B:74:0x0169, B:76:0x0175, B:78:0x0195, B:80:0x019a, B:79:0x0198, B:82:0x019e), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x014f A[Catch: Exception -> 0x0167, TryCatch #4 {Exception -> 0x0167, blocks: (B:87:0x01b9, B:89:0x01bf, B:91:0x01e4, B:93:0x01e9, B:92:0x01e7, B:95:0x01ed, B:96:0x01f2, B:63:0x0137, B:66:0x0143, B:68:0x014f, B:70:0x015d, B:74:0x0169, B:76:0x0175, B:78:0x0195, B:80:0x019a, B:79:0x0198, B:82:0x019e), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0169 A[Catch: Exception -> 0x0167, TryCatch #4 {Exception -> 0x0167, blocks: (B:87:0x01b9, B:89:0x01bf, B:91:0x01e4, B:93:0x01e9, B:92:0x01e7, B:95:0x01ed, B:96:0x01f2, B:63:0x0137, B:66:0x0143, B:68:0x014f, B:70:0x015d, B:74:0x0169, B:76:0x0175, B:78:0x0195, B:80:0x019a, B:79:0x0198, B:82:0x019e), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0175 A[Catch: Exception -> 0x0167, TryCatch #4 {Exception -> 0x0167, blocks: (B:87:0x01b9, B:89:0x01bf, B:91:0x01e4, B:93:0x01e9, B:92:0x01e7, B:95:0x01ed, B:96:0x01f2, B:63:0x0137, B:66:0x0143, B:68:0x014f, B:70:0x015d, B:74:0x0169, B:76:0x0175, B:78:0x0195, B:80:0x019a, B:79:0x0198, B:82:0x019e), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0195 A[Catch: Exception -> 0x0167, TryCatch #4 {Exception -> 0x0167, blocks: (B:87:0x01b9, B:89:0x01bf, B:91:0x01e4, B:93:0x01e9, B:92:0x01e7, B:95:0x01ed, B:96:0x01f2, B:63:0x0137, B:66:0x0143, B:68:0x014f, B:70:0x015d, B:74:0x0169, B:76:0x0175, B:78:0x0195, B:80:0x019a, B:79:0x0198, B:82:0x019e), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0198 A[Catch: Exception -> 0x0167, TryCatch #4 {Exception -> 0x0167, blocks: (B:87:0x01b9, B:89:0x01bf, B:91:0x01e4, B:93:0x01e9, B:92:0x01e7, B:95:0x01ed, B:96:0x01f2, B:63:0x0137, B:66:0x0143, B:68:0x014f, B:70:0x015d, B:74:0x0169, B:76:0x0175, B:78:0x0195, B:80:0x019a, B:79:0x0198, B:82:0x019e), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code duplicated, block: B:82:0x019e A[Catch: Exception -> 0x0167, TRY_LEAVE, TryCatch #4 {Exception -> 0x0167, blocks: (B:87:0x01b9, B:89:0x01bf, B:91:0x01e4, B:93:0x01e9, B:92:0x01e7, B:95:0x01ed, B:96:0x01f2, B:63:0x0137, B:66:0x0143, B:68:0x014f, B:70:0x015d, B:74:0x0169, B:76:0x0175, B:78:0x0195, B:80:0x019a, B:79:0x0198, B:82:0x019e), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bf A[Catch: Exception -> 0x0167, TryCatch #4 {Exception -> 0x0167, blocks: (B:87:0x01b9, B:89:0x01bf, B:91:0x01e4, B:93:0x01e9, B:92:0x01e7, B:95:0x01ed, B:96:0x01f2, B:63:0x0137, B:66:0x0143, B:68:0x014f, B:70:0x015d, B:74:0x0169, B:76:0x0175, B:78:0x0195, B:80:0x019a, B:79:0x0198, B:82:0x019e), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4 A[Catch: Exception -> 0x0167, TryCatch #4 {Exception -> 0x0167, blocks: (B:87:0x01b9, B:89:0x01bf, B:91:0x01e4, B:93:0x01e9, B:92:0x01e7, B:95:0x01ed, B:96:0x01f2, B:63:0x0137, B:66:0x0143, B:68:0x014f, B:70:0x015d, B:74:0x0169, B:76:0x0175, B:78:0x0195, B:80:0x019a, B:79:0x0198, B:82:0x019e), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7 A[Catch: Exception -> 0x0167, TryCatch #4 {Exception -> 0x0167, blocks: (B:87:0x01b9, B:89:0x01bf, B:91:0x01e4, B:93:0x01e9, B:92:0x01e7, B:95:0x01ed, B:96:0x01f2, B:63:0x0137, B:66:0x0143, B:68:0x014f, B:70:0x015d, B:74:0x0169, B:76:0x0175, B:78:0x0195, B:80:0x019a, B:79:0x0198, B:82:0x019e), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ed A[Catch: Exception -> 0x0167, TryCatch #4 {Exception -> 0x0167, blocks: (B:87:0x01b9, B:89:0x01bf, B:91:0x01e4, B:93:0x01e9, B:92:0x01e7, B:95:0x01ed, B:96:0x01f2, B:63:0x0137, B:66:0x0143, B:68:0x014f, B:70:0x015d, B:74:0x0169, B:76:0x0175, B:78:0x0195, B:80:0x019a, B:79:0x0198, B:82:0x019e), top: B:112:0x0137 }] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, xa.g] */
    @Override // coil.fetch.h
    public final Object a(kotlin.coroutines.c<? super g> cVar) throws Exception {
        HttpUriFetcher$fetch$1 httpUriFetcher$fetch$1;
        coil.disk.d.b bVarB;
        coil.disk.a.b bVar;
        Exception e10;
        Y2.d dVarA;
        HttpUriFetcher httpUriFetcher;
        coil.disk.a.b bVar2;
        Y2.d dVar;
        Y2.c cVar2;
        coil.disk.a value;
        z zVar;
        A a10;
        z zVar2;
        Exception e11;
        coil.disk.a.b bVarH;
        String str;
        Object objB;
        HttpUriFetcher httpUriFetcher2;
        DataSource dataSource;
        z zVar3;
        A a11;
        DataSource dataSource2;
        if (cVar instanceof HttpUriFetcher$fetch$1) {
            httpUriFetcher$fetch$1 = (HttpUriFetcher$fetch$1) cVar;
            int i10 = httpUriFetcher$fetch$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                httpUriFetcher$fetch$1.label = i10 - Integer.MIN_VALUE;
            } else {
                httpUriFetcher$fetch$1 = new HttpUriFetcher$fetch$1(this, (ContinuationImpl) cVar);
            }
        } else {
            httpUriFetcher$fetch$1 = new HttpUriFetcher$fetch$1(this, (ContinuationImpl) cVar);
        }
        Object obj = httpUriFetcher$fetch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = httpUriFetcher$fetch$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zVar2 = (z) httpUriFetcher$fetch$1.L$2;
                httpUriFetcher2 = (HttpUriFetcher) httpUriFetcher$fetch$1.L$0;
                try {
                    kotlin.b.b(obj);
                    zVar3 = (z) obj;
                    Bitmap.Config[] configArr = coil.util.k.f23160a;
                    a11 = zVar3.f45686h;
                    if (a11 == null) {
                        throw new IllegalStateException("response body == null");
                    }
                    httpUriFetcher2.getClass();
                    coil.decode.A a12 = new coil.decode.A(a11.h(), new y(0, httpUriFetcher2.f22966b.f23098a), null);
                    String strD = d(httpUriFetcher2.f22965a, a11.c());
                    if (zVar3.f45687i != null) {
                        dataSource2 = DataSource.f22860e;
                    } else {
                        dataSource2 = DataSource.f22859d;
                    }
                    return new l(a12, strD, dataSource2);
                } catch (Exception e12) {
                    e11 = e12;
                    coil.util.k.a(zVar2);
                    throw e11;
                }
            }
            Y2.d dVar2 = (Y2.d) httpUriFetcher$fetch$1.L$2;
            bVar = (coil.disk.a.b) httpUriFetcher$fetch$1.L$1;
            httpUriFetcher = (HttpUriFetcher) httpUriFetcher$fetch$1.L$0;
            try {
                kotlin.b.b(obj);
                dVar = dVar2;
                bVar2 = bVar;
                try {
                    zVar = (z) obj;
                    Bitmap.Config[] configArr2 = coil.util.k.f23160a;
                    a10 = zVar.f45686h;
                    if (a10 != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    try {
                        bVarH = httpUriFetcher.h(bVar2, dVar.f7582a, zVar, dVar.f7583b);
                        str = httpUriFetcher.f22965a;
                        if (bVarH != null) {
                            coil.decode.i iVarG = httpUriFetcher.g(bVarH);
                            Y2.c cVarF = httpUriFetcher.f(bVarH);
                            return new l(iVarG, d(str, cVarF != null ? (r) cVarF.f7577b.getValue() : null), DataSource.f22860e);
                        }
                        if (a10.h().g(1L)) {
                            coil.decode.A a13 = new coil.decode.A(a10.h(), new y(0, httpUriFetcher.f22966b.f23098a), null);
                            String strD2 = d(str, a10.c());
                            if (zVar.f45687i != null) {
                                dataSource = DataSource.f22860e;
                            } else {
                                dataSource = DataSource.f22859d;
                            }
                            return new l(a13, strD2, dataSource);
                        }
                        coil.util.k.a(zVar);
                        u uVarE = httpUriFetcher.e();
                        httpUriFetcher$fetch$1.L$0 = httpUriFetcher;
                        httpUriFetcher$fetch$1.L$1 = bVarH;
                        httpUriFetcher$fetch$1.L$2 = zVar;
                        httpUriFetcher$fetch$1.label = 2;
                        objB = httpUriFetcher.b(uVarE, httpUriFetcher$fetch$1);
                        if (objB == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        zVar2 = zVar;
                        obj = objB;
                        httpUriFetcher2 = httpUriFetcher;
                        zVar3 = (z) obj;
                        Bitmap.Config[] configArr3 = coil.util.k.f23160a;
                        a11 = zVar3.f45686h;
                        if (a11 == null) {
                            throw new IllegalStateException("response body == null");
                        }
                        httpUriFetcher2.getClass();
                        coil.decode.A a14 = new coil.decode.A(a11.h(), new y(0, httpUriFetcher2.f22966b.f23098a), null);
                        String strD3 = d(httpUriFetcher2.f22965a, a11.c());
                        if (zVar3.f45687i != null) {
                            dataSource2 = DataSource.f22860e;
                        } else {
                            dataSource2 = DataSource.f22859d;
                        }
                        return new l(a14, strD3, dataSource2);
                    } catch (Exception e13) {
                        zVar2 = zVar;
                        e11 = e13;
                        coil.util.k.a(zVar2);
                        throw e11;
                    }
                } catch (Exception e14) {
                    e10 = e14;
                    bVar = bVar2;
                    if (bVar != null) {
                        coil.util.k.a(bVar);
                    }
                    throw e10;
                }
            } catch (Exception e15) {
                e10 = e15;
                if (bVar != null) {
                    coil.util.k.a(bVar);
                }
                throw e10;
            }
        }
        kotlin.b.b(obj);
        coil.request.k kVar = this.f22966b;
        boolean zA = kVar.f23110n.a();
        String str2 = this.f22965a;
        if (!zA || (value = this.f22968d.getValue()) == null) {
            bVarB = null;
        } else {
            String str3 = kVar.f23106i;
            if (str3 == null) {
                str3 = str2;
            }
            bVarB = value.b(str3);
        }
        try {
            if (bVarB != null) {
                Long l10 = c().e(bVarB.L()).f49096d;
                if (l10 != null && l10.longValue() == 0) {
                    return new l(g(bVarB), d(str2, null), DataSource.f22859d);
                }
                if (!this.f22969e) {
                    coil.decode.i iVarG2 = g(bVarB);
                    Y2.c cVarF2 = f(bVarB);
                    return new l(iVarG2, d(str2, cVarF2 != null ? (r) cVarF2.f7577b.getValue() : null), DataSource.f22859d);
                }
                dVarA = new Y2.d.b(e(), f(bVarB)).a();
                if (dVarA.f7582a == null && (cVar2 = dVarA.f7583b) != null) {
                    return new l(g(bVarB), d(str2, (r) cVar2.f7577b.getValue()), DataSource.f22859d);
                }
            } else {
                dVarA = new Y2.d.b(e(), null).a();
            }
            u uVar = dVarA.f7582a;
            kotlin.jvm.internal.i.b(uVar);
            httpUriFetcher$fetch$1.L$0 = this;
            httpUriFetcher$fetch$1.L$1 = bVarB;
            httpUriFetcher$fetch$1.L$2 = dVarA;
            httpUriFetcher$fetch$1.label = 1;
            Object objB2 = b(uVar, httpUriFetcher$fetch$1);
            if (objB2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            httpUriFetcher = this;
            Y2.d dVar3 = dVarA;
            bVar2 = bVarB;
            obj = objB2;
            dVar = dVar3;
            zVar = (z) obj;
            Bitmap.Config[] configArr4 = coil.util.k.f23160a;
            a10 = zVar.f45686h;
            if (a10 != null) {
                throw new IllegalStateException("response body == null");
            }
            bVarH = httpUriFetcher.h(bVar2, dVar.f7582a, zVar, dVar.f7583b);
            str = httpUriFetcher.f22965a;
            if (bVarH != null) {
                coil.decode.i iVarG3 = httpUriFetcher.g(bVarH);
                Y2.c cVarF3 = httpUriFetcher.f(bVarH);
                return new l(iVarG3, d(str, cVarF3 != null ? (r) cVarF3.f7577b.getValue() : null), DataSource.f22860e);
            }
            if (a10.h().g(1L)) {
                coil.decode.A a15 = new coil.decode.A(a10.h(), new y(0, httpUriFetcher.f22966b.f23098a), null);
                String strD4 = d(str, a10.c());
                if (zVar.f45687i != null) {
                    dataSource = DataSource.f22860e;
                } else {
                    dataSource = DataSource.f22859d;
                }
                return new l(a15, strD4, dataSource);
            }
            coil.util.k.a(zVar);
            u uVarE2 = httpUriFetcher.e();
            httpUriFetcher$fetch$1.L$0 = httpUriFetcher;
            httpUriFetcher$fetch$1.L$1 = bVarH;
            httpUriFetcher$fetch$1.L$2 = zVar;
            httpUriFetcher$fetch$1.label = 2;
            objB = httpUriFetcher.b(uVarE2, httpUriFetcher$fetch$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            zVar2 = zVar;
            obj = objB;
            httpUriFetcher2 = httpUriFetcher;
            zVar3 = (z) obj;
            Bitmap.Config[] configArr5 = coil.util.k.f23160a;
            a11 = zVar3.f45686h;
            if (a11 == null) {
                throw new IllegalStateException("response body == null");
            }
            httpUriFetcher2.getClass();
            coil.decode.A a16 = new coil.decode.A(a11.h(), new y(0, httpUriFetcher2.f22966b.f23098a), null);
            String strD5 = d(httpUriFetcher2.f22965a, a11.c());
            if (zVar3.f45687i != null) {
                dataSource2 = DataSource.f22860e;
            } else {
                dataSource2 = DataSource.f22859d;
            }
            return new l(a16, strD5, dataSource2);
        } catch (Exception e16) {
            bVar = bVarB;
            e10 = e16;
            if (bVar != null) {
                coil.util.k.a(bVar);
            }
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(u uVar, ContinuationImpl continuationImpl) throws IOException {
        HttpUriFetcher$executeNetworkRequest$1 httpUriFetcher$executeNetworkRequest$1;
        z zVarExecute;
        if (continuationImpl instanceof HttpUriFetcher$executeNetworkRequest$1) {
            httpUriFetcher$executeNetworkRequest$1 = (HttpUriFetcher$executeNetworkRequest$1) continuationImpl;
            int i10 = httpUriFetcher$executeNetworkRequest$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                httpUriFetcher$executeNetworkRequest$1.label = i10 - Integer.MIN_VALUE;
            } else {
                httpUriFetcher$executeNetworkRequest$1 = new HttpUriFetcher$executeNetworkRequest$1(this, continuationImpl);
            }
        } else {
            httpUriFetcher$executeNetworkRequest$1 = new HttpUriFetcher$executeNetworkRequest$1(this, continuationImpl);
        }
        Object objP = httpUriFetcher$executeNetworkRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = httpUriFetcher$executeNetworkRequest$1.label;
        if (i11 == 0) {
            kotlin.b.b(objP);
            Bitmap.Config[] configArr = coil.util.k.f23160a;
            boolean zA = kotlin.jvm.internal.i.a(Looper.myLooper(), Looper.getMainLooper());
            p293xa.g<InterfaceC2754e.a> gVar = this.f22967c;
            if (!zA) {
                okhttp3.internal.connection.e eVarA = gVar.getValue().a(uVar);
                httpUriFetcher$executeNetworkRequest$1.label = 1;
                C2693i c2693i = new C2693i(1, p.y(httpUriFetcher$executeNetworkRequest$1));
                c2693i.s();
                o oVar = new o(eVarA, c2693i);
                FirebasePerfOkHttpClient.enqueue(eVarA, oVar);
                c2693i.u(oVar);
                objP = c2693i.p();
                if (objP == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (this.f22966b.f23111o.a()) {
                    throw new NetworkOnMainThreadException();
                }
                zVarExecute = FirebasePerfOkHttpClient.execute(gVar.getValue().a(uVar));
            }
            if (!zVarExecute.h() || zVarExecute.f45683e == 304) {
                return zVarExecute;
            }
            A a10 = zVarExecute.f45686h;
            if (a10 != null) {
                coil.util.k.a(a10);
            }
            throw new HttpException(zVarExecute);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(objP);
        zVarExecute = (z) objP;
        if (zVarExecute.h()) {
        }
        return zVarExecute;
    }

    public final p318zb.l c() {
        coil.disk.a value = this.f22968d.getValue();
        kotlin.jvm.internal.i.b(value);
        return value.c();
    }

    public final u e() {
        u.a aVar = new u.a();
        aVar.g(this.f22965a);
        coil.request.k kVar = this.f22966b;
        aVar.d(kVar.j);
        for (Map.Entry<Class<?>, Object> entry : kVar.f23107k.f23128a.entrySet()) {
            Class<?> key = entry.getKey();
            kotlin.jvm.internal.i.c(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            aVar.f(key, entry.getValue());
        }
        CachePolicy cachePolicy = kVar.f23110n;
        boolean zA = cachePolicy.a();
        boolean zA2 = kVar.f23111o.a();
        if (!zA2 && zA) {
            aVar.b(C2753d.f45336o);
        } else if (!zA2 || zA) {
            if (!zA2 && !zA) {
                aVar.b(f22964g);
            }
        } else if (cachePolicy.b()) {
            aVar.b(C2753d.f45335n);
        } else {
            aVar.b(f22963f);
        }
        return aVar.a();
    }

    public final Y2.c f(coil.disk.a.b bVar) throws Throwable {
        Throwable th;
        Y2.c cVar;
        try {
            C cB = v.b(c().i(bVar.L()));
            try {
                cVar = new Y2.c(cB);
                try {
                    cB.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    cB.close();
                } catch (Throwable th4) {
                    V.e(th3, th4);
                }
                th = th3;
                cVar = null;
            }
            if (th == null) {
                return cVar;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public final coil.decode.i g(coil.disk.a.b bVar) {
        p318zb.z data = bVar.getData();
        p318zb.l lVarC = c();
        String str = this.f22966b.f23106i;
        if (str == null) {
            str = this.f22965a;
        }
        return new coil.decode.i(data, lVarC, str, bVar);
    }

    public final coil.disk.a.b h(coil.disk.a.b bVar, u uVar, z zVar, Y2.c cVar) {
        coil.disk.d.a aVarA;
        Throwable th;
        coil.request.k kVar = this.f22966b;
        Throwable th2 = null;
        if (kVar.f23110n.b()) {
            boolean z10 = this.f22969e;
            okhttp3.o oVar = zVar.f45685g;
            if (!z10 || (!uVar.a().f45338b && !zVar.b().f45338b && !kotlin.jvm.internal.i.a(oVar.e("Vary"), "*"))) {
                if (bVar != null) {
                    aVarA = bVar.V();
                } else {
                    coil.disk.a value = this.f22968d.getValue();
                    if (value != null) {
                        String str = kVar.f23106i;
                        if (str == null) {
                            str = this.f22965a;
                        }
                        aVarA = value.a(str);
                    } else {
                        aVarA = null;
                    }
                }
                try {
                    if (aVarA == null) {
                        return null;
                    }
                    try {
                        if (zVar.f45683e != 304 || cVar == null) {
                            B bA = v.a(c().h(aVarA.b()));
                            try {
                                new Y2.c(zVar).a(bA);
                                p293xa.r rVar = p293xa.r.f47939a;
                                try {
                                    bA.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                try {
                                    bA.close();
                                } catch (Throwable th5) {
                                    V.e(th4, th5);
                                }
                                th = th4;
                            }
                            if (th != null) {
                                throw th;
                            }
                            B bA2 = v.a(c().h(aVarA.f22956a.b(1)));
                            try {
                                A a10 = zVar.f45686h;
                                kotlin.jvm.internal.i.b(a10);
                                a10.h().o(bA2);
                                try {
                                    bA2.close();
                                } catch (Throwable th6) {
                                    th2 = th6;
                                }
                            } catch (Throwable th7) {
                                th2 = th7;
                                try {
                                    bA2.close();
                                } catch (Throwable th8) {
                                    V.e(th2, th8);
                                }
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        } else {
                            z.a aVarI = zVar.i();
                            aVarI.c(Y2.d.a.a(cVar.f7581f, oVar));
                            z zVarA = aVarI.a();
                            B bA3 = v.a(c().h(aVarA.b()));
                            try {
                                new Y2.c(zVarA).a(bA3);
                                p293xa.r rVar2 = p293xa.r.f47939a;
                                try {
                                    bA3.close();
                                } catch (Throwable th9) {
                                    th2 = th9;
                                }
                            } catch (Throwable th10) {
                                th2 = th10;
                                try {
                                    bA3.close();
                                } catch (Throwable th11) {
                                    V.e(th2, th11);
                                }
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        coil.disk.d.b bVarA = aVarA.a();
                        coil.util.k.a(zVar);
                        return bVarA;
                    } catch (Exception e10) {
                        Bitmap.Config[] configArr = coil.util.k.f23160a;
                        try {
                            aVarA.f22956a.a(false);
                        } catch (Exception unused) {
                        }
                        throw e10;
                    }
                } catch (Throwable th12) {
                    coil.util.k.a(zVar);
                    throw th12;
                }
            }
        }
        if (bVar != null) {
            coil.util.k.a(bVar);
        }
        return null;
    }
}
