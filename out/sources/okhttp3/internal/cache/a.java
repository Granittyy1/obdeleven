package okhttp3.internal.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.m;
import okhttp3.A;
import okhttp3.C2752c;
import okhttp3.C2752c.d;
import okhttp3.C2753d;
import okhttp3.Protocol;
import okhttp3.o;
import okhttp3.p;
import okhttp3.q;
import okhttp3.u;
import okhttp3.z;
import p197pb.g;
import p318zb.H;
import p318zb.v;

/* JADX INFO: compiled from: CacheInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2752c f45432a;

    /* JADX INFO: renamed from: okhttp3.internal.cache.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheInterceptor.kt */
    public static final class C0516a {
        public static final z a(z zVar) {
            if ((zVar != null ? zVar.f45686h : null) == null) {
                return zVar;
            }
            z.a aVarI = zVar.i();
            aVarI.f45699g = null;
            return aVarI.a();
        }

        public static boolean b(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    public a(C2752c c2752c) {
        this.f45432a = c2752c;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0267  */
    /* JADX WARN: Code duplicated, block: B:107:0x0276  */
    /* JADX WARN: Code duplicated, block: B:108:0x027e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0292  */
    /* JADX WARN: Code duplicated, block: B:118:0x0298  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:131:0x02da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:136:0x0308  */
    /* JADX WARN: Code duplicated, block: B:145:0x0337  */
    /* JADX WARN: Code duplicated, block: B:146:0x0338 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:148:0x033b  */
    /* JADX WARN: Code duplicated, block: B:149:0x033e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0345  */
    /* JADX WARN: Code duplicated, block: B:166:0x0393  */
    /* JADX WARN: Code duplicated, block: B:168:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:175:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:177:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:179:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:196:0x042e  */
    /* JADX WARN: Code duplicated, block: B:200:0x043b  */
    /* JADX WARN: Code duplicated, block: B:213:0x049f A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:225:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:227:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:230:0x0501  */
    /* JADX WARN: Code duplicated, block: B:247:0x054c  */
    /* JADX WARN: Code duplicated, block: B:264:0x058b  */
    /* JADX WARN: Code duplicated, block: B:266:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:294:0x04c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x05f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [okhttp3.u, okhttp3.z] */
    @Override // okhttp3.q
    public final z intercept(q.a aVar) throws IOException {
        z zVar;
        int iY;
        long time;
        long time2;
        Date dateA;
        Date dateA2;
        Date dateA3;
        String str;
        String str2;
        String str3;
        boolean z10;
        u uVar;
        ?? r10;
        c cVar;
        int i10;
        long jMax;
        long millis;
        long jMin;
        String string;
        long time3;
        int i11;
        int i12;
        long millis2;
        String str4;
        String str5;
        long j;
        z.a aVarI;
        int i13;
        u uVar2;
        z zVar2;
        C2752c c2752c;
        okhttp3.internal.connection.e eVar;
        Object obj;
        okhttp3.internal.connection.e call;
        A a10;
        z zVarA;
        z zVarA2;
        String method;
        C2752c.d dVar;
        DiskLruCache.Editor editorH;
        A a11;
        o oVar;
        o oVar2;
        o.a aVar2;
        int size;
        int i14;
        int i15;
        int size2;
        C2752c c2752c2;
        C2752c.C0515c c0515c;
        DiskLruCache.Editor editorH2;
        String strK;
        String strK2;
        String strV;
        A a12;
        z zVarA3;
        p197pb.f fVar = (p197pb.f) aVar;
        okhttp3.internal.connection.e call2 = fVar.f45943a;
        C2752c c2752c3 = this.f45432a;
        if (c2752c3 != null) {
            u request = fVar.f45947e;
            i.e(request, "request");
            p pVar = request.f45661a;
            try {
                DiskLruCache.b bVarI = c2752c3.f45311b.i(C2752c.b.a(pVar));
                if (bVarI == null) {
                    zVarA3 = null;
                } else {
                    try {
                        C2752c.C0515c c0515c2 = new C2752c.C0515c((H) bVarI.f45430d.get(0));
                        o oVar3 = c0515c2.f45320b;
                        String str6 = c0515c2.f45321c;
                        p url = c0515c2.f45319a;
                        o oVar4 = c0515c2.f45325g;
                        String strE = oVar4.e("Content-Type");
                        String strE2 = oVar4.e("Content-Length");
                        u.a aVar3 = new u.a();
                        i.e(url, "url");
                        aVar3.f45667a = url;
                        aVar3.e(str6, null);
                        aVar3.d(oVar3);
                        u uVarA = aVar3.a();
                        z.a aVar4 = new z.a();
                        aVar4.f45693a = uVarA;
                        Protocol protocol = c0515c2.f45322d;
                        i.e(protocol, "protocol");
                        aVar4.f45694b = protocol;
                        aVar4.f45695c = c0515c2.f45323e;
                        String message = c0515c2.f45324f;
                        i.e(message, "message");
                        aVar4.f45696d = message;
                        aVar4.c(oVar4);
                        aVar4.f45699g = new C2752c.a(bVarI, strE, strE2);
                        aVar4.f45697e = c0515c2.f45326h;
                        aVar4.f45702k = c0515c2.f45327i;
                        aVar4.f45703l = c0515c2.j;
                        zVarA3 = aVar4.a();
                        if (url.equals(pVar) && str6.equals(request.f45662b)) {
                            Set setC = C2752c.b.c(zVarA3.f45685g);
                            if (!(setC instanceof Collection) || !setC.isEmpty()) {
                                Iterator it = setC.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str7 = (String) it.next();
                                        if (!i.a(oVar3.A(str7), request.f45663c.A(str7))) {
                                        }
                                    }
                                }
                            }
                        }
                        A a13 = zVarA3.f45686h;
                        if (a13 != null) {
                            p172nb.b.c(a13);
                        }
                    } catch (IOException unused) {
                        p172nb.b.c(bVarI);
                    }
                    zVarA3 = null;
                }
            } catch (IOException unused2) {
            }
            zVar = zVarA3;
        } else {
            zVar = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        u request2 = fVar.f45947e;
        i.e(request2, "request");
        if (zVar != null) {
            time = zVar.f45689l;
            time2 = zVar.f45690m;
            o oVar5 = zVar.f45685g;
            int size3 = oVar5.size();
            int i16 = 0;
            iY = -1;
            dateA = null;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
            while (i16 < size3) {
                String strK3 = oVar5.k(i16);
                int i17 = iY;
                String strV2 = oVar5.v(i16);
                long j10 = time;
                if (m.D(strK3, "Date", true)) {
                    dateA = p197pb.c.a(strV2);
                    str3 = strV2;
                } else if (m.D(strK3, "Expires", true)) {
                    dateA3 = p197pb.c.a(strV2);
                } else if (m.D(strK3, "Last-Modified", true)) {
                    dateA2 = p197pb.c.a(strV2);
                    str2 = strV2;
                } else if (m.D(strK3, "ETag", true)) {
                    str = strV2;
                } else {
                    if (m.D(strK3, "Age", true)) {
                        iY = p172nb.b.y(-1, strV2);
                    }
                    i16++;
                    time = j10;
                }
                iY = i17;
                i16++;
                time = j10;
            }
        } else {
            iY = -1;
            time = 0;
            time2 = 0;
            dateA = null;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        if (zVar != null) {
            z10 = false;
            z10 = false;
            if (!(request2.f45661a.j && zVar.f45684f == null) && c.a.a(request2, zVar)) {
                C2753d c2753dA = request2.a();
                if (!c2753dA.f45337a && request2.f45663c.e("If-Modified-Since") == null && request2.f45663c.e("If-None-Match") == null) {
                    C2753d c2753dB = zVar.b();
                    if (dateA != null) {
                        jMax = Math.max(0L, time2 - dateA.getTime());
                        i10 = -1;
                    } else {
                        i10 = -1;
                        jMax = 0;
                    }
                    if (iY != i10) {
                        jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(iY));
                    }
                    long j11 = jMax + (time2 - time) + (jCurrentTimeMillis - time2);
                    int i18 = zVar.b().f45339c;
                    if (i18 != -1) {
                        time3 = TimeUnit.SECONDS.toMillis(i18);
                    } else {
                        if (dateA3 != null) {
                            if (dateA != null) {
                                time2 = dateA.getTime();
                            }
                            time3 = dateA3.getTime() - time2;
                            if (time3 <= 0) {
                                time3 = 0;
                            }
                        } else if (dateA2 == null) {
                            millis = 0;
                            jMin = millis;
                        } else {
                            ArrayList arrayList = zVar.f45680b.f45661a.f45577g;
                            if (arrayList == null) {
                                string = null;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                p.b.e(arrayList, sb2);
                                string = sb2.toString();
                            }
                            if (string == null) {
                                if (dateA != null) {
                                    time = dateA.getTime();
                                }
                                long time4 = time - dateA2.getTime();
                                millis = 0;
                                if (time4 > 0) {
                                    jMin = time4 / ((long) 10);
                                }
                            } else {
                                millis = 0;
                            }
                            jMin = millis;
                        }
                        i11 = c2753dA.f45339c;
                        if (i11 != -1) {
                            jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i11));
                        }
                        i12 = c2753dA.f45345i;
                        if (i12 != -1) {
                            millis2 = TimeUnit.SECONDS.toMillis(i12);
                        } else {
                            millis2 = millis;
                        }
                        if (!c2753dB.f45343g && (i13 = c2753dA.f45344h) != -1) {
                            millis = TimeUnit.SECONDS.toMillis(i13);
                        }
                        if (c2753dB.f45337a) {
                            if (str != null) {
                                str4 = "If-None-Match";
                                str5 = str;
                            } else if (dateA2 != null) {
                                str4 = "If-Modified-Since";
                                str5 = str2;
                            } else if (dateA != null) {
                                str4 = r8;
                                str5 = str3;
                            } else {
                                uVar = request2;
                                r10 = 0;
                                cVar = new c(uVar, null);
                            }
                            uVar = request2;
                            o.a aVarQ = uVar.f45663c.q();
                            i.b(str5);
                            aVarQ.c(str4, str5);
                            u.a aVarB = uVar.b();
                            aVarB.d(aVarQ.e());
                            cVar = new c(aVarB.a(), zVar);
                            r10 = 0;
                        } else {
                            j = millis2 + j11;
                            if (j < millis + jMin) {
                                aVarI = zVar.i();
                                if (j >= jMin) {
                                    aVarI.f45698f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j11 > 86400000 && zVar.b().f45339c == -1 && dateA3 == null) {
                                    aVarI.f45698f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                cVar = new c(null, aVarI.a());
                                r10 = 0;
                                uVar = request2;
                            } else {
                                if (str != null) {
                                    str4 = "If-None-Match";
                                    str5 = str;
                                } else if (dateA2 != null) {
                                    str4 = "If-Modified-Since";
                                    str5 = str2;
                                } else if (dateA != null) {
                                    str4 = r8;
                                    str5 = str3;
                                } else {
                                    uVar = request2;
                                    r10 = 0;
                                    cVar = new c(uVar, null);
                                }
                                uVar = request2;
                                o.a aVarQ2 = uVar.f45663c.q();
                                i.b(str5);
                                aVarQ2.c(str4, str5);
                                u.a aVarB2 = uVar.b();
                                aVarB2.d(aVarQ2.e());
                                cVar = new c(aVarB2.a(), zVar);
                                r10 = 0;
                            }
                        }
                    }
                    jMin = time3;
                    millis = 0;
                    i11 = c2753dA.f45339c;
                    if (i11 != -1) {
                        jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i11));
                    }
                    i12 = c2753dA.f45345i;
                    if (i12 != -1) {
                        millis2 = TimeUnit.SECONDS.toMillis(i12);
                    } else {
                        millis2 = millis;
                    }
                    if (!c2753dB.f45343g) {
                        millis = TimeUnit.SECONDS.toMillis(i13);
                    }
                    if (c2753dB.f45337a) {
                        j = millis2 + j11;
                        if (j < millis + jMin) {
                            aVarI = zVar.i();
                            if (j >= jMin) {
                                aVarI.f45698f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j11 > 86400000) {
                                aVarI.f45698f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            cVar = new c(null, aVarI.a());
                            r10 = 0;
                            uVar = request2;
                        } else {
                            if (str != null) {
                                str4 = "If-None-Match";
                                str5 = str;
                            } else if (dateA2 != null) {
                                str4 = "If-Modified-Since";
                                str5 = str2;
                            } else if (dateA != null) {
                                str4 = r8;
                                str5 = str3;
                            } else {
                                uVar = request2;
                                r10 = 0;
                                cVar = new c(uVar, null);
                            }
                            uVar = request2;
                            o.a aVarQ3 = uVar.f45663c.q();
                            i.b(str5);
                            aVarQ3.c(str4, str5);
                            u.a aVarB3 = uVar.b();
                            aVarB3.d(aVarQ3.e());
                            cVar = new c(aVarB3.a(), zVar);
                            r10 = 0;
                        }
                    } else {
                        if (str != null) {
                            str4 = "If-None-Match";
                            str5 = str;
                        } else if (dateA2 != null) {
                            str4 = "If-Modified-Since";
                            str5 = str2;
                        } else if (dateA != null) {
                            str4 = r8;
                            str5 = str3;
                        } else {
                            uVar = request2;
                            r10 = 0;
                            cVar = new c(uVar, null);
                        }
                        uVar = request2;
                        o.a aVarQ4 = uVar.f45663c.q();
                        i.b(str5);
                        aVarQ4.c(str4, str5);
                        u.a aVarB4 = uVar.b();
                        aVarB4.d(aVarQ4.e());
                        cVar = new c(aVarB4.a(), zVar);
                        r10 = 0;
                    }
                } else {
                    uVar = request2;
                    fVar = fVar;
                    call2 = call2;
                    r10 = 0;
                    cVar = new c(uVar, null);
                }
            } else {
                cVar = new c(request2, null);
            }
            if (cVar.f45437a != null && uVar.a().j) {
                cVar = new c(r10, r10);
            }
            uVar2 = cVar.f45437a;
            zVar2 = cVar.f45438b;
            c2752c = this.f45432a;
            if (c2752c != null) {
                synchronized (c2752c) {
                }
            }
            if (call2 != null) {
                eVar = call2;
            } else {
                eVar = r10;
            }
            if (eVar != 0 || (obj = eVar.f45481f) == null) {
                obj = okhttp3.m.f45561a;
            }
            if (zVar != null && zVar2 == null && (a12 = zVar.f45686h) != null) {
                p172nb.b.c(a12);
            }
            if (uVar2 != null && zVar2 == null) {
                z.a aVar5 = new z.a();
                u request3 = fVar.f45947e;
                i.e(request3, "request");
                aVar5.f45693a = request3;
                aVar5.f45694b = Protocol.HTTP_1_1;
                aVar5.f45695c = 504;
                aVar5.f45696d = "Unsatisfiable Request (only-if-cached)";
                aVar5.f45699g = p172nb.b.f45028c;
                aVar5.f45702k = -1L;
                aVar5.f45703l = System.currentTimeMillis();
                z zVarA4 = aVar5.a();
                obj.getClass();
                i.e(call2, "call");
                return zVarA4;
            }
            call = call2;
            if (uVar2 == null) {
                i.b(zVar2);
                z.a aVarI2 = zVar2.i();
                z zVarA5 = C0516a.a(zVar2);
                z.a.b("cacheResponse", zVarA5);
                aVarI2.f45701i = zVarA5;
                z zVarA6 = aVarI2.a();
                obj.getClass();
                i.e(call, "call");
                return zVarA6;
            }
            if (zVar2 == null || this.f45432a != null) {
                obj.getClass();
                i.e(call, "call");
            }
            try {
                zVarA = ((p197pb.f) aVar).a(uVar2);
                if (zVar2 != null) {
                    if (zVarA.f45683e == 304) {
                        z.a aVarI3 = zVar2.i();
                        oVar = zVar2.f45685g;
                        oVar2 = zVarA.f45685g;
                        aVar2 = new o.a();
                        size = oVar.size();
                        for (i14 = 0; i14 < size; i14++) {
                            strK2 = oVar.k(i14);
                            strV = oVar.v(i14);
                            if ("Warning".equalsIgnoreCase(strK2) || !m.I(strV, "1", false)) {
                                if ("Content-Length".equalsIgnoreCase(strK2) || "Content-Encoding".equalsIgnoreCase(strK2) || "Content-Type".equalsIgnoreCase(strK2) || !C0516a.b(strK2) || oVar2.e(strK2) == null) {
                                    aVar2.c(strK2, strV);
                                }
                            }
                        }
                        size2 = oVar2.size();
                        for (i15 = 0; i15 < size2; i15++) {
                            strK = oVar2.k(i15);
                            if ("Content-Length".equalsIgnoreCase(strK) && !"Content-Encoding".equalsIgnoreCase(strK) && !"Content-Type".equalsIgnoreCase(strK) && C0516a.b(strK)) {
                                aVar2.c(strK, oVar2.v(i15));
                            }
                        }
                        aVarI3.c(aVar2.e());
                        aVarI3.f45702k = zVarA.f45689l;
                        aVarI3.f45703l = zVarA.f45690m;
                        z zVarA7 = C0516a.a(zVar2);
                        z.a.b("cacheResponse", zVarA7);
                        aVarI3.f45701i = zVarA7;
                        z zVarA8 = C0516a.a(zVarA);
                        z.a.b("networkResponse", zVarA8);
                        aVarI3.f45700h = zVarA8;
                        z zVarA9 = aVarI3.a();
                        A a14 = zVarA.f45686h;
                        i.b(a14);
                        a14.close();
                        c2752c2 = this.f45432a;
                        i.b(c2752c2);
                        synchronized (c2752c2) {
                        }
                        this.f45432a.getClass();
                        c0515c = new C2752c.C0515c(zVarA9);
                        A a15 = zVar2.f45686h;
                        i.c(a15, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                        DiskLruCache.b bVar = ((C2752c.a) a15).f45312c;
                        try {
                            editorH2 = bVar.f45431e.h(bVar.f45429c, bVar.f45428b);
                            if (editorH2 != 0) {
                                try {
                                    c0515c.c(editorH2);
                                    editorH2.b();
                                } catch (IOException unused3) {
                                    if (editorH2 != 0) {
                                        try {
                                            editorH2.a();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                }
                            }
                        } catch (IOException unused5) {
                            editorH2 = r10;
                        }
                        obj.getClass();
                        i.e(call, "call");
                        return zVarA9;
                    }
                    a11 = zVar2.f45686h;
                    if (a11 != null) {
                        p172nb.b.c(a11);
                    }
                }
                z.a aVarI4 = zVarA.i();
                z zVarA10 = C0516a.a(zVar2);
                z.a.b("cacheResponse", zVarA10);
                aVarI4.f45701i = zVarA10;
                z zVarA11 = C0516a.a(zVarA);
                z.a.b("networkResponse", zVarA11);
                aVarI4.f45700h = zVarA11;
                zVarA2 = aVarI4.a();
                if (this.f45432a != null) {
                    if (!p197pb.e.a(zVarA2) && c.a.a(uVar2, zVarA2)) {
                        C2752c c2752c4 = this.f45432a;
                        c2752c4.getClass();
                        u uVar3 = zVarA2.f45680b;
                        String method2 = uVar3.f45662b;
                        i.e(method2, "method");
                        try {
                            if (!method2.equals("POST") && !method2.equals("PATCH") && !method2.equals("PUT") && !method2.equals("DELETE") && !method2.equals("MOVE")) {
                                if (method2.equals("GET") && !C2752c.b.c(zVarA2.f45685g).contains("*")) {
                                    C2752c.C0515c c0515c3 = new C2752c.C0515c(zVarA2);
                                    try {
                                        DiskLruCache diskLruCache = c2752c4.f45311b;
                                        String strA = C2752c.b.a(uVar3.f45661a);
                                        Regex regex = DiskLruCache.f45394s;
                                        editorH = diskLruCache.h(-1L, strA);
                                        if (editorH == 0) {
                                            dVar = r10;
                                        } else {
                                            try {
                                                c0515c3.c(editorH);
                                                dVar = c2752c4.new d(editorH);
                                            } catch (IOException unused6) {
                                                if (editorH != 0) {
                                                    editorH.a();
                                                }
                                                dVar = r10;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                        editorH = r10;
                                    }
                                } else {
                                    dVar = r10;
                                }
                                if (dVar != 0) {
                                    C2752c.d.a aVar6 = dVar.f45330c;
                                    A a16 = zVarA2.f45686h;
                                    i.b(a16);
                                    b bVar2 = new b(a16.h(), dVar, v.a(aVar6));
                                    String strC = z.c("Content-Type", zVarA2);
                                    long jB = zVarA2.f45686h.b();
                                    z.a aVarI5 = zVarA2.i();
                                    aVarI5.f45699g = new g(strC, jB, v.b(bVar2));
                                    zVarA2 = aVarI5.a();
                                }
                                if (zVar2 != null) {
                                    obj.getClass();
                                    i.e(call, "call");
                                }
                                return zVarA2;
                            }
                            c2752c4.b(uVar3);
                        } catch (IOException unused8) {
                        }
                        dVar = r10;
                        if (dVar != 0) {
                            C2752c.d.a aVar7 = dVar.f45330c;
                            A a17 = zVarA2.f45686h;
                            i.b(a17);
                            b bVar3 = new b(a17.h(), dVar, v.a(aVar7));
                            String strC2 = z.c("Content-Type", zVarA2);
                            long jB2 = zVarA2.f45686h.b();
                            z.a aVarI6 = zVarA2.i();
                            aVarI6.f45699g = new g(strC2, jB2, v.b(bVar3));
                            zVarA2 = aVarI6.a();
                        }
                        if (zVar2 != null) {
                            obj.getClass();
                            i.e(call, "call");
                        }
                        return zVarA2;
                    }
                    method = uVar2.f45662b;
                    i.e(method, "method");
                    if (method.equals("POST") || method.equals("PATCH") || method.equals("PUT") || method.equals("DELETE") || method.equals("MOVE")) {
                        try {
                            this.f45432a.b(uVar2);
                        } catch (IOException unused9) {
                        }
                    }
                }
                return zVarA2;
            } catch (Throwable th) {
                if (zVar != null && (a10 = zVar.f45686h) != null) {
                    p172nb.b.c(a10);
                }
                throw th;
            }
        }
        z10 = false;
        cVar = new c(request2, null);
        uVar = request2;
        fVar = fVar;
        call2 = call2;
        r10 = z10;
        if (cVar.f45437a != null) {
            cVar = new c(r10, r10);
        }
        uVar2 = cVar.f45437a;
        zVar2 = cVar.f45438b;
        c2752c = this.f45432a;
        if (c2752c != null) {
            synchronized (c2752c) {
            }
        }
        if (call2 != null) {
            eVar = call2;
        } else {
            eVar = r10;
        }
        if (eVar != 0) {
            obj = okhttp3.m.f45561a;
        } else {
            obj = okhttp3.m.f45561a;
        }
        if (zVar != null) {
            p172nb.b.c(a12);
        }
        if (uVar2 != null) {
        }
        call = call2;
        if (uVar2 == null) {
            i.b(zVar2);
            z.a aVarI7 = zVar2.i();
            z zVarA12 = C0516a.a(zVar2);
            z.a.b("cacheResponse", zVarA12);
            aVarI7.f45701i = zVarA12;
            z zVarA13 = aVarI7.a();
            obj.getClass();
            i.e(call, "call");
            return zVarA13;
        }
        if (zVar2 == null) {
            obj.getClass();
            i.e(call, "call");
        } else {
            obj.getClass();
            i.e(call, "call");
        }
        zVarA = ((p197pb.f) aVar).a(uVar2);
        if (zVar2 != null) {
            if (zVarA.f45683e == 304) {
                z.a aVarI8 = zVar2.i();
                oVar = zVar2.f45685g;
                oVar2 = zVarA.f45685g;
                aVar2 = new o.a();
                size = oVar.size();
                while (i14 < size) {
                    strK2 = oVar.k(i14);
                    strV = oVar.v(i14);
                    if ("Warning".equalsIgnoreCase(strK2)) {
                    }
                    if ("Content-Length".equalsIgnoreCase(strK2)) {
                        aVar2.c(strK2, strV);
                    } else {
                        aVar2.c(strK2, strV);
                    }
                }
                size2 = oVar2.size();
                while (i15 < size2) {
                    strK = oVar2.k(i15);
                    if ("Content-Length".equalsIgnoreCase(strK)) {
                    }
                }
                aVarI8.c(aVar2.e());
                aVarI8.f45702k = zVarA.f45689l;
                aVarI8.f45703l = zVarA.f45690m;
                z zVarA14 = C0516a.a(zVar2);
                z.a.b("cacheResponse", zVarA14);
                aVarI8.f45701i = zVarA14;
                z zVarA15 = C0516a.a(zVarA);
                z.a.b("networkResponse", zVarA15);
                aVarI8.f45700h = zVarA15;
                z zVarA16 = aVarI8.a();
                A a18 = zVarA.f45686h;
                i.b(a18);
                a18.close();
                c2752c2 = this.f45432a;
                i.b(c2752c2);
                synchronized (c2752c2) {
                    this.f45432a.getClass();
                    c0515c = new C2752c.C0515c(zVarA16);
                    A a19 = zVar2.f45686h;
                    i.c(a19, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                    DiskLruCache.b bVar4 = ((C2752c.a) a19).f45312c;
                    editorH2 = bVar4.f45431e.h(bVar4.f45429c, bVar4.f45428b);
                    if (editorH2 != 0) {
                        c0515c.c(editorH2);
                        editorH2.b();
                    }
                    obj.getClass();
                    i.e(call, "call");
                    return zVarA16;
                }
            }
            a11 = zVar2.f45686h;
            if (a11 != null) {
                p172nb.b.c(a11);
            }
        }
        z.a aVarI9 = zVarA.i();
        z zVarA17 = C0516a.a(zVar2);
        z.a.b("cacheResponse", zVarA17);
        aVarI9.f45701i = zVarA17;
        z zVarA18 = C0516a.a(zVarA);
        z.a.b("networkResponse", zVarA18);
        aVarI9.f45700h = zVarA18;
        zVarA2 = aVarI9.a();
        if (this.f45432a != null) {
            if (!p197pb.e.a(zVarA2)) {
            }
            method = uVar2.f45662b;
            i.e(method, "method");
            if (method.equals("POST")) {
                this.f45432a.b(uVar2);
            } else {
                this.f45432a.b(uVar2);
            }
        }
        return zVarA2;
    }
}
