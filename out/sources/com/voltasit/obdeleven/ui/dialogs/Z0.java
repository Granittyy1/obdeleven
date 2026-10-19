package com.voltasit.obdeleven.ui.dialogs;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.model.COMPUCATEGORY;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.PHYSICALDATATYPE;
import com.obdeleven.service.odx.model.RADIX;
import com.obdeleven.service.odx.model.VT;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.view.FloatingEditText;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: compiled from: UdsDataInputDialog.java */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ArrayList f33875e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MaterialDialog f33876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MaterialDialog f33877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33878c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f33879d = KoinJavaComponent.b(com.voltasit.obdeleven.domain.usecases.odx.e.class, null, null);

    /* JADX INFO: compiled from: UdsDataInputDialog.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33880a;

        static {
            int[] iArr = new int[PHYSICALDATATYPE.values().length];
            f33880a = iArr;
            try {
                iArr[PHYSICALDATATYPE.A_FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33880a[PHYSICALDATATYPE.A_FLOAT64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33880a[PHYSICALDATATYPE.A_INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33880a[PHYSICALDATATYPE.A_UINT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33880a[PHYSICALDATATYPE.A_BYTEFIELD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33880a[PHYSICALDATATYPE.A_UNICODE2STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final void a() {
        MaterialDialog materialDialog = this.f33877b;
        if (materialDialog != null && materialDialog.isShowing()) {
            this.f33877b.dismiss();
        }
        MaterialDialog materialDialog2 = this.f33876a;
        if (materialDialog2 == null || !materialDialog2.isShowing()) {
            return;
        }
        this.f33876a.dismiss();
    }

    public final Task b(final ActivityC1347l activityC1347l, String str, final Param param, boolean z10, boolean z11) {
        ArrayList arrayList;
        this.f33878c = z10;
        COMPUCATEGORY category = param.f29462k.getCOMPUMETHOD().getCATEGORY();
        COMPUCATEGORY compucategory = COMPUCATEGORY.TEXTTABLE;
        Theme theme = Theme.f23261b;
        if (category != compucategory) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            MaterialDialog.a aVar = new MaterialDialog.a(activityC1347l);
            aVar.f23212B = theme;
            aVar.f23233b = str;
            aVar.a(R.layout.dialog_with_edittext);
            aVar.e(R.string.common_ok);
            aVar.d();
            aVar.f23217G = false;
            aVar.f23222L = new DialogInterface.OnCancelListener() { // from class: com.voltasit.obdeleven.ui.dialogs.V0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                }
            };
            final DATAOBJECTPROP dataobjectprop = param.f29462k;
            aVar.f23252v = new Y0(this, taskCompletionSource, dataobjectprop, activityC1347l, param);
            aVar.f23223M = new DialogInterface.OnShowListener() { // from class: com.voltasit.obdeleven.ui.dialogs.W0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    Z0 z12 = this.f33857b;
                    z12.getClass();
                    DATAOBJECTPROP dataobjectprop2 = dataobjectprop;
                    String hint = dataobjectprop2.getHint();
                    if (hint == null) {
                        hint = activityC1347l.getString(R.string.common_new_value);
                    }
                    final MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
                    FloatingEditText floatingEditText = (FloatingEditText) materialDialog.f34552b.findViewById(R.id.editText);
                    floatingEditText.setEnabled(!z12.f33878c);
                    materialDialog.c(DialogAction.f23184b).setEnabled(!z12.f33878c);
                    floatingEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.voltasit.obdeleven.ui.dialogs.X0
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                            if (i10 != 6) {
                                return false;
                            }
                            DialogAction dialogAction = DialogAction.f23184b;
                            MaterialDialog materialDialog2 = materialDialog;
                            materialDialog2.onClick(materialDialog2.c(dialogAction));
                            return true;
                        }
                    });
                    floatingEditText.setHint(hint);
                    int i10 = 4096;
                    int i11 = 0;
                    switch (Z0.a.f33880a[dataobjectprop2.getPHYSICALTYPE().getBASEDATATYPE().ordinal()]) {
                        case 1:
                        case 2:
                            i11 = 8192;
                        case 3:
                            i11 |= 4096;
                        case 4:
                            floatingEditText.setInputType(dataobjectprop2.getPHYSICALTYPE().getDISPLAYRADIX() != RADIX.HEX ? i11 | 2 : 1);
                            break;
                        case 6:
                            i10 = 0;
                        case 5:
                            floatingEditText.setInputType(i10 | 1);
                            break;
                    }
                    D9.o.p(floatingEditText);
                }
            };
            this.f33877b = aVar.f();
            return taskCompletionSource.getTask();
        }
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        final DATAOBJECTPROP dataobjectprop2 = param.f29462k;
        final List<COMPUSCALE> compuscale = dataobjectprop2.getCOMPUMETHOD().getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE();
        int size = compuscale.size();
        String[] strArr = new String[size];
        int i10 = -1;
        for (int i11 = 0; i11 < compuscale.size(); i11++) {
            COMPUSCALE compuscale2 = compuscale.get(i11);
            VT vt = compuscale2.getCOMPUCONST().getVT();
            if (vt.getValue().equals(param.f29459g)) {
                i10 = i11;
            }
            String strC = vt.getTI() != null ? Texttabe.c(vt.getTI()) : null;
            if (strC == null) {
                strC = vt.getValue();
            }
            if (z11) {
                strC = C4.b.d(strC, " (", compuscale2.getLOWERLIMIT().getValue(), ")");
            }
            strArr[i11] = strC;
        }
        int i12 = 0;
        while (true) {
            arrayList = f33875e;
            if (i12 >= size) {
                break;
            }
            arrayList.add(Integer.valueOf(i12));
            i12++;
        }
        if (this.f33878c) {
            MaterialDialog.a aVar2 = new MaterialDialog.a(activityC1347l);
            aVar2.f23212B = theme;
            aVar2.f23233b = str;
            aVar2.c(strArr);
            aVar2.e(R.string.common_close);
            aVar2.f23217G = false;
            aVar2.f23254x = new C7.h(taskCompletionSource2);
            com.voltasit.obdeleven.domain.usecases.gateway.b bVar = new com.voltasit.obdeleven.domain.usecases.gateway.b(taskCompletionSource2, compuscale, dataobjectprop2, param);
            aVar2.f23215E = i10;
            aVar2.f23256z = null;
            aVar2.f23211A = bVar;
            aVar2.f23216F = (Integer[]) arrayList.toArray(new Integer[size]);
            aVar2.f23222L = new DialogInterface.OnCancelListener() { // from class: com.voltasit.obdeleven.ui.dialogs.S0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    taskCompletionSource2.setResult(Boolean.FALSE);
                }
            };
            this.f33876a = aVar2.f();
        } else {
            MaterialDialog.a aVar3 = new MaterialDialog.a(activityC1347l);
            aVar3.f23212B = theme;
            aVar3.f23233b = str;
            aVar3.c(strArr);
            aVar3.e(R.string.common_ok);
            aVar3.d();
            aVar3.f23217G = false;
            aVar3.f23254x = new X8.n(taskCompletionSource2);
            MaterialDialog.d dVar = new MaterialDialog.d() { // from class: com.voltasit.obdeleven.ui.dialogs.T0
                @Override // com.afollestad.materialdialogs.MaterialDialog.d
                public final void b(MaterialDialog materialDialog, int i13) {
                    DATAOBJECTPROP dataobjectprop3 = dataobjectprop2;
                    Param param2 = param;
                    TaskCompletionSource taskCompletionSource3 = taskCompletionSource2;
                    if (i13 < 0) {
                        taskCompletionSource3.setResult(Boolean.FALSE);
                    } else {
                        COMPUSCALE compuscale3 = (COMPUSCALE) compuscale.get(i13);
                        try {
                            com.obdeleven.service.odx.a aVarPhysicalToInternal = dataobjectprop3.physicalToInternal(compuscale3.getCOMPUCONST().getVT().getValue());
                            param2.f29454b = aVarPhysicalToInternal.f29475a;
                            param2.f29465n = aVarPhysicalToInternal.f29476b;
                            param2.f29459g = compuscale3.getCOMPUCONST().getVT().getValue();
                            param2.f29460h = compuscale3.getCOMPUCONST().getVT().getTI();
                            taskCompletionSource3.setResult(Boolean.TRUE);
                        } catch (Exception unused) {
                        }
                    }
                    materialDialog.dismiss();
                }
            };
            aVar3.f23215E = i10;
            aVar3.f23256z = null;
            aVar3.f23211A = dVar;
            aVar3.f23222L = new DialogInterface.OnCancelListener() { // from class: com.voltasit.obdeleven.ui.dialogs.U0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    taskCompletionSource2.setResult(Boolean.FALSE);
                }
            };
            this.f33876a = aVar3.f();
        }
        return taskCompletionSource2.getTask();
    }
}
