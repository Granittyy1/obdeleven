package p134k8;

import androidx.compose.ui.text.font.s;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.CodingType;

/* JADX INFO: compiled from: KWP2000SubSystem1A.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Y0 implements Continuation<String, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X0.b f42712a;

    public Y0(X0.b bVar) {
        this.f42712a = bVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Boolean then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.startsWith("5A9A")) {
            String strSubstring = result.substring(4);
            while (strSubstring.length() > 0) {
                String strSubstring2 = strSubstring.substring(20, 24);
                int i10 = Integer.parseInt(strSubstring2.substring(0, 2), 16);
                int i11 = (Integer.parseInt(strSubstring2.substring(2), 16) - 1) * 2;
                String strSubstring3 = strSubstring.substring(24);
                String strB = "";
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = i12 * 2;
                    String strSubstring4 = strSubstring3.substring(i13, i13 + 2);
                    if (strSubstring4.equals("FF")) {
                        break;
                    }
                    strB = s.b(strB, strSubstring4);
                }
                int i14 = i10 & 15;
                X0 x10 = X0.this;
                if (i14 == x10.f42695b) {
                    x10.f42701h = CodingType.f34406f;
                    x10.f42702i = strB;
                    x10.j = strSubstring2;
                    return Boolean.TRUE;
                }
                strSubstring = strSubstring.substring(strB.length() + 26);
            }
        }
        return Boolean.FALSE;
    }
}
