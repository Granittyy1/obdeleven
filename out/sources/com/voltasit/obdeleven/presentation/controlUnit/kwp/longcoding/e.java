package com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding;

import android.view.View;
import androidx.appcompat.widget.O;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.J;
import com.voltasit.parse.model.ControlUnitLabelDB;
import java.util.ArrayList;
import java.util.List;
import p134k8.C2642q1;
import p255u9.E;
import p255u9.u;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31805d;

    public /* synthetic */ e(int i10, int i11, Object obj) {
        this.f31803b = i11;
        this.f31805d = obj;
        this.f31804c = i10;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    /* JADX WARN: Code duplicated, block: B:22:0x0093  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:25:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        O o10;
        androidx.appcompat.view.menu.f fVar;
        int i10;
        androidx.appcompat.view.menu.i iVar;
        ControlUnitLabelDB controlUnitLabelDB;
        List<u> listC;
        u uVar;
        switch (this.f31803b) {
            case 0:
                q qVar = (q) this.f31805d;
                C2642q1 c2642q1 = qVar.f31856y.f41191e;
                p121j8.e eVar = c2642q1.f42830b;
                if (eVar == null) {
                    return;
                }
                int i11 = qVar.f31830A;
                int i12 = this.f31804c;
                ArrayList arrayListB = eVar.b(i11, i12);
                for (ControlUnitLabelDB controlUnitLabelDB2 : new ArrayList(arrayListB)) {
                    if (controlUnitLabelDB2.getInt("value") == -1) {
                        arrayListB.remove(controlUnitLabelDB2);
                        if (arrayListB.isEmpty()) {
                            return;
                        }
                        o10 = new O(qVar.getContext(), qVar.f31854w[i12]);
                        fVar = o10.f8759a;
                        for (i10 = 0; i10 < arrayListB.size(); i10++) {
                            controlUnitLabelDB = (ControlUnitLabelDB) arrayListB.get(i10);
                            listC = eVar.c(controlUnitLabelDB, p267v9.a.f47671a);
                            if (listC == null) {
                                uVar = null;
                            } else {
                                uVar = listC.get(0);
                            }
                            if (uVar != null) {
                                fVar.a(0, controlUnitLabelDB.getInt("value"), i10, uVar.getString("value"));
                            }
                        }
                        if (!qVar.f31832C) {
                            o10.f8761c = new o(qVar, arrayListB, c2642q1);
                        }
                        if (fVar.f8463f.size() != 0) {
                            iVar = o10.f8760b;
                            if (iVar.b()) {
                                return;
                            }
                            if (iVar.f8517e != null) {
                                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                            }
                            iVar.d(0, 0, false, false);
                            return;
                        }
                        return;
                    }
                }
                if (arrayListB.isEmpty()) {
                    o10 = new O(qVar.getContext(), qVar.f31854w[i12]);
                    fVar = o10.f8759a;
                    while (i10 < arrayListB.size()) {
                        controlUnitLabelDB = (ControlUnitLabelDB) arrayListB.get(i10);
                        listC = eVar.c(controlUnitLabelDB, p267v9.a.f47671a);
                        if (listC == null) {
                            uVar = null;
                        } else {
                            uVar = listC.get(0);
                        }
                        if (uVar != null) {
                            fVar.a(0, controlUnitLabelDB.getInt("value"), i10, uVar.getString("value"));
                        }
                    }
                    if (!qVar.f31832C) {
                        o10.f8761c = new o(qVar, arrayListB, c2642q1);
                    }
                    if (fVar.f8463f.size() != 0) {
                        iVar = o10.f8760b;
                        if (iVar.b()) {
                            return;
                        }
                        if (iVar.f8517e != null) {
                            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                        }
                        iVar.d(0, 0, false, false);
                        return;
                    }
                    return;
                }
                return;
            default:
                p110i9.h hVar = (p110i9.h) this.f31805d;
                Q6.d dVar = hVar.f36799f;
                Object obj = hVar.f36795b.get(this.f31804c);
                dVar.getClass();
                E vehicle = (E) obj;
                J j = (J) dVar.f5110b;
                MainActivity.a aVar = j.f33810s;
                aVar.getClass();
                kotlin.jvm.internal.i.e(vehicle, "vehicle");
                aVar.f33571a.setResult(vehicle);
                j.f33813v.dismiss();
                return;
        }
    }
}
