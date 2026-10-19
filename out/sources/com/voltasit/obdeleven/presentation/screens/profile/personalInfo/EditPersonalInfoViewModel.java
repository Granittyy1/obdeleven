package com.voltasit.obdeleven.presentation.screens.profile.personalInfo;

import G8.C0705g;
import G8.G;
import J8.p;
import K8.v;
import androidx.compose.runtime.C1085f0;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import com.voltasit.obdeleven.domain.usecases.i;
import com.voltasit.obdeleven.domain.usecases.l;
import com.voltasit.obdeleven.domain.usecases.user.B;
import com.voltasit.obdeleven.domain.usecases.user.h;
import com.voltasit.obdeleven.domain.usecases.user.o;
import com.voltasit.obdeleven.presentation.screens.sfd.CreatePersonalInfoViewModel;
import com.voltasit.obdeleven.presentation.screens.sfd.a;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.n;

/* JADX INFO: compiled from: EditPersonalInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EditPersonalInfoViewModel extends CreatePersonalInfoViewModel {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final h f32955E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final v f32956F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final l f32957G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final i f32958H;

    /* JADX WARN: Multi-variable type inference failed */
    public EditPersonalInfoViewModel(B b10, p pVar, o oVar, h hVar, v vVar, l lVar, com.voltasit.obdeleven.domain.usecases.o oVar2, i iVar) {
        super(b10, pVar, oVar, vVar, lVar, oVar2, iVar);
        this.f32955E = hVar;
        this.f32956F = vVar;
        this.f32957G = lVar;
        this.f32958H = iVar;
        C1085f0 c1085f0 = this.f32998B;
        c1085f0.setValue(a.a((a) c1085f0.getValue(), null, null, false, true, null, null, null, false, false, false, false, false, false, false, false, 65271));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x0142  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.voltasit.obdeleven.presentation.screens.sfd.CreatePersonalInfoViewModel
    public final Object c(c<? super Boolean> cVar) {
        EditPersonalInfoViewModel$loadData$1 editPersonalInfoViewModel$loadData$1;
        EditPersonalInfoViewModel editPersonalInfoViewModel;
        EditPersonalInfoViewModel editPersonalInfoViewModel2;
        C8.a aVar;
        Throwable th;
        List<C0705g> list;
        String email;
        G g10;
        C1085f0 c1085f0;
        if (cVar instanceof EditPersonalInfoViewModel$loadData$1) {
            editPersonalInfoViewModel$loadData$1 = (EditPersonalInfoViewModel$loadData$1) cVar;
            int i10 = editPersonalInfoViewModel$loadData$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                editPersonalInfoViewModel$loadData$1.label = i10 - Integer.MIN_VALUE;
            } else {
                editPersonalInfoViewModel$loadData$1 = new EditPersonalInfoViewModel$loadData$1(this, (ContinuationImpl) cVar);
            }
        } else {
            editPersonalInfoViewModel$loadData$1 = new EditPersonalInfoViewModel$loadData$1(this, (ContinuationImpl) cVar);
        }
        Object objD = editPersonalInfoViewModel$loadData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = editPersonalInfoViewModel$loadData$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                editPersonalInfoViewModel = (EditPersonalInfoViewModel) editPersonalInfoViewModel$loadData$1.L$0;
                b.b(objD);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                editPersonalInfoViewModel2 = (EditPersonalInfoViewModel) editPersonalInfoViewModel$loadData$1.L$0;
                b.b(objD);
            }
            aVar = (C8.a) objD;
            if (aVar instanceof C8.a.b) {
                g10 = (G) ((C8.a.b) aVar).f2463a;
                editPersonalInfoViewModel2.getClass();
                String countryCode = g10.f3422f;
                i iVar = editPersonalInfoViewModel2.f32958H;
                iVar.getClass();
                kotlin.jvm.internal.i.e(countryCode, "countryCode");
                String strA = iVar.f30852a.a(countryCode);
                c1085f0 = editPersonalInfoViewModel2.f32998B;
                c1085f0.setValue(a.a((a) c1085f0.getValue(), g10, strA, false, false, null, null, null, false, false, false, false, false, false, false, false, 65532));
                if (n.S(g10.f3424h) || !n.S(g10.f3423g)) {
                    c1085f0.setValue(a.a((a) c1085f0.getValue(), null, null, true, false, null, null, null, false, false, false, false, false, false, false, false, 65531));
                }
            } else if (aVar instanceof C8.a.C0024a) {
                th = ((C8.a.C0024a) aVar).f2462a;
                editPersonalInfoViewModel2.getClass();
                if (th instanceof NotFoundException) {
                    list = editPersonalInfoViewModel2.f33000D;
                    if (list != null) {
                        kotlin.jvm.internal.i.m("countries");
                        throw null;
                    }
                    C0705g c0705gA = editPersonalInfoViewModel2.f32957G.a(list);
                    C1085f0 c1085f1 = editPersonalInfoViewModel2.f32998B;
                    a aVar2 = (a) c1085f1.getValue();
                    email = editPersonalInfoViewModel2.f32956F.L().getEmail();
                    if (email == null) {
                        email = "";
                    }
                    c1085f1.setValue(a.a(aVar2, new G(null, null, email, c0705gA.f3496b, null, null, null, null, 2035), null, false, false, null, null, null, true, false, false, false, false, false, false, false, 65270));
                } else {
                    editPersonalInfoViewModel2.f33008v.setValue(Boolean.TRUE);
                }
            }
            return Boolean.TRUE;
        }
        b.b(objD);
        editPersonalInfoViewModel$loadData$1.L$0 = this;
        editPersonalInfoViewModel$loadData$1.label = 1;
        objD = CreatePersonalInfoViewModel.d(this, editPersonalInfoViewModel$loadData$1);
        if (objD == coroutineSingletons) {
            return coroutineSingletons;
        }
        editPersonalInfoViewModel = this;
        if (!((Boolean) objD).booleanValue()) {
            return Boolean.FALSE;
        }
        h hVar = editPersonalInfoViewModel.f32955E;
        editPersonalInfoViewModel$loadData$1.L$0 = editPersonalInfoViewModel;
        editPersonalInfoViewModel$loadData$1.label = 2;
        objD = hVar.f30992a.h(editPersonalInfoViewModel$loadData$1);
        if (objD == coroutineSingletons) {
            return coroutineSingletons;
        }
        editPersonalInfoViewModel2 = editPersonalInfoViewModel;
        aVar = (C8.a) objD;
        if (aVar instanceof C8.a.b) {
            g10 = (G) ((C8.a.b) aVar).f2463a;
            editPersonalInfoViewModel2.getClass();
            String countryCode2 = g10.f3422f;
            i iVar2 = editPersonalInfoViewModel2.f32958H;
            iVar2.getClass();
            kotlin.jvm.internal.i.e(countryCode2, "countryCode");
            String strA2 = iVar2.f30852a.a(countryCode2);
            c1085f0 = editPersonalInfoViewModel2.f32998B;
            c1085f0.setValue(a.a((a) c1085f0.getValue(), g10, strA2, false, false, null, null, null, false, false, false, false, false, false, false, false, 65532));
            if (n.S(g10.f3424h)) {
                c1085f0.setValue(a.a((a) c1085f0.getValue(), null, null, true, false, null, null, null, false, false, false, false, false, false, false, false, 65531));
            } else {
                c1085f0.setValue(a.a((a) c1085f0.getValue(), null, null, true, false, null, null, null, false, false, false, false, false, false, false, false, 65531));
            }
        } else if (aVar instanceof C8.a.C0024a) {
            th = ((C8.a.C0024a) aVar).f2462a;
            editPersonalInfoViewModel2.getClass();
            if (th instanceof NotFoundException) {
                list = editPersonalInfoViewModel2.f33000D;
                if (list != null) {
                    kotlin.jvm.internal.i.m("countries");
                    throw null;
                }
                C0705g c0705gA2 = editPersonalInfoViewModel2.f32957G.a(list);
                C1085f0 c1085f2 = editPersonalInfoViewModel2.f32998B;
                a aVar3 = (a) c1085f2.getValue();
                email = editPersonalInfoViewModel2.f32956F.L().getEmail();
                if (email == null) {
                    email = "";
                }
                c1085f2.setValue(a.a(aVar3, new G(null, null, email, c0705gA2.f3496b, null, null, null, null, 2035), null, false, false, null, null, null, true, false, false, false, false, false, false, false, 65270));
            } else {
                editPersonalInfoViewModel2.f33008v.setValue(Boolean.TRUE);
            }
        }
        return Boolean.TRUE;
    }
}
