package p057e6;

import C4.b;
import O.a;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.C1293h;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34745a;

    public g(String str) {
        this.f34745a = C1293h.h("UID: [", "]  PID: [", "] ", Process.myUid(), Process.myPid()).concat(str);
    }

    public static String b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = b.d(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return a.f(str, " : ", str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            b(this.f34745a, str, objArr);
        }
    }
}
