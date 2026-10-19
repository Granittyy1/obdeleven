package Wa;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Formatter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7076a;

    public a(ArrayList arrayList) {
        this.f7076a = arrayList;
    }

    @Override // Wa.e
    public final void a(kotlinx.datetime.internal.format.parser.c cVar, StringBuilder sb2, boolean z10) {
        Iterator it = this.f7076a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(cVar, sb2, z10);
        }
    }
}
