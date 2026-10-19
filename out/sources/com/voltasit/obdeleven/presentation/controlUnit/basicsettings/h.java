package com.voltasit.obdeleven.presentation.controlUnit.basicsettings;

import V8.y;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.utils.bluetooth.m;
import java.util.ArrayList;
import java.util.Locale;
import p134k8.T1;
import p194p8.j;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31511c;

    public /* synthetic */ h(Object obj, int i10, Object obj2) {
        this.f31509a = i10;
        this.f31510b = obj;
        this.f31511c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01df  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:98:0x0263 A[SYNTHETIC] */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        String string;
        String strE;
        int i10;
        String string2;
        ArrayList arrayListA;
        int i11;
        LinearLayout[] linearLayoutArr;
        LinearLayout linearLayout;
        String string3;
        T1 t8;
        switch (this.f31509a) {
            case 0:
                i iVar = (i) this.f31510b;
                iVar.getClass();
                m8.g gVar = (m8.g) this.f31511c;
                p121j8.c cVar = gVar.f44618c;
                if (cVar != null) {
                    string = cVar.e(-1);
                    strE = cVar.e(-2);
                } else {
                    string = null;
                    strE = null;
                }
                if (string == null || string.isEmpty()) {
                    string = iVar.getString(R.string.common_channel);
                }
                iVar.f31520n.setText(string);
                if (strE == null || strE.isEmpty()) {
                    strE = "...";
                }
                iVar.f31526t.setText(strE);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    LinearLayout[] linearLayoutArr2 = iVar.f31530x;
                    if (i13 >= linearLayoutArr2.length) {
                        if (gVar.equals(iVar.f31532z)) {
                            iVar.f31515D.setRefreshing(false);
                            if (task.isFaulted()) {
                                iVar.f31512A = false;
                                iVar.f31525s.setVisibility(4);
                                iVar.f31528v.setEnabled(false);
                                int iA = ((CommandException) task.getError()).a();
                                if (iA == -1) {
                                    MainActivity mainActivityQ = iVar.q();
                                    P.a(mainActivityQ, mainActivityQ.getString(R.string.common_request_timeout));
                                } else if (iA != 51) {
                                    P.a(iVar.q(), String.format("(%02X) %s", Integer.valueOf(iA), Texttabe.a(iA)));
                                } else {
                                    iVar.V(false);
                                }
                                String string4 = iVar.getString(R.string.common_not_available);
                                iVar.f31524r.setText(string4);
                                while (true) {
                                    LinearLayout[] linearLayoutArr3 = iVar.f31530x;
                                    if (i12 < linearLayoutArr3.length) {
                                        LinearLayout linearLayout2 = linearLayoutArr3[i12];
                                        if (i12 >= 4) {
                                            linearLayout2.setVisibility(8);
                                            LinearLayout linearLayout3 = iVar.f31522p;
                                            linearLayout3.getChildAt(linearLayout3.indexOfChild(linearLayout2) - 1).setVisibility(8);
                                        } else {
                                            ((TextView) linearLayout2.getChildAt(1)).setText(string4);
                                        }
                                        i12++;
                                    }
                                }
                            } else {
                                Task<TContinuationResult> taskContinueWithTask = gVar.f44619d.continueWithTask(new m8.d(gVar));
                                gVar.f44619d = taskContinueWithTask.makeVoid();
                                j jVar = (j) taskContinueWithTask.getResult();
                                if (iVar.f31512A) {
                                    iVar.W();
                                }
                                int iIntValue = ((Integer) task.getResult()).intValue();
                                if (iIntValue != 4) {
                                    if (iIntValue == 10) {
                                        iVar.f31524r.setText(iVar.getString(R.string.common_running_advanced));
                                    } else if (iIntValue != 6) {
                                        if (iIntValue == 7) {
                                            iVar.f31524r.setText(iVar.getString(R.string.common_on));
                                        }
                                        iVar.f31525s.setVisibility(i10);
                                        iVar.f31528v.setEnabled(true);
                                        string2 = iVar.getString(R.string.common_not_available);
                                        arrayListA = jVar.a(iVar.f31513B);
                                        i11 = arrayListA.size() > 4 ? 0 : 8;
                                        while (true) {
                                            linearLayoutArr = iVar.f31530x;
                                            if (i12 < linearLayoutArr.length) {
                                                linearLayout = linearLayoutArr[i12];
                                                if (i12 >= 4) {
                                                    linearLayout.setVisibility(i11);
                                                    LinearLayout linearLayout4 = iVar.f31522p;
                                                    linearLayout4.getChildAt(linearLayout4.indexOfChild(linearLayout) - 1).setVisibility(i11);
                                                }
                                                if (linearLayout.getVisibility() == 0) {
                                                    TextView textView = (TextView) linearLayout.getChildAt(1);
                                                    if (i12 < arrayListA.size()) {
                                                        t8 = (T1) arrayListA.get(i12);
                                                        if (t8.f42679b != null) {
                                                            string3 = t8.toString();
                                                        } else {
                                                            string3 = string2;
                                                        }
                                                    } else {
                                                        string3 = string2;
                                                    }
                                                    textView.setText(string3);
                                                }
                                                i12++;
                                            }
                                        }
                                    } else {
                                        iVar.f31524r.setText(iVar.getString(R.string.common_off));
                                    }
                                    i10 = 0;
                                    iVar.f31525s.setVisibility(i10);
                                    iVar.f31528v.setEnabled(true);
                                    string2 = iVar.getString(R.string.common_not_available);
                                    arrayListA = jVar.a(iVar.f31513B);
                                    if (arrayListA.size() > 4) {
                                    }
                                    while (true) {
                                        linearLayoutArr = iVar.f31530x;
                                        if (i12 < linearLayoutArr.length) {
                                            linearLayout = linearLayoutArr[i12];
                                            if (i12 >= 4) {
                                                linearLayout.setVisibility(i11);
                                                LinearLayout linearLayout5 = iVar.f31522p;
                                                linearLayout5.getChildAt(linearLayout5.indexOfChild(linearLayout) - 1).setVisibility(i11);
                                            }
                                            if (linearLayout.getVisibility() == 0) {
                                                TextView textView2 = (TextView) linearLayout.getChildAt(1);
                                                if (i12 < arrayListA.size()) {
                                                    t8 = (T1) arrayListA.get(i12);
                                                    if (t8.f42679b != null) {
                                                        string3 = t8.toString();
                                                    } else {
                                                        string3 = string2;
                                                    }
                                                } else {
                                                    string3 = string2;
                                                }
                                                textView2.setText(string3);
                                            }
                                            i12++;
                                        }
                                    }
                                } else {
                                    iVar.f31524r.setText(iVar.getString(R.string.common_cancelled));
                                }
                                i10 = 4;
                                iVar.f31525s.setVisibility(i10);
                                iVar.f31528v.setEnabled(true);
                                string2 = iVar.getString(R.string.common_not_available);
                                arrayListA = jVar.a(iVar.f31513B);
                                if (arrayListA.size() > 4) {
                                }
                                while (true) {
                                    linearLayoutArr = iVar.f31530x;
                                    if (i12 < linearLayoutArr.length) {
                                        linearLayout = linearLayoutArr[i12];
                                        if (i12 >= 4) {
                                            linearLayout.setVisibility(i11);
                                            LinearLayout linearLayout6 = iVar.f31522p;
                                            linearLayout6.getChildAt(linearLayout6.indexOfChild(linearLayout) - 1).setVisibility(i11);
                                        }
                                        if (linearLayout.getVisibility() == 0) {
                                            TextView textView3 = (TextView) linearLayout.getChildAt(1);
                                            if (i12 < arrayListA.size()) {
                                                t8 = (T1) arrayListA.get(i12);
                                                if (t8.f42679b != null) {
                                                    string3 = t8.toString();
                                                } else {
                                                    string3 = string2;
                                                }
                                            } else {
                                                string3 = string2;
                                            }
                                            textView3.setText(string3);
                                        }
                                        i12++;
                                    }
                                }
                            }
                        } else {
                            Task taskContinueWithTask2 = gVar.f44619d.continueWithTask(new m8.e(gVar));
                            gVar.f44619d = taskContinueWithTask2;
                            taskContinueWithTask2.continueWith(new y(2, iVar));
                        }
                        return null;
                    }
                    TextView textView4 = (TextView) linearLayoutArr2[i13].getChildAt(0);
                    String strE2 = cVar != null ? cVar.e(i13) : null;
                    if (strE2 == null || strE2.isEmpty()) {
                        Locale locale = Locale.US;
                        strE2 = iVar.getString(R.string.common_value) + " " + (i13 + 1);
                    }
                    textView4.setText(strE2);
                    i13++;
                }
                break;
            case 1:
                final m mVar = (m) this.f31510b;
                mVar.getClass();
                StringBuilder sb2 = new StringBuilder("verifyFirmware(");
                final String str = (String) this.f31511c;
                sb2.append(str);
                sb2.append(")");
                O.e.j("Device", sb2.toString());
                Task taskForResult = Task.forResult(null);
                final Capture capture = new Capture("");
                for (int i14 = 0; i14 < 20; i14++) {
                    final int i15 = i14 * 1600;
                    taskForResult = taskForResult.onSuccessTask(new Continuation() { // from class: com.voltasit.obdeleven.utils.bluetooth.i
                        @Override // com.parse.boltsinternal.Continuation
                        public final Object then(Task task2) {
                            mVar.getClass();
                            int i16 = i15;
                            return new Z7.e("02".concat(String.format("%02X%02X%02X00%02X%02X", Integer.valueOf(i16 & 255), Integer.valueOf((i16 >> 8) & 255), Integer.valueOf((i16 >> 16) & 255), 25, 0)), false).a().continueWith(new com.voltasit.obdeleven.presentation.oca.b(1, capture));
                        }
                    });
                }
                return taskForResult.continueWith(new Continuation() { // from class: com.voltasit.obdeleven.utils.bluetooth.j
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) {
                        StringBuilder sb3 = new StringBuilder("written firmware checksum: ");
                        Capture capture2 = capture;
                        sb3.append((String) capture2.get());
                        O.e.j("Device", sb3.toString());
                        return Boolean.valueOf(((String) capture2.get()).equals(str));
                    }
                }).continueWithTask(new com.parse.a(5, mVar));
            default:
                return ((j) this.f31511c).b(((p073f9.b) this.f31510b).f35018y).makeVoid();
        }
    }
}
