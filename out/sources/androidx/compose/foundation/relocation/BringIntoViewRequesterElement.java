package androidx.compose.foundation.relocation;

import androidx.compose.ui.h;
import androidx.compose.ui.node.H;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewRequesterElement extends H<d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f11023b;

    public BringIntoViewRequesterElement(a aVar) {
        this.f11023b = aVar;
    }

    @Override // androidx.compose.ui.node.H
    public final h.c a() {
        d dVar = new d();
        dVar.f11025p = this.f11023b;
        return dVar;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(h.c cVar) {
        d dVar = (d) cVar;
        a aVar = dVar.f11025p;
        if (aVar instanceof b) {
            i.c(aVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((b) aVar).f11024a.m(dVar);
        }
        a aVar2 = this.f11023b;
        if (aVar2 instanceof b) {
            ((b) aVar2).f11024a.b(dVar);
        }
        dVar.f11025p = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (i.a(this.f11023b, ((BringIntoViewRequesterElement) obj).f11023b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f11023b.hashCode();
    }
}
