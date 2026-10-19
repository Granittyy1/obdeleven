package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.r;
import androidx.compose.foundation.text.t;
import androidx.compose.ui.layout.InterfaceC1170p;

/* JADX INFO: compiled from: SelectionController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11481a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11482b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.a<InterfaceC1170p> f11483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f11484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f11485e;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Ia.a<? extends InterfaceC1170p> aVar, r rVar, long j) {
        this.f11483c = aVar;
        this.f11484d = rVar;
        this.f11485e = j;
    }

    @Override // androidx.compose.foundation.text.t
    public final void a() {
        long j = this.f11485e;
        r rVar = this.f11484d;
        if (SelectionRegistrarKt.a(rVar, j)) {
            rVar.g();
        }
    }

    @Override // androidx.compose.foundation.text.t
    public final void b(long j) {
        InterfaceC1170p interfaceC1170p = (InterfaceC1170p) ((SelectionController$modifier$1) this.f11483c).invoke();
        r rVar = this.f11484d;
        if (interfaceC1170p != null) {
            if (!interfaceC1170p.c()) {
                return;
            }
            rVar.f();
            this.f11481a = j;
        }
        if (SelectionRegistrarKt.a(rVar, this.f11485e)) {
            this.f11482b = 0L;
        }
    }

    @Override // androidx.compose.foundation.text.t
    public final void e(long j) {
        InterfaceC1170p interfaceC1170p = (InterfaceC1170p) ((SelectionController$modifier$1) this.f11483c).invoke();
        if (interfaceC1170p == null || !interfaceC1170p.c()) {
            return;
        }
        r rVar = this.f11484d;
        if (SelectionRegistrarKt.a(rVar, this.f11485e)) {
            long jG = I.d.g(this.f11482b, j);
            this.f11482b = jG;
            long jG2 = I.d.g(this.f11481a, jG);
            if (rVar.e()) {
                this.f11481a = jG2;
                this.f11482b = 0L;
            }
        }
    }

    @Override // androidx.compose.foundation.text.t
    public final void onCancel() {
        long j = this.f11485e;
        r rVar = this.f11484d;
        if (SelectionRegistrarKt.a(rVar, j)) {
            rVar.g();
        }
    }

    @Override // androidx.compose.foundation.text.t
    public final void c() {
    }

    @Override // androidx.compose.foundation.text.t
    public final void d() {
    }
}
