package com.voltasit.obdeleven.domain.usecases;

import G8.C0705g;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: GetDeviceCountryUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0705g f30861b = new C0705g("US", "+1", "US");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f30862a;

    public l(k kVar) {
        this.f30862a = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0705g a(List<C0705g> list) {
        C8.a<String> aVarC;
        Object c0024a;
        Object next;
        String lowerCase;
        String lowerCase2;
        J8.w wVar = this.f30862a.f30860a;
        C8.a<String> aVarB = wVar.b();
        if (!(aVarB instanceof C8.a.b) || kotlin.text.n.S((String) ((C8.a.b) aVarB).f2463a)) {
            c0024a = aVarB;
            aVarC = wVar.c();
            if (!(aVarC instanceof C8.a.b) || kotlin.text.n.S((String) ((C8.a.b) aVarC).f2463a)) {
                c0024a = aVarC;
                C8.a.b bVarA = wVar.a();
                boolean zS = kotlin.text.n.S((String) bVarA.f2463a);
                c0024a = bVarA;
                if (zS) {
                    c0024a = new C8.a.C0024a(new NotFoundException("Country code"));
                }
            }
        }
        c0024a = aVarC;
        c0024a = aVarB;
        boolean z10 = c0024a instanceof C8.a.C0024a;
        C0705g c0705g = f30861b;
        if (z10) {
            return c0705g;
        }
        if (!(c0024a instanceof C8.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = (String) ((C8.a.b) c0024a).f2463a;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str2 = ((C0705g) next).f3497c;
            Locale locale = Locale.ROOT;
            lowerCase = str2.toLowerCase(locale);
            kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
            lowerCase2 = str.toLowerCase(locale);
            kotlin.jvm.internal.i.d(lowerCase2, "toLowerCase(...)");
        } while (!lowerCase.equals(lowerCase2));
        C0705g c0705g2 = (C0705g) next;
        return c0705g2 != null ? c0705g2 : c0705g;
    }
}
