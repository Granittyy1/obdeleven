package p134k8;

import C4.b;
import S8.a;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;

/* JADX INFO: renamed from: k8.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2657w implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42863b;

    public /* synthetic */ C2657w(int i10, ControlUnit controlUnit) {
        this.f42862a = i10;
        this.f42863b = controlUnit;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085 A[SYNTHETIC] */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        String strTrim;
        switch (this.f42862a) {
            case 0:
                ControlUnit controlUnit = this.f42863b;
                controlUnit.getClass();
                return ((Boolean) task.getResult()).booleanValue() ? Task.forResult(Boolean.TRUE) : controlUnit.f29335r.d("220600").continueWithTask(new K(1, controlUnit)).continueWith(new a(7, controlUnit));
            default:
                ControlUnit controlUnit2 = this.f42863b;
                controlUnit2.getClass();
                String str = (String) task.getResult();
                if (str.startsWith("5A91")) {
                    String strSubstring = str.substring(4);
                    ArrayList arrayList = new ArrayList();
                    int i10 = 0;
                    while (i10 < strSubstring.length()) {
                        int i11 = i10 + 2;
                        int i12 = Integer.parseInt(strSubstring.substring(i10, i11), 16);
                        if (i12 == 255) {
                            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                strTrim = ((String) arrayList.get(i13)).trim();
                                if (i13 != 0) {
                                    controlUnit2.C0(strTrim);
                                } else if (i13 != 1) {
                                    controlUnit2.f29320b.setHWVersion(strTrim);
                                }
                            }
                        } else {
                            int i14 = i12 - 1;
                            String string = "";
                            int i15 = 0;
                            while (i15 < i14) {
                                StringBuilder sbE = b.e(string);
                                int i16 = i11 + 2;
                                sbE.append((char) (Integer.parseInt(strSubstring.substring(i11, i16), 16) & 127));
                                string = sbE.toString();
                                i15++;
                                i11 = i16;
                            }
                            arrayList.add(string);
                            i10 = i11;
                        }
                    }
                    while (i13 < arrayList.size()) {
                        strTrim = ((String) arrayList.get(i13)).trim();
                        if (i13 != 0) {
                            controlUnit2.C0(strTrim);
                        } else if (i13 != 1) {
                            controlUnit2.f29320b.setHWVersion(strTrim);
                        }
                    }
                }
                return controlUnit2.f29335r.d("1A86");
        }
    }
}
