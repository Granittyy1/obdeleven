package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.r;
import androidx.compose.ui.layout.InterfaceC1170p;

/* JADX INFO: compiled from: SelectionController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.compose.foundation.text.selection.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ia.a<InterfaceC1170p> f11486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f11487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11488c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Ia.a<? extends InterfaceC1170p> aVar, r rVar, long j) {
        this.f11486a = aVar;
        this.f11487b = rVar;
        this.f11488c = j;
    }

    @Override // androidx.compose.foundation.text.selection.e
    public final boolean a(long j, androidx.compose.foundation.text.selection.j jVar) {
        InterfaceC1170p interfaceC1170p = (InterfaceC1170p) ((SelectionController$modifier$1) this.f11486a).invoke();
        if (interfaceC1170p == null || !interfaceC1170p.c()) {
            return false;
        }
        r rVar = this.f11487b;
        rVar.f();
        return SelectionRegistrarKt.a(rVar, this.f11488c);
    }

    @Override // androidx.compose.foundation.text.selection.e
    public final void b() {
        this.f11487b.g();
    }

    @Override // androidx.compose.foundation.text.selection.e
    public final boolean c(long j, androidx.compose.foundation.text.selection.j jVar) {
        InterfaceC1170p interfaceC1170p = (InterfaceC1170p) ((SelectionController$modifier$1) this.f11486a).invoke();
        if (interfaceC1170p == null) {
            return true;
        }
        if (!interfaceC1170p.c()) {
            return false;
        }
        r rVar = this.f11487b;
        if (!SelectionRegistrarKt.a(rVar, this.f11488c)) {
            return false;
        }
        rVar.e();
        return true;
    }
}
