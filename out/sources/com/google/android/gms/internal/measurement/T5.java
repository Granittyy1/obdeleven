package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class T5 extends AbstractC1856m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L5 f25601f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T5(L5 l10, boolean z10, boolean z11) {
        super("log");
        this.f25601f = l10;
        this.f25599d = z10;
        this.f25600e = z11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1856m
    public final InterfaceC1884q a(Y1 y10, List<InterfaceC1884q> list) {
        D1.j(1, "log", list);
        int size = list.size();
        zzs zzsVar = zzs.INFO;
        C1932x c1932x = InterfaceC1884q.f25814f0;
        L5 l10 = this.f25601f;
        if (size == 1) {
            l10.f25507d.e(zzsVar, y10.f25642b.c(y10, list.get(0)).A(), Collections.emptyList(), this.f25599d, this.f25600e);
            return c1932x;
        }
        int i10 = D1.i(y10.f25642b.c(y10, list.get(0)).z().doubleValue());
        if (i10 == 2) {
            zzsVar = zzs.VERBOSE;
        } else if (i10 == 3) {
            zzsVar = zzs.DEBUG;
        } else if (i10 == 5) {
            zzsVar = zzs.WARN;
        } else if (i10 == 6) {
            zzsVar = zzs.ERROR;
        }
        zzs zzsVar2 = zzsVar;
        String strA = y10.f25642b.c(y10, list.get(1)).A();
        if (list.size() == 2) {
            l10.f25507d.e(zzsVar2, strA, Collections.emptyList(), this.f25599d, this.f25600e);
            return c1932x;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 2; i11 < Math.min(list.size(), 5); i11++) {
            arrayList.add(y10.f25642b.c(y10, list.get(i11)).A());
        }
        l10.f25507d.e(zzsVar2, strA, arrayList, this.f25599d, this.f25600e);
        return c1932x;
    }
}
