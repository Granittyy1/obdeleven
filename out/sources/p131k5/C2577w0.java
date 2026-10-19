package p131k5;

import C4.b;
import U4.C0804l;
import android.os.Bundle;
import androidx.compose.foundation.gestures.d;
import androidx.compose.runtime.snapshots.j;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k5.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2577w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference<String[]> f42509b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<String[]> f42510c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference<String[]> f42511d = new AtomicReference<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f42512a;

    public C2577w0(j jVar) {
        this.f42512a = jVar;
    }

    public static String c(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C0804l.h(atomicReference);
        C0804l.b(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i10] == null) {
                            strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                        }
                        str2 = strArr3[i10];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        String strE;
        if (bundle == null) {
            return null;
        }
        if (!this.f42512a.b()) {
            return bundle.toString();
        }
        StringBuilder sbE = b.e("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbE.length() != 8) {
                sbE.append(", ");
            }
            sbE.append(f(str));
            sbE.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strE = e(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strE = e((Object[]) obj);
            } else {
                strE = obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbE.append(strE);
        }
        sbE.append("}]");
        return sbE.toString();
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f42512a.b() ? str : c(str, P.f41947g, P.f41945e, f42509b);
    }

    public final String d(C2588z c2588z) {
        String string;
        j jVar = this.f42512a;
        if (!jVar.b()) {
            return c2588z.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(c2588z.f42544d);
        sb2.append(",name=");
        sb2.append(b(c2588z.f42542b));
        sb2.append(",params=");
        C2568u c2568u = c2588z.f42543c;
        if (c2568u == null) {
            string = null;
        } else {
            string = !jVar.b() ? c2568u.f42473b.toString() : a(c2568u.k());
        }
        sb2.append(string);
        return sb2.toString();
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbE = b.e("[");
        for (Object obj : objArr) {
            String strA = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (strA != null) {
                if (sbE.length() != 1) {
                    sbE.append(", ");
                }
                sbE.append(strA);
            }
        }
        sbE.append("]");
        return sbE.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f42512a.b() ? str : c(str, O.f41927f, O.f41926e, f42510c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (this.f42512a.b()) {
            return str.startsWith("_exp_") ? d.b("experiment_id(", str, ")") : c(str, Q.f41963f, Q.f41962e, f42511d);
        }
        return str;
    }
}
