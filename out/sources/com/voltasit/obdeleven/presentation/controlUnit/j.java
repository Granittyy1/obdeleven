package com.voltasit.obdeleven.presentation.controlUnit;

import B8.AbstractC0637l;
import android.view.View;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.obdeleven.service.exception.ControlUnitException;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.devices.DeviceFragment;
import com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p134k8.D1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31664c;

    public /* synthetic */ j(int i10, Object obj) {
        this.f31663b = i10;
        this.f31664c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        switch (this.f31663b) {
            case 0:
                ControlUnitFragment controlUnitFragment = (ControlUnitFragment) this.f31664c;
                List<D1> list = controlUnitFragment.f31434t;
                kotlin.jvm.internal.i.b(list);
                boolean zIsEmpty = list.isEmpty();
                J8.p pVar = controlUnitFragment.f34087g;
                if (zIsEmpty) {
                    pVar.b("ControlUnitFragment", "No valid subsystems");
                    controlUnitFragment.E(R.string.common_something_went_wrong);
                    return;
                }
                List<D1> list2 = controlUnitFragment.f31434t;
                kotlin.jvm.internal.i.b(list2);
                int i10 = 0;
                if (list2.size() == 1) {
                    List<D1> list3 = controlUnitFragment.f31434t;
                    kotlin.jvm.internal.i.b(list3);
                    D1 d10 = list3.get(0);
                    V8.o oVar = new V8.o();
                    oVar.f6816s = d10;
                    oVar.f6817t = d10.h();
                    controlUnitFragment.r().n(oVar, null);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                List<D1> list4 = controlUnitFragment.f31434t;
                kotlin.jvm.internal.i.b(list4);
                for (D1 d11 : list4) {
                    try {
                        string = d11.u();
                    } catch (ControlUnitException unused) {
                        string = controlUnitFragment.getResources().getString(R.string.common_unknown);
                    }
                    if (controlUnitFragment.f31424A.a()) {
                        string = String.format(Locale.US, "(%d) %s", Arrays.copyOf(new Object[]{Integer.valueOf(d11.getId()), string}, 2));
                    }
                    arrayList.add(string);
                    break;
                }
                if (arrayList.isEmpty()) {
                    pVar.b("ControlUnitFragment", "No valid subsystems");
                    controlUnitFragment.E(R.string.common_something_went_wrong);
                    return;
                }
                MaterialDialog.a aVar = new MaterialDialog.a(controlUnitFragment.requireActivity());
                aVar.f23212B = Theme.f23261b;
                aVar.g(R.string.common_subsystems);
                if (arrayList.size() > 0) {
                    CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        charSequenceArr[i10] = it.next().toString();
                        i10++;
                    }
                    aVar.c(charSequenceArr);
                } else if (arrayList.size() == 0) {
                    aVar.f23242l = new ArrayList<>();
                }
                aVar.f23256z = new A4.b(controlUnitFragment);
                aVar.f23211A = null;
                controlUnitFragment.f31435u = aVar.f();
                return;
            case 1:
                LoginTwoFactorBackupCodeFragment this$0 = (LoginTwoFactorBackupCodeFragment) this.f31664c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.getParentFragmentManager().R();
                return;
            default:
                i9.d.a aVar2 = (i9.d.a) this.f31664c;
                int adapterPosition = aVar2.getAdapterPosition();
                p110i9.d dVar = p110i9.d.this;
                X5.p pVar2 = dVar.f36782d;
                if (pVar2 == null || adapterPosition == -1) {
                    return;
                }
                Q8.b item = (Q8.b) dVar.f36779a.get(adapterPosition);
                DeviceFragment this$1 = (DeviceFragment) pVar2.f7260b;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                kotlin.jvm.internal.i.e(item, "item");
                AbstractC0637l abstractC0637l = this$1.f32127m;
                if (abstractC0637l == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                p110i9.d dVar2 = abstractC0637l.f1998t;
                kotlin.jvm.internal.i.b(dVar2);
                List<T> list5 = dVar2.f36779a;
                int size = list5.size();
                for (int iIndexOf = list5.indexOf(item) + 1; iIndexOf < size; iIndexOf++) {
                    Q8.b bVar = (Q8.b) list5.get(iIndexOf);
                    kotlin.jvm.internal.i.b(bVar);
                    bVar.f5130e--;
                }
                AbstractC0637l abstractC0637l2 = this$1.f32127m;
                if (abstractC0637l2 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                p110i9.d dVar3 = abstractC0637l2.f1998t;
                kotlin.jvm.internal.i.b(dVar3);
                dVar3.c(item);
                this$1.P(list5);
                return;
        }
    }
}
