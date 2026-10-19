package p265v7;

import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.v1.i;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p241t7.a;

/* JADX INFO: compiled from: FirebasePerfTraceValidator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47667b = a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f47668a;

    public d(i iVar) {
        this.f47668a = iVar;
    }

    public static boolean d(i iVar, int i10) {
        if (iVar == null) {
            return false;
        }
        a aVar = f47667b;
        if (i10 > 1) {
            aVar.f();
            return false;
        }
        for (Map.Entry<String, Long> entry : iVar.S().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                String strTrim = key.trim();
                if (strTrim.isEmpty()) {
                    aVar.f();
                } else if (strTrim.length() > 100) {
                    aVar.f();
                } else if (entry.getValue() == null) {
                    Objects.toString(entry.getValue());
                    aVar.f();
                    return false;
                }
            }
            entry.getKey();
            aVar.f();
            return false;
        }
        Iterator<E> it = iVar.Y().iterator();
        while (it.hasNext()) {
            if (!d((i) it.next(), i10 + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(i iVar, int i10) {
        Long l10;
        a aVar = f47667b;
        if (iVar == null) {
            aVar.f();
            return false;
        }
        if (i10 > 1) {
            aVar.f();
            return false;
        }
        String strW = iVar.W();
        if (strW != null) {
            String strTrim = strW.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (iVar.V() <= 0) {
                    aVar.f();
                    return false;
                }
                if (!iVar.Z()) {
                    aVar.f();
                    return false;
                }
                if (iVar.W().startsWith("_st_") && ((l10 = iVar.S().get(Constants$CounterNames.FRAMES_TOTAL.toString())) == null || l10.compareTo((Long) 0L) <= 0)) {
                    aVar.f();
                    return false;
                }
                Iterator<E> it = iVar.Y().iterator();
                while (it.hasNext()) {
                    if (!e((i) it.next(), i10 + 1)) {
                        return false;
                    }
                }
                for (Map.Entry<String, String> entry : iVar.T().entrySet()) {
                    try {
                        e.b(entry.getKey(), entry.getValue());
                    } catch (IllegalArgumentException e10) {
                        e10.getLocalizedMessage();
                        aVar.f();
                        return false;
                    }
                }
                return true;
            }
        }
        aVar.f();
        return false;
    }

    @Override // p265v7.e
    public final boolean a() {
        i iVar = this.f47668a;
        boolean zE = e(iVar, 0);
        a aVar = f47667b;
        if (!zE) {
            iVar.W();
            aVar.f();
            return false;
        }
        if (iVar.R() <= 0) {
            Iterator<E> it = iVar.Y().iterator();
            while (it.hasNext()) {
                if (((i) it.next()).R() > 0) {
                }
            }
            return true;
        }
        if (d(iVar, 0)) {
            return true;
        }
        aVar.f();
        return false;
    }
}
