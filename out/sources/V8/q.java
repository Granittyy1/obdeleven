package V8;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.interfaces.IDevice;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Locale;
import p134k8.T1;
import p134k8.a2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6822b;

    public /* synthetic */ q(int i10, Object obj) {
        this.f6821a = i10;
        this.f6822b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x018e A[PHI: r5
      0x018e: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v7 java.lang.String) binds: [B:48:0x0178, B:53:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws CommandException {
        String string;
        switch (this.f6821a) {
            case 0:
                s sVar = (s) this.f6822b;
                sVar.getClass();
                return !((Boolean) task.getResult()).booleanValue() ? sVar.f6825l.e() : Task.forResult(Boolean.TRUE);
            case 1:
                X8.s sVar2 = (X8.s) this.f6822b;
                sVar2.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return null;
                }
                sVar2.f7415p.notifyDataSetChanged();
                return null;
            case 2:
                ((com.voltasit.obdeleven.utils.bluetooth.m) this.f6822b).f34366a = IDevice.State.f29316e;
                return null;
            case 3:
                OBDIICu oBDIICu = (OBDIICu) this.f6822b;
                oBDIICu.getClass();
                oBDIICu.f29324f = new com.obdeleven.service.protocol.a();
                oBDIICu.j = new ControlUnit.h(500, "kbps");
                return null;
            case 4:
                a2 a2Var = (a2) this.f6822b;
                a2Var.getClass();
                if (task.getResult() != null) {
                    a2Var.f42725b.put(((com.obdeleven.service.model.f) task.getResult()).n(), (com.obdeleven.service.model.f) task.getResult());
                    a2Var.f42724a.put(((com.obdeleven.service.model.f) task.getResult()).n(), (ControlUnit) task.getResult());
                }
                return a2Var.f42725b;
            case 5:
                p170n9.n nVar = (p170n9.n) this.f6822b;
                nVar.f31788z.setRefreshing(false);
                String name = nVar.f31784v.getName();
                p121j8.c cVar = nVar.f31784v.f45913d;
                String strE = cVar != null ? cVar.e(-2) : null;
                if (name == null || name.isEmpty()) {
                    name = nVar.getString(R.string.common_channel);
                }
                nVar.f31774l.setText(name);
                if (strE == null || strE.isEmpty()) {
                    strE = "...";
                }
                nVar.f31778p.setText(strE);
                if (task.isFaulted()) {
                    String string2 = nVar.getString(R.string.common_not_available);
                    int i10 = 0;
                    while (true) {
                        LinearLayout[] linearLayoutArr = nVar.f31782t;
                        if (i10 >= linearLayoutArr.length) {
                            return null;
                        }
                        LinearLayout linearLayout = linearLayoutArr[i10];
                        if (i10 >= 4) {
                            linearLayout.setVisibility(8);
                            LinearLayout linearLayout2 = nVar.f31776n;
                            linearLayout2.getChildAt(linearLayout2.indexOfChild(linearLayout) - 1).setVisibility(8);
                        } else {
                            Locale locale = Locale.US;
                            ((TextView) linearLayout.getChildAt(0)).setText(nVar.getString(R.string.common_value) + " " + (i10 + 1));
                            ((TextView) linearLayout.getChildAt(1)).setText(string2);
                        }
                        i10++;
                    }
                } else {
                    String string3 = nVar.getString(R.string.common_not_available);
                    ArrayList arrayListA = nVar.f31784v.a(nVar.f31786x);
                    int i11 = arrayListA.size() > 4 ? 0 : 8;
                    int i12 = 0;
                    while (true) {
                        LinearLayout[] linearLayoutArr2 = nVar.f31782t;
                        if (i12 >= linearLayoutArr2.length) {
                            return null;
                        }
                        LinearLayout linearLayout3 = linearLayoutArr2[i12];
                        if (i12 >= 4) {
                            linearLayout3.setVisibility(i11);
                            LinearLayout linearLayout4 = nVar.f31776n;
                            linearLayout4.getChildAt(linearLayout4.indexOfChild(linearLayout3) - 1).setVisibility(i11);
                        }
                        if (linearLayout3.getVisibility() == 0) {
                            TextView textView = (TextView) linearLayout3.getChildAt(0);
                            TextView textView2 = (TextView) linearLayout3.getChildAt(1);
                            Locale locale2 = Locale.US;
                            String str = nVar.getString(R.string.common_value) + " " + (i12 + 1);
                            if (i12 >= arrayListA.size()) {
                                string = string3;
                            } else {
                                T1 t8 = (T1) arrayListA.get(i12);
                                String str2 = t8.f42678a;
                                if (str2 != null) {
                                    str = str2;
                                }
                                if (t8.f42679b != null) {
                                    string = t8.toString();
                                } else {
                                    string = string3;
                                }
                            }
                            textView.setText(str);
                            textView2.setText(string);
                        }
                        i12++;
                    }
                }
                break;
            default:
                p219r8.b bVar = (p219r8.b) this.f6822b;
                bVar.getClass();
                String str3 = (String) task.getResult();
                O.e.j(bVar.l(), "Result: " + str3);
                if (!str3.contains("71")) {
                    if (str3.startsWith("7F31")) {
                        throw new CommandException(Integer.parseInt(str3.substring(4, 6), 16));
                    }
                    throw new CommandException(-1);
                }
                String strSubstring = str3.substring(12, 16);
                O.e.j(bVar.l(), "HexChannelCode: " + strSubstring);
                bVar.f46400a.f29320b.addOutputTestCodeAndSave(strSubstring);
                String strD = O.h.d(strSubstring, bVar.f46398g);
                O.e.j(bVar.l(), "Code from channel: " + strD);
                bVar.f46395d = strD.equals("01195") || strD.startsWith("P1AFF");
                bVar.f46396e = Texttabe.c(O.h.e(strD));
                O.e.j(bVar.l(), "Name: " + bVar.f46396e);
                return null;
        }
    }
}
