package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p101i0.j;

/* JADX INFO: compiled from: ConstraintWidgetContainer.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p089h0.c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final androidx.constraintlayout.core.c f16073A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f16074B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f16075C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f16076D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f16077E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public c[] f16078F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public c[] f16079G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f16080H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f16081I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f16082J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f16083K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f16084L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f16085M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f16086N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final HashSet<ConstraintWidget> f16087O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final i0.b.a f16088P0;
    public final p101i0.b v0 = new p101i0.b(this);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final p101i0.e f16089w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f16090x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public p101i0.b.InterfaceC0381b f16091y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f16092z0;

    public d() {
        p101i0.e eVar = new p101i0.e();
        eVar.f36476b = true;
        eVar.f36477c = true;
        eVar.f36479e = new ArrayList<>();
        new ArrayList();
        eVar.f36480f = null;
        eVar.f36481g = new i0.b.a();
        eVar.f36482h = new ArrayList<>();
        eVar.f36475a = this;
        eVar.f36478d = this;
        this.f16089w0 = eVar;
        this.f16091y0 = null;
        this.f16092z0 = false;
        this.f16073A0 = new androidx.constraintlayout.core.c();
        this.f16076D0 = 0;
        this.f16077E0 = 0;
        this.f16078F0 = new c[4];
        this.f16079G0 = new c[4];
        this.f16080H0 = 257;
        this.f16081I0 = false;
        this.f16082J0 = false;
        this.f16083K0 = null;
        this.f16084L0 = null;
        this.f16085M0 = null;
        this.f16086N0 = null;
        this.f16087O0 = new HashSet<>();
        this.f16088P0 = new i0.b.a();
    }

    public static void Z(ConstraintWidget constraintWidget, p101i0.b.InterfaceC0381b interfaceC0381b, i0.b.a aVar) {
        int i10;
        int i11;
        if (interfaceC0381b == null) {
            return;
        }
        if (constraintWidget.f15985i0 == 8 || (constraintWidget instanceof f) || (constraintWidget instanceof a)) {
            aVar.f36468e = 0;
            aVar.f36469f = 0;
            return;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f15962U;
        aVar.f36464a = dimensionBehaviourArr[0];
        aVar.f36465b = dimensionBehaviourArr[1];
        aVar.f36466c = constraintWidget.u();
        aVar.f36467d = constraintWidget.o();
        aVar.f36472i = false;
        aVar.j = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f36464a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f16015d;
        boolean z10 = dimensionBehaviour == dimensionBehaviour2;
        boolean z11 = aVar.f36465b == dimensionBehaviour2;
        boolean z12 = z10 && constraintWidget.f15966Y > 0.0f;
        boolean z13 = z11 && constraintWidget.f15966Y > 0.0f;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16014c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f16013b;
        if (z10 && constraintWidget.x(0) && constraintWidget.f16001r == 0 && !z12) {
            aVar.f36464a = dimensionBehaviour3;
            if (z11 && constraintWidget.f16003s == 0) {
                aVar.f36464a = dimensionBehaviour4;
            }
            z10 = false;
        }
        if (z11 && constraintWidget.x(1) && constraintWidget.f16003s == 0 && !z13) {
            aVar.f36465b = dimensionBehaviour3;
            if (z10 && constraintWidget.f16001r == 0) {
                aVar.f36465b = dimensionBehaviour4;
            }
            z11 = false;
        }
        if (constraintWidget.E()) {
            aVar.f36464a = dimensionBehaviour4;
            z10 = false;
        }
        if (constraintWidget.F()) {
            aVar.f36465b = dimensionBehaviour4;
            z11 = false;
        }
        int[] iArr = constraintWidget.f16005t;
        if (z12) {
            if (iArr[0] == 4) {
                aVar.f36464a = dimensionBehaviour4;
            } else if (!z11) {
                if (aVar.f36465b == dimensionBehaviour4) {
                    i11 = aVar.f36467d;
                } else {
                    aVar.f36464a = dimensionBehaviour3;
                    ((ConstraintLayout.b) interfaceC0381b).b(constraintWidget, aVar);
                    i11 = aVar.f36469f;
                }
                aVar.f36464a = dimensionBehaviour4;
                aVar.f36466c = (int) (constraintWidget.f15966Y * i11);
            }
        }
        if (z13) {
            if (iArr[1] == 4) {
                aVar.f36465b = dimensionBehaviour4;
            } else if (!z10) {
                if (aVar.f36464a == dimensionBehaviour4) {
                    i10 = aVar.f36466c;
                } else {
                    aVar.f36465b = dimensionBehaviour3;
                    ((ConstraintLayout.b) interfaceC0381b).b(constraintWidget, aVar);
                    i10 = aVar.f36468e;
                }
                aVar.f36465b = dimensionBehaviour4;
                if (constraintWidget.f15967Z == -1) {
                    aVar.f36467d = (int) (i10 / constraintWidget.f15966Y);
                } else {
                    aVar.f36467d = (int) (constraintWidget.f15966Y * i10);
                }
            }
        }
        ((ConstraintLayout.b) interfaceC0381b).b(constraintWidget, aVar);
        constraintWidget.S(aVar.f36468e);
        constraintWidget.P(aVar.f36469f);
        constraintWidget.f15946E = aVar.f36471h;
        constraintWidget.M(aVar.f36470g);
        aVar.j = 0;
    }

    @Override // p089h0.c, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void G() {
        this.f16073A0.t();
        this.f16074B0 = 0;
        this.f16075C0 = 0;
        super.G();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void T(boolean z10, boolean z11) {
        super.T(z10, z11);
        int size = this.f35715u0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35715u0.get(i10).T(z10, z11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:348:0x0605  */
    /* JADX WARN: Code duplicated, block: B:351:0x0611  */
    /* JADX WARN: Code duplicated, block: B:358:0x0628  */
    /* JADX WARN: Code duplicated, block: B:359:0x062f  */
    /* JADX WARN: Code duplicated, block: B:365:0x0642  */
    /* JADX WARN: Code duplicated, block: B:371:0x065a  */
    /* JADX WARN: Code duplicated, block: B:374:0x0660  */
    /* JADX WARN: Code duplicated, block: B:376:0x0668 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:379:0x0676  */
    /* JADX WARN: Code duplicated, block: B:386:0x0694  */
    /* JADX WARN: Code duplicated, block: B:390:0x069f  */
    /* JADX WARN: Code duplicated, block: B:393:0x06aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:395:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:398:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:402:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:405:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:407:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:411:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:416:0x06fb A[Catch: Exception -> 0x0709, LOOP:11: B:415:0x06f9->B:416:0x06fb, LOOP_END, TryCatch #5 {Exception -> 0x0709, blocks: (B:414:0x06f1, B:416:0x06fb, B:420:0x0715), top: B:551:0x06f1 }] */
    /* JADX WARN: Code duplicated, block: B:425:0x0722 A[Catch: Exception -> 0x075b, TRY_LEAVE, TryCatch #3 {Exception -> 0x075b, blocks: (B:423:0x071c, B:425:0x0722), top: B:547:0x071c }] */
    /* JADX WARN: Code duplicated, block: B:441:0x0765  */
    /* JADX WARN: Code duplicated, block: B:444:0x0771 A[Catch: Exception -> 0x0747, TryCatch #7 {Exception -> 0x0747, blocks: (B:431:0x0740, B:442:0x076d, B:444:0x0771, B:446:0x0777, B:447:0x0793, B:449:0x0797, B:451:0x079d, B:455:0x07b5, B:458:0x07c0, B:460:0x07c4, B:462:0x07ca), top: B:555:0x0740 }] */
    /* JADX WARN: Code duplicated, block: B:449:0x0797 A[Catch: Exception -> 0x0747, TryCatch #7 {Exception -> 0x0747, blocks: (B:431:0x0740, B:442:0x076d, B:444:0x0771, B:446:0x0777, B:447:0x0793, B:449:0x0797, B:451:0x079d, B:455:0x07b5, B:458:0x07c0, B:460:0x07c4, B:462:0x07ca), top: B:555:0x0740 }] */
    /* JADX WARN: Code duplicated, block: B:458:0x07c0 A[Catch: Exception -> 0x0747, PHI: r22
      0x07c0: PHI (r22v7 androidx.constraintlayout.core.widgets.ConstraintAnchor) = 
      (r22v2 androidx.constraintlayout.core.widgets.ConstraintAnchor)
      (r22v2 androidx.constraintlayout.core.widgets.ConstraintAnchor)
      (r22v9 androidx.constraintlayout.core.widgets.ConstraintAnchor)
     binds: [B:448:0x0795, B:450:0x079b, B:455:0x07b5] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {Exception -> 0x0747, blocks: (B:431:0x0740, B:442:0x076d, B:444:0x0771, B:446:0x0777, B:447:0x0793, B:449:0x0797, B:451:0x079d, B:455:0x07b5, B:458:0x07c0, B:460:0x07c4, B:462:0x07ca), top: B:555:0x0740 }] */
    /* JADX WARN: Code duplicated, block: B:460:0x07c4 A[Catch: Exception -> 0x0747, TryCatch #7 {Exception -> 0x0747, blocks: (B:431:0x0740, B:442:0x076d, B:444:0x0771, B:446:0x0777, B:447:0x0793, B:449:0x0797, B:451:0x079d, B:455:0x07b5, B:458:0x07c0, B:460:0x07c4, B:462:0x07ca), top: B:555:0x0740 }] */
    /* JADX WARN: Code duplicated, block: B:470:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:480:0x0823  */
    /* JADX WARN: Code duplicated, block: B:482:0x083b  */
    /* JADX WARN: Code duplicated, block: B:484:0x084f  */
    /* JADX WARN: Code duplicated, block: B:486:0x0853  */
    /* JADX WARN: Code duplicated, block: B:489:0x0860  */
    /* JADX WARN: Code duplicated, block: B:491:0x0867 A[LOOP:14: B:490:0x0865->B:491:0x0867, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:495:0x087b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:500:0x0887 A[LOOP:13: B:499:0x0885->B:500:0x0887, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:503:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:507:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:512:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:515:0x090c  */
    /* JADX WARN: Code duplicated, block: B:516:0x0919  */
    /* JADX WARN: Code duplicated, block: B:518:0x091c  */
    /* JADX WARN: Code duplicated, block: B:520:0x0923 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:523:0x092b  */
    /* JADX WARN: Code duplicated, block: B:526:0x093e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:531:0x095c A[PHI: r18 r23
      0x095c: PHI (r18v7 ??) = (r18v6 ??), (r18v10 ??), (r18v10 ??) binds: [B:517:0x091a, B:525:0x093c, B:526:0x093e] A[DONT_GENERATE, DONT_INLINE]
      0x095c: PHI (r23v11 boolean) = (r23v10 boolean), (r23v14 boolean), (r23v14 boolean) binds: [B:517:0x091a, B:525:0x093c, B:526:0x093e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:533:0x0961  */
    /* JADX WARN: Code duplicated, block: B:534:0x0963  */
    /* JADX WARN: Code duplicated, block: B:538:0x0976  */
    /* JADX WARN: Code duplicated, block: B:547:0x071c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x06db A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v33 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r18v35 */
    /* JADX WARN: Type inference failed for: r18v36 */
    /* JADX WARN: Type inference failed for: r18v37 */
    /* JADX WARN: Type inference failed for: r18v38 */
    /* JADX WARN: Type inference failed for: r18v39 */
    /* JADX WARN: Type inference failed for: r18v40 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r31v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.d, h0.c] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // p089h0.c
    public final void V() {
        int i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintAnchor constraintAnchor;
        int i11;
        androidx.constraintlayout.core.c cVar;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintAnchor constraintAnchor2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        boolean z10;
        boolean z11;
        char c10;
        ArrayList<ConstraintWidget> arrayList;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr;
        boolean z12;
        int i12;
        int i13;
        boolean zA0;
        boolean z13;
        int i14;
        ?? r15;
        boolean z14;
        int i15;
        ConstraintAnchor constraintAnchor3;
        boolean z15;
        ?? r21;
        boolean[] zArr;
        int i16;
        boolean z16;
        int iMax;
        boolean z17;
        int iMax2;
        ?? r10;
        ?? r18;
        int i17;
        ?? r19;
        int i18;
        ?? r110;
        ?? r16;
        int i19;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zA1;
        int size;
        int i20;
        boolean z18;
        ConstraintWidget constraintWidget;
        ?? r22;
        int i21;
        WeakReference<ConstraintAnchor> weakReference;
        ConstraintAnchor constraintAnchor4;
        WeakReference<ConstraintAnchor> weakReference2;
        WeakReference<ConstraintAnchor> weakReference3;
        WeakReference<ConstraintAnchor> weakReference4;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7;
        j jVar;
        j jVar2;
        int i22;
        int iU;
        int i23;
        int iO;
        int i24;
        int iB;
        j jVar3;
        j jVar4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8;
        this.f15969a0 = 0;
        this.f15971b0 = 0;
        this.f16081I0 = false;
        this.f16082J0 = false;
        int size2 = this.f35715u0.size();
        int iMax7 = Math.max(0, u());
        int iMax8 = Math.max(0, o());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.f15962U;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviourArr2[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviourArr2[0];
        int i25 = this.f16090x0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.f16015d;
        ConstraintAnchor constraintAnchor5 = this.f15952K;
        ConstraintAnchor constraintAnchor6 = this.f15951J;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.f16013b;
        if (i25 == 0 && g.b(this.f16080H0, 1)) {
            p101i0.b.InterfaceC0381b interfaceC0381b = this.f16091y0;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = this.f15962U;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dimensionBehaviourArr3[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = dimensionBehaviourArr3[1];
            I();
            ArrayList<ConstraintWidget> arrayList2 = this.f35715u0;
            int size3 = arrayList2.size();
            for (int i26 = 0; i26 < size3; i26++) {
                arrayList2.get(i26).I();
            }
            boolean z19 = this.f16092z0;
            if (dimensionBehaviour13 == dimensionBehaviour12) {
                N(0, u());
            } else {
                constraintAnchor6.l(0);
                this.f15969a0 = 0;
            }
            boolean z20 = false;
            int i27 = 0;
            boolean z21 = false;
            while (i27 < size3) {
                ConstraintAnchor constraintAnchor7 = constraintAnchor6;
                ConstraintWidget constraintWidget3 = arrayList2.get(i27);
                int i28 = iMax7;
                if (constraintWidget3 instanceof f) {
                    f fVar = (f) constraintWidget3;
                    dimensionBehaviour8 = dimensionBehaviour9;
                    if (fVar.f16138y0 == 1) {
                        int i29 = fVar.v0;
                        if (i29 != -1) {
                            fVar.V(i29);
                        } else if (fVar.f16136w0 != -1 && E()) {
                            fVar.V(u() - fVar.f16136w0);
                        } else if (E()) {
                            fVar.V((int) ((fVar.f16135u0 * u()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else {
                    dimensionBehaviour8 = dimensionBehaviour9;
                    if ((constraintWidget3 instanceof a) && ((a) constraintWidget3).X() == 0) {
                        z21 = true;
                    }
                }
                i27++;
                iMax7 = i28;
                constraintAnchor6 = constraintAnchor7;
                dimensionBehaviour9 = dimensionBehaviour8;
            }
            i10 = iMax7;
            dimensionBehaviour = dimensionBehaviour9;
            constraintAnchor = constraintAnchor6;
            if (z20) {
                for (int i30 = 0; i30 < size3; i30++) {
                    ConstraintWidget constraintWidget4 = arrayList2.get(i30);
                    if (constraintWidget4 instanceof f) {
                        f fVar2 = (f) constraintWidget4;
                        if (fVar2.f16138y0 == 1) {
                            p101i0.f.b(0, fVar2, interfaceC0381b, z19);
                        }
                    }
                }
            }
            p101i0.f.b(0, this, interfaceC0381b, z19);
            if (z21) {
                for (int i31 = 0; i31 < size3; i31++) {
                    ConstraintWidget constraintWidget5 = arrayList2.get(i31);
                    if (constraintWidget5 instanceof a) {
                        a aVar = (a) constraintWidget5;
                        if (aVar.X() == 0 && aVar.W()) {
                            p101i0.f.b(1, aVar, interfaceC0381b, z19);
                        }
                    }
                }
            }
            if (dimensionBehaviour14 == dimensionBehaviour12) {
                O(0, o());
            } else {
                constraintAnchor5.l(0);
                this.f15971b0 = 0;
            }
            boolean z22 = false;
            boolean z23 = false;
            for (int i32 = 0; i32 < size3; i32++) {
                ConstraintWidget constraintWidget6 = arrayList2.get(i32);
                if (constraintWidget6 instanceof f) {
                    f fVar3 = (f) constraintWidget6;
                    if (fVar3.f16138y0 == 0) {
                        int i33 = fVar3.v0;
                        if (i33 != -1) {
                            fVar3.V(i33);
                        } else if (fVar3.f16136w0 != -1 && F()) {
                            fVar3.V(o() - fVar3.f16136w0);
                        } else if (F()) {
                            fVar3.V((int) ((fVar3.f16135u0 * o()) + 0.5f));
                        }
                        z22 = true;
                    }
                } else if ((constraintWidget6 instanceof a) && ((a) constraintWidget6).X() == 1) {
                    z23 = true;
                }
            }
            if (z22) {
                for (int i34 = 0; i34 < size3; i34++) {
                    ConstraintWidget constraintWidget7 = arrayList2.get(i34);
                    if (constraintWidget7 instanceof f) {
                        f fVar4 = (f) constraintWidget7;
                        if (fVar4.f16138y0 == 0) {
                            p101i0.f.g(1, fVar4, interfaceC0381b);
                        }
                    }
                }
            }
            p101i0.f.g(0, this, interfaceC0381b);
            if (z23) {
                for (int i35 = 0; i35 < size3; i35++) {
                    ConstraintWidget constraintWidget8 = arrayList2.get(i35);
                    if (constraintWidget8 instanceof a) {
                        a aVar2 = (a) constraintWidget8;
                        if (aVar2.X() == 1 && aVar2.W()) {
                            p101i0.f.g(1, aVar2, interfaceC0381b);
                        }
                    }
                }
            }
            for (int i36 = 0; i36 < size3; i36++) {
                ConstraintWidget constraintWidget9 = arrayList2.get(i36);
                if (constraintWidget9.D() && p101i0.f.a(constraintWidget9)) {
                    Z(constraintWidget9, interfaceC0381b, p101i0.f.f36483a);
                    if (!(constraintWidget9 instanceof f)) {
                        p101i0.f.b(0, constraintWidget9, interfaceC0381b, z19);
                        p101i0.f.g(0, constraintWidget9, interfaceC0381b);
                    } else if (((f) constraintWidget9).f16138y0 == 0) {
                        p101i0.f.g(0, constraintWidget9, interfaceC0381b);
                    } else {
                        p101i0.f.b(0, constraintWidget9, interfaceC0381b, z19);
                    }
                }
            }
            for (int i37 = 0; i37 < size2; i37++) {
                ConstraintWidget constraintWidget10 = this.f35715u0.get(i37);
                if (constraintWidget10.D() && !(constraintWidget10 instanceof f) && !(constraintWidget10 instanceof a) && !(constraintWidget10 instanceof i) && !constraintWidget10.f15948G) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourN = constraintWidget10.n(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourN2 = constraintWidget10.n(1);
                    if (dimensionBehaviourN != dimensionBehaviour11 || constraintWidget10.f16001r == 1 || dimensionBehaviourN2 != dimensionBehaviour11 || constraintWidget10.f16003s == 1) {
                        Z(constraintWidget10, this.f16091y0, new i0.b.a());
                    }
                }
            }
        } else {
            i10 = iMax7;
            iMax8 = iMax8;
            dimensionBehaviour = dimensionBehaviour9;
            constraintAnchor = constraintAnchor6;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.f16014c;
        androidx.constraintlayout.core.c cVar2 = this.f16073A0;
        if (size2 > 2) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dimensionBehaviour;
            if ((dimensionBehaviour10 == dimensionBehaviour15 || dimensionBehaviour16 == dimensionBehaviour15) && g.b(this.f16080H0, 1024)) {
                p101i0.b.InterfaceC0381b interfaceC0381b2 = this.f16091y0;
                ArrayList<ConstraintWidget> arrayList3 = this.f35715u0;
                int size4 = arrayList3.size();
                int i38 = 0;
                while (true) {
                    if (i38 < size4) {
                        ConstraintWidget constraintWidget11 = arrayList3.get(i38);
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = this.f15962U;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviourArr4[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviourArr4[1];
                        constraintAnchor2 = constraintAnchor5;
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr5 = constraintWidget11.f15962U;
                        i11 = size2;
                        if (p101i0.g.b(dimensionBehaviour17, dimensionBehaviour18, dimensionBehaviourArr5[0], dimensionBehaviourArr5[1]) && !(constraintWidget11 instanceof e)) {
                            i38++;
                            constraintAnchor5 = constraintAnchor2;
                            size2 = i11;
                        } else {
                            dimensionBehaviour4 = dimensionBehaviour15;
                            dimensionBehaviour6 = dimensionBehaviour10;
                            dimensionBehaviour7 = dimensionBehaviour16;
                            dimensionBehaviour5 = dimensionBehaviour12;
                            cVar = cVar2;
                        }
                    } else {
                        i11 = size2;
                        constraintAnchor2 = constraintAnchor5;
                        int i39 = 0;
                        ArrayList arrayList4 = null;
                        ArrayList<p089h0.b> arrayList5 = null;
                        ArrayList arrayList6 = null;
                        ArrayList<p089h0.b> arrayList7 = null;
                        ArrayList arrayList8 = null;
                        ArrayList arrayList9 = null;
                        while (i39 < size4) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviour16;
                            ConstraintWidget constraintWidget12 = arrayList3.get(i39);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = dimensionBehaviour10;
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr6 = this.f15962U;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = dimensionBehaviour12;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = dimensionBehaviourArr6[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour23 = dimensionBehaviourArr6[1];
                            androidx.constraintlayout.core.c cVar3 = cVar2;
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr7 = constraintWidget12.f15962U;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour24 = dimensionBehaviour15;
                            if (!p101i0.g.b(dimensionBehaviour22, dimensionBehaviour23, dimensionBehaviourArr7[0], dimensionBehaviourArr7[1])) {
                                Z(constraintWidget12, interfaceC0381b2, this.f16088P0);
                            }
                            boolean z24 = constraintWidget12 instanceof f;
                            if (z24) {
                                f fVar5 = (f) constraintWidget12;
                                if (fVar5.f16138y0 == 0) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(fVar5);
                                }
                                if (fVar5.f16138y0 == 1) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(fVar5);
                                }
                            }
                            if (constraintWidget12 instanceof p089h0.b) {
                                if (constraintWidget12 instanceof a) {
                                    a aVar3 = (a) constraintWidget12;
                                    if (aVar3.X() == 0) {
                                        if (arrayList5 == null) {
                                            arrayList5 = new ArrayList();
                                        }
                                        arrayList5.add(aVar3);
                                    }
                                    if (aVar3.X() == 1) {
                                        if (arrayList7 == null) {
                                            arrayList7 = new ArrayList();
                                        }
                                        arrayList7.add(aVar3);
                                    }
                                } else {
                                    p089h0.b bVar = (p089h0.b) constraintWidget12;
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(bVar);
                                    if (arrayList7 == null) {
                                        arrayList7 = new ArrayList();
                                    }
                                    arrayList7.add(bVar);
                                }
                            }
                            if (constraintWidget12.f15951J.f15930f == null && constraintWidget12.f15953L.f15930f == null && !z24 && !(constraintWidget12 instanceof a)) {
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(constraintWidget12);
                            }
                            if (constraintWidget12.f15952K.f15930f == null && constraintWidget12.f15954M.f15930f == null && constraintWidget12.f15955N.f15930f == null && !z24 && !(constraintWidget12 instanceof a)) {
                                if (arrayList9 == null) {
                                    arrayList9 = new ArrayList();
                                }
                                ArrayList arrayList10 = arrayList9;
                                arrayList10.add(constraintWidget12);
                                arrayList9 = arrayList10;
                            }
                            i39++;
                            dimensionBehaviour10 = dimensionBehaviour20;
                            dimensionBehaviour16 = dimensionBehaviour19;
                            dimensionBehaviour12 = dimensionBehaviour21;
                            cVar2 = cVar3;
                            dimensionBehaviour15 = dimensionBehaviour24;
                        }
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour25 = dimensionBehaviour15;
                        androidx.constraintlayout.core.c cVar4 = cVar2;
                        dimensionBehaviour6 = dimensionBehaviour10;
                        dimensionBehaviour7 = dimensionBehaviour16;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour26 = dimensionBehaviour12;
                        ArrayList<j> arrayList11 = new ArrayList<>();
                        if (arrayList4 != null) {
                            Iterator it = arrayList4.iterator();
                            while (it.hasNext()) {
                                p101i0.g.a((f) it.next(), 0, arrayList11, null);
                            }
                        }
                        int i40 = 0;
                        j jVar5 = null;
                        if (arrayList5 != null) {
                            for (p089h0.b bVar2 : arrayList5) {
                                j jVarA = p101i0.g.a(bVar2, i40, arrayList11, jVar5);
                                bVar2.V(i40, jVarA, arrayList11);
                                jVarA.a(arrayList11);
                                i40 = 0;
                                jVar5 = null;
                            }
                        }
                        HashSet<ConstraintAnchor> hashSet = m(ConstraintAnchor.Type.f15934b).f15925a;
                        if (hashSet != null) {
                            Iterator<ConstraintAnchor> it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                p101i0.g.a(it2.next().f15928d, 0, arrayList11, null);
                            }
                        }
                        HashSet<ConstraintAnchor> hashSet2 = m(ConstraintAnchor.Type.f15936d).f15925a;
                        if (hashSet2 != null) {
                            Iterator<ConstraintAnchor> it3 = hashSet2.iterator();
                            while (it3.hasNext()) {
                                p101i0.g.a(it3.next().f15928d, 0, arrayList11, null);
                            }
                        }
                        ConstraintAnchor.Type type = ConstraintAnchor.Type.f15939g;
                        HashSet<ConstraintAnchor> hashSet3 = m(type).f15925a;
                        if (hashSet3 != null) {
                            Iterator<ConstraintAnchor> it4 = hashSet3.iterator();
                            while (it4.hasNext()) {
                                p101i0.g.a(it4.next().f15928d, 0, arrayList11, null);
                            }
                        }
                        j jVar6 = null;
                        if (arrayList8 != null) {
                            Iterator it5 = arrayList8.iterator();
                            while (it5.hasNext()) {
                                p101i0.g.a((ConstraintWidget) it5.next(), 0, arrayList11, null);
                            }
                        }
                        if (arrayList6 != null) {
                            Iterator it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                p101i0.g.a((f) it6.next(), 1, arrayList11, null);
                            }
                        }
                        int i41 = 1;
                        if (arrayList7 != null) {
                            for (p089h0.b bVar3 : arrayList7) {
                                j jVarA2 = p101i0.g.a(bVar3, i41, arrayList11, jVar6);
                                bVar3.V(i41, jVarA2, arrayList11);
                                jVarA2.a(arrayList11);
                                i41 = 1;
                                jVar6 = null;
                            }
                        }
                        HashSet<ConstraintAnchor> hashSet4 = m(ConstraintAnchor.Type.f15935c).f15925a;
                        if (hashSet4 != null) {
                            Iterator<ConstraintAnchor> it7 = hashSet4.iterator();
                            while (it7.hasNext()) {
                                p101i0.g.a(it7.next().f15928d, 1, arrayList11, null);
                            }
                        }
                        HashSet<ConstraintAnchor> hashSet5 = m(ConstraintAnchor.Type.f15938f).f15925a;
                        if (hashSet5 != null) {
                            Iterator<ConstraintAnchor> it8 = hashSet5.iterator();
                            while (it8.hasNext()) {
                                p101i0.g.a(it8.next().f15928d, 1, arrayList11, null);
                            }
                        }
                        HashSet<ConstraintAnchor> hashSet6 = m(ConstraintAnchor.Type.f15937e).f15925a;
                        if (hashSet6 != null) {
                            Iterator<ConstraintAnchor> it9 = hashSet6.iterator();
                            while (it9.hasNext()) {
                                p101i0.g.a(it9.next().f15928d, 1, arrayList11, null);
                            }
                        }
                        HashSet<ConstraintAnchor> hashSet7 = m(type).f15925a;
                        if (hashSet7 != null) {
                            Iterator<ConstraintAnchor> it10 = hashSet7.iterator();
                            while (it10.hasNext()) {
                                p101i0.g.a(it10.next().f15928d, 1, arrayList11, null);
                            }
                        }
                        if (arrayList9 != null) {
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                p101i0.g.a((ConstraintWidget) it11.next(), 1, arrayList11, null);
                            }
                        }
                        for (int i42 = 0; i42 < size4; i42++) {
                            ConstraintWidget constraintWidget13 = arrayList3.get(i42);
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr8 = constraintWidget13.f15962U;
                            if (dimensionBehaviourArr8[0] == dimensionBehaviour11 && dimensionBehaviourArr8[1] == dimensionBehaviour11) {
                                int i43 = constraintWidget13.f16004s0;
                                int size5 = arrayList11.size();
                                int i44 = 0;
                                while (true) {
                                    if (i44 >= size5) {
                                        jVar3 = null;
                                        break;
                                    }
                                    jVar3 = arrayList11.get(i44);
                                    if (i43 == jVar3.f36488b) {
                                        break;
                                    } else {
                                        i44++;
                                    }
                                }
                                int i45 = constraintWidget13.f16006t0;
                                int size6 = arrayList11.size();
                                int i46 = 0;
                                while (true) {
                                    if (i46 >= size6) {
                                        jVar4 = null;
                                        break;
                                    }
                                    jVar4 = arrayList11.get(i46);
                                    if (i45 == jVar4.f36488b) {
                                        break;
                                    } else {
                                        i46++;
                                    }
                                }
                                if (jVar3 != null && jVar4 != null) {
                                    jVar3.c(0, jVar4);
                                    jVar4.f36489c = 2;
                                    arrayList11.remove(jVar3);
                                }
                            }
                        }
                        if (arrayList11.size() > 1) {
                            dimensionBehaviour4 = dimensionBehaviour25;
                            if (this.f15962U[0] == dimensionBehaviour4) {
                                int i47 = 0;
                                jVar = null;
                                for (j jVar7 : arrayList11) {
                                    if (jVar7.f36489c != 1) {
                                        androidx.constraintlayout.core.c cVar5 = cVar4;
                                        int iB2 = jVar7.b(cVar5, 0);
                                        if (iB2 > i47) {
                                            jVar = jVar7;
                                            i47 = iB2;
                                        }
                                        cVar4 = cVar5;
                                    }
                                }
                                cVar = cVar4;
                                dimensionBehaviour5 = dimensionBehaviour26;
                                if (jVar != null) {
                                    Q(dimensionBehaviour5);
                                    S(i47);
                                }
                                if (this.f15962U[1] == dimensionBehaviour4) {
                                    i24 = 0;
                                    jVar2 = null;
                                    for (j jVar8 : arrayList11) {
                                        if (jVar8.f36489c != 0 && (iB = jVar8.b(cVar, 1)) > i24) {
                                            jVar2 = jVar8;
                                            i24 = iB;
                                        }
                                    }
                                    if (jVar2 != null) {
                                        R(dimensionBehaviour5);
                                        P(i24);
                                    } else {
                                        jVar2 = null;
                                    }
                                } else {
                                    jVar2 = null;
                                }
                                if (jVar == null || jVar2 != null) {
                                    dimensionBehaviour2 = dimensionBehaviour6;
                                    if (dimensionBehaviour2 == dimensionBehaviour4) {
                                        i22 = i10;
                                        if (i22 < u() || i22 <= 0) {
                                            iU = u();
                                        } else {
                                            S(i22);
                                            this.f16081I0 = true;
                                        }
                                        dimensionBehaviour3 = dimensionBehaviour7;
                                        if (dimensionBehaviour3 == dimensionBehaviour4) {
                                            i23 = iMax8;
                                            if (i23 < o() || i23 <= 0) {
                                                iO = o();
                                            } else {
                                                P(i23);
                                                this.f16082J0 = true;
                                            }
                                            iMax8 = iO;
                                            i10 = iU;
                                            z10 = true;
                                        } else {
                                            i23 = iMax8;
                                        }
                                        iO = i23;
                                        iMax8 = iO;
                                        i10 = iU;
                                        z10 = true;
                                    } else {
                                        i22 = i10;
                                    }
                                    iU = i22;
                                    dimensionBehaviour3 = dimensionBehaviour7;
                                    if (dimensionBehaviour3 == dimensionBehaviour4) {
                                        i23 = iMax8;
                                        if (i23 < o()) {
                                        }
                                        iO = o();
                                        iMax8 = iO;
                                        i10 = iU;
                                        z10 = true;
                                    } else {
                                        i23 = iMax8;
                                    }
                                    iO = i23;
                                    iMax8 = iO;
                                    i10 = iU;
                                    z10 = true;
                                }
                                if (!a0(64) || a0(128)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                cVar.getClass();
                                cVar.f15911h = false;
                                if (this.f16080H0 == 0 && z11) {
                                    c10 = 1;
                                    cVar.f15911h = true;
                                } else {
                                    c10 = 1;
                                }
                                arrayList = this.f35715u0;
                                dimensionBehaviourArr = this.f15962U;
                                if (dimensionBehaviourArr[0] != dimensionBehaviour4 || dimensionBehaviourArr[c10] == dimensionBehaviour4) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f16076D0 = 0;
                                this.f16077E0 = 0;
                                i12 = i11;
                                for (i13 = 0; i13 < i12; i13++) {
                                    constraintWidget2 = this.f35715u0.get(i13);
                                    if (constraintWidget2 instanceof p089h0.c) {
                                        ((p089h0.c) constraintWidget2).V();
                                    }
                                }
                                zA0 = a0(64);
                                z13 = z10;
                                i14 = 0;
                                r15 = 1;
                                while (r15 != 0) {
                                    i15 = i14 + 1;
                                    try {
                                        cVar.t();
                                        try {
                                            this.f16076D0 = 0;
                                            this.f16077E0 = 0;
                                            k(cVar);
                                            for (i21 = 0; i21 < i12; i21++) {
                                                this.f35715u0.get(i21).k(cVar);
                                            }
                                            X(cVar);
                                            try {
                                                weakReference = this.f16083K0;
                                                if (weakReference != null) {
                                                    try {
                                                        if (weakReference.get() != null) {
                                                            ConstraintAnchor constraintAnchor8 = this.f16083K0.get();
                                                            constraintAnchor4 = constraintAnchor2;
                                                            z15 = z13;
                                                            try {
                                                                SolverVariable solverVariableK = cVar.k(constraintAnchor4);
                                                                constraintAnchor3 = constraintAnchor4;
                                                                try {
                                                                    androidx.constraintlayout.core.c cVar6 = this.f16073A0;
                                                                    iMax8 = iMax8;
                                                                    arrayList = arrayList;
                                                                    try {
                                                                        cVar6.f(cVar6.k(constraintAnchor8), solverVariableK, 0, 5);
                                                                        this.f16083K0 = null;
                                                                    } catch (Exception e10) {
                                                                        e = e10;
                                                                        r22 = 1;
                                                                        e.printStackTrace();
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        r21 = r22;
                                                                        zArr = g.f16140a;
                                                                        if (r21 != 0) {
                                                                            zArr[2] = false;
                                                                            zA1 = a0(64);
                                                                            U(cVar, zA1);
                                                                            size = this.f35715u0.size();
                                                                            i20 = 0;
                                                                            z18 = false;
                                                                            while (i20 < size) {
                                                                                constraintWidget = this.f35715u0.get(i20);
                                                                                constraintWidget.U(cVar, zA1);
                                                                                boolean z25 = zA1;
                                                                                int i48 = size;
                                                                                if (constraintWidget.f15982h == -1) {
                                                                                    z18 = true;
                                                                                } else {
                                                                                    z18 = true;
                                                                                }
                                                                                i20++;
                                                                                zA1 = z25;
                                                                                size = i48;
                                                                                z18 = z18;
                                                                            }
                                                                            z16 = z18;
                                                                        } else {
                                                                            U(cVar, zA0);
                                                                            for (i16 = 0; i16 < i12; i16++) {
                                                                                this.f35715u0.get(i16).U(cVar, zA0);
                                                                            }
                                                                            z16 = false;
                                                                        }
                                                                        if (z12) {
                                                                            iMax3 = 0;
                                                                            iMax4 = 0;
                                                                            for (i19 = 0; i19 < i12; i19++) {
                                                                                ConstraintWidget constraintWidget14 = this.f35715u0.get(i19);
                                                                                iMax4 = Math.max(iMax4, constraintWidget14.u() + constraintWidget14.f15969a0);
                                                                                iMax3 = Math.max(iMax3, constraintWidget14.o() + constraintWidget14.f15971b0);
                                                                            }
                                                                            iMax5 = Math.max(this.f15975d0, iMax4);
                                                                            iMax6 = Math.max(this.f15977e0, iMax3);
                                                                            z16 = z16;
                                                                            if (dimensionBehaviour2 == dimensionBehaviour4) {
                                                                                z16 = z16;
                                                                                S(iMax5);
                                                                                this.f15962U[0] = dimensionBehaviour4;
                                                                                z16 = true;
                                                                                z15 = true;
                                                                            }
                                                                            if (dimensionBehaviour3 == dimensionBehaviour4) {
                                                                                P(iMax6);
                                                                                this.f15962U[1] = dimensionBehaviour4;
                                                                                z16 = true;
                                                                                z15 = true;
                                                                            }
                                                                        }
                                                                        iMax = Math.max(this.f15975d0, u());
                                                                        z17 = z16;
                                                                        if (iMax > u()) {
                                                                            S(iMax);
                                                                            this.f15962U[0] = dimensionBehaviour5;
                                                                            z17 = true;
                                                                            z15 = true;
                                                                        }
                                                                        iMax2 = Math.max(this.f15977e0, o());
                                                                        if (iMax2 > o()) {
                                                                            P(iMax2);
                                                                            r10 = 1;
                                                                            this.f15962U[1] = dimensionBehaviour5;
                                                                            r18 = 1;
                                                                            z15 = true;
                                                                        } else {
                                                                            r10 = 1;
                                                                        }
                                                                        if (z15) {
                                                                            r18 = z17;
                                                                            i17 = iMax8;
                                                                            r19 = r18;
                                                                            r19 = r18;
                                                                            z13 = z15;
                                                                            i18 = 8;
                                                                            r110 = r19;
                                                                        } else {
                                                                            r18 = z17;
                                                                            if (this.f15962U[0] == dimensionBehaviour4) {
                                                                                r18 = r18;
                                                                                if (u() > i10) {
                                                                                    this.f16081I0 = r10;
                                                                                    this.f15962U[0] = dimensionBehaviour5;
                                                                                    S(i10);
                                                                                    ?? r111 = r10;
                                                                                    z15 = r111 == true ? 1 : 0;
                                                                                    r18 = r111;
                                                                                }
                                                                            }
                                                                            r18 = r18;
                                                                            r18 = r18;
                                                                            if (this.f15962U[r10] == dimensionBehaviour4) {
                                                                                r18 = z17;
                                                                                i17 = iMax8;
                                                                                r19 = r18;
                                                                                r19 = r18;
                                                                                z13 = z15;
                                                                                i18 = 8;
                                                                                r110 = r19;
                                                                            } else {
                                                                                r18 = z17;
                                                                                i17 = iMax8;
                                                                                r19 = r18;
                                                                                r19 = r18;
                                                                                z13 = z15;
                                                                                i18 = 8;
                                                                                r110 = r19;
                                                                            }
                                                                        }
                                                                        if (i15 > i18) {
                                                                            r19 = r18;
                                                                            r16 = 0;
                                                                        } else {
                                                                            r19 = r18;
                                                                            r16 = r110;
                                                                        }
                                                                        i14 = i15;
                                                                        iMax8 = i17;
                                                                        constraintAnchor2 = constraintAnchor3;
                                                                        arrayList = arrayList;
                                                                        r15 = r16;
                                                                    }
                                                                } catch (Exception e11) {
                                                                    e = e11;
                                                                    iMax8 = iMax8;
                                                                    arrayList = arrayList;
                                                                }
                                                            } catch (Exception e12) {
                                                                e = e12;
                                                                iMax8 = iMax8;
                                                                arrayList = arrayList;
                                                                constraintAnchor3 = constraintAnchor4;
                                                            }
                                                        } else {
                                                            iMax8 = iMax8;
                                                            arrayList = arrayList;
                                                            constraintAnchor3 = constraintAnchor2;
                                                            z15 = z13;
                                                        }
                                                        weakReference2 = this.f16085M0;
                                                        if (weakReference2 != null && weakReference2.get() != null) {
                                                            ConstraintAnchor constraintAnchor9 = this.f16085M0.get();
                                                            SolverVariable solverVariableK2 = cVar.k(this.f15954M);
                                                            androidx.constraintlayout.core.c cVar7 = this.f16073A0;
                                                            cVar7.f(solverVariableK2, cVar7.k(constraintAnchor9), 0, 5);
                                                            this.f16085M0 = null;
                                                        }
                                                        weakReference3 = this.f16084L0;
                                                        if (weakReference3 != null || weakReference3.get() == null) {
                                                            weakReference4 = this.f16086N0;
                                                            if (weakReference4 == null && weakReference4.get() != null) {
                                                                ConstraintAnchor constraintAnchor10 = this.f16086N0.get();
                                                                SolverVariable solverVariableK3 = cVar.k(this.f15953L);
                                                                try {
                                                                    androidx.constraintlayout.core.c cVar8 = this.f16073A0;
                                                                    cVar8.f(solverVariableK3, cVar8.k(constraintAnchor10), 0, 5);
                                                                    try {
                                                                        this.f16086N0 = null;
                                                                    } catch (Exception e13) {
                                                                        e = e13;
                                                                        r22 = 1;
                                                                        e.printStackTrace();
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        r21 = r22;
                                                                    }
                                                                } catch (Exception e14) {
                                                                    e = e14;
                                                                    r22 = 1;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    r21 = r22;
                                                                    zArr = g.f16140a;
                                                                    if (r21 != 0) {
                                                                        zArr[2] = false;
                                                                        zA1 = a0(64);
                                                                        U(cVar, zA1);
                                                                        size = this.f35715u0.size();
                                                                        i20 = 0;
                                                                        z18 = false;
                                                                        while (i20 < size) {
                                                                            constraintWidget = this.f35715u0.get(i20);
                                                                            constraintWidget.U(cVar, zA1);
                                                                            boolean z26 = zA1;
                                                                            int i49 = size;
                                                                            if (constraintWidget.f15982h == -1) {
                                                                                z18 = true;
                                                                            } else {
                                                                                z18 = true;
                                                                            }
                                                                            i20++;
                                                                            zA1 = z26;
                                                                            size = i49;
                                                                            z18 = z18;
                                                                        }
                                                                        z16 = z18;
                                                                    } else {
                                                                        U(cVar, zA0);
                                                                        while (i16 < i12) {
                                                                            this.f35715u0.get(i16).U(cVar, zA0);
                                                                        }
                                                                        z16 = false;
                                                                    }
                                                                    if (z12) {
                                                                        iMax3 = 0;
                                                                        iMax4 = 0;
                                                                        while (i19 < i12) {
                                                                            ConstraintWidget constraintWidget15 = this.f35715u0.get(i19);
                                                                            iMax4 = Math.max(iMax4, constraintWidget15.u() + constraintWidget15.f15969a0);
                                                                            iMax3 = Math.max(iMax3, constraintWidget15.o() + constraintWidget15.f15971b0);
                                                                        }
                                                                        iMax5 = Math.max(this.f15975d0, iMax4);
                                                                        iMax6 = Math.max(this.f15977e0, iMax3);
                                                                        z16 = z16;
                                                                        if (dimensionBehaviour2 == dimensionBehaviour4) {
                                                                            z16 = z16;
                                                                            S(iMax5);
                                                                            this.f15962U[0] = dimensionBehaviour4;
                                                                            z16 = true;
                                                                            z15 = true;
                                                                        }
                                                                        if (dimensionBehaviour3 == dimensionBehaviour4) {
                                                                            P(iMax6);
                                                                            this.f15962U[1] = dimensionBehaviour4;
                                                                            z16 = true;
                                                                            z15 = true;
                                                                        }
                                                                    }
                                                                    iMax = Math.max(this.f15975d0, u());
                                                                    z17 = z16;
                                                                    if (iMax > u()) {
                                                                        S(iMax);
                                                                        this.f15962U[0] = dimensionBehaviour5;
                                                                        z17 = true;
                                                                        z15 = true;
                                                                    }
                                                                    iMax2 = Math.max(this.f15977e0, o());
                                                                    if (iMax2 > o()) {
                                                                        P(iMax2);
                                                                        r10 = 1;
                                                                        this.f15962U[1] = dimensionBehaviour5;
                                                                        r18 = 1;
                                                                        z15 = true;
                                                                    } else {
                                                                        r10 = 1;
                                                                    }
                                                                    if (z15) {
                                                                        r18 = z17;
                                                                        if (this.f15962U[0] == dimensionBehaviour4) {
                                                                            r18 = r18;
                                                                            if (u() > i10) {
                                                                                this.f16081I0 = r10;
                                                                                this.f15962U[0] = dimensionBehaviour5;
                                                                                S(i10);
                                                                                ?? r112 = r10;
                                                                                z15 = r112 == true ? 1 : 0;
                                                                                r18 = r112;
                                                                            }
                                                                        }
                                                                        r18 = r18;
                                                                        r18 = r18;
                                                                        if (this.f15962U[r10] == dimensionBehaviour4) {
                                                                            r18 = z17;
                                                                            i17 = iMax8;
                                                                            r19 = r18;
                                                                            r19 = r18;
                                                                            z13 = z15;
                                                                            i18 = 8;
                                                                            r110 = r19;
                                                                        } else {
                                                                            r18 = z17;
                                                                            i17 = iMax8;
                                                                            r19 = r18;
                                                                            r19 = r18;
                                                                            z13 = z15;
                                                                            i18 = 8;
                                                                            r110 = r19;
                                                                        }
                                                                    } else {
                                                                        r18 = z17;
                                                                        i17 = iMax8;
                                                                        r19 = r18;
                                                                        r19 = r18;
                                                                        z13 = z15;
                                                                        i18 = 8;
                                                                        r110 = r19;
                                                                    }
                                                                    if (i15 > i18) {
                                                                        r19 = r18;
                                                                        r16 = 0;
                                                                    } else {
                                                                        r19 = r18;
                                                                        r16 = r110;
                                                                    }
                                                                    i14 = i15;
                                                                    iMax8 = i17;
                                                                    constraintAnchor2 = constraintAnchor3;
                                                                    arrayList = arrayList;
                                                                    r15 = r16;
                                                                }
                                                            }
                                                            cVar.p();
                                                            r21 = 1;
                                                        } else {
                                                            ConstraintAnchor constraintAnchor11 = this.f16084L0.get();
                                                            ConstraintAnchor constraintAnchor12 = constraintAnchor;
                                                            try {
                                                                SolverVariable solverVariableK4 = cVar.k(constraintAnchor12);
                                                                androidx.constraintlayout.core.c cVar9 = this.f16073A0;
                                                                constraintAnchor = constraintAnchor12;
                                                                cVar9.f(cVar9.k(constraintAnchor11), solverVariableK4, 0, 5);
                                                                this.f16084L0 = null;
                                                                weakReference4 = this.f16086N0;
                                                                if (weakReference4 == null) {
                                                                }
                                                                cVar.p();
                                                                r21 = 1;
                                                            } catch (Exception e15) {
                                                                e = e15;
                                                                constraintAnchor = constraintAnchor12;
                                                                r22 = 1;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                r21 = r22;
                                                                zArr = g.f16140a;
                                                                if (r21 != 0) {
                                                                    zArr[2] = false;
                                                                    zA1 = a0(64);
                                                                    U(cVar, zA1);
                                                                    size = this.f35715u0.size();
                                                                    i20 = 0;
                                                                    z18 = false;
                                                                    while (i20 < size) {
                                                                        constraintWidget = this.f35715u0.get(i20);
                                                                        constraintWidget.U(cVar, zA1);
                                                                        boolean z27 = zA1;
                                                                        int i410 = size;
                                                                        if (constraintWidget.f15982h == -1) {
                                                                            z18 = true;
                                                                        } else {
                                                                            z18 = true;
                                                                        }
                                                                        i20++;
                                                                        zA1 = z27;
                                                                        size = i410;
                                                                        z18 = z18;
                                                                    }
                                                                    z16 = z18;
                                                                } else {
                                                                    U(cVar, zA0);
                                                                    while (i16 < i12) {
                                                                        this.f35715u0.get(i16).U(cVar, zA0);
                                                                    }
                                                                    z16 = false;
                                                                }
                                                                if (z12) {
                                                                    iMax3 = 0;
                                                                    iMax4 = 0;
                                                                    while (i19 < i12) {
                                                                        ConstraintWidget constraintWidget16 = this.f35715u0.get(i19);
                                                                        iMax4 = Math.max(iMax4, constraintWidget16.u() + constraintWidget16.f15969a0);
                                                                        iMax3 = Math.max(iMax3, constraintWidget16.o() + constraintWidget16.f15971b0);
                                                                    }
                                                                    iMax5 = Math.max(this.f15975d0, iMax4);
                                                                    iMax6 = Math.max(this.f15977e0, iMax3);
                                                                    z16 = z16;
                                                                    if (dimensionBehaviour2 == dimensionBehaviour4) {
                                                                        z16 = z16;
                                                                        S(iMax5);
                                                                        this.f15962U[0] = dimensionBehaviour4;
                                                                        z16 = true;
                                                                        z15 = true;
                                                                    }
                                                                    if (dimensionBehaviour3 == dimensionBehaviour4) {
                                                                        P(iMax6);
                                                                        this.f15962U[1] = dimensionBehaviour4;
                                                                        z16 = true;
                                                                        z15 = true;
                                                                    }
                                                                }
                                                                iMax = Math.max(this.f15975d0, u());
                                                                z17 = z16;
                                                                if (iMax > u()) {
                                                                    S(iMax);
                                                                    this.f15962U[0] = dimensionBehaviour5;
                                                                    z17 = true;
                                                                    z15 = true;
                                                                }
                                                                iMax2 = Math.max(this.f15977e0, o());
                                                                if (iMax2 > o()) {
                                                                    P(iMax2);
                                                                    r10 = 1;
                                                                    this.f15962U[1] = dimensionBehaviour5;
                                                                    r18 = 1;
                                                                    z15 = true;
                                                                } else {
                                                                    r10 = 1;
                                                                }
                                                                if (z15) {
                                                                    r18 = z17;
                                                                    if (this.f15962U[0] == dimensionBehaviour4) {
                                                                        r18 = r18;
                                                                        if (u() > i10) {
                                                                            this.f16081I0 = r10;
                                                                            this.f15962U[0] = dimensionBehaviour5;
                                                                            S(i10);
                                                                            ?? r113 = r10;
                                                                            z15 = r113 == true ? 1 : 0;
                                                                            r18 = r113;
                                                                        }
                                                                    }
                                                                    r18 = r18;
                                                                    r18 = r18;
                                                                    if (this.f15962U[r10] == dimensionBehaviour4) {
                                                                        r18 = z17;
                                                                        i17 = iMax8;
                                                                        r19 = r18;
                                                                        r19 = r18;
                                                                        z13 = z15;
                                                                        i18 = 8;
                                                                        r110 = r19;
                                                                    } else {
                                                                        r18 = z17;
                                                                        i17 = iMax8;
                                                                        r19 = r18;
                                                                        r19 = r18;
                                                                        z13 = z15;
                                                                        i18 = 8;
                                                                        r110 = r19;
                                                                    }
                                                                } else {
                                                                    r18 = z17;
                                                                    i17 = iMax8;
                                                                    r19 = r18;
                                                                    r19 = r18;
                                                                    z13 = z15;
                                                                    i18 = 8;
                                                                    r110 = r19;
                                                                }
                                                                if (i15 > i18) {
                                                                    r19 = r18;
                                                                    r16 = 0;
                                                                } else {
                                                                    r19 = r18;
                                                                    r16 = r110;
                                                                }
                                                                i14 = i15;
                                                                iMax8 = i17;
                                                                constraintAnchor2 = constraintAnchor3;
                                                                arrayList = arrayList;
                                                                r15 = r16;
                                                            }
                                                        }
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        iMax8 = iMax8;
                                                        arrayList = arrayList;
                                                        constraintAnchor3 = constraintAnchor2;
                                                        z15 = z13;
                                                    }
                                                } else {
                                                    iMax8 = iMax8;
                                                    arrayList = arrayList;
                                                    constraintAnchor3 = constraintAnchor2;
                                                    z15 = z13;
                                                    weakReference2 = this.f16085M0;
                                                    if (weakReference2 != null) {
                                                        ConstraintAnchor constraintAnchor13 = this.f16085M0.get();
                                                        SolverVariable solverVariableK5 = cVar.k(this.f15954M);
                                                        androidx.constraintlayout.core.c cVar10 = this.f16073A0;
                                                        cVar10.f(solverVariableK5, cVar10.k(constraintAnchor13), 0, 5);
                                                        this.f16085M0 = null;
                                                    }
                                                    weakReference3 = this.f16084L0;
                                                    if (weakReference3 != null) {
                                                        weakReference4 = this.f16086N0;
                                                        if (weakReference4 == null) {
                                                        }
                                                        cVar.p();
                                                        r21 = 1;
                                                    } else {
                                                        weakReference4 = this.f16086N0;
                                                        if (weakReference4 == null) {
                                                        }
                                                        cVar.p();
                                                        r21 = 1;
                                                    }
                                                }
                                            } catch (Exception e17) {
                                                e = e17;
                                                iMax8 = iMax8;
                                                arrayList = arrayList;
                                                constraintAnchor3 = constraintAnchor2;
                                                z15 = z13;
                                            }
                                        } catch (Exception e18) {
                                            e = e18;
                                            constraintAnchor3 = constraintAnchor2;
                                            z15 = z13;
                                            r22 = r15;
                                            e.printStackTrace();
                                            System.out.println("EXCEPTION : " + e);
                                            r21 = r22;
                                            zArr = g.f16140a;
                                            if (r21 != 0) {
                                                zArr[2] = false;
                                                zA1 = a0(64);
                                                U(cVar, zA1);
                                                size = this.f35715u0.size();
                                                i20 = 0;
                                                z18 = false;
                                                while (i20 < size) {
                                                    constraintWidget = this.f35715u0.get(i20);
                                                    constraintWidget.U(cVar, zA1);
                                                    boolean z28 = zA1;
                                                    int i411 = size;
                                                    if (constraintWidget.f15982h == -1) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = true;
                                                    }
                                                    i20++;
                                                    zA1 = z28;
                                                    size = i411;
                                                    z18 = z18;
                                                }
                                                z16 = z18;
                                            } else {
                                                U(cVar, zA0);
                                                while (i16 < i12) {
                                                    this.f35715u0.get(i16).U(cVar, zA0);
                                                }
                                                z16 = false;
                                            }
                                            if (z12) {
                                                iMax3 = 0;
                                                iMax4 = 0;
                                                while (i19 < i12) {
                                                    ConstraintWidget constraintWidget17 = this.f35715u0.get(i19);
                                                    iMax4 = Math.max(iMax4, constraintWidget17.u() + constraintWidget17.f15969a0);
                                                    iMax3 = Math.max(iMax3, constraintWidget17.o() + constraintWidget17.f15971b0);
                                                }
                                                iMax5 = Math.max(this.f15975d0, iMax4);
                                                iMax6 = Math.max(this.f15977e0, iMax3);
                                                z16 = z16;
                                                if (dimensionBehaviour2 == dimensionBehaviour4) {
                                                    z16 = z16;
                                                    S(iMax5);
                                                    this.f15962U[0] = dimensionBehaviour4;
                                                    z16 = true;
                                                    z15 = true;
                                                }
                                                if (dimensionBehaviour3 == dimensionBehaviour4) {
                                                    P(iMax6);
                                                    this.f15962U[1] = dimensionBehaviour4;
                                                    z16 = true;
                                                    z15 = true;
                                                }
                                            }
                                            iMax = Math.max(this.f15975d0, u());
                                            z17 = z16;
                                            if (iMax > u()) {
                                                S(iMax);
                                                this.f15962U[0] = dimensionBehaviour5;
                                                z17 = true;
                                                z15 = true;
                                            }
                                            iMax2 = Math.max(this.f15977e0, o());
                                            if (iMax2 > o()) {
                                                P(iMax2);
                                                r10 = 1;
                                                this.f15962U[1] = dimensionBehaviour5;
                                                r18 = 1;
                                                z15 = true;
                                            } else {
                                                r10 = 1;
                                            }
                                            if (z15) {
                                                r18 = z17;
                                                if (this.f15962U[0] == dimensionBehaviour4) {
                                                    r18 = r18;
                                                    if (u() > i10) {
                                                        this.f16081I0 = r10;
                                                        this.f15962U[0] = dimensionBehaviour5;
                                                        S(i10);
                                                        ?? r114 = r10;
                                                        z15 = r114 == true ? 1 : 0;
                                                        r18 = r114;
                                                    }
                                                }
                                                r18 = r18;
                                                r18 = r18;
                                                if (this.f15962U[r10] == dimensionBehaviour4) {
                                                    r18 = z17;
                                                    i17 = iMax8;
                                                    r19 = r18;
                                                    r19 = r18;
                                                    z13 = z15;
                                                    i18 = 8;
                                                    r110 = r19;
                                                } else {
                                                    r18 = z17;
                                                    i17 = iMax8;
                                                    r19 = r18;
                                                    r19 = r18;
                                                    z13 = z15;
                                                    i18 = 8;
                                                    r110 = r19;
                                                }
                                            } else {
                                                r18 = z17;
                                                i17 = iMax8;
                                                r19 = r18;
                                                r19 = r18;
                                                z13 = z15;
                                                i18 = 8;
                                                r110 = r19;
                                            }
                                            if (i15 > i18) {
                                                r19 = r18;
                                                r16 = 0;
                                            } else {
                                                r19 = r18;
                                                r16 = r110;
                                            }
                                            i14 = i15;
                                            iMax8 = i17;
                                            constraintAnchor2 = constraintAnchor3;
                                            arrayList = arrayList;
                                            r15 = r16;
                                        }
                                    } catch (Exception e19) {
                                        e = e19;
                                    }
                                    zArr = g.f16140a;
                                    if (r21 != 0) {
                                        zArr[2] = false;
                                        zA1 = a0(64);
                                        U(cVar, zA1);
                                        size = this.f35715u0.size();
                                        i20 = 0;
                                        z18 = false;
                                        while (i20 < size) {
                                            constraintWidget = this.f35715u0.get(i20);
                                            constraintWidget.U(cVar, zA1);
                                            boolean z29 = zA1;
                                            int i412 = size;
                                            if (constraintWidget.f15982h == -1 || constraintWidget.f15984i != -1) {
                                                z18 = true;
                                            }
                                            i20++;
                                            zA1 = z29;
                                            size = i412;
                                            z18 = z18;
                                        }
                                        z16 = z18;
                                    } else {
                                        U(cVar, zA0);
                                        while (i16 < i12) {
                                            this.f35715u0.get(i16).U(cVar, zA0);
                                        }
                                        z16 = false;
                                    }
                                    if (z12 && i15 < 8 && zArr[2]) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i19 < i12) {
                                            ConstraintWidget constraintWidget18 = this.f35715u0.get(i19);
                                            iMax4 = Math.max(iMax4, constraintWidget18.u() + constraintWidget18.f15969a0);
                                            iMax3 = Math.max(iMax3, constraintWidget18.o() + constraintWidget18.f15971b0);
                                        }
                                        iMax5 = Math.max(this.f15975d0, iMax4);
                                        iMax6 = Math.max(this.f15977e0, iMax3);
                                        z16 = z16;
                                        if (dimensionBehaviour2 == dimensionBehaviour4 && u() < iMax5) {
                                            z16 = z16;
                                            S(iMax5);
                                            this.f15962U[0] = dimensionBehaviour4;
                                            z16 = true;
                                            z15 = true;
                                        }
                                        if (dimensionBehaviour3 == dimensionBehaviour4 && o() < iMax6) {
                                            P(iMax6);
                                            this.f15962U[1] = dimensionBehaviour4;
                                            z16 = true;
                                            z15 = true;
                                        }
                                    }
                                    iMax = Math.max(this.f15975d0, u());
                                    z17 = z16;
                                    if (iMax > u()) {
                                        S(iMax);
                                        this.f15962U[0] = dimensionBehaviour5;
                                        z17 = true;
                                        z15 = true;
                                    }
                                    iMax2 = Math.max(this.f15977e0, o());
                                    if (iMax2 > o()) {
                                        P(iMax2);
                                        r10 = 1;
                                        this.f15962U[1] = dimensionBehaviour5;
                                        r18 = 1;
                                        z15 = true;
                                    } else {
                                        r10 = 1;
                                    }
                                    if (z15) {
                                        r18 = z17;
                                        if (this.f15962U[0] == dimensionBehaviour4 && i10 > 0) {
                                            r18 = r18;
                                            if (u() > i10) {
                                                this.f16081I0 = r10;
                                                this.f15962U[0] = dimensionBehaviour5;
                                                S(i10);
                                                ?? r115 = r10;
                                                z15 = r115 == true ? 1 : 0;
                                                r18 = r115;
                                            }
                                        }
                                        r18 = r18;
                                        r18 = r18;
                                        if (this.f15962U[r10] == dimensionBehaviour4 || iMax8 <= 0) {
                                            r18 = z17;
                                            i17 = iMax8;
                                            r19 = r18;
                                        } else {
                                            i17 = iMax8;
                                            if (o() > i17) {
                                                this.f16082J0 = r10;
                                                this.f15962U[r10] = dimensionBehaviour5;
                                                P(i17);
                                                i18 = 8;
                                                z13 = true;
                                                r110 = 1;
                                            }
                                        }
                                        r19 = r18;
                                        z13 = z15;
                                        i18 = 8;
                                        r110 = r19;
                                    } else {
                                        r18 = z17;
                                        i17 = iMax8;
                                        r19 = r18;
                                        r19 = r18;
                                        z13 = z15;
                                        i18 = 8;
                                        r110 = r19;
                                    }
                                    if (i15 > i18) {
                                        r19 = r18;
                                        r16 = 0;
                                    } else {
                                        r19 = r18;
                                        r16 = r110;
                                    }
                                    i14 = i15;
                                    iMax8 = i17;
                                    constraintAnchor2 = constraintAnchor3;
                                    arrayList = arrayList;
                                    r15 = r16;
                                }
                                z14 = z13;
                                this.f35715u0 = arrayList;
                                if (z14) {
                                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr9 = this.f15962U;
                                    dimensionBehaviourArr9[0] = dimensionBehaviour2;
                                    dimensionBehaviourArr9[1] = dimensionBehaviour3;
                                }
                                J(cVar.f15915m);
                            }
                            dimensionBehaviour5 = dimensionBehaviour26;
                            cVar = cVar4;
                            jVar = null;
                            if (this.f15962U[1] == dimensionBehaviour4) {
                                i24 = 0;
                                jVar2 = null;
                                while (r0.hasNext()) {
                                    if (jVar8.f36489c != 0) {
                                        jVar2 = jVar8;
                                        i24 = iB;
                                    }
                                }
                                if (jVar2 != null) {
                                    R(dimensionBehaviour5);
                                    P(i24);
                                } else {
                                    jVar2 = null;
                                }
                            } else {
                                jVar2 = null;
                            }
                            if (jVar == null) {
                            }
                            dimensionBehaviour2 = dimensionBehaviour6;
                            if (dimensionBehaviour2 == dimensionBehaviour4) {
                                i22 = i10;
                                if (i22 < u()) {
                                }
                                iU = u();
                                dimensionBehaviour3 = dimensionBehaviour7;
                                if (dimensionBehaviour3 == dimensionBehaviour4) {
                                    i23 = iMax8;
                                    if (i23 < o()) {
                                    }
                                    iO = o();
                                    iMax8 = iO;
                                    i10 = iU;
                                    z10 = true;
                                    if (a0(64)) {
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    cVar.getClass();
                                    cVar.f15911h = false;
                                    if (this.f16080H0 == 0) {
                                        c10 = 1;
                                    } else {
                                        c10 = 1;
                                    }
                                    arrayList = this.f35715u0;
                                    dimensionBehaviourArr = this.f15962U;
                                    if (dimensionBehaviourArr[0] != dimensionBehaviour4) {
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                    }
                                    this.f16076D0 = 0;
                                    this.f16077E0 = 0;
                                    i12 = i11;
                                    while (i13 < i12) {
                                        constraintWidget2 = this.f35715u0.get(i13);
                                        if (constraintWidget2 instanceof p089h0.c) {
                                            ((p089h0.c) constraintWidget2).V();
                                        }
                                    }
                                    zA0 = a0(64);
                                    z13 = z10;
                                    i14 = 0;
                                    r15 = 1;
                                    while (r15 != 0) {
                                        i15 = i14 + 1;
                                        cVar.t();
                                        this.f16076D0 = 0;
                                        this.f16077E0 = 0;
                                        k(cVar);
                                        while (i21 < i12) {
                                            this.f35715u0.get(i21).k(cVar);
                                        }
                                        X(cVar);
                                        weakReference = this.f16083K0;
                                        if (weakReference != null) {
                                            if (weakReference.get() != null) {
                                                ConstraintAnchor constraintAnchor14 = this.f16083K0.get();
                                                constraintAnchor4 = constraintAnchor2;
                                                z15 = z13;
                                                SolverVariable solverVariableK6 = cVar.k(constraintAnchor4);
                                                constraintAnchor3 = constraintAnchor4;
                                                androidx.constraintlayout.core.c cVar11 = this.f16073A0;
                                                iMax8 = iMax8;
                                                arrayList = arrayList;
                                                cVar11.f(cVar11.k(constraintAnchor14), solverVariableK6, 0, 5);
                                                this.f16083K0 = null;
                                            } else {
                                                iMax8 = iMax8;
                                                arrayList = arrayList;
                                                constraintAnchor3 = constraintAnchor2;
                                                z15 = z13;
                                            }
                                            weakReference2 = this.f16085M0;
                                            if (weakReference2 != null) {
                                                ConstraintAnchor constraintAnchor15 = this.f16085M0.get();
                                                SolverVariable solverVariableK7 = cVar.k(this.f15954M);
                                                androidx.constraintlayout.core.c cVar12 = this.f16073A0;
                                                cVar12.f(solverVariableK7, cVar12.k(constraintAnchor15), 0, 5);
                                                this.f16085M0 = null;
                                            }
                                            weakReference3 = this.f16084L0;
                                            if (weakReference3 != null) {
                                                weakReference4 = this.f16086N0;
                                                if (weakReference4 == null) {
                                                }
                                                cVar.p();
                                                r21 = 1;
                                            } else {
                                                weakReference4 = this.f16086N0;
                                                if (weakReference4 == null) {
                                                }
                                                cVar.p();
                                                r21 = 1;
                                            }
                                        } else {
                                            iMax8 = iMax8;
                                            arrayList = arrayList;
                                            constraintAnchor3 = constraintAnchor2;
                                            z15 = z13;
                                            weakReference2 = this.f16085M0;
                                            if (weakReference2 != null) {
                                                ConstraintAnchor constraintAnchor16 = this.f16085M0.get();
                                                SolverVariable solverVariableK8 = cVar.k(this.f15954M);
                                                androidx.constraintlayout.core.c cVar13 = this.f16073A0;
                                                cVar13.f(solverVariableK8, cVar13.k(constraintAnchor16), 0, 5);
                                                this.f16085M0 = null;
                                            }
                                            weakReference3 = this.f16084L0;
                                            if (weakReference3 != null) {
                                                weakReference4 = this.f16086N0;
                                                if (weakReference4 == null) {
                                                }
                                                cVar.p();
                                                r21 = 1;
                                            } else {
                                                weakReference4 = this.f16086N0;
                                                if (weakReference4 == null) {
                                                }
                                                cVar.p();
                                                r21 = 1;
                                            }
                                        }
                                        zArr = g.f16140a;
                                        if (r21 != 0) {
                                            zArr[2] = false;
                                            zA1 = a0(64);
                                            U(cVar, zA1);
                                            size = this.f35715u0.size();
                                            i20 = 0;
                                            z18 = false;
                                            while (i20 < size) {
                                                constraintWidget = this.f35715u0.get(i20);
                                                constraintWidget.U(cVar, zA1);
                                                boolean z210 = zA1;
                                                int i413 = size;
                                                if (constraintWidget.f15982h == -1) {
                                                    z18 = true;
                                                } else {
                                                    z18 = true;
                                                }
                                                i20++;
                                                zA1 = z210;
                                                size = i413;
                                                z18 = z18;
                                            }
                                            z16 = z18;
                                        } else {
                                            U(cVar, zA0);
                                            while (i16 < i12) {
                                                this.f35715u0.get(i16).U(cVar, zA0);
                                            }
                                            z16 = false;
                                        }
                                        if (z12) {
                                            iMax3 = 0;
                                            iMax4 = 0;
                                            while (i19 < i12) {
                                                ConstraintWidget constraintWidget19 = this.f35715u0.get(i19);
                                                iMax4 = Math.max(iMax4, constraintWidget19.u() + constraintWidget19.f15969a0);
                                                iMax3 = Math.max(iMax3, constraintWidget19.o() + constraintWidget19.f15971b0);
                                            }
                                            iMax5 = Math.max(this.f15975d0, iMax4);
                                            iMax6 = Math.max(this.f15977e0, iMax3);
                                            z16 = z16;
                                            if (dimensionBehaviour2 == dimensionBehaviour4) {
                                                z16 = z16;
                                                S(iMax5);
                                                this.f15962U[0] = dimensionBehaviour4;
                                                z16 = true;
                                                z15 = true;
                                            }
                                            if (dimensionBehaviour3 == dimensionBehaviour4) {
                                                P(iMax6);
                                                this.f15962U[1] = dimensionBehaviour4;
                                                z16 = true;
                                                z15 = true;
                                            }
                                        }
                                        iMax = Math.max(this.f15975d0, u());
                                        z17 = z16;
                                        if (iMax > u()) {
                                            S(iMax);
                                            this.f15962U[0] = dimensionBehaviour5;
                                            z17 = true;
                                            z15 = true;
                                        }
                                        iMax2 = Math.max(this.f15977e0, o());
                                        if (iMax2 > o()) {
                                            P(iMax2);
                                            r10 = 1;
                                            this.f15962U[1] = dimensionBehaviour5;
                                            r18 = 1;
                                            z15 = true;
                                        } else {
                                            r10 = 1;
                                        }
                                        if (z15) {
                                            r18 = z17;
                                            if (this.f15962U[0] == dimensionBehaviour4) {
                                                r18 = r18;
                                                if (u() > i10) {
                                                    this.f16081I0 = r10;
                                                    this.f15962U[0] = dimensionBehaviour5;
                                                    S(i10);
                                                    ?? r116 = r10;
                                                    z15 = r116 == true ? 1 : 0;
                                                    r18 = r116;
                                                }
                                            }
                                            r18 = r18;
                                            r18 = r18;
                                            if (this.f15962U[r10] == dimensionBehaviour4) {
                                                r18 = z17;
                                                i17 = iMax8;
                                                r19 = r18;
                                                r19 = r18;
                                                z13 = z15;
                                                i18 = 8;
                                                r110 = r19;
                                            } else {
                                                r18 = z17;
                                                i17 = iMax8;
                                                r19 = r18;
                                                r19 = r18;
                                                z13 = z15;
                                                i18 = 8;
                                                r110 = r19;
                                            }
                                        } else {
                                            r18 = z17;
                                            i17 = iMax8;
                                            r19 = r18;
                                            r19 = r18;
                                            z13 = z15;
                                            i18 = 8;
                                            r110 = r19;
                                        }
                                        if (i15 > i18) {
                                            r19 = r18;
                                            r16 = 0;
                                        } else {
                                            r19 = r18;
                                            r16 = r110;
                                        }
                                        i14 = i15;
                                        iMax8 = i17;
                                        constraintAnchor2 = constraintAnchor3;
                                        arrayList = arrayList;
                                        r15 = r16;
                                    }
                                    z14 = z13;
                                    this.f35715u0 = arrayList;
                                    if (z14) {
                                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr10 = this.f15962U;
                                        dimensionBehaviourArr10[0] = dimensionBehaviour2;
                                        dimensionBehaviourArr10[1] = dimensionBehaviour3;
                                    }
                                    J(cVar.f15915m);
                                }
                                i23 = iMax8;
                                iO = i23;
                                iMax8 = iO;
                                i10 = iU;
                                z10 = true;
                                if (a0(64)) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                cVar.getClass();
                                cVar.f15911h = false;
                                if (this.f16080H0 == 0) {
                                    c10 = 1;
                                } else {
                                    c10 = 1;
                                }
                                arrayList = this.f35715u0;
                                dimensionBehaviourArr = this.f15962U;
                                if (dimensionBehaviourArr[0] != dimensionBehaviour4) {
                                    z12 = true;
                                } else {
                                    z12 = true;
                                }
                                this.f16076D0 = 0;
                                this.f16077E0 = 0;
                                i12 = i11;
                                while (i13 < i12) {
                                    constraintWidget2 = this.f35715u0.get(i13);
                                    if (constraintWidget2 instanceof p089h0.c) {
                                        ((p089h0.c) constraintWidget2).V();
                                    }
                                }
                                zA0 = a0(64);
                                z13 = z10;
                                i14 = 0;
                                r15 = 1;
                                while (r15 != 0) {
                                    i15 = i14 + 1;
                                    cVar.t();
                                    this.f16076D0 = 0;
                                    this.f16077E0 = 0;
                                    k(cVar);
                                    while (i21 < i12) {
                                        this.f35715u0.get(i21).k(cVar);
                                    }
                                    X(cVar);
                                    weakReference = this.f16083K0;
                                    if (weakReference != null) {
                                        if (weakReference.get() != null) {
                                            ConstraintAnchor constraintAnchor17 = this.f16083K0.get();
                                            constraintAnchor4 = constraintAnchor2;
                                            z15 = z13;
                                            SolverVariable solverVariableK9 = cVar.k(constraintAnchor4);
                                            constraintAnchor3 = constraintAnchor4;
                                            androidx.constraintlayout.core.c cVar14 = this.f16073A0;
                                            iMax8 = iMax8;
                                            arrayList = arrayList;
                                            cVar14.f(cVar14.k(constraintAnchor17), solverVariableK9, 0, 5);
                                            this.f16083K0 = null;
                                        } else {
                                            iMax8 = iMax8;
                                            arrayList = arrayList;
                                            constraintAnchor3 = constraintAnchor2;
                                            z15 = z13;
                                        }
                                        weakReference2 = this.f16085M0;
                                        if (weakReference2 != null) {
                                            ConstraintAnchor constraintAnchor18 = this.f16085M0.get();
                                            SolverVariable solverVariableK10 = cVar.k(this.f15954M);
                                            androidx.constraintlayout.core.c cVar15 = this.f16073A0;
                                            cVar15.f(solverVariableK10, cVar15.k(constraintAnchor18), 0, 5);
                                            this.f16085M0 = null;
                                        }
                                        weakReference3 = this.f16084L0;
                                        if (weakReference3 != null) {
                                            weakReference4 = this.f16086N0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar.p();
                                            r21 = 1;
                                        } else {
                                            weakReference4 = this.f16086N0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar.p();
                                            r21 = 1;
                                        }
                                    } else {
                                        iMax8 = iMax8;
                                        arrayList = arrayList;
                                        constraintAnchor3 = constraintAnchor2;
                                        z15 = z13;
                                        weakReference2 = this.f16085M0;
                                        if (weakReference2 != null) {
                                            ConstraintAnchor constraintAnchor19 = this.f16085M0.get();
                                            SolverVariable solverVariableK11 = cVar.k(this.f15954M);
                                            androidx.constraintlayout.core.c cVar16 = this.f16073A0;
                                            cVar16.f(solverVariableK11, cVar16.k(constraintAnchor19), 0, 5);
                                            this.f16085M0 = null;
                                        }
                                        weakReference3 = this.f16084L0;
                                        if (weakReference3 != null) {
                                            weakReference4 = this.f16086N0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar.p();
                                            r21 = 1;
                                        } else {
                                            weakReference4 = this.f16086N0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar.p();
                                            r21 = 1;
                                        }
                                    }
                                    zArr = g.f16140a;
                                    if (r21 != 0) {
                                        zArr[2] = false;
                                        zA1 = a0(64);
                                        U(cVar, zA1);
                                        size = this.f35715u0.size();
                                        i20 = 0;
                                        z18 = false;
                                        while (i20 < size) {
                                            constraintWidget = this.f35715u0.get(i20);
                                            constraintWidget.U(cVar, zA1);
                                            boolean z211 = zA1;
                                            int i414 = size;
                                            if (constraintWidget.f15982h == -1) {
                                                z18 = true;
                                            } else {
                                                z18 = true;
                                            }
                                            i20++;
                                            zA1 = z211;
                                            size = i414;
                                            z18 = z18;
                                        }
                                        z16 = z18;
                                    } else {
                                        U(cVar, zA0);
                                        while (i16 < i12) {
                                            this.f35715u0.get(i16).U(cVar, zA0);
                                        }
                                        z16 = false;
                                    }
                                    if (z12) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i19 < i12) {
                                            ConstraintWidget constraintWidget110 = this.f35715u0.get(i19);
                                            iMax4 = Math.max(iMax4, constraintWidget110.u() + constraintWidget110.f15969a0);
                                            iMax3 = Math.max(iMax3, constraintWidget110.o() + constraintWidget110.f15971b0);
                                        }
                                        iMax5 = Math.max(this.f15975d0, iMax4);
                                        iMax6 = Math.max(this.f15977e0, iMax3);
                                        z16 = z16;
                                        if (dimensionBehaviour2 == dimensionBehaviour4) {
                                            z16 = z16;
                                            S(iMax5);
                                            this.f15962U[0] = dimensionBehaviour4;
                                            z16 = true;
                                            z15 = true;
                                        }
                                        if (dimensionBehaviour3 == dimensionBehaviour4) {
                                            P(iMax6);
                                            this.f15962U[1] = dimensionBehaviour4;
                                            z16 = true;
                                            z15 = true;
                                        }
                                    }
                                    iMax = Math.max(this.f15975d0, u());
                                    z17 = z16;
                                    if (iMax > u()) {
                                        S(iMax);
                                        this.f15962U[0] = dimensionBehaviour5;
                                        z17 = true;
                                        z15 = true;
                                    }
                                    iMax2 = Math.max(this.f15977e0, o());
                                    if (iMax2 > o()) {
                                        P(iMax2);
                                        r10 = 1;
                                        this.f15962U[1] = dimensionBehaviour5;
                                        r18 = 1;
                                        z15 = true;
                                    } else {
                                        r10 = 1;
                                    }
                                    if (z15) {
                                        r18 = z17;
                                        if (this.f15962U[0] == dimensionBehaviour4) {
                                            r18 = r18;
                                            if (u() > i10) {
                                                this.f16081I0 = r10;
                                                this.f15962U[0] = dimensionBehaviour5;
                                                S(i10);
                                                ?? r117 = r10;
                                                z15 = r117 == true ? 1 : 0;
                                                r18 = r117;
                                            }
                                        }
                                        r18 = r18;
                                        r18 = r18;
                                        if (this.f15962U[r10] == dimensionBehaviour4) {
                                            r18 = z17;
                                            i17 = iMax8;
                                            r19 = r18;
                                            r19 = r18;
                                            z13 = z15;
                                            i18 = 8;
                                            r110 = r19;
                                        } else {
                                            r18 = z17;
                                            i17 = iMax8;
                                            r19 = r18;
                                            r19 = r18;
                                            z13 = z15;
                                            i18 = 8;
                                            r110 = r19;
                                        }
                                    } else {
                                        r18 = z17;
                                        i17 = iMax8;
                                        r19 = r18;
                                        r19 = r18;
                                        z13 = z15;
                                        i18 = 8;
                                        r110 = r19;
                                    }
                                    if (i15 > i18) {
                                        r19 = r18;
                                        r16 = 0;
                                    } else {
                                        r19 = r18;
                                        r16 = r110;
                                    }
                                    i14 = i15;
                                    iMax8 = i17;
                                    constraintAnchor2 = constraintAnchor3;
                                    arrayList = arrayList;
                                    r15 = r16;
                                }
                                z14 = z13;
                                this.f35715u0 = arrayList;
                                if (z14) {
                                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr11 = this.f15962U;
                                    dimensionBehaviourArr11[0] = dimensionBehaviour2;
                                    dimensionBehaviourArr11[1] = dimensionBehaviour3;
                                }
                                J(cVar.f15915m);
                            }
                            i22 = i10;
                            iU = i22;
                            dimensionBehaviour3 = dimensionBehaviour7;
                            if (dimensionBehaviour3 == dimensionBehaviour4) {
                                i23 = iMax8;
                                if (i23 < o()) {
                                }
                                iO = o();
                                iMax8 = iO;
                                i10 = iU;
                                z10 = true;
                                if (a0(64)) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                cVar.getClass();
                                cVar.f15911h = false;
                                if (this.f16080H0 == 0) {
                                    c10 = 1;
                                } else {
                                    c10 = 1;
                                }
                                arrayList = this.f35715u0;
                                dimensionBehaviourArr = this.f15962U;
                                if (dimensionBehaviourArr[0] != dimensionBehaviour4) {
                                    z12 = true;
                                } else {
                                    z12 = true;
                                }
                                this.f16076D0 = 0;
                                this.f16077E0 = 0;
                                i12 = i11;
                                while (i13 < i12) {
                                    constraintWidget2 = this.f35715u0.get(i13);
                                    if (constraintWidget2 instanceof p089h0.c) {
                                        ((p089h0.c) constraintWidget2).V();
                                    }
                                }
                                zA0 = a0(64);
                                z13 = z10;
                                i14 = 0;
                                r15 = 1;
                                while (r15 != 0) {
                                    i15 = i14 + 1;
                                    cVar.t();
                                    this.f16076D0 = 0;
                                    this.f16077E0 = 0;
                                    k(cVar);
                                    while (i21 < i12) {
                                        this.f35715u0.get(i21).k(cVar);
                                    }
                                    X(cVar);
                                    weakReference = this.f16083K0;
                                    if (weakReference != null) {
                                        if (weakReference.get() != null) {
                                            ConstraintAnchor constraintAnchor110 = this.f16083K0.get();
                                            constraintAnchor4 = constraintAnchor2;
                                            z15 = z13;
                                            SolverVariable solverVariableK12 = cVar.k(constraintAnchor4);
                                            constraintAnchor3 = constraintAnchor4;
                                            androidx.constraintlayout.core.c cVar17 = this.f16073A0;
                                            iMax8 = iMax8;
                                            arrayList = arrayList;
                                            cVar17.f(cVar17.k(constraintAnchor110), solverVariableK12, 0, 5);
                                            this.f16083K0 = null;
                                        } else {
                                            iMax8 = iMax8;
                                            arrayList = arrayList;
                                            constraintAnchor3 = constraintAnchor2;
                                            z15 = z13;
                                        }
                                        weakReference2 = this.f16085M0;
                                        if (weakReference2 != null) {
                                            ConstraintAnchor constraintAnchor111 = this.f16085M0.get();
                                            SolverVariable solverVariableK13 = cVar.k(this.f15954M);
                                            androidx.constraintlayout.core.c cVar18 = this.f16073A0;
                                            cVar18.f(solverVariableK13, cVar18.k(constraintAnchor111), 0, 5);
                                            this.f16085M0 = null;
                                        }
                                        weakReference3 = this.f16084L0;
                                        if (weakReference3 != null) {
                                            weakReference4 = this.f16086N0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar.p();
                                            r21 = 1;
                                        } else {
                                            weakReference4 = this.f16086N0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar.p();
                                            r21 = 1;
                                        }
                                    } else {
                                        iMax8 = iMax8;
                                        arrayList = arrayList;
                                        constraintAnchor3 = constraintAnchor2;
                                        z15 = z13;
                                        weakReference2 = this.f16085M0;
                                        if (weakReference2 != null) {
                                            ConstraintAnchor constraintAnchor112 = this.f16085M0.get();
                                            SolverVariable solverVariableK14 = cVar.k(this.f15954M);
                                            androidx.constraintlayout.core.c cVar19 = this.f16073A0;
                                            cVar19.f(solverVariableK14, cVar19.k(constraintAnchor112), 0, 5);
                                            this.f16085M0 = null;
                                        }
                                        weakReference3 = this.f16084L0;
                                        if (weakReference3 != null) {
                                            weakReference4 = this.f16086N0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar.p();
                                            r21 = 1;
                                        } else {
                                            weakReference4 = this.f16086N0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar.p();
                                            r21 = 1;
                                        }
                                    }
                                    zArr = g.f16140a;
                                    if (r21 != 0) {
                                        zArr[2] = false;
                                        zA1 = a0(64);
                                        U(cVar, zA1);
                                        size = this.f35715u0.size();
                                        i20 = 0;
                                        z18 = false;
                                        while (i20 < size) {
                                            constraintWidget = this.f35715u0.get(i20);
                                            constraintWidget.U(cVar, zA1);
                                            boolean z212 = zA1;
                                            int i415 = size;
                                            if (constraintWidget.f15982h == -1) {
                                                z18 = true;
                                            } else {
                                                z18 = true;
                                            }
                                            i20++;
                                            zA1 = z212;
                                            size = i415;
                                            z18 = z18;
                                        }
                                        z16 = z18;
                                    } else {
                                        U(cVar, zA0);
                                        while (i16 < i12) {
                                            this.f35715u0.get(i16).U(cVar, zA0);
                                        }
                                        z16 = false;
                                    }
                                    if (z12) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i19 < i12) {
                                            ConstraintWidget constraintWidget111 = this.f35715u0.get(i19);
                                            iMax4 = Math.max(iMax4, constraintWidget111.u() + constraintWidget111.f15969a0);
                                            iMax3 = Math.max(iMax3, constraintWidget111.o() + constraintWidget111.f15971b0);
                                        }
                                        iMax5 = Math.max(this.f15975d0, iMax4);
                                        iMax6 = Math.max(this.f15977e0, iMax3);
                                        z16 = z16;
                                        if (dimensionBehaviour2 == dimensionBehaviour4) {
                                            z16 = z16;
                                            S(iMax5);
                                            this.f15962U[0] = dimensionBehaviour4;
                                            z16 = true;
                                            z15 = true;
                                        }
                                        if (dimensionBehaviour3 == dimensionBehaviour4) {
                                            P(iMax6);
                                            this.f15962U[1] = dimensionBehaviour4;
                                            z16 = true;
                                            z15 = true;
                                        }
                                    }
                                    iMax = Math.max(this.f15975d0, u());
                                    z17 = z16;
                                    if (iMax > u()) {
                                        S(iMax);
                                        this.f15962U[0] = dimensionBehaviour5;
                                        z17 = true;
                                        z15 = true;
                                    }
                                    iMax2 = Math.max(this.f15977e0, o());
                                    if (iMax2 > o()) {
                                        P(iMax2);
                                        r10 = 1;
                                        this.f15962U[1] = dimensionBehaviour5;
                                        r18 = 1;
                                        z15 = true;
                                    } else {
                                        r10 = 1;
                                    }
                                    if (z15) {
                                        r18 = z17;
                                        if (this.f15962U[0] == dimensionBehaviour4) {
                                            r18 = r18;
                                            if (u() > i10) {
                                                this.f16081I0 = r10;
                                                this.f15962U[0] = dimensionBehaviour5;
                                                S(i10);
                                                ?? r118 = r10;
                                                z15 = r118 == true ? 1 : 0;
                                                r18 = r118;
                                            }
                                        }
                                        r18 = r18;
                                        r18 = r18;
                                        if (this.f15962U[r10] == dimensionBehaviour4) {
                                            r18 = z17;
                                            i17 = iMax8;
                                            r19 = r18;
                                            r19 = r18;
                                            z13 = z15;
                                            i18 = 8;
                                            r110 = r19;
                                        } else {
                                            r18 = z17;
                                            i17 = iMax8;
                                            r19 = r18;
                                            r19 = r18;
                                            z13 = z15;
                                            i18 = 8;
                                            r110 = r19;
                                        }
                                    } else {
                                        r18 = z17;
                                        i17 = iMax8;
                                        r19 = r18;
                                        r19 = r18;
                                        z13 = z15;
                                        i18 = 8;
                                        r110 = r19;
                                    }
                                    if (i15 > i18) {
                                        r19 = r18;
                                        r16 = 0;
                                    } else {
                                        r19 = r18;
                                        r16 = r110;
                                    }
                                    i14 = i15;
                                    iMax8 = i17;
                                    constraintAnchor2 = constraintAnchor3;
                                    arrayList = arrayList;
                                    r15 = r16;
                                }
                                z14 = z13;
                                this.f35715u0 = arrayList;
                                if (z14) {
                                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr12 = this.f15962U;
                                    dimensionBehaviourArr12[0] = dimensionBehaviour2;
                                    dimensionBehaviourArr12[1] = dimensionBehaviour3;
                                }
                                J(cVar.f15915m);
                            }
                            i23 = iMax8;
                            iO = i23;
                            iMax8 = iO;
                            i10 = iU;
                            z10 = true;
                            if (a0(64)) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            cVar.getClass();
                            cVar.f15911h = false;
                            if (this.f16080H0 == 0) {
                                c10 = 1;
                            } else {
                                c10 = 1;
                            }
                            arrayList = this.f35715u0;
                            dimensionBehaviourArr = this.f15962U;
                            if (dimensionBehaviourArr[0] != dimensionBehaviour4) {
                                z12 = true;
                            } else {
                                z12 = true;
                            }
                            this.f16076D0 = 0;
                            this.f16077E0 = 0;
                            i12 = i11;
                            while (i13 < i12) {
                                constraintWidget2 = this.f35715u0.get(i13);
                                if (constraintWidget2 instanceof p089h0.c) {
                                    ((p089h0.c) constraintWidget2).V();
                                }
                            }
                            zA0 = a0(64);
                            z13 = z10;
                            i14 = 0;
                            r15 = 1;
                            while (r15 != 0) {
                                i15 = i14 + 1;
                                cVar.t();
                                this.f16076D0 = 0;
                                this.f16077E0 = 0;
                                k(cVar);
                                while (i21 < i12) {
                                    this.f35715u0.get(i21).k(cVar);
                                }
                                X(cVar);
                                weakReference = this.f16083K0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        ConstraintAnchor constraintAnchor113 = this.f16083K0.get();
                                        constraintAnchor4 = constraintAnchor2;
                                        z15 = z13;
                                        SolverVariable solverVariableK15 = cVar.k(constraintAnchor4);
                                        constraintAnchor3 = constraintAnchor4;
                                        androidx.constraintlayout.core.c cVar110 = this.f16073A0;
                                        iMax8 = iMax8;
                                        arrayList = arrayList;
                                        cVar110.f(cVar110.k(constraintAnchor113), solverVariableK15, 0, 5);
                                        this.f16083K0 = null;
                                    } else {
                                        iMax8 = iMax8;
                                        arrayList = arrayList;
                                        constraintAnchor3 = constraintAnchor2;
                                        z15 = z13;
                                    }
                                    weakReference2 = this.f16085M0;
                                    if (weakReference2 != null) {
                                        ConstraintAnchor constraintAnchor114 = this.f16085M0.get();
                                        SolverVariable solverVariableK16 = cVar.k(this.f15954M);
                                        androidx.constraintlayout.core.c cVar111 = this.f16073A0;
                                        cVar111.f(solverVariableK16, cVar111.k(constraintAnchor114), 0, 5);
                                        this.f16085M0 = null;
                                    }
                                    weakReference3 = this.f16084L0;
                                    if (weakReference3 != null) {
                                        weakReference4 = this.f16086N0;
                                        if (weakReference4 == null) {
                                        }
                                        cVar.p();
                                        r21 = 1;
                                    } else {
                                        weakReference4 = this.f16086N0;
                                        if (weakReference4 == null) {
                                        }
                                        cVar.p();
                                        r21 = 1;
                                    }
                                } else {
                                    iMax8 = iMax8;
                                    arrayList = arrayList;
                                    constraintAnchor3 = constraintAnchor2;
                                    z15 = z13;
                                    weakReference2 = this.f16085M0;
                                    if (weakReference2 != null) {
                                        ConstraintAnchor constraintAnchor115 = this.f16085M0.get();
                                        SolverVariable solverVariableK17 = cVar.k(this.f15954M);
                                        androidx.constraintlayout.core.c cVar112 = this.f16073A0;
                                        cVar112.f(solverVariableK17, cVar112.k(constraintAnchor115), 0, 5);
                                        this.f16085M0 = null;
                                    }
                                    weakReference3 = this.f16084L0;
                                    if (weakReference3 != null) {
                                        weakReference4 = this.f16086N0;
                                        if (weakReference4 == null) {
                                        }
                                        cVar.p();
                                        r21 = 1;
                                    } else {
                                        weakReference4 = this.f16086N0;
                                        if (weakReference4 == null) {
                                        }
                                        cVar.p();
                                        r21 = 1;
                                    }
                                }
                                zArr = g.f16140a;
                                if (r21 != 0) {
                                    zArr[2] = false;
                                    zA1 = a0(64);
                                    U(cVar, zA1);
                                    size = this.f35715u0.size();
                                    i20 = 0;
                                    z18 = false;
                                    while (i20 < size) {
                                        constraintWidget = this.f35715u0.get(i20);
                                        constraintWidget.U(cVar, zA1);
                                        boolean z213 = zA1;
                                        int i416 = size;
                                        if (constraintWidget.f15982h == -1) {
                                            z18 = true;
                                        } else {
                                            z18 = true;
                                        }
                                        i20++;
                                        zA1 = z213;
                                        size = i416;
                                        z18 = z18;
                                    }
                                    z16 = z18;
                                } else {
                                    U(cVar, zA0);
                                    while (i16 < i12) {
                                        this.f35715u0.get(i16).U(cVar, zA0);
                                    }
                                    z16 = false;
                                }
                                if (z12) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i19 < i12) {
                                        ConstraintWidget constraintWidget112 = this.f35715u0.get(i19);
                                        iMax4 = Math.max(iMax4, constraintWidget112.u() + constraintWidget112.f15969a0);
                                        iMax3 = Math.max(iMax3, constraintWidget112.o() + constraintWidget112.f15971b0);
                                    }
                                    iMax5 = Math.max(this.f15975d0, iMax4);
                                    iMax6 = Math.max(this.f15977e0, iMax3);
                                    z16 = z16;
                                    if (dimensionBehaviour2 == dimensionBehaviour4) {
                                        z16 = z16;
                                        S(iMax5);
                                        this.f15962U[0] = dimensionBehaviour4;
                                        z16 = true;
                                        z15 = true;
                                    }
                                    if (dimensionBehaviour3 == dimensionBehaviour4) {
                                        P(iMax6);
                                        this.f15962U[1] = dimensionBehaviour4;
                                        z16 = true;
                                        z15 = true;
                                    }
                                }
                                iMax = Math.max(this.f15975d0, u());
                                z17 = z16;
                                if (iMax > u()) {
                                    S(iMax);
                                    this.f15962U[0] = dimensionBehaviour5;
                                    z17 = true;
                                    z15 = true;
                                }
                                iMax2 = Math.max(this.f15977e0, o());
                                if (iMax2 > o()) {
                                    P(iMax2);
                                    r10 = 1;
                                    this.f15962U[1] = dimensionBehaviour5;
                                    r18 = 1;
                                    z15 = true;
                                } else {
                                    r10 = 1;
                                }
                                if (z15) {
                                    r18 = z17;
                                    if (this.f15962U[0] == dimensionBehaviour4) {
                                        r18 = r18;
                                        if (u() > i10) {
                                            this.f16081I0 = r10;
                                            this.f15962U[0] = dimensionBehaviour5;
                                            S(i10);
                                            ?? r119 = r10;
                                            z15 = r119 == true ? 1 : 0;
                                            r18 = r119;
                                        }
                                    }
                                    r18 = r18;
                                    r18 = r18;
                                    if (this.f15962U[r10] == dimensionBehaviour4) {
                                        r18 = z17;
                                        i17 = iMax8;
                                        r19 = r18;
                                        r19 = r18;
                                        z13 = z15;
                                        i18 = 8;
                                        r110 = r19;
                                    } else {
                                        r18 = z17;
                                        i17 = iMax8;
                                        r19 = r18;
                                        r19 = r18;
                                        z13 = z15;
                                        i18 = 8;
                                        r110 = r19;
                                    }
                                } else {
                                    r18 = z17;
                                    i17 = iMax8;
                                    r19 = r18;
                                    r19 = r18;
                                    z13 = z15;
                                    i18 = 8;
                                    r110 = r19;
                                }
                                if (i15 > i18) {
                                    r19 = r18;
                                    r16 = 0;
                                } else {
                                    r19 = r18;
                                    r16 = r110;
                                }
                                i14 = i15;
                                iMax8 = i17;
                                constraintAnchor2 = constraintAnchor3;
                                arrayList = arrayList;
                                r15 = r16;
                            }
                            z14 = z13;
                            this.f35715u0 = arrayList;
                            if (z14) {
                                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr13 = this.f15962U;
                                dimensionBehaviourArr13[0] = dimensionBehaviour2;
                                dimensionBehaviourArr13[1] = dimensionBehaviour3;
                            }
                            J(cVar.f15915m);
                        }
                        dimensionBehaviour5 = dimensionBehaviour26;
                        cVar = cVar4;
                        dimensionBehaviour4 = dimensionBehaviour25;
                    }
                    dimensionBehaviour2 = dimensionBehaviour6;
                    dimensionBehaviour3 = dimensionBehaviour7;
                }
            } else {
                i11 = size2;
                dimensionBehaviour3 = dimensionBehaviour16;
                constraintAnchor2 = constraintAnchor5;
                dimensionBehaviour4 = dimensionBehaviour15;
                cVar = cVar2;
                dimensionBehaviour2 = dimensionBehaviour10;
                dimensionBehaviour5 = dimensionBehaviour12;
            }
        } else {
            i11 = size2;
            cVar = cVar2;
            dimensionBehaviour2 = dimensionBehaviour10;
            dimensionBehaviour3 = dimensionBehaviour;
            dimensionBehaviour4 = dimensionBehaviour15;
            constraintAnchor2 = constraintAnchor5;
            dimensionBehaviour5 = dimensionBehaviour12;
        }
        z10 = false;
        if (a0(64)) {
            z11 = true;
        } else {
            z11 = true;
        }
        cVar.getClass();
        cVar.f15911h = false;
        if (this.f16080H0 == 0) {
            c10 = 1;
        } else {
            c10 = 1;
        }
        arrayList = this.f35715u0;
        dimensionBehaviourArr = this.f15962U;
        if (dimensionBehaviourArr[0] != dimensionBehaviour4) {
            z12 = true;
        } else {
            z12 = true;
        }
        this.f16076D0 = 0;
        this.f16077E0 = 0;
        i12 = i11;
        while (i13 < i12) {
            constraintWidget2 = this.f35715u0.get(i13);
            if (constraintWidget2 instanceof p089h0.c) {
                ((p089h0.c) constraintWidget2).V();
            }
        }
        zA0 = a0(64);
        z13 = z10;
        i14 = 0;
        r15 = 1;
        while (r15 != 0) {
            i15 = i14 + 1;
            cVar.t();
            this.f16076D0 = 0;
            this.f16077E0 = 0;
            k(cVar);
            while (i21 < i12) {
                this.f35715u0.get(i21).k(cVar);
            }
            X(cVar);
            weakReference = this.f16083K0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    ConstraintAnchor constraintAnchor116 = this.f16083K0.get();
                    constraintAnchor4 = constraintAnchor2;
                    z15 = z13;
                    SolverVariable solverVariableK18 = cVar.k(constraintAnchor4);
                    constraintAnchor3 = constraintAnchor4;
                    androidx.constraintlayout.core.c cVar113 = this.f16073A0;
                    iMax8 = iMax8;
                    arrayList = arrayList;
                    cVar113.f(cVar113.k(constraintAnchor116), solverVariableK18, 0, 5);
                    this.f16083K0 = null;
                } else {
                    iMax8 = iMax8;
                    arrayList = arrayList;
                    constraintAnchor3 = constraintAnchor2;
                    z15 = z13;
                }
                weakReference2 = this.f16085M0;
                if (weakReference2 != null) {
                    ConstraintAnchor constraintAnchor117 = this.f16085M0.get();
                    SolverVariable solverVariableK19 = cVar.k(this.f15954M);
                    androidx.constraintlayout.core.c cVar114 = this.f16073A0;
                    cVar114.f(solverVariableK19, cVar114.k(constraintAnchor117), 0, 5);
                    this.f16085M0 = null;
                }
                weakReference3 = this.f16084L0;
                if (weakReference3 != null) {
                    weakReference4 = this.f16086N0;
                    if (weakReference4 == null) {
                    }
                    cVar.p();
                    r21 = 1;
                } else {
                    weakReference4 = this.f16086N0;
                    if (weakReference4 == null) {
                    }
                    cVar.p();
                    r21 = 1;
                }
            } else {
                iMax8 = iMax8;
                arrayList = arrayList;
                constraintAnchor3 = constraintAnchor2;
                z15 = z13;
                weakReference2 = this.f16085M0;
                if (weakReference2 != null) {
                    ConstraintAnchor constraintAnchor118 = this.f16085M0.get();
                    SolverVariable solverVariableK110 = cVar.k(this.f15954M);
                    androidx.constraintlayout.core.c cVar115 = this.f16073A0;
                    cVar115.f(solverVariableK110, cVar115.k(constraintAnchor118), 0, 5);
                    this.f16085M0 = null;
                }
                weakReference3 = this.f16084L0;
                if (weakReference3 != null) {
                    weakReference4 = this.f16086N0;
                    if (weakReference4 == null) {
                    }
                    cVar.p();
                    r21 = 1;
                } else {
                    weakReference4 = this.f16086N0;
                    if (weakReference4 == null) {
                    }
                    cVar.p();
                    r21 = 1;
                }
            }
            zArr = g.f16140a;
            if (r21 != 0) {
                zArr[2] = false;
                zA1 = a0(64);
                U(cVar, zA1);
                size = this.f35715u0.size();
                i20 = 0;
                z18 = false;
                while (i20 < size) {
                    constraintWidget = this.f35715u0.get(i20);
                    constraintWidget.U(cVar, zA1);
                    boolean z214 = zA1;
                    int i417 = size;
                    if (constraintWidget.f15982h == -1) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    i20++;
                    zA1 = z214;
                    size = i417;
                    z18 = z18;
                }
                z16 = z18;
            } else {
                U(cVar, zA0);
                while (i16 < i12) {
                    this.f35715u0.get(i16).U(cVar, zA0);
                }
                z16 = false;
            }
            if (z12) {
                iMax3 = 0;
                iMax4 = 0;
                while (i19 < i12) {
                    ConstraintWidget constraintWidget113 = this.f35715u0.get(i19);
                    iMax4 = Math.max(iMax4, constraintWidget113.u() + constraintWidget113.f15969a0);
                    iMax3 = Math.max(iMax3, constraintWidget113.o() + constraintWidget113.f15971b0);
                }
                iMax5 = Math.max(this.f15975d0, iMax4);
                iMax6 = Math.max(this.f15977e0, iMax3);
                z16 = z16;
                if (dimensionBehaviour2 == dimensionBehaviour4) {
                    z16 = z16;
                    S(iMax5);
                    this.f15962U[0] = dimensionBehaviour4;
                    z16 = true;
                    z15 = true;
                }
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    P(iMax6);
                    this.f15962U[1] = dimensionBehaviour4;
                    z16 = true;
                    z15 = true;
                }
            }
            iMax = Math.max(this.f15975d0, u());
            z17 = z16;
            if (iMax > u()) {
                S(iMax);
                this.f15962U[0] = dimensionBehaviour5;
                z17 = true;
                z15 = true;
            }
            iMax2 = Math.max(this.f15977e0, o());
            if (iMax2 > o()) {
                P(iMax2);
                r10 = 1;
                this.f15962U[1] = dimensionBehaviour5;
                r18 = 1;
                z15 = true;
            } else {
                r10 = 1;
            }
            if (z15) {
                r18 = z17;
                if (this.f15962U[0] == dimensionBehaviour4) {
                    r18 = r18;
                    if (u() > i10) {
                        this.f16081I0 = r10;
                        this.f15962U[0] = dimensionBehaviour5;
                        S(i10);
                        ?? r1110 = r10;
                        z15 = r1110 == true ? 1 : 0;
                        r18 = r1110;
                    }
                }
                r18 = r18;
                r18 = r18;
                if (this.f15962U[r10] == dimensionBehaviour4) {
                    r18 = z17;
                    i17 = iMax8;
                    r19 = r18;
                    r19 = r18;
                    z13 = z15;
                    i18 = 8;
                    r110 = r19;
                } else {
                    r18 = z17;
                    i17 = iMax8;
                    r19 = r18;
                    r19 = r18;
                    z13 = z15;
                    i18 = 8;
                    r110 = r19;
                }
            } else {
                r18 = z17;
                i17 = iMax8;
                r19 = r18;
                r19 = r18;
                z13 = z15;
                i18 = 8;
                r110 = r19;
            }
            if (i15 > i18) {
                r19 = r18;
                r16 = 0;
            } else {
                r19 = r18;
                r16 = r110;
            }
            i14 = i15;
            iMax8 = i17;
            constraintAnchor2 = constraintAnchor3;
            arrayList = arrayList;
            r15 = r16;
        }
        z14 = z13;
        this.f35715u0 = arrayList;
        if (z14) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr14 = this.f15962U;
            dimensionBehaviourArr14[0] = dimensionBehaviour2;
            dimensionBehaviourArr14[1] = dimensionBehaviour3;
        }
        J(cVar.f15915m);
    }

    public final void W(ConstraintWidget constraintWidget, int i10) {
        if (i10 == 0) {
            int i11 = this.f16076D0 + 1;
            c[] cVarArr = this.f16079G0;
            if (i11 >= cVarArr.length) {
                this.f16079G0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.f16079G0;
            int i12 = this.f16076D0;
            cVarArr2[i12] = new c(constraintWidget, 0, this.f16092z0);
            this.f16076D0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.f16077E0 + 1;
            c[] cVarArr3 = this.f16078F0;
            if (i13 >= cVarArr3.length) {
                this.f16078F0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.f16078F0;
            int i14 = this.f16077E0;
            cVarArr4[i14] = new c(constraintWidget, 1, this.f16092z0);
            this.f16077E0 = i14 + 1;
        }
    }

    public final void X(androidx.constraintlayout.core.c cVar) {
        boolean zA0 = a0(64);
        e(cVar, zA0);
        int size = this.f35715u0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f35715u0.get(i10);
            boolean[] zArr = constraintWidget.f15961T;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                ConstraintWidget constraintWidget2 = this.f35715u0.get(i11);
                if (constraintWidget2 instanceof a) {
                    a aVar = (a) constraintWidget2;
                    for (int i12 = 0; i12 < aVar.v0; i12++) {
                        ConstraintWidget constraintWidget3 = aVar.f35714u0[i12];
                        if (aVar.f16019x0 || constraintWidget3.f()) {
                            int i13 = aVar.f16018w0;
                            if (i13 == 0 || i13 == 1) {
                                constraintWidget3.f15961T[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                constraintWidget3.f15961T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<ConstraintWidget> hashSet = this.f16087O0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            ConstraintWidget constraintWidget4 = this.f35715u0.get(i14);
            constraintWidget4.getClass();
            boolean z11 = constraintWidget4 instanceof i;
            if (z11 || (constraintWidget4 instanceof f)) {
                if (z11) {
                    hashSet.add(constraintWidget4);
                } else {
                    constraintWidget4.e(cVar, zA0);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<ConstraintWidget> it = hashSet.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                for (int i15 = 0; i15 < iVar.v0; i15++) {
                    if (hashSet.contains(iVar.f35714u0[i15])) {
                        iVar.e(cVar, zA0);
                        hashSet.remove(iVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<ConstraintWidget> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().e(cVar, zA0);
                }
                hashSet.clear();
            }
        }
        boolean z12 = androidx.constraintlayout.core.c.f15903q;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16014c;
        if (z12) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i16 = 0; i16 < size; i16++) {
                ConstraintWidget constraintWidget5 = this.f35715u0.get(i16);
                constraintWidget5.getClass();
                if (!(constraintWidget5 instanceof i) && !(constraintWidget5 instanceof f)) {
                    hashSet2.add(constraintWidget5);
                }
            }
            d(this, cVar, hashSet2, this.f15962U[0] == dimensionBehaviour ? 0 : 1, false);
            for (ConstraintWidget constraintWidget6 : hashSet2) {
                g.a(this, cVar, constraintWidget6);
                constraintWidget6.e(cVar, zA0);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                ConstraintWidget constraintWidget7 = this.f35715u0.get(i17);
                if (constraintWidget7 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.f15962U;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f16013b;
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget7.Q(dimensionBehaviour4);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget7.R(dimensionBehaviour4);
                    }
                    constraintWidget7.e(cVar, zA0);
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget7.Q(dimensionBehaviour2);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget7.R(dimensionBehaviour3);
                    }
                } else {
                    g.a(this, cVar, constraintWidget7);
                    if (!(constraintWidget7 instanceof i) && !(constraintWidget7 instanceof f)) {
                        constraintWidget7.e(cVar, zA0);
                    }
                }
            }
        }
        if (this.f16076D0 > 0) {
            b.a(this, cVar, null, 0);
        }
        if (this.f16077E0 > 0) {
            b.a(this, cVar, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    public final boolean Y(int i10, boolean z10) {
        boolean z11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z12;
        p101i0.e eVar = this.f16089w0;
        d dVar = eVar.f36475a;
        boolean z13 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourN = dVar.n(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourN2 = dVar.n(1);
        int iV = dVar.v();
        int iW = dVar.w();
        ArrayList<WidgetRun> arrayList = eVar.f36479e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f16013b;
        if (z10 && (dimensionBehaviourN == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16014c) || dimensionBehaviourN2 == dimensionBehaviour)) {
            Iterator<WidgetRun> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z12 = z10;
                    break;
                }
                WidgetRun next = it.next();
                if (next.f16046f == i10 && !next.k()) {
                    z12 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z12 && dimensionBehaviourN == dimensionBehaviour) {
                    dVar.Q(dimensionBehaviour2);
                    dVar.S(eVar.d(dVar, 0));
                    dVar.f15974d.f16045e.d(dVar.u());
                }
            } else if (z12 && dimensionBehaviourN2 == dimensionBehaviour) {
                dVar.R(dimensionBehaviour2);
                dVar.P(eVar.d(dVar, 1));
                dVar.f15976e.f16045e.d(dVar.o());
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16016e;
        if (i10 == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar.f15962U[0];
            if (dimensionBehaviour4 == dimensionBehaviour2 || dimensionBehaviour4 == dimensionBehaviour3) {
                int iU = dVar.u() + iV;
                dVar.f15974d.f16049i.d(iU);
                dVar.f15974d.f16045e.d(iU - iV);
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dVar.f15962U[1];
            if (dimensionBehaviour5 == dimensionBehaviour2 || dimensionBehaviour5 == dimensionBehaviour3) {
                int iO = dVar.o() + iW;
                dVar.f15976e.f16049i.d(iO);
                dVar.f15976e.f16045e.d(iO - iW);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        eVar.g();
        for (WidgetRun widgetRun : arrayList) {
            if (widgetRun.f16046f == i10 && (widgetRun.f16042b != dVar || widgetRun.f16047g)) {
                widgetRun.e();
            }
        }
        for (WidgetRun widgetRun2 : arrayList) {
            if (widgetRun2.f16046f == i10 && (z11 || widgetRun2.f16042b != dVar)) {
                if (!widgetRun2.f16048h.j || !widgetRun2.f16049i.j || (!(widgetRun2 instanceof p101i0.c) && !widgetRun2.f16045e.j)) {
                    dVar.Q(dimensionBehaviourN);
                    dVar.R(dimensionBehaviourN2);
                    return z13;
                }
            }
        }
        z13 = true;
        dVar.Q(dimensionBehaviourN);
        dVar.R(dimensionBehaviourN2);
        return z13;
    }

    public final boolean a0(int i10) {
        return (this.f16080H0 & i10) == i10;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void r(StringBuilder sb2) {
        sb2.append(this.j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.f15964W);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f15965X);
        sb2.append("\n");
        Iterator<ConstraintWidget> it = this.f35715u0.iterator();
        while (it.hasNext()) {
            it.next().r(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
