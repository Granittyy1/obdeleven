package okhttp3.logging;

import C4.b;
import androidx.compose.foundation.gestures.d;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.i;
import okhttp3.A;
import okhttp3.Protocol;
import okhttp3.internal.connection.c;
import okhttp3.o;
import okhttp3.q;
import okhttp3.r;
import okhttp3.u;
import okhttp3.y;
import okhttp3.z;
import p197pb.e;
import p197pb.f;
import p318zb.C2839f;
import p318zb.InterfaceC2841h;
import p318zb.p;

/* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpLoggingInterceptor implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f45553a = a.f45560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile EmptySet f45554b = EmptySet.f42985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Level f45555c = Level.f45556b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
    public static final class Level {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Level f45556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Level f45557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Level f45558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Level[] f45559e;

        static {
            Level level = new Level("NONE", 0);
            f45556b = level;
            Level level2 = new Level("BASIC", 1);
            Level level3 = new Level("HEADERS", 2);
            f45557c = level3;
            Level level4 = new Level("BODY", 3);
            f45558d = level4;
            f45559e = new Level[]{level, level2, level3, level4};
        }

        public Level() {
            throw null;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f45559e.clone();
        }
    }

    /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final okhttp3.logging.a f45560a = new okhttp3.logging.a();

        void a(String str);
    }

    public HttpLoggingInterceptor(int i10) {
    }

    public final void a(o oVar, int i10) {
        this.f45554b.contains(oVar.k(i10));
        String strV = oVar.v(i10);
        this.f45553a.a(oVar.k(i10) + ": " + strV);
    }

    /* JADX WARN: Code duplicated, block: B:137:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9 A[LOOP:0: B:45:0x00f7->B:46:0x00f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x0241  */
    /* JADX WARN: Code duplicated, block: B:83:0x0255  */
    /* JADX WARN: Code duplicated, block: B:86:0x0273  */
    /* JADX WARN: Code duplicated, block: B:87:0x0275  */
    /* JADX WARN: Code duplicated, block: B:90:0x0299  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:96:0x02bd A[LOOP:1: B:95:0x02bb->B:96:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x02c5  */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x0241, please report this as an issue */
    @Override // okhttp3.q
    public final z intercept(q.a aVar) throws Exception {
        String string;
        boolean z10;
        String str;
        z zVarA;
        long jB;
        String str2;
        String strC;
        String strB;
        o oVar;
        int size;
        int i10;
        String str3;
        Long l10;
        Charset UTF_8;
        int size2;
        int i11;
        Charset UTF_9;
        Level level = this.f45555c;
        f fVar = (f) aVar;
        u uVar = fVar.f45947e;
        if (level == Level.f45556b) {
            return fVar.a(uVar);
        }
        boolean z11 = true;
        boolean z12 = level == Level.f45558d;
        if (!z12 && level != Level.f45557c) {
            z11 = false;
        }
        y yVar = uVar.f45664d;
        c cVar = fVar.f45946d;
        okhttp3.internal.connection.f fVar2 = cVar != null ? cVar.f45456g : null;
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(uVar.f45662b);
        sb2.append(' ');
        sb2.append(uVar.f45661a);
        String str4 = " ";
        String str5 = "";
        if (fVar2 != null) {
            StringBuilder sb3 = new StringBuilder(" ");
            Protocol protocol = fVar2.f45503f;
            i.b(protocol);
            sb3.append(protocol);
            string = sb3.toString();
        } else {
            string = "";
        }
        sb2.append(string);
        String string2 = sb2.toString();
        if (!z11 && yVar != null) {
            StringBuilder sbF = b.f(string2, " (");
            sbF.append(yVar.contentLength());
            sbF.append("-byte body)");
            string2 = sbF.toString();
        }
        this.f45553a.a(string2);
        String str6 = "Content-Encoding";
        String str7 = "-byte body omitted)";
        try {
            if (z11) {
                o oVar2 = uVar.f45663c;
                if (yVar != null) {
                    r rVarContentType = yVar.contentType();
                    z10 = z11;
                    if (rVarContentType != null && oVar2.e("Content-Type") == null) {
                        this.f45553a.a("Content-Type: " + rVarContentType);
                    }
                    if (yVar.contentLength() != -1 && oVar2.e("Content-Length") == null) {
                        this.f45553a.a("Content-Length: " + yVar.contentLength());
                    }
                    size2 = oVar2.size();
                    for (i11 = 0; i11 < size2; i11++) {
                        a(oVar2, i11);
                    }
                    if (z12 || yVar == null) {
                        str6 = "Content-Encoding";
                        str5 = str5;
                        str = str7;
                        this.f45553a.a("--> END " + uVar.f45662b);
                    } else {
                        String strE = uVar.f45663c.e("Content-Encoding");
                        if (strE != null && !strE.equalsIgnoreCase("identity") && !strE.equalsIgnoreCase("gzip")) {
                            this.f45553a.a("--> END " + uVar.f45662b + " (encoded body omitted)");
                        } else if (yVar.isDuplex()) {
                            this.f45553a.a("--> END " + uVar.f45662b + " (duplex request body omitted)");
                        } else if (yVar.isOneShot()) {
                            this.f45553a.a("--> END " + uVar.f45662b + " (one-shot body omitted)");
                        } else {
                            C2839f c2839f = new C2839f();
                            yVar.writeTo(c2839f);
                            r rVarContentType2 = yVar.contentType();
                            if (rVarContentType2 == null || (UTF_9 = rVarContentType2.a(StandardCharsets.UTF_8)) == null) {
                                UTF_9 = StandardCharsets.UTF_8;
                                i.d(UTF_9, "UTF_8");
                            }
                            str5 = str5;
                            this.f45553a.a(str5);
                            if (p111ia.c.g(c2839f)) {
                                str6 = "Content-Encoding";
                                this.f45553a.a(c2839f.o0(c2839f.f49074c, UTF_9));
                                this.f45553a.a("--> END " + uVar.f45662b + " (" + yVar.contentLength() + "-byte body)");
                                str = str7;
                            } else {
                                str6 = "Content-Encoding";
                                a aVar2 = this.f45553a;
                                StringBuilder sb4 = new StringBuilder("--> END ");
                                sb4.append(uVar.f45662b);
                                sb4.append(" (binary ");
                                sb4.append(yVar.contentLength());
                                str = str7;
                                sb4.append(str);
                                aVar2.a(sb4.toString());
                            }
                        }
                        str5 = "";
                        str = str7;
                    }
                    long jNanoTime = System.nanoTime();
                    zVarA = ((f) aVar).a(uVar);
                    long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                    A a10 = zVarA.f45686h;
                    i.b(a10);
                    jB = a10.b();
                    if (jB != -1) {
                        str2 = jB + "-byte";
                    } else {
                        str2 = "unknown-length";
                    }
                    a aVar3 = this.f45553a;
                    StringBuilder sb5 = new StringBuilder("<-- ");
                    sb5.append(zVarA.f45683e);
                    if (zVarA.f45682d.length() == 0) {
                        strC = str5;
                    } else {
                        strC = B7.b.c(str4, zVarA.f45682d);
                    }
                    sb5.append(strC);
                    sb5.append(' ');
                    sb5.append(zVarA.f45680b.f45661a);
                    sb5.append(" (");
                    sb5.append(millis);
                    sb5.append("ms");
                    if (z10) {
                        strB = str5;
                    } else {
                        strB = d.b(", ", str2, " body");
                    }
                    sb5.append(strB);
                    sb5.append(')');
                    aVar3.a(sb5.toString());
                    if (z10) {
                        oVar = zVarA.f45685g;
                        size = oVar.size();
                        for (i10 = 0; i10 < size; i10++) {
                            a(oVar, i10);
                        }
                        if (z12 || !e.a(zVarA)) {
                            this.f45553a.a("<-- END HTTP");
                        } else {
                            String str8 = str6;
                            String strE2 = zVarA.f45685g.e(str8);
                            if (strE2 == null || strE2.equalsIgnoreCase("identity")) {
                                str3 = "gzip";
                            } else {
                                str3 = r13;
                                if (!strE2.equalsIgnoreCase(str3)) {
                                    this.f45553a.a("<-- END HTTP (encoded body omitted)");
                                }
                            }
                            InterfaceC2841h interfaceC2841hH = a10.h();
                            interfaceC2841hH.g(Long.MAX_VALUE);
                            C2839f c2839fF = interfaceC2841hH.f();
                            if (str3.equalsIgnoreCase(oVar.e(str8))) {
                                Long lValueOf = Long.valueOf(c2839fF.f49074c);
                                p pVar = new p(c2839fF.clone());
                                try {
                                    c2839fF = new C2839f();
                                    c2839fF.k0(pVar);
                                    p241t7.b.n(pVar, null);
                                    l10 = lValueOf;
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        p241t7.b.n(pVar, th);
                                        throw th2;
                                    }
                                }
                            } else {
                                l10 = null;
                            }
                            r rVarC = a10.c();
                            if (rVarC == null || (UTF_8 = rVarC.a(StandardCharsets.UTF_8)) == null) {
                                UTF_8 = StandardCharsets.UTF_8;
                                i.d(UTF_8, "UTF_8");
                            }
                            if (!p111ia.c.g(c2839fF)) {
                                this.f45553a.a(str5);
                                this.f45553a.a("<-- END HTTP (binary " + c2839fF.f49074c + str);
                                return zVarA;
                            }
                            if (jB != 0) {
                                this.f45553a.a(str5);
                                a aVar4 = this.f45553a;
                                C2839f c2839fClone = c2839fF.clone();
                                aVar4.a(c2839fClone.o0(c2839fClone.f49074c, UTF_8));
                            }
                            if (l10 != null) {
                                this.f45553a.a("<-- END HTTP (" + c2839fF.f49074c + "-byte, " + l10 + "-gzipped-byte body)");
                            } else {
                                this.f45553a.a("<-- END HTTP (" + c2839fF.f49074c + "-byte body)");
                            }
                        }
                    }
                    return zVarA;
                }
                z10 = z11;
                str4 = " ";
                str7 = "-byte body omitted)";
                size2 = oVar2.size();
                while (i11 < size2) {
                    a(oVar2, i11);
                }
                if (z12) {
                    str6 = "Content-Encoding";
                    str5 = str5;
                    str = str7;
                    this.f45553a.a("--> END " + uVar.f45662b);
                } else {
                    str6 = "Content-Encoding";
                    str5 = str5;
                    str = str7;
                    this.f45553a.a("--> END " + uVar.f45662b);
                }
                long jNanoTime2 = System.nanoTime();
                zVarA = ((f) aVar).a(uVar);
                long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime2);
                A a11 = zVarA.f45686h;
                i.b(a11);
                jB = a11.b();
                if (jB != -1) {
                    str2 = jB + "-byte";
                } else {
                    str2 = "unknown-length";
                }
                a aVar5 = this.f45553a;
                StringBuilder sb6 = new StringBuilder("<-- ");
                sb6.append(zVarA.f45683e);
                if (zVarA.f45682d.length() == 0) {
                    strC = str5;
                } else {
                    strC = B7.b.c(str4, zVarA.f45682d);
                }
                sb6.append(strC);
                sb6.append(' ');
                sb6.append(zVarA.f45680b.f45661a);
                sb6.append(" (");
                sb6.append(millis2);
                sb6.append("ms");
                if (z10) {
                    strB = d.b(", ", str2, " body");
                } else {
                    strB = str5;
                }
                sb6.append(strB);
                sb6.append(')');
                aVar5.a(sb6.toString());
                if (z10) {
                    oVar = zVarA.f45685g;
                    size = oVar.size();
                    while (i10 < size) {
                        a(oVar, i10);
                    }
                    if (z12) {
                        this.f45553a.a("<-- END HTTP");
                    } else {
                        this.f45553a.a("<-- END HTTP");
                    }
                }
                return zVarA;
            }
            z10 = z11;
            str4 = " ";
            str = "-byte body omitted)";
            zVarA = ((f) aVar).a(uVar);
            long millis3 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime2);
            A a12 = zVarA.f45686h;
            i.b(a12);
            jB = a12.b();
            if (jB != -1) {
                str2 = jB + "-byte";
            } else {
                str2 = "unknown-length";
            }
            a aVar6 = this.f45553a;
            StringBuilder sb7 = new StringBuilder("<-- ");
            sb7.append(zVarA.f45683e);
            if (zVarA.f45682d.length() == 0) {
                strC = str5;
            } else {
                strC = B7.b.c(str4, zVarA.f45682d);
            }
            sb7.append(strC);
            sb7.append(' ');
            sb7.append(zVarA.f45680b.f45661a);
            sb7.append(" (");
            sb7.append(millis3);
            sb7.append("ms");
            if (z10) {
                strB = d.b(", ", str2, " body");
            } else {
                strB = str5;
            }
            sb7.append(strB);
            sb7.append(')');
            aVar6.a(sb7.toString());
            if (z10) {
                oVar = zVarA.f45685g;
                size = oVar.size();
                while (i10 < size) {
                    a(oVar, i10);
                }
                if (z12) {
                    this.f45553a.a("<-- END HTTP");
                } else {
                    this.f45553a.a("<-- END HTTP");
                }
            }
            return zVarA;
        } catch (Exception e10) {
            this.f45553a.a("<-- HTTP FAILED: " + e10);
            throw e10;
        }
        long jNanoTime3 = System.nanoTime();
    }
}
