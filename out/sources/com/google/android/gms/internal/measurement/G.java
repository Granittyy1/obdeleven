package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class G implements Comparator<InterfaceC1884q> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1856m f25452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y1 f25453c;

    public G(AbstractC1856m abstractC1856m, Y1 y10) {
        this.f25452b = abstractC1856m;
        this.f25453c = y10;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(InterfaceC1884q interfaceC1884q, InterfaceC1884q interfaceC1884q2) {
        InterfaceC1884q interfaceC1884q3 = interfaceC1884q;
        InterfaceC1884q interfaceC1884q4 = interfaceC1884q2;
        if (interfaceC1884q3 instanceof C1932x) {
            return !(interfaceC1884q4 instanceof C1932x) ? 1 : 0;
        }
        if (interfaceC1884q4 instanceof C1932x) {
            return -1;
        }
        AbstractC1856m abstractC1856m = this.f25452b;
        return abstractC1856m == null ? interfaceC1884q3.A().compareTo(interfaceC1884q4.A()) : (int) D1.a(abstractC1856m.a(this.f25453c, Arrays.asList(interfaceC1884q3, interfaceC1884q4)).z().doubleValue());
    }
}
