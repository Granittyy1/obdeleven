package Y2;

import android.graphics.Bitmap;
import coil.util.Time;
import coil.util.k;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.text.l;
import kotlin.text.m;
import okhttp3.C2753d;
import okhttp3.o;
import okhttp3.p;
import okhttp3.u;

/* JADX INFO: compiled from: CacheStrategy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f7582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f7583b;

    /* JADX INFO: compiled from: CacheStrategy.kt */
    public static final class a {
        public static o a(o oVar, o oVar2) {
            o.a aVar = new o.a();
            int size = oVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strK = oVar.k(i10);
                String strV = oVar.v(i10);
                if ((!"Warning".equalsIgnoreCase(strK) || !m.I(strV, "1", false)) && ("Content-Length".equalsIgnoreCase(strK) || "Content-Encoding".equalsIgnoreCase(strK) || "Content-Type".equalsIgnoreCase(strK) || !b(strK) || oVar2.e(strK) == null)) {
                    aVar.d(strK, strV);
                }
            }
            int size2 = oVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strK2 = oVar2.k(i11);
                if (!"Content-Length".equalsIgnoreCase(strK2) && !"Content-Encoding".equalsIgnoreCase(strK2) && !"Content-Type".equalsIgnoreCase(strK2) && b(strK2)) {
                    aVar.d(strK2, oVar2.v(i11));
                }
            }
            return aVar.e();
        }

        public static boolean b(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    /* JADX INFO: compiled from: CacheStrategy.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f7584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f7585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Date f7586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Date f7588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f7589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Date f7590g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f7591h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f7592i;
        public final String j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f7593k;

        public b(u uVar, c cVar) {
            int i10;
            this.f7584a = uVar;
            this.f7585b = cVar;
            this.f7593k = -1;
            if (cVar != null) {
                this.f7591h = cVar.f7578c;
                this.f7592i = cVar.f7579d;
                o oVar = cVar.f7581f;
                int size = oVar.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String strK = oVar.k(i11);
                    if (m.D(strK, "Date", true)) {
                        String strE = oVar.e("Date");
                        this.f7586c = strE != null ? p197pb.c.a(strE) : null;
                        this.f7587d = oVar.v(i11);
                    } else if (m.D(strK, "Expires", true)) {
                        String strE2 = oVar.e("Expires");
                        this.f7590g = strE2 != null ? p197pb.c.a(strE2) : null;
                    } else if (m.D(strK, "Last-Modified", true)) {
                        String strE3 = oVar.e("Last-Modified");
                        this.f7588e = strE3 != null ? p197pb.c.a(strE3) : null;
                        this.f7589f = oVar.v(i11);
                    } else if (m.D(strK, "ETag", true)) {
                        this.j = oVar.v(i11);
                    } else if (m.D(strK, "Age", true)) {
                        String strV = oVar.v(i11);
                        Bitmap.Config[] configArr = k.f23160a;
                        Long lB = l.B(strV);
                        if (lB != null) {
                            long jLongValue = lB.longValue();
                            i10 = jLongValue > 2147483647L ? BrazeLogger.SUPPRESS : jLongValue < 0 ? 0 : (int) jLongValue;
                        } else {
                            i10 = -1;
                        }
                        this.f7593k = i10;
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:56:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:60:0x0106  */
        /* JADX WARN: Code duplicated, block: B:63:0x0115  */
        /* JADX WARN: Code duplicated, block: B:64:0x011d  */
        /* JADX WARN: Code duplicated, block: B:70:0x0131  */
        /* JADX WARN: Code duplicated, block: B:79:0x014d  */
        /* JADX WARN: Code duplicated, block: B:80:0x0150 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:81:0x0152  */
        /* JADX WARN: Code duplicated, block: B:83:0x015a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:84:0x015c  */
        /* JADX WARN: Code duplicated, block: B:87:0x0175  */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, xa.g] */
        public final d a() {
            long j;
            long jMin;
            String string;
            long time;
            int i10;
            int i11;
            long millis;
            long millis2;
            String str;
            String str2;
            int i12;
            u uVar = this.f7584a;
            c cVar = this.f7585b;
            if (cVar == null) {
                return new d(uVar, null);
            }
            p pVar = uVar.f45661a;
            if (pVar.j && !cVar.f7580e) {
                return new d(uVar, null);
            }
            ?? r10 = cVar.f7576a;
            C2753d c2753d = (C2753d) r10.getValue();
            if (uVar.a().f45338b || ((C2753d) r10.getValue()).f45338b || i.a(cVar.f7581f.e("Vary"), "*")) {
                return new d(uVar, null);
            }
            C2753d c2753dA = uVar.a();
            if (!c2753dA.f45337a) {
                o oVar = uVar.f45663c;
                if (oVar.e("If-Modified-Since") == null && oVar.e("If-None-Match") == null) {
                    long time2 = this.f7592i;
                    Date date = this.f7586c;
                    long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
                    int i13 = this.f7593k;
                    if (i13 != -1) {
                        jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i13));
                    }
                    long time3 = this.f7591h;
                    long jA = jMax + (time2 - time3) + (Time.a() - time2);
                    int i14 = ((C2753d) r10.getValue()).f45339c;
                    Date date2 = this.f7588e;
                    if (i14 == -1) {
                        Date date3 = this.f7590g;
                        if (date3 != null) {
                            if (date != null) {
                                time2 = date.getTime();
                            }
                            time = date3.getTime() - time2;
                            if (time <= 0) {
                                time = 0;
                            }
                        } else if (date2 == null) {
                            j = 0;
                            jMin = j;
                        } else {
                            ArrayList arrayList = pVar.f45577g;
                            if (arrayList == null) {
                                string = null;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                p.b.e(arrayList, sb2);
                                string = sb2.toString();
                            }
                            if (string == null) {
                                if (date != null) {
                                    time3 = date.getTime();
                                }
                                long time4 = time3 - date2.getTime();
                                j = 0;
                                if (time4 > 0) {
                                    jMin = time4 / ((long) 10);
                                }
                            } else {
                                j = 0;
                            }
                            jMin = j;
                        }
                        i10 = c2753dA.f45339c;
                        if (i10 != -1) {
                            jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i10));
                        }
                        i11 = c2753dA.f45345i;
                        if (i11 != -1) {
                            millis = TimeUnit.SECONDS.toMillis(i11);
                        } else {
                            millis = 0;
                        }
                        if (!c2753d.f45343g || (i12 = c2753dA.f45344h) == -1) {
                            millis2 = 0;
                        } else {
                            millis2 = TimeUnit.SECONDS.toMillis(i12);
                        }
                        if (c2753d.f45337a && jA + millis < jMin + millis2) {
                            return new d(null, cVar);
                        }
                        str = this.j;
                        if (str != null) {
                            str2 = "If-None-Match";
                        } else {
                            if (date2 != null) {
                                str = this.f7589f;
                                i.b(str);
                            } else {
                                if (date != null) {
                                    return new d(uVar, null);
                                }
                                str = this.f7587d;
                                i.b(str);
                            }
                            str2 = "If-Modified-Since";
                        }
                        u.a aVarB = uVar.b();
                        aVarB.f45669c.a(str2, str);
                        return new d(aVarB.a(), cVar);
                    }
                    time = TimeUnit.SECONDS.toMillis(i14);
                    jMin = time;
                    i10 = c2753dA.f45339c;
                    if (i10 != -1) {
                        jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i10));
                    }
                    i11 = c2753dA.f45345i;
                    if (i11 != -1) {
                        millis = TimeUnit.SECONDS.toMillis(i11);
                    } else {
                        millis = 0;
                    }
                    if (c2753d.f45343g) {
                        millis2 = 0;
                    } else {
                        millis2 = 0;
                    }
                    if (c2753d.f45337a) {
                    }
                    str = this.j;
                    if (str != null) {
                        str2 = "If-None-Match";
                    } else {
                        if (date2 != null) {
                            str = this.f7589f;
                            i.b(str);
                        } else {
                            if (date != null) {
                                return new d(uVar, null);
                            }
                            str = this.f7587d;
                            i.b(str);
                        }
                        str2 = "If-Modified-Since";
                    }
                    u.a aVarB2 = uVar.b();
                    aVarB2.f45669c.a(str2, str);
                    return new d(aVarB2.a(), cVar);
                }
            }
            return new d(uVar, null);
        }
    }

    public d(u uVar, c cVar) {
        this.f7582a = uVar;
        this.f7583b = cVar;
    }
}
