package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: VirtualLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class i extends p089h0.b {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f16148w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f16149x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f16150y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f16151z0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f16141A0 = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f16142B0 = 0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f16143C0 = false;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f16144D0 = 0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f16145E0 = 0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final i0.b.a f16146F0 = new i0.b.a();

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public p101i0.b.InterfaceC0381b f16147G0 = null;

    public final void X(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        p101i0.b.InterfaceC0381b interfaceC0381b;
        ConstraintWidget constraintWidget2;
        while (true) {
            interfaceC0381b = this.f16147G0;
            if (interfaceC0381b != null || (constraintWidget2 = this.f15963V) == null) {
                break;
            } else {
                this.f16147G0 = ((d) constraintWidget2).f16091y0;
            }
        }
        i0.b.a aVar = this.f16146F0;
        aVar.f36464a = dimensionBehaviour;
        aVar.f36465b = dimensionBehaviour2;
        aVar.f36466c = i10;
        aVar.f36467d = i11;
        ((ConstraintLayout.b) interfaceC0381b).b(constraintWidget, aVar);
        constraintWidget.S(aVar.f36468e);
        constraintWidget.P(aVar.f36469f);
        constraintWidget.f15946E = aVar.f36471h;
        constraintWidget.M(aVar.f36470g);
    }

    @Override // p089h0.b, p089h0.a
    public final void c() {
        for (int i10 = 0; i10 < this.v0; i10++) {
            ConstraintWidget constraintWidget = this.f35714u0[i10];
            if (constraintWidget != null) {
                constraintWidget.f15948G = true;
            }
        }
    }

    public void W(int i10, int i11, int i12, int i13) {
    }
}
