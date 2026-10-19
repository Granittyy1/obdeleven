package androidx.compose.foundation.relocation;

import androidx.compose.ui.h;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f11025p;

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    @Override // androidx.compose.ui.h.c
    public final void I1() {
        a aVar = this.f11025p;
        if (aVar instanceof b) {
            i.c(aVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((b) aVar).f11024a.m(this);
        }
        if (aVar instanceof b) {
            ((b) aVar).f11024a.b(this);
        }
        this.f11025p = aVar;
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        a aVar = this.f11025p;
        if (aVar instanceof b) {
            i.c(aVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((b) aVar).f11024a.m(this);
        }
    }
}
