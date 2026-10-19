package androidx.compose.foundation.text;

import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: LinkStateInteractionSourceObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l<T> implements InterfaceC2687d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.collection.I<androidx.compose.foundation.interaction.i> f11358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f11359c;

    public l(androidx.collection.I<androidx.compose.foundation.interaction.i> i10, m mVar) {
        this.f11358b = i10;
        this.f11359c = mVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        androidx.compose.foundation.interaction.i iVar = (androidx.compose.foundation.interaction.i) obj;
        boolean z10 = iVar instanceof androidx.compose.foundation.interaction.g ? true : iVar instanceof androidx.compose.foundation.interaction.d ? true : iVar instanceof androidx.compose.foundation.interaction.m.b;
        androidx.collection.I<androidx.compose.foundation.interaction.i> i10 = this.f11358b;
        if (z10) {
            i10.g(iVar);
        } else if (iVar instanceof androidx.compose.foundation.interaction.h) {
            i10.j(((androidx.compose.foundation.interaction.h) iVar).f10072a);
        } else if (iVar instanceof androidx.compose.foundation.interaction.e) {
            i10.j(((androidx.compose.foundation.interaction.e) iVar).f10071a);
        } else if (iVar instanceof androidx.compose.foundation.interaction.m.c) {
            i10.j(((androidx.compose.foundation.interaction.m.c) iVar).f10076a);
        } else if (iVar instanceof androidx.compose.foundation.interaction.m.a) {
            i10.j(((androidx.compose.foundation.interaction.m.a) iVar).f10074a);
        }
        Object[] objArr = i10.f9108a;
        int i11 = i10.f9109b;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            m mVar = this.f11359c;
            if (i12 >= i11) {
                mVar.f11361b.m(i13);
                return p293xa.r.f47939a;
            }
            androidx.compose.foundation.interaction.i iVar2 = (androidx.compose.foundation.interaction.i) objArr[i12];
            if (iVar2 instanceof androidx.compose.foundation.interaction.g) {
                mVar.getClass();
                i13 |= 2;
            } else if (iVar2 instanceof androidx.compose.foundation.interaction.d) {
                mVar.getClass();
                i13 |= 1;
            } else if (iVar2 instanceof androidx.compose.foundation.interaction.m.b) {
                mVar.getClass();
                i13 |= 4;
            }
            i12++;
        }
    }
}
