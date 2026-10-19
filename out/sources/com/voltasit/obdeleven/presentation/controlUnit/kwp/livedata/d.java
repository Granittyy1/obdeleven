package com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import java.util.Locale;
import p134k8.T1;
import p194p8.h;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31767c;

    public /* synthetic */ d(Object obj, int i10, Object obj2) {
        this.f31765a = i10;
        this.f31766b = obj;
        this.f31767c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0124 A[PHI: r5
      0x0124: PHI (r5v9 java.lang.String) = (r5v8 java.lang.String), (r5v11 java.lang.String) binds: [B:48:0x010e, B:53:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        String string;
        switch (this.f31765a) {
            case 0:
                f fVar = (f) this.f31766b;
                fVar.getClass();
                h hVar = (h) this.f31767c;
                String name = hVar.getName();
                p121j8.c cVar = hVar.f45913d;
                String strE = cVar != null ? cVar.e(-2) : null;
                if (name == null || name.isEmpty()) {
                    name = fVar.getString(R.string.common_channel);
                }
                fVar.f31774l.setText(name);
                if (strE == null || strE.isEmpty()) {
                    strE = "...";
                }
                fVar.f31778p.setText(strE);
                if (!hVar.equals(fVar.f31784v)) {
                    fVar.f31787y = true;
                    if (!fVar.f31785w) {
                        return null;
                    }
                    fVar.Q();
                    return null;
                }
                fVar.f31788z.setRefreshing(false);
                if (task.isFaulted()) {
                    fVar.f31785w = false;
                    String string2 = fVar.getString(R.string.common_not_available);
                    int i10 = 0;
                    while (true) {
                        LinearLayout[] linearLayoutArr = fVar.f31782t;
                        if (i10 >= linearLayoutArr.length) {
                            fVar.Q();
                            return null;
                        }
                        LinearLayout linearLayout = linearLayoutArr[i10];
                        if (i10 >= 4) {
                            linearLayout.setVisibility(8);
                            LinearLayout linearLayout2 = fVar.f31776n;
                            linearLayout2.getChildAt(linearLayout2.indexOfChild(linearLayout) - 1).setVisibility(8);
                        } else {
                            Locale locale = Locale.US;
                            ((TextView) linearLayout.getChildAt(0)).setText(fVar.getString(R.string.common_value) + " " + (i10 + 1));
                            ((TextView) linearLayout.getChildAt(1)).setText(string2);
                        }
                        i10++;
                    }
                } else {
                    if (fVar.f31785w) {
                        fVar.Q();
                    }
                    if (fVar.f31787y) {
                        UserTrackingUtils.c(UserTrackingUtils.Key.f34246G, 1);
                        fVar.f31787y = false;
                    }
                    String string3 = fVar.getString(R.string.common_not_available);
                    ArrayList arrayListA = hVar.a(fVar.f31786x);
                    int i11 = arrayListA.size() > 4 ? 0 : 8;
                    int i12 = 0;
                    while (true) {
                        LinearLayout[] linearLayoutArr2 = fVar.f31782t;
                        if (i12 >= linearLayoutArr2.length) {
                            return null;
                        }
                        LinearLayout linearLayout3 = linearLayoutArr2[i12];
                        if (i12 >= 4) {
                            linearLayout3.setVisibility(i11);
                            LinearLayout linearLayout4 = fVar.f31776n;
                            linearLayout4.getChildAt(linearLayout4.indexOfChild(linearLayout3) - 1).setVisibility(i11);
                        }
                        if (linearLayout3.getVisibility() == 0) {
                            TextView textView = (TextView) linearLayout3.getChildAt(0);
                            TextView textView2 = (TextView) linearLayout3.getChildAt(1);
                            Locale locale2 = Locale.US;
                            String str = fVar.getString(R.string.common_value) + " " + (i12 + 1);
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
                ControlUnit controlUnit = (ControlUnit) this.f31766b;
                controlUnit.getClass();
                String str3 = (String) task.getResult();
                boolean zStartsWith = str3.startsWith("76");
                Capture capture = (Capture) this.f31767c;
                if (zStartsWith) {
                    capture.set(str3.substring(2));
                    return controlUnit.f29335r.d("37");
                }
                capture.set(str3);
                return task;
        }
    }
}
